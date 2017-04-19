package busbike.business.pojo.vo;

import busbike.base.pojo.vo.PageQuery;
import busbike.business.pojo.po.RepairInfo;


public class RepairQueryVo {
	
	private PageQuery pageQuery;//分页信息
	
	private RepairInfo repairInfo;
	
	

	public RepairInfo getRepairInfo() {
		return repairInfo;
	}

	public void setRepairInfo(RepairInfo repairInfo) {
		this.repairInfo = repairInfo;
	}

	public PageQuery getPageQuery() {
		return pageQuery;
	}

	public void setPageQuery(PageQuery pageQuery) {
		this.pageQuery = pageQuery;
	}

	
	
}
