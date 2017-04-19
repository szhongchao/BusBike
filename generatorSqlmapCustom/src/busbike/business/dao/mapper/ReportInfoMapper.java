package busbike.business.dao.mapper;

import busbike.business.pojo.po.ReportInfo;
import busbike.business.pojo.po.ReportInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ReportInfoMapper {
    int countByExample(ReportInfoExample example);

    int deleteByExample(ReportInfoExample example);

    int deleteByPrimaryKey(Integer reportId);

    int insert(ReportInfo record);

    int insertSelective(ReportInfo record);

    List<ReportInfo> selectByExample(ReportInfoExample example);

    ReportInfo selectByPrimaryKey(Integer reportId);

    int updateByExampleSelective(@Param("record") ReportInfo record, @Param("example") ReportInfoExample example);

    int updateByExample(@Param("record") ReportInfo record, @Param("example") ReportInfoExample example);

    int updateByPrimaryKeySelective(ReportInfo record);

    int updateByPrimaryKey(ReportInfo record);
}