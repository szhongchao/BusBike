package busbike.base.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import busbike.base.dao.mapper.DictInfoMapper;
import busbike.base.dao.mapper.DictInfoMapperCustom;
import busbike.base.dao.mapper.EmpInfoMapper;
import busbike.base.dao.mapper.EmpInfoMapperCustom;
import busbike.base.pojo.po.EmpInfo;
import busbike.base.pojo.po.EmpInfoExample;
import busbike.base.pojo.vo.ActiveEmp;
import busbike.base.pojo.vo.EmpInfoQueryVo;
import busbike.base.process.context.Config;
import busbike.base.process.result.ResultUtil;
import busbike.base.service.EmpService;
import busbike.util.MD5;

public class EmpServiceImpl implements EmpService{

	



	//注入 mapper
	@Autowired
	private EmpInfoMapperCustom empInfoMapperCustom;
	@Autowired
	private EmpInfoMapper empInfoMapper;	
	@Autowired
	private DictInfoMapper dictInfoMapper;
	
	@Autowired
	private DictInfoMapperCustom dictInfoMapperCustom;
	
	
	//根据用户id查询用户信息
	@Override
	public EmpInfo selectEmpInfoById(String empId) throws Exception {
		// 从数据库查询用户
		EmpInfo empInfo = empInfoMapper.selectByPrimaryKey(new Integer(empId));

		return empInfo;

	}
	// 根据条件查询列表的总数
	@Override
	public int countEmpInfo(EmpInfoQueryVo empInfoQueryVo) throws Exception {
		
		
		return  empInfoMapperCustom.findEmpInfoCount(empInfoQueryVo);
	}

	// 根据条件查询用户信息
	@Override
	public List<EmpInfo> selectEmpInfoList(EmpInfoQueryVo empInfoQueryVo)throws Exception {
		
		return empInfoMapperCustom.findEmpInfoList(empInfoQueryVo);
	}
	//插入用户数据
	@Override
	public void insertEmpInfo(EmpInfo empInfo) throws Exception {
	
		EmpInfo empInfoInner = empInfoMapperCustom.selectByEmpName(empInfo.getEmpName());
		//验证用户名是否存在
		if (empInfoInner != null) {
			
			ResultUtil.throwExcepion(ResultUtil.createFail(Config.MESSAGE, 213,
					null));
		}				
		
		//如果输入有值则为对应的员工,如果为空则是普通用户(默认扫码租车)
		if( empInfo.getEmpTypeId() != null && !empInfo.getEmpTypeId().equals("") ){
			empInfo.setEmpType(dictInfoMapperCustom.selectInfoByDictCode(empInfo.getEmpTypeId()));
		}else{
			empInfo.setEmpTypeId("0102");
			empInfo.setEmpType(dictInfoMapperCustom.selectInfoByDictCode(empInfo.getEmpTypeId()));
		}
		//如果设置了信用等级则设置,如果为空则默认的信用为初级
		if(empInfo.getEmpClassId() != null && !empInfo.getEmpClassId().equals("")){
			empInfo.setEmpClassName(dictInfoMapperCustom.selectInfoByDictCode(empInfo.getEmpClassId()));
		}else{
			empInfo.setEmpClassId("0204");
			empInfo.setEmpClassName(dictInfoMapperCustom.selectInfoByDictCode(empInfo.getEmpClassId()));
		}
		//如果输入分组为空则不更新
		if(empInfo.getEmpGroupId() != null && !empInfo.getEmpGroupId().equals("") ){
			empInfo.setEmpGroupName(dictInfoMapperCustom.selectInfoByDictCode(empInfo.getEmpGroupId()));
		}else{
			empInfo.setEmpGroupId("3202");
			empInfo.setEmpGroupName(dictInfoMapperCustom.selectInfoByDictCode(empInfo.getEmpGroupId()));
		}
		empInfo.setIsVisible("1");
		empInfo.setEmpPassword(new MD5().getMD5ofStr(empInfo.getEmpPassword()));
		empInfoMapper.insert(empInfo);
	}

	@Override
	public void deleteEmpInfo(String empId) throws Exception {
		// 校验用户是否存在
		EmpInfo empInfo = empInfoMapper.selectByPrimaryKey(new Integer(empId) );
		if (empInfo == null) {
			// 用户不存在
			ResultUtil.throwExcepion(ResultUtil.createFail(Config.MESSAGE, 212,
					null));
		}
		// 执行删除
		empInfoMapper.deleteByPrimaryKey(new Integer(empId));
	}

