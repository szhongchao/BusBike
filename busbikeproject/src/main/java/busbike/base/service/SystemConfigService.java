package busbike.base.service;

import java.util.List;

import busbike.base.pojo.po.DictInfo;
import busbike.base.pojo.po.EmpInfo;
import busbike.base.pojo.po.ZoneInfo;

/*import busbike.base.pojo.po.Basicinfo;
import busbike.base.pojo.po.Dictinfo;*/

/**
 * 系统级别service
 * @author Thinkpad
 *
 */
public interface SystemConfigService {
	/**
	 * 根据CityId获取区域信息
	 */
	public List<ZoneInfo> findZoneInfoByCityId(String cityId) throws Exception;
	/**
	 * 根据UserClassId获取用户列表信息
	 */
	public List<EmpInfo> findEmpInforByEmpClassId(String classId) throws Exception;
	/**
	 * 根据SysKey获取系统类别的信息
	 */
	public List<DictInfo> findDictinfoByType(String typecode) throws Exception;
	

}
