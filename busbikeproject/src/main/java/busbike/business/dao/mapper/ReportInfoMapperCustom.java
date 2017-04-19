package busbike.business.dao.mapper;

import java.util.List;

import busbike.business.pojo.po.ReportInfo;
import busbike.business.pojo.vo.ReportQueryVo;

public interface ReportInfoMapperCustom {
    
	//报修目录查询列表
	public List<ReportInfo> selectReportInfoList(ReportQueryVo reportQueryVo) throws Exception;
	public int countReportInfo(ReportQueryVo reportQueryVo) throws Exception;
	//报修列表添加
	public void insertReport(ReportQueryVo reportQueryVo) throws Exception;

	// 根据报修编号查询报修记录-
	public ReportInfo selectLatestByReportId(String reportId) throws Exception;

	//修改审核状态
	public void updateReport(ReportInfo reportInfo) throws Exception;
}