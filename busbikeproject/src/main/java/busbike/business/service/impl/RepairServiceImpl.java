package busbike.business.service.impl;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;

import busbike.base.pojo.vo.ActiveEmp;
import busbike.base.process.context.Config;
import busbike.base.process.result.ResultUtil;
import busbike.business.dao.mapper.MaintainInfoMapper;
import busbike.business.dao.mapper.RepairInfoMapper;
import busbike.business.dao.mapper.RepairInfoMapperCustom;
import busbike.business.dao.mapper.ReportInfoMapper;
import busbike.business.pojo.po.MaintainInfo;
import busbike.business.pojo.po.RepairInfo;
import busbike.business.pojo.po.ReportInfo;
import busbike.business.pojo.vo.RepairQueryVo;
import busbike.business.service.RepairService;


public class RepairServiceImpl implements RepairService {

	@Autowired
	private RepairInfoMapperCustom repairInfoMapperCustom;

	@Autowired
	private RepairInfoMapper repairInfoMapper;
	@Autowired
	private ReportInfoMapper reportInfoMapper;
	
	@Autowired
	private MaintainInfoMapper maintainInfoMapper;
	
	//单车信息查询
	@Override
	public RepairInfo getSingleCarRepairInfoByReportId(String reportId) throws Exception {

		RepairInfo repairInfo = repairInfoMapperCustom.selectLatestByReportId(reportId);
		return repairInfo;
	}
	//单车信息查询
	@Override
	public RepairInfo getSingleCarRepairInfoByRepairId(String repairId) throws Exception {

		RepairInfo repairInfo = repairInfoMapper.selectByPrimaryKey(new Integer(repairId) );
		return repairInfo;
	}

	@Override
	public int countRepairInfo(ActiveEmp activeEmp, RepairQueryVo repairQueryVo) throws Exception {
		// 非空判断
		repairQueryVo = repairQueryVo != null ? repairQueryVo : new RepairQueryVo();

		String empTypeId = activeEmp.getEmpTypeId();// 用户类型id
		if(empTypeId.matches("3005")){
			RepairInfo repairInfo = repairQueryVo.getRepairInfo();
			repairInfo = repairInfo != null ? repairInfo : new RepairInfo();
			repairInfo.setRepairEmpId(activeEmp.getEmpId());
			repairQueryVo.setRepairInfo(repairInfo);
		}
		
	
		return repairInfoMapperCustom.countRepairInfo(repairQueryVo);
	}
	@Override
	public List<RepairInfo> selectRepairInfoList(ActiveEmp activeEmp, RepairQueryVo repairQueryVo) throws Exception {
		// 非空判断
		repairQueryVo = repairQueryVo != null ? repairQueryVo : new RepairQueryVo();

		String empTypeId = activeEmp.getEmpTypeId();// 用户类型id
		if(empTypeId.matches("3005")){
			RepairInfo repairInfo = repairQueryVo.getRepairInfo();
			repairInfo = repairInfo != null ? repairInfo : new RepairInfo();
			repairInfo.setRepairEmpId(activeEmp.getEmpId());
			repairQueryVo.setRepairInfo(repairInfo);
		}
		
		
		return repairInfoMapperCustom.selectRepairInfoList(repairQueryVo);
	}

	
	@Override
	public void insertRepair(String classId, RepairQueryVo repairQueryVo) throws Exception {
		//验证用户权限
		if(!classId.equals("0301")){
			
			ResultUtil.throwExcepion(ResultUtil.createFail(Config.MESSAGE, 103,
					null));
		}
		//验证车辆信息
		//验证位置信息
		//验证故障信息
		repairInfoMapperCustom.insertRepair(repairQueryVo);
		
	}

	

	@Override
	public void editRepairInfo(ActiveEmp activeEmp, RepairQueryVo repairQueryVo,String requType)throws Exception {
		
		RepairInfo repairInfoPage = repairQueryVo.getRepairInfo();
		RepairInfo repairInfo = repairInfoMapperCustom.selectLatestByReportId(repairInfoPage.getReportId().toString());
		
		switch (requType) {
		
		case "2404": //创建维修工作
			repairInfo.setState("2404");
			repairInfo.setCarFaultDesc(repairInfoPage.getCarFaultDesc());
			//添加维修人员
			repairInfo.setRepairEmpId(repairInfoPage.getRepairEmpId());
			//修改报修列表的状态为维修中
			ReportInfo reportInfo = reportInfoMapper.selectByPrimaryKey(repairInfoPage.getReportId());
			reportInfo.setState("2404");
			reportInfoMapper.updateByPrimaryKey(reportInfo);
			break;
		
		case "2409":
			//接受任务
			repairInfo.setState("2409");
			//repairInfo.setCarFaultDesc(repairInfoPage.getCarFaultDesc());
			//repairInfo.setFaultName(dictInfoMapperCustom.selectInfoByDictCode(repairInfo.getFaultTypeNum()));
			break;
		case "2402":
			//拒绝任务
			repairInfo.setState("2402");
			//repairInfo.setCarFaultDesc(repairInfoPage.getCarFaultDesc());
			break;
		case "2405":
			//开始维修
			repairInfo.setState("2405");
			//repairInfo.setCarFaultDesc(repairInfoPage.getCarFaultDesc());
			break;
		case "2406":
			//维修成功
			repairInfo.setState("2406");
			repairInfo.setCarFaultDesc(repairInfoPage.getCarFaultDesc());
			
			break;
		case "2407":
			//维修失败
			repairInfo.setState("2407");
			//repairInfo.setCarFaultDesc(repairInfoPage.getCarFaultDesc());
			break;
		case "24081":
			//维修成功
			repairInfo.setState("2408");
			//repairInfo.setCarFaultDesc(repairInfoPage.getCarFaultDesc());
			//讲数据写入保养列表
			// 将repairInfo中数据设置到maintainInfo
			MaintainInfo maintainInfo = new MaintainInfo();
			BeanUtils.copyProperties(repairInfo, maintainInfo);
			maintainInfo.setState("24081");
			maintainInfoMapper.insert(maintainInfo);
			break;
		case "24082":
			//维修失败
			repairInfo.setState("2408");
			//repairInfo.setCarFaultDesc(repairInfoPage.getCarFaultDesc());
			//讲数据写入保养列表
			// 将repairInfo中数据设置到maintainInfo
			MaintainInfo maintainInfo1 = new MaintainInfo();
			BeanUtils.copyProperties(repairInfo, maintainInfo1);
			maintainInfo1.setState("24082");
			maintainInfoMapper.insert(maintainInfo1);
			break;
		default:
			ResultUtil.throwExcepion(ResultUtil.createFail(Config.MESSAGE, 101,null));
			break;
		}
		
		repairInfoMapper.updateByPrimaryKey(repairInfo);
	}
	
	//获取系统时间
	public static String getDate() {
		 SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm");
		 return formatter.format(new Date());
		 }
	}
