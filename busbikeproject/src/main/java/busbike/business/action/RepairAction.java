package busbike.business.action;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import busbike.base.pojo.po.DictInfo;
import busbike.base.pojo.vo.ActiveEmp;
import busbike.base.pojo.vo.PageQuery;
import busbike.base.process.context.Config;
import busbike.base.process.result.DataGridResultInfo;
import busbike.base.process.result.ResultUtil;
import busbike.base.process.result.SubmitResultInfo;
import busbike.base.service.SystemConfigService;
import busbike.business.pojo.po.RepairInfo;
import busbike.business.pojo.vo.RepairQueryVo;
import busbike.business.service.MaintainService;
import busbike.business.service.RepairService;


/**
 * 
 * <p>
 * Title: YpmlAction
 * </p>
 * <p>
 * Description:审核lieb
 * </p>
 * <p>
 * Company: www.itcast.com
 * </p>
 * 
 * @author szc
 * @date 2016年11月30日下午4:20:42
 * @version 1.0
 */
@Controller
@RequestMapping("/repair")
public class RepairAction {

	@Autowired
	private SystemConfigService systemConfigService;

	@Autowired
	private RepairService repairService;

	// 查询页面
	@RequestMapping("/queryRepair")
	public String queryRepair(Model model) throws Exception {
		//用户类型
		List<DictInfo> userType = systemConfigService.findDictinfoByType("01");
		model.addAttribute("userType", userType);
		//用户信用等级
		List<DictInfo> creditRating = systemConfigService.findDictinfoByType("02");
		model.addAttribute("creditRating", creditRating);
		//用户组
		List<DictInfo> groupList = systemConfigService.findDictinfoByType("03");
		model.addAttribute("groupList", groupList);
		//用户组
		List<DictInfo> repairState = systemConfigService.findDictinfoByType("21");
		model.addAttribute("repairState", repairState);
				
		return "/business/repair/queryRepair";
	}
	//添加报修页面
	@RequestMapping("/addRepair")
	public String addRepair(Model model)throws Exception{
		//用户类型
		List<DictInfo> empType = systemConfigService.findDictinfoByType("30");
		model.addAttribute("empType", empType);
		//用户信用等级
		List<DictInfo> empClass = systemConfigService.findDictinfoByType("31");
		model.addAttribute("empClass", empClass);
		//用户组
		List<DictInfo> groupList = systemConfigService.findDictinfoByType("32");
		model.addAttribute("groupList", groupList);
		
		return "/business/maintain/addmaintain";
	}
	@RequestMapping("/addmaintainsubmit")
	public @ResponseBody SubmitResultInfo addRepairSubmit(HttpSession session, RepairQueryVo repairQueryVo)throws Exception{
		//使用全局异常处理器后，在actoin不用进行try/catch捕获
		// 当前用户
		ActiveEmp activeEmp = (ActiveEmp) session
				.getAttribute(Config.ACTIVEUSER_KEY);
		// 查看用户的权限
		String classId = activeEmp.getEmpClassId();// 用户类型id
		
		
		repairService.insertRepair(classId, repairQueryVo);
		
		return ResultUtil.createSubmitResult(ResultUtil.createSuccess(Config.MESSAGE, 906, null));
		}
		@RequestMapping("/repairJob")
		public String repairJob(Model model, HttpSession session, String repairId )throws Exception{
			// 当前员工
			ActiveEmp activeEmp = (ActiveEmp) session
					.getAttribute(Config.ACTIVEUSER_KEY);
			//to do
			RepairInfo repairInfo = repairService.getSingleCarRepairInfoByRepairId(repairId);
			model.addAttribute("repairInfo", repairInfo);
	
			return "/business/repair/repairJob";
		}
		
		
		
		// 查询列表结果集,json
		@RequestMapping("/queryRepair_result")
		public @ResponseBody
		DataGridResultInfo queryRepairResult(ActiveEmp activeEmp,RepairQueryVo repairQueryVo,int page, int rows) throws Exception {
	
			// 列表的总数
			int total = repairService.countRepairInfo(activeEmp,repairQueryVo);
	
			// 分页参数
			PageQuery pageQuery = new PageQuery();
			pageQuery.setPageParams(total, rows, page);
			repairQueryVo.setPageQuery(pageQuery);// 设置分页参数
	
			// 分页查询列表
			List<RepairInfo> list = repairService.selectRepairInfoList(activeEmp,repairQueryVo);
	
			DataGridResultInfo dataGridResultInfo = new DataGridResultInfo();
			dataGridResultInfo.setTotal(total);
			dataGridResultInfo.setRows(list);
	
			return dataGridResultInfo;
		}
		//单辆车信息查看页面
		@RequestMapping("/singleCarInfo")
		public @ResponseBody RepairInfo getSingleCarRepairInfoByReportId(ActiveEmp activeEmp,String reportId)throws Exception{

			RepairInfo repairInfo= repairService.getSingleCarRepairInfoByReportId(reportId);
		
			return repairInfo;
		}
		//创建维修工作表,接受,拒绝维修,维修成功,失败等信息的修改
		@RequestMapping("/editRepairInfo")
		public @ResponseBody SubmitResultInfo editRepairInfo(ActiveEmp activeEmp, RepairQueryVo repairQueryVo,String requType)throws Exception{
			
			repairService.editRepairInfo(activeEmp, repairQueryVo,requType);
			
			return ResultUtil.createSubmitResult(ResultUtil.createSuccess(Config.MESSAGE, 906, null));
		}
		
}
