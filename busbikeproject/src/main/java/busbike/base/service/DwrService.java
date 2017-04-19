package busbike.base.service;

/**
 * dwr的服务接口
 * @author Thinkpad
 *
 */
public interface DwrService {
	//测试方法
	public String testdwr() throws Exception;
	
	public String checkCarExist(String CarNum) throws Exception;
	/*//获取近几年记录
	public List<Map<String, String>> businessyear() throws Exception;
	//获取数据字典，用于那使用数据字典id的项目
	public List<Map<String, String>> getDictinfoIdlist(String typecode) throws Exception;
	//获取数据字典，用于那使用数据字典dictcode的项目
	public List<Map<String, String>> getDictinfoCodelist(String typecode) throws Exception;*/
}
