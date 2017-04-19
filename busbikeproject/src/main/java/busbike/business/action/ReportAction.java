package busbike.business.action;

import java.net.URLDecoder;
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
import busbike.business.pojo.po.ReportInfo;
import busbike.business.pojo.vo.ReportQueryVo;
import busbike.business.pojo.vo.SingleCarInfoCustom;
import busbike.business.service.ReportService;


/**
 * 
 * <p>
 * Title: YpmlAction
 * </p>
 * <p>
 * Description:供货商药品目录
 * </p>
 * <p>
 * Company: www.itcast.com
 * </p>
 * 
 * @author 苗润土
 * @date 2014年11月30日下午4:20:42
 * @version 1.0
 */
@Controller
@RequestMapping("/report")
public class ReportAction {

	@Autowired
	private SystemConfigService systemConfigService;

	@Autowired
	private ReportService reportService;


	// 查询页面
	@RequestMapping("/queryReport")
	public String queryReport(Model model) throws Exception {
		//保修来源
		List<DictInfo> reportSource = systemConfigService.findDictinfoByType("23");
		model.addAttribute("reportSource", reportSource);
		//用户组
		List<DictInfo> state = systemConfigService.findDictinfoByType("20");
		model.addAttribute("state", state);
		//故障列表
		List<DictInfo> faultType = systemConfigService.findDictinfoByType("22");
		model.addAttribute("faultType", faultType);
		return "/business/report/queryReport";
	}
	//添加报修页面
	@RequestMapping("/addReport")
	public String addReport(Model model)throws Exception{
		//用户类型
		List<DictInfo> empType = systemConfigService.findDictinfoByType("30");
		model.addAttribute("empType", empType);
		//用户信用等级
		List<DictInfo> empClass = systemConfigService.findDictinfoByType("31");
		model.addAttribute("empClass", empClass);
		//故障类型
		List<DictInfo> faultType = systemConfigService.findDictinfoByType("22");
		model.addAttribute("faultType", faultType);
		return "/business/report/addReport";
	}
	@RequestMapping("/reportCheck")
	public String reportCheck(Model model, HttpSession session, String id ) throws Exception{
		// 当前用户
		ActiveEmp activeEmp = (ActiveEmp) session
				.getAttribute(Config.ACTIVEUSER_KEY);
		// 查看用户的权限
		 String classId = activeEmp.getEmpClassId();// 用户类型id
		//通过id取出用户信息，传向页面
		ReportInfo reportInfo =  reportService.getSingleCarReportInfoByReportId(id);
		model.addAttribute("reportInfoCustom", reportInfo);
		//故障类型
		List<DictInfo> faultType = systemConfigService.findDictinfoByType("22");
		model.addAttribute("faultType", faultType);
		return "/business/report/reportCheck";
	}
	
	
	//获取报修车辆的最新状态
	@RequestMapping("/reportCarInfo")
	public @ResponseBody SingleCarInfoCustom getReportCarInfo(String carNum  )throws Exception{
		SingleCarInfoCustom singleCarUseInfo= reportService.getSingleCarLatestInfoByCarNum(carNum);
		return singleCarUseInfo;
	}
	//审核车辆是否存在
	@RequestMapping("/checkCarExist")
	public @ResponseBody String checkCarExist(ActiveEmp activeEmp ,String carNum ) throws Exception{
		
		String result =  reportService.checkCarExist(carNum);
		
		return result;
	}
	//添加报修信息
	@RequestMapping("/addreportsubmit")
	public @ResponseBody SubmitResultInfo addReportSubmit(ActiveEmp activeEmp , ReportInfo reportInfo)throws Exception{
	
		reportInfo.setCarFaultDesc(URLDecoder.decode(reportInfo.getCarFaultDesc(),"UTF-8"));
	
		reportService.insertReport(activeEmp, reportInfo);
		
		return ResultUtil.createSubmitResult(ResultUtil.createSuccess(Config.MESSAGE, 906, null));
	}
	// 查询列表结果集,json
	@RequestMapping("/queryReport_result")
	public @ResponseBody
	DataGridResultInfo queryReportResult(ActiveEmp activeEmp,ReportQueryVo reportQueryVo,int page, int rows) throws Exception {
		// 列表的总数
		int total = reportService.countReportInfo(activeEmp, reportQueryVo);

		// 分页参数
		PageQuery pageQuery = new PageQuery();
		pageQuery.setPageParams(total, rows, page);
		reportQueryVo.setPageQuery(pageQuery);// 设置分页参数

		// 分页查询列表
		List<ReportInfo> list = reportService.selectReportInfoList(activeEmp, reportQueryVo);

		DataGridResultInfo dataGridResultInfo = new DataGridResultInfo();
		dataGridResultInfo.setTotal(total);
		dataGridResultInfo.setRows(list);
		return dataGridResultInfo;
	}
	//单辆车信息查看页面
	@RequestMapping("/singleCarInfo")
	public @ResponseBody ReportInfo getSingleCarReportInfoByReportId(ActiveEmp activeEmp,String reportId)throws Exception{

		ReportInfo reportInfo= reportService.getSingleCarReportInfoByReportId(reportId);
	
		return reportInfo;
	}
	//编辑保修信息,包括用户修改,审核通过,审核不通过
	@RequestMapping("/editReportInfo")
	public @ResponseBody SubmitResultInfo editReportInfo(ActiveEmp activeEmp,ReportQueryVo reportQueryVo,String repairEmpId,String requType)throws Exception{
		
		ReportInfo reportInfo = reportQueryVo.getReportInfo();
		String carFaultDesc = reportInfo.getCarFaultDesc();
		if(reportInfo != null  && carFaultDesc != null){
			reportInfo.setCarFaultDesc(URLDecoder.decode(carFaultDesc,"UTF-8"));
			reportQueryVo.setReportInfo(reportInfo);
		}
		
		reportService.editReportInfo(activeEmp, reportQueryVo,repairEmpId,requType);
		
		return ResultUtil.createSubmitResult(ResultUtil.createSuccess(Config.MESSAGE, 906, null));
		
	}
}
