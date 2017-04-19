package busbike.base.dao.mapper;

import busbike.base.pojo.po.ZoneInfo;
import busbike.base.pojo.po.ZoneInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ZoneInfoMapper {
    int countByExample(ZoneInfoExample example);

    int deleteByExample(ZoneInfoExample example);

    int insert(ZoneInfo record);

    int insertSelective(ZoneInfo record);

    List<ZoneInfo> selectByExample(ZoneInfoExample example);

    int updateByExampleSelective(@Param("record") ZoneInfo record, @Param("example") ZoneInfoExample example);

    int updateByExample(@Param("record") ZoneInfo record, @Param("example") ZoneInfoExample example);
}