	@Override
	public void updateEmpInfo(String empId, EmpInfo empInfo)throws Exception {
		
			EmpInfo empInfoInner = empInfoMapper.selectByPrimaryKey(new Integer(empId));
			if (empInfoInner == null) {
				// 找不到要修改用户信息
				ResultUtil.throwExcepion(ResultUtil.createFail(Config.MESSAGE, 215,null));
			}
			String pwd_page = empInfo.getEmpPassword().trim();
			String pwd_md5 = null;
			if (pwd_page != null && !pwd_page.equals("")) {
				// 说明用户修改密码了
				pwd_md5 = new MD5().getMD5ofStr(pwd_page);
			}
			//如果输入密码为空则不更新
			if (pwd_md5 != null && empInfo.getIsVisible() !="") {
				empInfoInner.setEmpPassword(pwd_md5);
			}
			//如果输入类型为空则不更新
			if( empInfo.getEmpTypeId() != null && !empInfo.getEmpTypeId().equals("") ){
				empInfoInner.setEmpType(dictInfoMapperCustom.selectInfoByDictCode(empInfo.getEmpType()));
			}
			//如果输入类别为空则不更新
			if(empInfo.getEmpClassId() != null && !empInfo.getEmpClassId().equals("")){
				empInfoInner.setEmpClassName(dictInfoMapperCustom.selectInfoByDictCode(empInfo.getEmpClassName()));
			}
			//如果输入分组为空则不更新
			if(empInfo.getEmpGroupId() != null && !empInfo.getEmpGroupId().equals("") ){
				empInfoInner.setEmpGroupName(dictInfoMapperCustom.selectInfoByDictCode(empInfo.getEmpGroupName()));
			}
			//更改用户使用状态
			if(empInfo.getIsVisible() !=null && empInfo.getIsVisible() !="" && !empInfo.getIsVisible().equals(empInfoInner.getIsVisible()))
				empInfoInner.setIsVisible(empInfo.getIsVisible());
			//更改用户类型id
			if(empInfo.getEmpTypeId() !=null && empInfo.getEmpTypeId() !="" && !empInfo.getEmpTypeId().equals(empInfoInner.getEmpTypeId()))
				empInfoInner.setEmpTypeId(empInfo.getEmpTypeId());
			//更改用户姓名
			if(empInfo.getEmpName() !=null && empInfo.getEmpName() !="" && !empInfo.getEmpName().equals(empInfoInner.getEmpName()))
				empInfoInner.setEmpName(empInfo.getEmpName());
			//更改用户分类id
			if(empInfo.getEmpClassId() !=null && empInfo.getEmpClassId() !="" && !empInfo.getEmpClassId().equals(empInfoInner.getEmpClassId()))
				empInfoInner.setEmpClassId(empInfo.getEmpClassId());
			//更改用户分组id
			if(empInfo.getEmpGroupId() !=null && empInfo.getEmpGroupId() !="" && !empInfo.getEmpGroupId().equals(empInfoInner.getEmpGroupId()))
				empInfoInner.setEmpGroupId(empInfo.getEmpGroupId());
			empInfoMapper.updateByPrimaryKey(empInfoInner);
	}
	
	//用户验证
	@Override
	public ActiveEmp checkEmpInfo(String empName, String password,String validateCode) throws Exception {
		// 校验用户是否存在
		EmpInfo empInfo = empInfoMapperCustom.selectByEmpName(empName);
		if (empInfo == null) {
			// 用户名或密码错误
			ResultUtil.throwExcepion(ResultUtil.createFail(Config.MESSAGE, 114,null));
		}
		// 校验用户密码是否合法
		String pwd_db = empInfo.getEmpPassword();// md5密文
		String pwd_md5 = new MD5().getMD5ofStr(password);
		if (!pwd_db.equalsIgnoreCase(pwd_md5)) {
			// 用户名或密码错误
			ResultUtil.throwExcepion(ResultUtil.createFail(Config.MESSAGE, 114,null));
		}
		//验证是否为普通手机端用户登录PC端
		if( !("00000").equals(validateCode) && empInfo.getEmpTypeId().matches("01\\d{2}")){
			
			ResultUtil.throwExcepion(ResultUtil.createFail(Config.MESSAGE, 101,null));
		}
		// 构建用户身份信息
		ActiveEmp activeEmp = new ActiveEmp();
		activeEmp.setEmpId(empInfo.getEmpId().toString());
		activeEmp.setEmpName(empInfo.getEmpName());
		activeEmp.setEmpGroupId(empInfo.getEmpGroupId());
		activeEmp.setEmpClassId(empInfo.getEmpClassId());
		activeEmp.setEmpTypeId(empInfo.getEmpTypeId());
		return activeEmp;
	}
	
}
