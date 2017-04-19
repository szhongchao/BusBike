package busbike.business.service;

import java.util.List;

import busbike.base.pojo.vo.ActiveEmp;
import busbike.business.pojo.po.MaintainInfo;
import busbike.business.pojo.vo.MaintainQueryVo;


public interface MaintainService {

	/**
	 * 
	 * <p>
	 * Title: findGysypmlList
	 * </p>
	 * <p>
	 * Description:
	 * </p>
	 * 
	 * @return
	 * @throws Exception
	 */
	//查询记录总数
	public int countMaintainInfo(ActiveEmp activeEmp, MaintainQueryVo maintainQueryVo)throws Exception;
	//查询列表信息
	public List<MaintainInfo> selectMaintainInfoList(ActiveEmp activeEmp,MaintainQueryVo maintainQueryVo) throws Exception;
	//单辆车信息查看
	public MaintainInfo getSingleCarMaintainInfoByReportId(String reportId) throws Exception;
	//单辆车信息查看
	public MaintainInfo getSingleCarMaintainInfoByMaintainId(String maintainId) throws Exception;
	
	//public MaintainInfo selectRepairInfo(ActiveEmp activeEmp, String id) throws Exception;
	
	
	
}
