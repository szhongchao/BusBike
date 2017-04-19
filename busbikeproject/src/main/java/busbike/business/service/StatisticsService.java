package busbike.business.service;

import java.util.List;

import busbike.business.pojo.po.AllCarInfo;
import busbike.business.pojo.po.RentInfo;
import busbike.business.pojo.po.SingleCarInfo;
import busbike.business.pojo.vo.SingleCarQueryVo;

public interface StatisticsService {
  List<AllCarInfo> findAllCarInfoList(String topNum, String bottomNum) throws Exception;
  List<RentInfo> findRentInfoList(String rentId ) throws Exception;
  List<SingleCarInfo> singleCarInfoList(SingleCarQueryVo singleCarUseQueryVo ) throws Exception;
}
