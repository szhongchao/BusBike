package busbike.business.service;

import java.util.List;

import busbike.base.pojo.vo.ActiveEmp;
import busbike.business.pojo.po.RepairInfo;
import busbike.business.pojo.vo.RepairInfoCustom;
import busbike.business.pojo.vo.RepairQueryVo;


public interface RepairService {

	// 供货商药品目录查询列表
	/**
	 * 
	 * <p>
	 * Title: findGysypmlList
	 * </p>
	 * <p>
	 * Description:
	 * </p>
	 * 
	 * @param usergysid
	 *            id
	 * @param gysypmlQueryVo
	 *            查询条件
	 * @return
	 * @throws Exception
	 */
	//查询目录总数
	public int countRepairInfo(ActiveEmp activeEmp, RepairQueryVo repairQueryVo)throws Exception;
	// 根据分页信息查询目录列表
	public List<RepairInfo> selectRepairInfoList(ActiveEmp activeEmp,RepairQueryVo repairQueryVo) throws Exception;
	//写入维修列表
	public void insertRepair(String classId, RepairQueryVo repairQueryVo) throws Exception;
	//根据报修编号单辆车信息查看页面
	public RepairInfo	getSingleCarRepairInfoByReportId(String reportId) throws Exception;
	//根据维修编号单辆车信息查看页面
	public RepairInfo	getSingleCarRepairInfoByRepairId(String RepairId) throws Exception;
	//编辑保修信息,包括用户修改,审核通过,审核不通过
	public void editRepairInfo(ActiveEmp activeEmp,RepairQueryVo repairQueryVo,String requType) throws Exception;
	
	
}
