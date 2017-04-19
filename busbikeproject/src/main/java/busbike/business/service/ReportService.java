package busbike.business.service;

import java.util.List;

import busbike.base.pojo.vo.ActiveEmp;
import busbike.business.pojo.po.ReportInfo;
import busbike.business.pojo.vo.ReportQueryVo;
import busbike.business.pojo.vo.SingleCarInfoCustom;


public interface ReportService {

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
	 *            供货商id
	 * @param gysypmlQueryVo
	 *            查询条件
	 * @return
	 * @throws Exception
	 */
	//根据车辆编号查询最新的车辆状态
	public SingleCarInfoCustom getSingleCarLatestInfoByCarNum(String carNum) throws Exception;
	//添加报修记录
	public void insertReport(ActiveEmp activeEmp, ReportInfo reportInfo) throws Exception;
	//审核车辆是否存在
	public String checkCarExist(String carNum) throws Exception;
	//查询记录总数
	public int countReportInfo(ActiveEmp activeEmp, ReportQueryVo reportQueryVo)throws Exception;
	// 查询列表结果集
	public List<ReportInfo> selectReportInfoList(ActiveEmp activeEmp,ReportQueryVo reportQueryVo) throws Exception;
	//单辆车信息查看页面
	public ReportInfo  getSingleCarReportInfoByReportId(String reportId) throws Exception;
	//编辑保修信息,包括用户修改,审核通过,审核不通过
	public void editReportInfo(ActiveEmp activeEmp,ReportQueryVo reportQueryVo,String repairEmpId,String requType) throws Exception;
	
	
	
}
