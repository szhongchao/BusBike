package busbike.base.dao.mapper;

import java.util.List;

import busbike.base.pojo.po.EmpInfo;
import busbike.base.pojo.vo.EmpInfoQueryVo;

public interface EmpInfoMapperCustom {
	
	//查询用户列表
	public List<EmpInfo> findEmpInfoList(EmpInfoQueryVo empInfoQueryVo) throws Exception;
	
	//查询用户列表
	public EmpInfo selectByEmpName(String empName) throws Exception;
	
	//查询总数
	public int findEmpInfoCount(EmpInfoQueryVo empInfoQueryVo) throws Exception;

}
