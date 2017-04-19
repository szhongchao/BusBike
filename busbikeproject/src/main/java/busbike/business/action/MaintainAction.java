package busbike.business.action;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import busbike.base.pojo.vo.ActiveEmp;
import busbike.base.pojo.vo.PageQuery;
import busbike.base.process.result.DataGridResultInfo;
import busbike.business.pojo.po.MaintainInfo;
import busbike.business.pojo.vo.MaintainQueryVo;
import busbike.business.service.MaintainService;

@Controller
@RequestMapping("/maintain")
public class MaintainAction {
	
	@Autowired
	private MaintainService maintainService;
	
	//查询列表信息
	@RequestMapping("/queryMaintain_result")
	public @ResponseBody
	DataGridResultInfo queryMaintainResult(ActiveEmp activeEmp,MaintainQueryVo maintainQueryVo,int page, int rows) throws Exception {
		// 列表的总数
		int total = maintainService.countMaintainInfo(activeEmp,maintainQueryVo);
		// 分页参数
		PageQuery pageQuery = new PageQuery();
		pageQuery.setPageParams(total, rows, page);
		maintainQueryVo.setPageQuery(pageQuery);// 设置分页参数
		// 分页查询列表
		List<MaintainInfo> list = maintainService.selectMaintainInfoList(activeEmp,maintainQueryVo);
		DataGridResultInfo dataGridResultInfo = new DataGridResultInfo();
		dataGridResultInfo.setTotal(total);
		dataGridResultInfo.setRows(list);
		return dataGridResultInfo;
	}
	//单辆车信息查看页面
	@RequestMapping("/singleCarInfo")
	public @ResponseBody MaintainInfo getSingleCarMaintainInfo(ActiveEmp activeEmp,String reportId)throws Exception{
		MaintainInfo maintainInfo= maintainService.getSingleCarMaintainInfoByReportId(reportId);
		return maintainInfo;
	}
	
		

}
