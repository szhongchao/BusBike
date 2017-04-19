package busbike.base.action;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import busbike.base.pojo.po.DictInfo;
import busbike.base.pojo.po.EmpInfo;
import busbike.base.pojo.vo.ActiveEmp;
import busbike.base.pojo.vo.EmpInfoQueryVo;
import busbike.base.pojo.vo.PageQuery;
import busbike.base.process.context.Config;
import busbike.base.process.result.DataGridResultInfo;
import busbike.base.process.result.ResultUtil;
import busbike.base.process.result.SubmitResultInfo;
import busbike.base.service.EmpService;
import busbike.base.service.SystemConfigService;



/**
 * 
 * <p>Title: UserAction</p>
 * <p>Description:系统用户管理 </p>
 * <p>Company: www.itcast.com</p> 
 * @author	szc
 * @date	2016年11月11日上午10:56:09
 * @version 1.0
 */
@Controller
@RequestMapping("/emp")
public class EmpAction {
	
	@Autowired
	private EmpService empService;
	
	
	@Autowired
	private SystemConfigService systemConfigService;
	
	//用户查询页面
	@RequestMapping("/queryemp")
	public String queryemp(Model model)throws Exception{
		//将页面所需要的数据取出，传到页面
		//用户类型
		List<DictInfo> empType = systemConfigService.findDictinfoByType("30");
		model.addAttribute("empType", empType);
		//用户信用等级
		List<DictInfo> empClass = systemConfigService.findDictinfoByType("31");
		model.addAttribute("empClass", empClass);
		//用户组
		List<DictInfo> groupList = systemConfigService.findDictinfoByType("32");
		model.addAttribute("groupList", groupList);
		return "/base/emp/queryemp";
	}
	//用户查询页面
	@RequestMapping("/queryuser")
	public String queryuser(Model model)throws Exception{
		//将页面所需要的数据取出，传到页面
		//用户类型
		List<DictInfo> empType = systemConfigService.findDictinfoByType("30");
		model.addAttribute("empType", empType);
		//用户信用等级
		List<DictInfo> empClass = systemConfigService.findDictinfoByType("31");
		model.addAttribute("empClass", empClass);
		//用户组
		List<DictInfo> groupList = systemConfigService.findDictinfoByType("32");
		model.addAttribute("groupList", groupList);
		

		return "/base/user/queryuser";
	}
	
	
	//用户查询页面的结果集
	//最终DataGridResultInfo通过@ResponseBody将java对象转成json
	@RequestMapping("/queryemp_result")
	public @ResponseBody DataGridResultInfo queryemp_result(ActiveEmp activeEmp,EmpInfoQueryVo empInfoQueryVo,int page,int rows)throws Exception{
		
		//非空校验
		empInfoQueryVo = empInfoQueryVo!=null?empInfoQueryVo:new EmpInfoQueryVo();
		
		//查询列表的总数
		int total = empService.countEmpInfo(empInfoQueryVo);
		
		PageQuery pageQuery = new PageQuery();
		pageQuery.setPageParams(total, rows, page);
		
		empInfoQueryVo.setPageQuery(pageQuery);
		
		//分页查询，向sysuserQueryVo中传入pageQuery
		List<EmpInfo> list = empService.selectEmpInfoList(empInfoQueryVo);
		
		DataGridResultInfo dataGridResultInfo = new DataGridResultInfo();
		//填充 total
		dataGridResultInfo.setTotal(total);
		//填充  rows
		dataGridResultInfo.setRows(list);
		
		return dataGridResultInfo;
	}
	
	//添加用户页面
	@RequestMapping("/addemp")
	public String addemp(Model model)throws Exception{
		//用户类型
		List<DictInfo> empType = systemConfigService.findDictinfoByType("30");
		model.addAttribute("empType", empType);
		//用户信用等级
		List<DictInfo> empClass = systemConfigService.findDictinfoByType("31");
		model.addAttribute("empClass", empClass);
		//用户组
		List<DictInfo> groupList = systemConfigService.findDictinfoByType("32");
		model.addAttribute("groupList", groupList);
		
		return "/base/emp/addemp";
	}
	//添加用户页面
		@RequestMapping("/adduser")
		public String adduser(Model model)throws Exception{
			//用户类型
			List<DictInfo> empType = systemConfigService.findDictinfoByType("30");
			model.addAttribute("empType", empType);
			//用户信用等级
			List<DictInfo> empClass = systemConfigService.findDictinfoByType("31");
			model.addAttribute("empClass", empClass);
			//用户组
			List<DictInfo> groupList = systemConfigService.findDictinfoByType("32");
			model.addAttribute("groupList", groupList);
			
			return "/base/user/adduser";
		}
	
	//添加用户提交
	//提交 结果转json输出到页面
	//提交表单数据统一使用包装类
	@RequestMapping("/addempsubmit")
	public @ResponseBody SubmitResultInfo addempsubmit(ActiveEmp activeEmp, EmpInfoQueryVo empInfoQueryVo)throws Exception{
		
		empService.insertEmpInfo(empInfoQueryVo.getEmpInfo());
		
		return ResultUtil.createSubmitResult(ResultUtil.createSuccess(Config.MESSAGE, 906, null));
	}
	
	//删除用户
	@RequestMapping("/deleteEmp")
	public @ResponseBody SubmitResultInfo deletesysuser(String empId) throws Exception{
		
		//调用service
		empService.deleteEmpInfo(empId);

		return ResultUtil.createSubmitResult(ResultUtil.createSuccess(Config.MESSAGE, 906, null));
	}

	//修改用户页面
	@RequestMapping("/editemp")
	public String editemp(Model model,String empId)throws Exception{
		
		//通过id取出用户信息，传向页面
		EmpInfo empInfo =  empService.selectEmpInfoById(empId);
		model.addAttribute("empInfo", empInfo);
		//用户类型
		List<DictInfo> empType = systemConfigService.findDictinfoByType("30");
		model.addAttribute("empType", empType);
		//用户信用等级
		List<DictInfo> empClass = systemConfigService.findDictinfoByType("31");
		model.addAttribute("empClass", empClass);
		//用户组
		List<DictInfo> groupList = systemConfigService.findDictinfoByType("32");
		model.addAttribute("groupList", groupList);
		
		return "/base/emp/editemp";
		
	}
	//修改用户页面
		@RequestMapping("/edituser")
		public String edituser(Model model,String empId)throws Exception{
			
			//通过id取出用户信息，传向页面
			EmpInfo empInfo =  empService.selectEmpInfoById(empId);
			model.addAttribute("empInfo", empInfo);
			//用户类型
			List<DictInfo> empType = systemConfigService.findDictinfoByType("30");
			model.addAttribute("empType", empType);
			//用户信用等级
			List<DictInfo> empClass = systemConfigService.findDictinfoByType("31");
			model.addAttribute("empClass", empClass);
			//用户组
			List<DictInfo> groupList = systemConfigService.findDictinfoByType("32");
			model.addAttribute("groupList", groupList);
			
			return "/base/user/edituser";
			
		}
	
	//修改用户提交
	@RequestMapping("/editempsubmit")
	public @ResponseBody SubmitResultInfo editempsubmit(String empId,EmpInfoQueryVo empInfoQueryVo)throws Exception{
		
	
		empService.updateEmpInfo(empId, empInfoQueryVo.getEmpInfo());
		
		return ResultUtil.createSubmitResult(ResultUtil.createSuccess(Config.MESSAGE, 906, null));
		
	}
}
