package busbike.business.service.impl;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;

import busbike.base.dao.mapper.DictInfoMapperCustom;
import busbike.base.pojo.vo.ActiveEmp;
import busbike.base.process.context.Config;
import busbike.base.process.result.ResultUtil;
import busbike.business.dao.mapper.AllCarInfoMapper;
import busbike.business.dao.mapper.RentReturnInfoMapperCustom;
import busbike.business.dao.mapper.RepairInfoMapper;
import busbike.business.dao.mapper.ReportInfoMapper;
import busbike.business.dao.mapper.ReportInfoMapperCustom;
import busbike.business.pojo.po.AllCarInfoExample;
import busbike.business.pojo.po.RentReturnInfo;
import busbike.business.pojo.po.RepairInfo;
import busbike.business.pojo.po.ReportInfo;
import busbike.business.pojo.vo.ReportQueryVo;
import busbike.business.pojo.vo.SingleCarInfoCustom;
import busbike.business.service.ReportService;


public class ReportServiceImpl implements ReportService {

	@Autowired
	private ReportInfoMapperCustom reportInfoMapperCustom;


	@Autowired
	private ReportInfoMapper reportInfoMapper;
	
	@Autowired
	private DictInfoMapperCustom dictInfoMapperCustom;

	@Autowired
	private RepairInfoMapper repairInfoMapper;
	
	@Autowired
	private AllCarInfoMapper allCarInfoMapper;
	@Autowired
	private RentReturnInfoMapperCustom rentReturnInfoMapperCustom;
	
	
	
