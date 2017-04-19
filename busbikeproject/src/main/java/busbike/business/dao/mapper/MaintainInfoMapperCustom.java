package busbike.business.dao.mapper;

import java.util.List;

import busbike.business.pojo.po.MaintainInfo;
import busbike.business.pojo.vo.MaintainQueryVo;

public interface MaintainInfoMapperCustom {
    
	public int countMaintainInfo(MaintainQueryVo maintainQueryVo) throws Exception;
	//报修目录查询列表
	public List<MaintainInfo> selectMaintainInfoList(MaintainQueryVo maintainQueryVo) throws Exception;
	
	//根据保修编号从维修列表中查询车辆信息
	public MaintainInfo selectLatestByReportId (String reportId) throws Exception;
	
	
}