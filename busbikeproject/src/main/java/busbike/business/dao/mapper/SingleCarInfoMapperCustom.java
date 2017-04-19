package busbike.business.dao.mapper;

import java.util.List;

import busbike.business.pojo.po.SingleCarInfo;
import busbike.business.pojo.vo.SingleCarQueryVo;

public interface SingleCarInfoMapperCustom {
   

    List<SingleCarInfo> findSingleCarListByCarNum(SingleCarQueryVo singleCarQueryVo);
    int findSingleCarNumByCarNum();

   }