package busbike.business.dao.mapper;

import busbike.business.pojo.po.MaintainInfo;
import busbike.business.pojo.po.MaintainInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MaintainInfoMapper {
    int countByExample(MaintainInfoExample example);

    int deleteByExample(MaintainInfoExample example);

    int deleteByPrimaryKey(Integer maintainId);

    int insert(MaintainInfo record);

    int insertSelective(MaintainInfo record);

    List<MaintainInfo> selectByExample(MaintainInfoExample example);

    MaintainInfo selectByPrimaryKey(Integer maintainId);

    int updateByExampleSelective(@Param("record") MaintainInfo record, @Param("example") MaintainInfoExample example);

    int updateByExample(@Param("record") MaintainInfo record, @Param("example") MaintainInfoExample example);

    int updateByPrimaryKeySelective(MaintainInfo record);

    int updateByPrimaryKey(MaintainInfo record);
}