	//获取车辆的最新状态
	@Override
	public SingleCarInfoCustom getSingleCarLatestInfoByCarNum(String carNum) throws Exception {
		if(null == carNum || "".equals(carNum)){
			ResultUtil.throwExcepion(ResultUtil.createFail(Config.MESSAGE, 711,
					null));
		}
		RentReturnInfo rentReturnInfo = rentReturnInfoMapperCustom.selectLatestByCarNum(carNum);
		//验证车辆是否存在
		if(rentReturnInfo == null){
			
			ResultUtil.throwExcepion(ResultUtil.createFail(Config.MESSAGE, 711,
					null));
		}
		
		SingleCarInfoCustom singleCarInfoCustom = new SingleCarInfoCustom();
		
		singleCarInfoCustom.setRentDateTime(rentReturnInfo.getRentDateTime());
		singleCarInfoCustom.setCarNum(rentReturnInfo.getCarNum());
		singleCarInfoCustom.setRentNetid(rentReturnInfo.getRentNetid());
		singleCarInfoCustom.setRentNum(rentReturnInfo.getRentNum());
		
		return singleCarInfoCustom;
	}
	//添加报修记录
	@Override
	public void insertReport(ActiveEmp activeEmp, ReportInfo reportInfo) throws Exception {
		//验证用户权限,添加姓名
		String userTypeId = activeEmp.getEmpTypeId();// 用户类型id
		if(userTypeId.matches("01\\d{2}")){ //普通用户
			reportInfo.setReportSource(dictInfoMapperCustom.selectInfoByDictCode("0101"));
			reportInfo.setReportName(activeEmp.getEmpName());
		}else if(userTypeId.matches("30\\d{2}")){
			if(userTypeId.equals("3001")){ //管理员
				reportInfo.setReportSource(dictInfoMapperCustom.selectInfoByDictCode("3001"));
				reportInfo.setReportName(activeEmp.getEmpName());
			}else if(userTypeId.equals("3002")){ //调度中心
				reportInfo.setReportSource(dictInfoMapperCustom.selectInfoByDictCode("3002"));
				reportInfo.setReportName(activeEmp.getEmpName());
			}else if(userTypeId.equals("3003")){ //维修中心
				reportInfo.setReportSource(dictInfoMapperCustom.selectInfoByDictCode("3203"));
				reportInfo.setReportName(activeEmp.getEmpName());
			}else if(userTypeId.equals("3004")){ //审核员
				reportInfo.setReportSource(dictInfoMapperCustom.selectInfoByDictCode("3004"));
				reportInfo.setReportName(activeEmp.getEmpName());
			}
		}else{
			ResultUtil.throwExcepion(ResultUtil.createFail(Config.MESSAGE, 101,
					null));
		}
		//添加报修编号
		reportInfo.setReportEmpId(activeEmp.getEmpId());
		
		reportInfo.setIsMultiFault("否");
		//添加保修状态
		reportInfo.setState("2401");
		reportInfo.setFaultName(dictInfoMapperCustom.selectInfoByDictCode(reportInfo.getFaultTypeNum()));
		
		reportInfo.setReportDateTime(getDate());
		
		reportInfoMapper.insert(reportInfo);
		
	}
	//审核车辆是否存在
	@Override
	public String checkCarExist(String rentCarNum) throws Exception{
		String result = "1";
		if(null == rentCarNum || "".equals(rentCarNum)){
			result = "0";
			return result;
		}
		AllCarInfoExample allCarInfoExample = new AllCarInfoExample();
		AllCarInfoExample.Criteria criteria = allCarInfoExample.createCriteria();
		criteria.andCarNumEqualTo(rentCarNum);
		int carNum = allCarInfoMapper.countByExample(allCarInfoExample);
		return String.valueOf(carNum);
	}
	//查询记录总数
	@Override
	public int countReportInfo(ActiveEmp activeEmp, ReportQueryVo reportQueryVo)throws Exception {
		// 非空判断
		reportQueryVo = reportQueryVo != null ? reportQueryVo : new ReportQueryVo();
		String userTypeId = activeEmp.getEmpTypeId();// 用户类型id
		if(userTypeId.matches("01\\d{2}")){
			ReportInfo reportInfo = reportQueryVo.getReportInfo();
			reportInfo = reportInfo != null ? reportInfo : new ReportInfo();
			reportInfo.setReportEmpId(activeEmp.getEmpId());
			reportQueryVo.setReportInfo(reportInfo);
		}
		return reportInfoMapperCustom.countReportInfo(reportQueryVo);
	}
	// 查询列表结果集
	@Override
	public List<ReportInfo> selectReportInfoList(ActiveEmp activeEmp, ReportQueryVo reportQueryVo) throws Exception {
		// 非空判断
		reportQueryVo = reportQueryVo != null ? reportQueryVo : new ReportQueryVo();

		String userTypeId = activeEmp.getEmpTypeId();// 用户类型id
		if(userTypeId.matches("01\\d{2}")){
			ReportInfo reportInfo = reportQueryVo.getReportInfo();
			reportInfo.setReportEmpId(activeEmp.getEmpId());
			reportQueryVo.setReportInfo(reportInfo);
		}
		return reportInfoMapperCustom.selectReportInfoList(reportQueryVo);
	}
	//单辆车信息查看页面
	@Override
	public ReportInfo getSingleCarReportInfoByReportId(String reportId) throws Exception {
		
		ReportInfo reportInfo = reportInfoMapperCustom.selectLatestByReportId(reportId);
		
		return reportInfo;
	}
	//编辑保修信息,包括用户修改,审核通过,审核不通过
	@Override
	public void editReportInfo(ActiveEmp activeEmp, ReportQueryVo reportQueryVo,String repairEmpId,String requType) throws Exception{
		
		ReportInfo reportInfoPage = reportQueryVo.getReportInfo();
		ReportInfo reportInfo = reportInfoMapper.selectByPrimaryKey(reportInfoPage.getReportId());
		switch (requType) {
		case "2401": //用户修改
			reportInfo.setCarFaultDesc(reportInfoPage.getCarFaultDesc());
			break;
		case "2402": //审核通过
			reportInfo.setState("2402");
			reportInfo.setCarFaultDesc(reportInfoPage.getCarFaultDesc());
			reportInfo.setFaultName(dictInfoMapperCustom.selectInfoByDictCode(reportInfo.getFaultTypeNum()));
			//创建维修数据表
			// 将reportInfo中数据设置到repairInfo
			RepairInfo repairInfo = new RepairInfo();
			BeanUtils.copyProperties(reportInfo, repairInfo);
			repairInfo.setRepairEmpId(repairEmpId);
			repairInfo.setSheetCreateDateTime(getDate());
			repairInfoMapper.insert(repairInfo);
			
			break;
		case "2403": //审核未通过
			reportInfo.setState("2403");
			reportInfo.setCarFaultDesc(reportInfoPage.getCarFaultDesc());
			break;
		/*case "2": //维修中
			reportInfo.setState("2404");
			reportInfo.setCarFaultDesc(reportInfoPage.getCarFaultDesc());
			
			break;*/
		default:
			ResultUtil.throwExcepion(ResultUtil.createFail(Config.MESSAGE, 101,null));
			break;
		}
		reportInfoMapper.updateByPrimaryKey(reportInfo);
	}
	
	//获取系统时间
	public static String getDate() {
		 SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm");
		 return formatter.format(new Date());
		 }

}
