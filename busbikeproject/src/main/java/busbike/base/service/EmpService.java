package busbike.base.service;

import java.util.List;

import busbike.base.pojo.po.EmpInfo;
import busbike.base.pojo.vo.ActiveEmp;
import busbike.base.pojo.vo.EmpInfoQueryVo;

public interface EmpService {
	
	//根据用户id查询用户信息
	public EmpInfo selectEmpInfoById(String empId) throws Exception;
	// 根据条件查询列表的总数
	public int countEmpInfo(EmpInfoQueryVo empInfoQueryVo) throws Exception;
	// 根据条件查询用户信息
	public List<EmpInfo> selectEmpInfoList(EmpInfoQueryVo empInfoQueryVo)throws Exception;
	//插入用户数据
	public void insertEmpInfo(EmpInfo empInfo) throws Exception;
	//删除用户
	public void deleteEmpInfo(String empId) throws Exception;
	//修改用户
	public void updateEmpInfo(String empId,EmpInfo empInfo)throws Exception;
	//用户登录
	public ActiveEmp checkEmpInfo(String empName,String password,String validateCode)throws Exception; 
	
	

}
