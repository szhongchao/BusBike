package busbike.base.dao.mapper;

import busbike.base.pojo.po.DictType;
import busbike.base.pojo.po.DictTypeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DictTypeMapper {
    int countByExample(DictTypeExample example);

    int deleteByExample(DictTypeExample example);

    int deleteByPrimaryKey(Integer dictId);

    int insert(DictType record);

    int insertSelective(DictType record);

    List<DictType> selectByExample(DictTypeExample example);

    DictType selectByPrimaryKey(Integer dictId);

    int updateByExampleSelective(@Param("record") DictType record, @Param("example") DictTypeExample example);

    int updateByExample(@Param("record") DictType record, @Param("example") DictTypeExample example);

    int updateByPrimaryKeySelective(DictType record);

    int updateByPrimaryKey(DictType record);
}