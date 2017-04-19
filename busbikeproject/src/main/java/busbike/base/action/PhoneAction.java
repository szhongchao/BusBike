package busbike.base.action;

import java.util.Arrays;
import java.util.Date;
import java.util.Map;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import busbike.base.pojo.po.EmpInfo;
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
@RequestMapping("/phone")
public class PhoneAction {
	
	
		@Autowired
		private EmpService empService;
	
		// 用户注册页面
		@RequestMapping("/register")
		public @ResponseBody SubmitResultInfo register(EmpInfo empInfo) throws Exception {
			// 数据获取传到页面
			
			empService.insertEmpInfo(empInfo);
	
			return ResultUtil.createSubmitResult(ResultUtil.createSuccess(
					Config.MESSAGE, 107, new Object[] { "" }));
		}

		// 用户登陆页面
		@RequestMapping("/mLogin")
		public String userLogin(Model model) throws Exception {
			// 数据获取传到页面
	
			return "/webPhone/login/login";
		}
		
		
		@RequestMapping("/mMain")
		public String main(Model model, HttpSession session, String id ) throws Exception{
			
			// 当前用户
			ActiveEmp activeEmp = (ActiveEmp) session
					.getAttribute(Config.ACTIVEUSER_KEY);
			return "/webPhone/mMain";
			
		}
		//用户报修
		@RequestMapping("/singleCar")
		public String report(Map<String,Object> map,Model model,ModelMap modelMap, HttpSession session, String carNum ) throws Exception{		
			// 当前用户
			ActiveEmp activeEmp = (ActiveEmp) session
					.getAttribute(Config.ACTIVEUSER_KEY);
			 map.put("names", Arrays.asList("caoyc","zhh","cjx"));
			 model.addAttribute("time", new Date());
			 model.addAttribute("carNum", carNum);
			 modelMap.addAttribute("city", "ChengDu");
			 modelMap.put("gender", "male"); 
			return "/webPhone/singleCar";
		}
	
		/*//用户审核
		@RequestMapping("/reportCheck")
		public String reportCheck(Model model, HttpSession session, String id ) throws Exception{
			List<DictInfo> userType = systemConfigService.findDictinfoByType("01");
			model.addAttribute("userType", userType);
			// 当前用户
			ActiveEmp activeEmp = (ActiveEmp) session
					.getAttribute(Config.ACTIVEUSER_KEY);
			
			ReportInfoCustom reportInfoCustom = reportService.findReportInfoById(activeEmp, id);
					
			
			model.addAttribute("reportInfoCustom", reportInfoCustom);
			
			return "/webPhone/reportCheck";
		}*/
		//信息查看
		@RequestMapping("/view")
		public String view(Model model, HttpSession session, String id ) throws Exception{
			
			// 当前用户
			ActiveEmp activeEmp = (ActiveEmp) session
					.getAttribute(Config.ACTIVEUSER_KEY);	
			return "/webPhone/view";
		}
		//信息管理
		@RequestMapping("/manager")
		public String manager(Model model, HttpSession session, String id ) throws Exception{
			
			// 当前用户
			ActiveEmp activeEmp = (ActiveEmp) session
					.getAttribute(Config.ACTIVEUSER_KEY);	
			return "/webPhone/manager";
		}
		
		//退出
		@RequestMapping("/logout")
		public String logout(HttpSession session)throws Exception{
			//session过期
			session.invalidate();
			return "redirect:login.action";
		}

}
