package busbike.business.dao.mapper;

import busbike.business.pojo.po.RentReturnInfo;

public interface RentReturnInfoMapperCustom {
	
	RentReturnInfo selectLatestByCarNum(String carNum);

}