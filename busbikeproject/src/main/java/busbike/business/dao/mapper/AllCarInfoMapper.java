package busbike.business.dao.mapper;

import busbike.business.pojo.po.AllCarInfo;
import busbike.business.pojo.po.AllCarInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AllCarInfoMapper {
    int countByExample(AllCarInfoExample example);

    int deleteByExample(AllCarInfoExample example);

    int deleteByPrimaryKey(Integer carInfoId);

    int insert(AllCarInfo record);

    int insertSelective(AllCarInfo record);

    List<AllCarInfo> selectByExample(AllCarInfoExample example);

    AllCarInfo selectByPrimaryKey(Integer carInfoId);

    int updateByExampleSelective(@Param("record") AllCarInfo record, @Param("example") AllCarInfoExample example);

    int updateByExample(@Param("record") AllCarInfo record, @Param("example") AllCarInfoExample example);

    int updateByPrimaryKeySelective(AllCarInfo record);

    int updateByPrimaryKey(AllCarInfo record);
}