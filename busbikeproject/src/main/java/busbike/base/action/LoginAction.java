package busbike.base.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import busbike.base.pojo.vo.ActiveEmp;
import busbike.base.process.context.Config;
import busbike.base.process.result.ResultUtil;
import busbike.base.process.result.SubmitResultInfo;
import busbike.base.service.EmpService;

/**
 * 
 * <p>
 * Title: LoginAction
 * </p>
 * <p>
 * Description: 用户认证
 * </p>
 * <p>
 * Company: www.itcast.com
 * </p>
 * 
 * @author szc
 * @date 2016年11月29日上午9:12:05
 * @version 1.0
 */
@Controller
public class LoginAction {

	@Autowired
	private EmpService empService;

	// 用户登陆页面
	@RequestMapping("/login")
	public String login(Model model) throws Exception {
		// 数据获取传到页面

		return "/base/login";
	}

	// 用户登陆提交
	@RequestMapping("/loginsubmit")
	public @ResponseBody
	SubmitResultInfo loginsubmit(HttpSession session, HttpServletRequest request)
			throws Exception {
		
		String empName=request.getParameter("empName");
        String password=request.getParameter("password");
        String validateCode = request.getParameter("validateCode");
        
		ActiveEmp activeEmp = null;
		//校验验证码,00000表示手机用户登录
		
		String validateCode_session = (String) session.getAttribute("validateCode");
		if(validateCode_session !=null && !validateCode_session.equals(validateCode)){
			//验证码输入错误
			ResultUtil.throwExcepion(ResultUtil.createFail(Config.MESSAGE, 113,null));
		}
		
		activeEmp = empService.checkEmpInfo(empName, password,validateCode );
		// 将用户身份信息写入session
		session.setAttribute(Config.ACTIVEUSER_KEY, activeEmp);

		return ResultUtil.createSubmitResult(ResultUtil.createSuccess(
				Config.MESSAGE, 107, new Object[] {""},activeEmp.getEmpTypeId() ));
	}

	
	//退出
	@RequestMapping("/logout")
	public String logout(HttpSession session)throws Exception{
		//session过期
		session.invalidate();
		return "redirect:login.action";
	}

}
