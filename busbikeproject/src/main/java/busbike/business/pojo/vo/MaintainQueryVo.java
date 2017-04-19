package busbike.business.pojo.vo;

import busbike.base.pojo.vo.PageQuery;
import busbike.business.pojo.po.MaintainInfo;


public class MaintainQueryVo {
	
	
	private PageQuery pageQuery;//分页信息
	
	
	private MaintainInfo maintainInfo;


	public MaintainInfo getMaintainInfo() {
		return maintainInfo;
	}

	public void setMaintainInfo(MaintainInfo maintainInfo) {
		this.maintainInfo = maintainInfo;
	}

	public PageQuery getPageQuery() {
		return pageQuery;
	}

	public void setPageQuery(PageQuery pageQuery) {
		this.pageQuery = pageQuery;
	}

	
	
}
