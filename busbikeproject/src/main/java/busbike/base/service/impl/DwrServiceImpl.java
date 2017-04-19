package busbike.base.service.impl;

import org.springframework.beans.factory.annotation.Autowired;

import busbike.base.service.DwrService;
import busbike.base.service.SystemConfigService;
import busbike.business.dao.mapper.AllCarInfoMapper;
import busbike.business.pojo.po.AllCarInfoExample;


public class DwrServiceImpl implements DwrService {
	
	@Autowired
	SystemConfigService systemConfigService;
	
	@Autowired
	AllCarInfoMapper allCarInfoMapper;
	
	/**
	 * 测试方法
	 * @return
	 * @throws Exception
	 */
	public String testdwr() throws Exception{
		return "helloworld";
	}
	
	public String testdwr2(String name) throws Exception{
		return "helloworld "+name;
	}
	@Override
	public String checkCarExist(String rentCarNum) throws Exception{
		String result = "1";
		if(null == rentCarNum || "".equals(rentCarNum)){
			result = "0";
			return result;
		}
		AllCarInfoExample allCarInfoExample = new AllCarInfoExample();
		AllCarInfoExample.Criteria criteria = allCarInfoExample.createCriteria();
		criteria.andCarNumEqualTo(rentCarNum);
		int carNum = allCarInfoMapper.countByExample(allCarInfoExample);
		return String.valueOf(carNum);
	}
	
	/**
	 * 获取年度，获取近6年
	 */
	/*public List<Map<String, String>> businessyear() throws Exception{
		//当前年
		int year = Integer.parseInt(MyUtil.get_YYYY(MyUtil.getDate()));
		//定义了一个list对象，list里边是map
		List<Map<String, String>> result  = new ArrayList<Map<String,String>>();
		//将近5年放入list
		for(int i=year;i>=year-5;i--){
			 Map<String, String> index = new HashMap<String, String>();
			 index.put("info", i+"");
	      	 index.put("value", i+"");
	      	 result.add(index);
		}
		//将list返回
		return result;
	}*/
	
	/**
	 * 根据typecode获取数据字典id信息
	 *//*
	@Override
	public List<Map<String, String>> getDictinfoIdlist(String typecode) throws Exception {
        List<Dictinfo> list = systemConfigService.findDictinfoByType(typecode);
        
        List<Map<String, String>> result  = new ArrayList<Map<String,String>>();
        for(Dictinfo dictinfo:list){
        	Map<String, String> index = new HashMap<String, String>();
        	index.put("info", dictinfo.getInfo());
        	index.put("value", dictinfo.getId());//将数据字典表中的id放入，用于在页面中将id作为select下拉框的value值
        	result.add(index);
        }
		return result;
	}
	*//**
	 * 根据typecode获取数据字典dictcode信息
	 *//*
	@Override
	public List<Map<String, String>> getDictinfoCodelist(String typecode) throws Exception {
        List<Dictinfo> list = systemConfigService.findDictinfoByType(typecode);
        
        List<Map<String, String>> result  = new ArrayList<Map<String,String>>();
        for(Dictinfo dictinfo:list){
        	Map<String, String> index = new HashMap<String, String>();
        	index.put("info", dictinfo.getInfo());
        	index.put("value", dictinfo.getDictcode());//将数据字典的dictcode值放入，用于在页面中将dictcode值作为select下拉框的value值
        	result.add(index);
        }
		return result;
	}*/
	

}
