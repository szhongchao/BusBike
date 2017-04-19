package busbike.business.dao.mapper;

import busbike.business.pojo.po.RentReturnInfo;
import busbike.business.pojo.po.RentReturnInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface RentReturnInfoMapper {
    int countByExample(RentReturnInfoExample example);

    int deleteByExample(RentReturnInfoExample example);

    int insert(RentReturnInfo record);

    int insertSelective(RentReturnInfo record);

    List<RentReturnInfo> selectByExample(RentReturnInfoExample example);

    int updateByExampleSelective(@Param("record") RentReturnInfo record, @Param("example") RentReturnInfoExample example);

    int updateByExample(@Param("record") RentReturnInfo record, @Param("example") RentReturnInfoExample example);
}