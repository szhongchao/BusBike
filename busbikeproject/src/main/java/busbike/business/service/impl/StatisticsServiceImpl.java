package busbike.business.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import busbike.base.process.context.Config;
import busbike.base.process.result.ResultUtil;
import busbike.business.dao.mapper.AllCarInfoMapper;
import busbike.business.dao.mapper.RentInfoMapper;
import busbike.business.dao.mapper.SingleCarInfoMapperCustom;
import busbike.business.pojo.po.AllCarInfo;
import busbike.business.pojo.po.AllCarInfoExample;
import busbike.business.pojo.po.RentInfo;
import busbike.business.pojo.po.RentInfoExample;
import busbike.business.pojo.po.SingleCarInfo;
import busbike.business.pojo.vo.SingleCarQueryVo;
import busbike.business.service.StatisticsService;

public class StatisticsServiceImpl implements StatisticsService  {
	@Autowired
	private RentInfoMapper rentInfoMapper;
	@Autowired
	private SingleCarInfoMapperCustom singleCarInfoMapperCustom;
	@Autowired
	private AllCarInfoMapper allCarInfoMapper;

	@Override
	public List<RentInfo> findRentInfoList(String rentId) throws Exception {
		
		RentInfoExample rentInfoExample = new RentInfoExample();
		RentInfoExample.Criteria criteria = rentInfoExample.createCriteria();
		criteria.andZoneNameEqualTo("城东");
		
		List<RentInfo> rentInfoList = rentInfoMapper.selectByExample(rentInfoExample);
		
		return  rentInfoList;
		
		
	}

	@Override
	public List<SingleCarInfo> singleCarInfoList(SingleCarQueryVo singleCarUseQueryVo) throws Exception {
		
		//验证单车是否存在
		
		
		
		return  singleCarInfoMapperCustom.findSingleCarListByCarNum(singleCarUseQueryVo);
	}

	@Override
	public List<AllCarInfo> findAllCarInfoList(String topNum, String bottomNum) throws Exception {
		
		AllCarInfoExample allCarInfoExample = new AllCarInfoExample();
		
		AllCarInfoExample.Criteria criteria = allCarInfoExample.createCriteria();
		criteria.andCarNumBetween(topNum, bottomNum);
		int allCarNum  = allCarInfoMapper.countByExample(allCarInfoExample);
		if(allCarNum > 1000){

			ResultUtil.throwExcepion(ResultUtil.createFail(Config.MESSAGE, 710,
					null));
		}
		
		return allCarInfoMapper.selectByExample(allCarInfoExample);
	}

	
	

}
