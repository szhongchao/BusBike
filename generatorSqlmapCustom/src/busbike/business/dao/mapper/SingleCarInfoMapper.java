package busbike.business.dao.mapper;

import busbike.business.pojo.po.SingleCarInfo;
import busbike.business.pojo.po.SingleCarInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SingleCarInfoMapper {
    int countByExample(SingleCarInfoExample example);

    int deleteByExample(SingleCarInfoExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(SingleCarInfo record);

    int insertSelective(SingleCarInfo record);

    List<SingleCarInfo> selectByExample(SingleCarInfoExample example);

    SingleCarInfo selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") SingleCarInfo record, @Param("example") SingleCarInfoExample example);

    int updateByExample(@Param("record") SingleCarInfo record, @Param("example") SingleCarInfoExample example);

    int updateByPrimaryKeySelective(SingleCarInfo record);

    int updateByPrimaryKey(SingleCarInfo record);
}