package busbike.business.dao.mapper;

import busbike.business.pojo.po.RentInfo;
import busbike.business.pojo.po.RentInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface RentInfoMapper {
    int countByExample(RentInfoExample example);

    int deleteByExample(RentInfoExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(RentInfo record);

    int insertSelective(RentInfo record);

    List<RentInfo> selectByExample(RentInfoExample example);

    RentInfo selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") RentInfo record, @Param("example") RentInfoExample example);

    int updateByExample(@Param("record") RentInfo record, @Param("example") RentInfoExample example);

    int updateByPrimaryKeySelective(RentInfo record);

    int updateByPrimaryKey(RentInfo record);
}