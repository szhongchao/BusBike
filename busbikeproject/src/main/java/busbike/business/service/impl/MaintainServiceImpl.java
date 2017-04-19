package busbike.business.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import busbike.base.pojo.vo.ActiveEmp;
import busbike.business.dao.mapper.MaintainInfoMapper;
import busbike.business.dao.mapper.MaintainInfoMapperCustom;
import busbike.business.pojo.po.MaintainInfo;
import busbike.business.pojo.vo.MaintainQueryVo;
import busbike.business.service.MaintainService;


public class MaintainServiceImpl implements MaintainService {
	
	@Autowired
	private MaintainInfoMapperCustom maintainInfoMapperCustom;
	@Autowired
	private MaintainInfoMapper maintainInfoMapper;
	
	//查询记录总数
	@Override
	public int countMaintainInfo(ActiveEmp activeEmp, MaintainQueryVo maintainQueryVo) throws Exception {
		// 非空判断
		maintainQueryVo = maintainQueryVo != null ? maintainQueryVo : new MaintainQueryVo();

		String empTypeId = activeEmp.getEmpTypeId();// 用户类型id
		//添加用户权限查询
		if(empTypeId.matches("01\\d{2}")){ //普通用户
			MaintainInfo maintainInfo = maintainQueryVo.getMaintainInfo();
			maintainInfo = maintainInfo != null ? maintainInfo : new MaintainInfo();
			maintainInfo.setReportEmpId(activeEmp.getEmpId());
			maintainQueryVo.setMaintainInfo(maintainInfo);
			
		}else if(empTypeId.matches("3005")){//维修员工
			MaintainInfo maintainInfo = maintainQueryVo.getMaintainInfo();
			maintainInfo = maintainInfo != null ? maintainInfo : new MaintainInfo();
			maintainInfo.setRepairEmpId(activeEmp.getEmpId());
			maintainQueryVo.setMaintainInfo(maintainInfo);
		}else if(empTypeId.matches("3004")){//审核员
			MaintainInfo maintainInfo = maintainQueryVo.getMaintainInfo();
			maintainInfo = maintainInfo != null ? maintainInfo : new MaintainInfo();
			maintainInfo.setCheckEmpId(activeEmp.getEmpId());
			maintainQueryVo.setMaintainInfo(maintainInfo);
		}
		return maintainInfoMapperCustom.countMaintainInfo(maintainQueryVo);
	}
	//查询列表信息
	@Override
	public List<MaintainInfo> selectMaintainInfoList(ActiveEmp activeEmp, MaintainQueryVo maintainQueryVo)
			throws Exception {
		// 非空判断
		maintainQueryVo = maintainQueryVo != null ? maintainQueryVo : new MaintainQueryVo();

		String empTypeId = activeEmp.getEmpTypeId();// 用户类型id
		//添加用户权限查询
		if(empTypeId.matches("01\\d{2}")){ //普通用户
			MaintainInfo maintainInfo = maintainQueryVo.getMaintainInfo();
			maintainInfo = maintainInfo != null ? maintainInfo : new MaintainInfo();
			maintainInfo.setReportEmpId(activeEmp.getEmpId());
			maintainQueryVo.setMaintainInfo(maintainInfo);
			
		}else if(empTypeId.matches("3005")){//维修员工
			MaintainInfo maintainInfo = maintainQueryVo.getMaintainInfo();
			maintainInfo = maintainInfo != null ? maintainInfo : new MaintainInfo();
			maintainInfo.setRepairEmpId(activeEmp.getEmpId());
			maintainQueryVo.setMaintainInfo(maintainInfo);
		}else if(empTypeId.matches("3004")){//审核员
			MaintainInfo maintainInfo = maintainQueryVo.getMaintainInfo();
			maintainInfo = maintainInfo != null ? maintainInfo : new MaintainInfo();
			maintainInfo.setCheckEmpId(activeEmp.getEmpId());
			maintainQueryVo.setMaintainInfo(maintainInfo);
		}
		return maintainInfoMapperCustom.selectMaintainInfoList(maintainQueryVo);
	}
	//单辆车信息查看
	@Override
	public MaintainInfo getSingleCarMaintainInfoByReportId(String reportId) throws Exception {
		MaintainInfo maintainInfo = maintainInfoMapperCustom.selectLatestByReportId(reportId);
		return maintainInfo;
	}
	//单辆车信息查看
	@Override
	public MaintainInfo getSingleCarMaintainInfoByMaintainId(String maintainId) throws Exception {
		MaintainInfo maintainInfo = maintainInfoMapper.selectByPrimaryKey(new Integer(maintainId) );
		return maintainInfo;
	}

	


	
}
