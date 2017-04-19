package busbike.business.pojo.vo;

import busbike.base.pojo.vo.ActiveEmp;
import busbike.base.pojo.vo.PageQuery;
import busbike.business.pojo.po.ReportInfo;


public class ReportQueryVo {
	
	private PageQuery pageQuery;//分页信息
	
	private ActiveEmp activeEmp; //当前用户

	private ReportInfo reportInfo;
	
	public ReportInfo getReportInfo() {
		return reportInfo;
	}

	public void setReportInfo(ReportInfo reportInfo) {
		this.reportInfo = reportInfo;
	}

	public ActiveEmp getActiveEmp() {
		return activeEmp;
	}

	public void setActiveEmp(ActiveEmp activeEmp) {
		this.activeEmp = activeEmp;
	}
	
	

	public PageQuery getPageQuery() {
		return pageQuery;
	}

	public void setPageQuery(PageQuery pageQuery) {
		this.pageQuery = pageQuery;
	}

	
	
}
