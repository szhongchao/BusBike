package busbike.base.dao.mapper;

import busbike.base.pojo.po.DictInfo;
import busbike.base.pojo.po.DictInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DictInfoMapper {
    int countByExample(DictInfoExample example);

    int deleteByExample(DictInfoExample example);

    int deleteByPrimaryKey(Integer dictInfoId);

    int insert(DictInfo record);

    int insertSelective(DictInfo record);

    List<DictInfo> selectByExample(DictInfoExample example);

    DictInfo selectByPrimaryKey(Integer dictInfoId);

    int updateByExampleSelective(@Param("record") DictInfo record, @Param("example") DictInfoExample example);

    int updateByExample(@Param("record") DictInfo record, @Param("example") DictInfoExample example);

    int updateByPrimaryKeySelective(DictInfo record);

    int updateByPrimaryKey(DictInfo record);
}