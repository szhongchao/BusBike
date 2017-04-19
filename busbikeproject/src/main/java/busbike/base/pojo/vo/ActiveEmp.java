package busbike.base.pojo.vo;

import java.util.List;

/**
 * 用户身份信息，存入session
 * 由于tomcat将session会序列化在本地硬盘上，所以使用Serializable接口
 * @author Thinkpad
 *
 */
public class ActiveEmp  implements java.io.Serializable {
	private String empId;//用户账号
	private String empName;//用户名称
	private String empGroupId;//用户类型
	private String empClassId;//用户类型名称
	private String empTypeId;//用户类型名称
	
	public String getEmpTypeId() {
		return empTypeId;
	}

	public void setEmpTypeId(String empTypeId) {
		this.empTypeId = empTypeId;
	}

	public String getEmpClassId() {
		return empClassId;
	}

	public void setEmpClassId(String empClassId) {
		this.empClassId = empClassId;
	}

	private Menu menu;//操作菜单
	private List<Operation> operationList;//操作权限，包括用户点击菜单及操作菜单功能�?有链接权�?
	
	//private String sysid;//用户�?属单位id
	//private String sysmc;//单位名称
	
	public String getEmpId() {
		return empId;
	}

	public void setEmpId(String empId) {
		this.empId = empId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public String getEmpGroupId() {
		return empGroupId;
	}

	public void setEmpGroupId(String empGroupId) {
		this.empGroupId = empGroupId;
	}


	/*public String getLogintype() {
		return logintype;
	}

	public void setLogintype(String logintype) {
		this.logintype = logintype;
	}*/



	

	public List<Operation> getOperationList() {
		return operationList;
	}

	public void setOperationList(List<Operation> operationList) {
		this.operationList = operationList;
	}

	

	public Menu getMenu() {
		return menu;
	}

	public void setMenu(Menu menu) {
		this.menu = menu;
	}



/*	public Operation getActionUrl(String actionUrl) {
		if (operationList != null) {
			
			for (Iterator<Operation> o_list = operationList.iterator(); o_list.hasNext();) {
				Operation o_i = (Operation) o_list.next();
				if (actionUrl.indexOf(o_i.getActionUrl())>0) {
					return o_i;
				}
			}
		}
		return null;
	}*/
	

}
