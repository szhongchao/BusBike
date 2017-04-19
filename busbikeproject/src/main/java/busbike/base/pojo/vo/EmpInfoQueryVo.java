package busbike.base.pojo.vo;

import busbike.base.pojo.po.EmpInfo;

/**
 * 
 * <p>Title: SysuserQueryVo</p>
 * <p>Description:包装类，用于页面向action传递参数，将数据传到mybatis </p>
 * <p>Company: www.itcast.com</p> 
 * @author	苗润土
 * @date	2014年11月26日上午10:32:50
 * @version 1.0
 */
public class EmpInfoQueryVo {
	
	//分页参数
	private PageQuery pageQuery;
	
	private EmpInfo empInfo;
	
	private ActiveEmp activeEmp;


	public ActiveEmp getActiveEmp() {
		return activeEmp;
	}

	public void setActiveEmp(ActiveEmp activeEmp) {
		this.activeEmp = activeEmp;
	}

	public EmpInfo getEmpInfo() {
		return empInfo;
	}

	public void setEmpInfo(EmpInfo empInfo) {
		this.empInfo = empInfo;
	}

	public PageQuery getPageQuery() {
		return pageQuery;
	}

	public void setPageQuery(PageQuery pageQuery) {
		this.pageQuery = pageQuery;
	}
	
	

}
