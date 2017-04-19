<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/jsp/base/tag.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<LINK rel="stylesheet" type="text/css" href="${baseurl}js/easyui/styles/default.css">
<%@ include file="/WEB-INF/jsp/base/common_css.jsp"%>
<%@ include file="/WEB-INF/jsp/base/common_js.jsp"%>
<title>修改用户</title>
<script type="text/javascript">
  function sysusersave(){
	  
	  jquerySubByFId('userform',sysusersave_callback,null,"json");
	  
	  
	  
  }
  //ajax调用的回调函数，ajax请求完成调用此函数，传入的参数是action返回的结果
  function sysusersave_callback(data){
	 
	  message_alert(data);
	  //如果成功，自动关闭
	 if(data.resultInfo.type =='1'){
		 //延迟1秒执行关闭方法
		 setTimeout("parent.closemodalwindow()", 1000);
	 }
	 /* var formdata = $("#sysuserqueryForm").serializeJson();
		$('#sysuserlist').datagrid('load',formdata); */
	  
  }
 
</script>
</head>
<body>
 

<form id="userform" action="${baseurl}user/editusersubmit.action" method="post">
<!-- 更新用户的id -->
<input type="hidden" name="userId" value="${userInfoCustom.userId}"/>
<TABLE border=0 cellSpacing=0 cellPadding=0 width="100%" bgColor=#c4d8ed>

   <TBODY>
   <TR>
				<TD background=images/r_0.gif width="100%">
					<TABLE cellSpacing=0 cellPadding=0 width="100%">
						<TBODY>
							<TR>
								<TD>&nbsp;系统用户信息</TD>
								<TD align=right>&nbsp;</TD>
							</TR>
						</TBODY>
					</TABLE>
				</TD>
			</TR>
			
			<TR>
				<TD>
					<TABLE class="toptable grid" border=1 cellSpacing=1 cellPadding=4
						align=center>
						<TBODY>
							
							<TR>
								<TD  height=30 width="15%" align=right>用户类型：</td>
									<td class=category width="35%" ><select name="userInfoCustom.userTypeId">
										<option value="">${userInfoCustom.userType}</option>
										<!-- 改成从数据字典取 -->
										 <c:forEach items="${userType}" var="dictInfo">
										 <option value="${dictInfo.dictCode}">${dictInfo.info}</option>
										</c:forEach> 
									</select></TD>
								<TD  height=30 width="15%" align=right>用户等级：</TD>
									<td class=category width="35%"><select name="userInfoCustom.userClassId">
										<option value="">${userInfoCustom.userClassName}</option>
										<!-- 改成从数据字典取 -->
											 <c:forEach items="${creditRating}" var="dictInfo">
											 <option value="${dictInfo.dictCode}">${dictInfo.info}</option>
										</c:forEach> 
									</select></TD>
							</TR>
							<TR>
								<TD height=30 width="15%" align=right >用户密码：</TD>
								<TD class=category width="35%">
								<div>
								    如果要修改密码请在此输入<br/>
									<input type="password" id="sysuser_password" name="userInfoCustom.userPassword" />
								</div>
								<div id="sysuser_passwordTip"></div>
								</TD>
								<TD height=30 width="15%" align=right >用户分组：</TD>
								<TD class=category width="35%">
								<div>
								<select name="userInfoCustom.userGroupId">
									<option value="">${userInfoCustom.userGroupName}</option>
									<!-- 改成从数据字典取 -->
										 <c:forEach items="${groupList}" var="dictInfo">
										 <option value="${dictInfo.dictCode}">${dictInfo.info}</option>
									</c:forEach> 
								</select>
								</div>
								<div id="sysuser_groupidTip"></div>
								</TD>
								
								
							</TR>
							<TR>
							    <TD height=30 width="15%" align=right >用户名称：</TD><!-- 用处：根据名称获取单位id -->
								<TD class=category width="35%">
								<input type="text" value="${userInfoCustom.userName}" name="userInfoCustom.userName" >
								</TD>
								<TD height=30 width="15%" align=right>用户状态：</TD>
								<TD class=category width="35%">
								<input type="radio" name="userInfoCustom.isvisible" value="1" />正常
								<input type="radio" name="userInfoCustom.isvisible" value="0" />暂停
								</TD>
								
							</TR>
							<tr>
							  <td colspan=4 align=center class=category>
								<a id="submitbtn"  class="easyui-linkbutton"   iconCls="icon-ok" href="#" onclick="sysusersave()">提交</a>
								<a id="closebtn"  class="easyui-linkbutton" iconCls="icon-cancel" href="#" onclick="parent.closemodalwindow()">关闭</a>
							  </td>
							</tr>
						
							</TBODY>
						</TABLE>
					</TD>
				</TR>
   </TBODY>
</TABLE>
</form>
</body>
</html>