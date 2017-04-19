package busbike.business.action;

import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import busbike.base.pojo.po.DictInfo;
import busbike.base.process.result.DataGridResultInfo;
import busbike.base.service.SystemConfigService;
import busbike.business.pojo.po.AllCarInfo;
import busbike.business.pojo.po.RentInfo;
import busbike.business.pojo.po.SingleCarInfo;
import busbike.business.pojo.vo.SingleCarQueryVo;
import busbike.business.service.StatisticsService;

@Controller
@RequestMapping("/statistics")
public class StatisticsAction {

	@Autowired
	private StatisticsService statisticsService;
	
	// 查询页面
	@RequestMapping("/usedata")
	public String querymaintain(Map<String,Object> map,Model model,ModelMap modelMap) throws Exception {
		
		
		
		
		 map.put("names", Arrays.asList("caoyc","zhh","cjx"));
		 model.addAttribute("time", new Date());
		 modelMap.addAttribute("city", "ChengDu");
		 modelMap.put("gender", "male");   
		
				
		return "/business/statistics/usedata";
	}
	// 地图调用页面
		@RequestMapping("/gis")
		public String gis(Model model) throws Exception {
			//用户类型
			List<RentInfo> rentInfo = statisticsService.findRentInfoList("3501");
			model.addAttribute("rentInfo", rentInfo);
					
			return "/business/statistics/gis";
		}
		// 地图调用页面
		@RequestMapping("/carAnaly")
		public String singlecar(Model model) throws Exception {
			//用户类型
			List<RentInfo> rentInfo = statisticsService.findRentInfoList("3501");
			model.addAttribute("rentInfo", rentInfo);
					
			return "/business/statistics/carAnaly";
		}
	@RequestMapping("/rentInfo")
	public @ResponseBody DataGridResultInfo rentInfo( )throws Exception{
		
		List<RentInfo> rentInfo = statisticsService.findRentInfoList("3501");
		
		DataGridResultInfo dataGridResultInfo = new DataGridResultInfo();
		
		//填充  rows
		dataGridResultInfo.setRows(rentInfo);
		
		return dataGridResultInfo;
	}
	
	@RequestMapping("/allCarUseInfo")
	public @ResponseBody DataGridResultInfo allCarUseInfo(String bottomNum, String topNum )throws Exception{
		
		List<AllCarInfo> allCarUseInfo = statisticsService.findAllCarInfoList(bottomNum,topNum);
		
		DataGridResultInfo dataGridResultInfo = new DataGridResultInfo();
		
		//填充  rows
		dataGridResultInfo.setRows(allCarUseInfo);
		
		return dataGridResultInfo;
	}
	
	
	@RequestMapping("/singleCarUserInfo")
	public @ResponseBody DataGridResultInfo singleCarUserInfo(String carNum )throws Exception{
		String minUseMin = "0";
		String maxUseMin = "100";
		
		SingleCarQueryVo singleCarUseQueryVo = new SingleCarQueryVo();
		
		singleCarUseQueryVo.setCarNum(carNum);
		singleCarUseQueryVo.setMinUseMin(minUseMin);
		singleCarUseQueryVo.setMaxUseMin(maxUseMin);
		
		List<SingleCarInfo> singleCarUserList = statisticsService.singleCarInfoList(singleCarUseQueryVo);
		
		DataGridResultInfo dataGridResultInfo = new DataGridResultInfo();
		
		//填充  rows
		dataGridResultInfo.setRows(singleCarUserList);
		
		return dataGridResultInfo;
	}


}
