package busbike.business.dao.mapper;

import java.util.List;

import busbike.business.pojo.po.RepairInfo;
import busbike.business.pojo.vo.RepairQueryVo;

public interface RepairInfoMapperCustom {
	public int countRepairInfo(RepairQueryVo repairQueryVo) throws Exception;
	//报修目录查询列表
	public List<RepairInfo> selectRepairInfoList(RepairQueryVo repairQueryVo) throws Exception;

	//报修列表添加
	public void insertRepair(RepairQueryVo repairQueryVo) throws Exception;
	// 根据报修编号查询报修记录-
	public RepairInfo selectLatestByRepairId(String reportId) throws Exception;
	//报修列表添加
	public void updateRepair(RepairInfo repairInfo) throws Exception;
	//根据保修编号从维修列表中查询车辆信息
	public RepairInfo selectLatestByReportId (String reportId) throws Exception;
}