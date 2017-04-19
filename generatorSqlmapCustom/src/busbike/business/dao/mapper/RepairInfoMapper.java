package busbike.business.dao.mapper;

import busbike.business.pojo.po.RepairInfo;
import busbike.business.pojo.po.RepairInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface RepairInfoMapper {
    int countByExample(RepairInfoExample example);

    int deleteByExample(RepairInfoExample example);

    int deleteByPrimaryKey(Integer repairId);

    int insert(RepairInfo record);

    int insertSelective(RepairInfo record);

    List<RepairInfo> selectByExample(RepairInfoExample example);

    RepairInfo selectByPrimaryKey(Integer repairId);

    int updateByExampleSelective(@Param("record") RepairInfo record, @Param("example") RepairInfoExample example);

    int updateByExample(@Param("record") RepairInfo record, @Param("example") RepairInfoExample example);

    int updateByPrimaryKeySelective(RepairInfo record);

    int updateByPrimaryKey(RepairInfo record);
}