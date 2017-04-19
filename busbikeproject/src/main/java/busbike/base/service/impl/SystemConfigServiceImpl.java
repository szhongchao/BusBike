package busbike.base.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import busbike.base.dao.mapper.DictInfoMapper;
import busbike.base.dao.mapper.EmpInfoMapper;
import busbike.base.dao.mapper.ZoneInfoMapper;
import busbike.base.pojo.po.DictInfo;
import busbike.base.pojo.po.DictInfoExample;
import busbike.base.pojo.po.EmpInfo;
import busbike.base.pojo.po.EmpInfoExample;
import busbike.base.pojo.po.ZoneInfo;
import busbike.base.pojo.po.ZoneInfoExample;
import busbike.base.service.SystemConfigService;

public class SystemConfigServiceImpl  implements SystemConfigService{

	
	@Autowired
	ZoneInfoMapper zoneInfoMapper;
	@Autowired
	EmpInfoMapper empInfoMapper;
	@Autowired
	DictInfoMapper dictInfoMapper;
	
	//根据CityId获取区域信息
	@Override
	public List<ZoneInfo> findZoneInfoByCityId(String cityId) throws Exception {

		ZoneInfoExample zoneInfoExample = new ZoneInfoExample();
		ZoneInfoExample.Criteria criteria = zoneInfoExample.createCriteria();
		
		criteria.andCityIdEqualTo(cityId);
		return zoneInfoMapper.selectByExample(zoneInfoExample);
		
	}
	//根据UserClassId获取用户列表信息
	@Override
	public List<EmpInfo> findEmpInforByEmpClassId(String classId) throws Exception {

		EmpInfoExample userInfoExample = new EmpInfoExample();
		EmpInfoExample.Criteria criteria = userInfoExample.createCriteria();
		
		criteria.andEmpClassIdEqualTo(classId);
		
		return empInfoMapper.selectByExample(userInfoExample);
		
	}
	//根据SysKey获取系统类别的信息
	@Override
	public List<DictInfo> findDictinfoByType(String typecode) throws Exception {

		DictInfoExample dictInfoExample = new DictInfoExample();
		DictInfoExample.Criteria criteria = dictInfoExample.createCriteria();
		
		criteria.andTypeCodeEqualTo(typecode);
		return dictInfoMapper.selectByExample(dictInfoExample);
	}
	

}
