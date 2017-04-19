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
<title>添加用户</title>
<script type="text/javascript">
  function empsave(){
	 
	  //准备使用jquery 提供的ajax Form提交方式
	  //将form的id传入，方法自动将form中的数据组成成key/value数据，通过ajax提交，提交方法类型为form中定义的method，
	  //使用ajax form提交时，不用指定url，url就是form中定义的action
	  //此种方式和原始的post方式差不多，只不过使用了ajax方式
	  
	  //第一个参数：form的id
	  //第二个参数：sysusersave_callback是回调函数，sysusersave_callback当成一个方法的指针
	  //第三个参数：传入的参数， 可以为空
	  //第四个参数：dataType预期服务器返回的数据类型,这里action返回json
	  //根据form的id找到该form的action地址
	  jquerySubByFId('userform',sysusersave_callback,null,"json");
	  
  }
  //ajax调用的回调函数，ajax请求完成调用此函数，传入的参数是action返回的结果
 function sysusersave_callback(data){
	  
	  message_alert(data);


  }
 
</script>
</head>
<body>


<form id="userform" action="${baseurl}emp/addempsubmit.action" method="post">
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
									<td class=category width="35%"><select name="empInfo.empTypeId">
										<option value="">请选择用户类型</option>
										<!-- 改成从数据字典取 -->
										  <c:forEach items="${empType}" var="dictInfo">
										 <option value="${dictInfo.dictCode}">${dictInfo.info}</option>
										</c:forEach> 
									</select></TD>
								<TD  height=30 width="15%" align=right>用户等级：</TD>
									<td class=category width="35%">
									<select name="empInfo.empClassId" >
										<option value="">请选择用户等级</option>
										<!-- 改成从数据字典取 -->
										<c:forEach items="${empClass}" var="dictInfo">
										   <option value="${dictInfo.dictCode}">${dictInfo.info}</option>
										</c:forEach> 
									</select></TD>
							</TR>
							<TR>
								<TD height=30 width="15%" align=right >用户密码：</TD>
								<TD class=category width="35%">
								<div>
									<input type="password" id="sysuser_password" name="empInfo.empPassword" />
								</div>
								<div id="sysuser_passwordTip"></div>
								</TD>
								<TD height=30 width="15%" align=right >用户分组：</TD>
								<TD class=category width="35%">
								<div>
								<select name="empInfo.empGroupId" >
									<option value="">请选择用户分组</option>
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
								<input type="text" name="empInfo.empName" />
								</TD>
								<TD height=30 width="15%" align=right>用户状态：</TD>
								<TD class=category width="35%">
								<input type="radio" name="empInfo.isvisible" value="1" />正常
								<input type="radio" name="empInfo.isvisible" value="0" />暂停
								</TD>
								
							</TR>
							<tr>
							  <td colspan=4 align=center class=category>
								<a id="submitbtn"  class="easyui-linkbutton"   iconCls="icon-ok" href="#" onclick="empsave()">提交</a>
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