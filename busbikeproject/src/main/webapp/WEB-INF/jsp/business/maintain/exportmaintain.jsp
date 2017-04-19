<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<%@ page contentType="text/html; charset=UTF-8"%>
<%@ include file="/WEB-INF/jsp/base/tag.jsp"%>
<html> 
<head>
<title>报修列表导出</title>
<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="content-type" content="text/html; charset=UTF-8">

<%@ include file="/WEB-INF/jsp/base/common_css.jsp"%>
<%@ include file="/WEB-INF/jsp/base/common_js.jsp"%>

<script type="text/javascript">
//药品信息导出
function ypxxexport(){
	//调用ajax Form提交
	jquerySubByFId('ypxxlistFrom',ypxxExprot_callback,null,"json");
	
}
function ypxxExprot_callback(data){
	
	//在这里提示信息中有文件下载链接
	message_alert(data);
	
}


</script>

</head>
<body>
<!-- 导出条件 -->

<form id="ypxxlistFrom" name="ypxxlistFrom" action="${baseurl}maintain/exportMaintainSubmit.action" method="post">
<TABLE  class="table_search">
				<TBODY>
					<TR>
						<TD class="left">维修状态：</TD>
						<td >
							<select id="ypxxCustom_lb" name="maintainInfoCustom.state" style="width:150px">	
							    <option value="">全部</option> 
								<c:forEach items="${stateList}" var="sysInfo">
									<option value="${sysInfo.sysKey}">${sysInfo.sysValue}</option>
								</c:forEach>
							</select>
						</td>
						<TD class="left">维修模式：</TD>
						<td >
							<select id="ypxxCustom.jyzt" name="maintainInfoCustom.repairMode" style="width:150px">
							     <option value="">全部</option>
								<c:forEach items="${modeList}" var="sysInfo">
									<option value="${sysInfo.sysKey}">${sysInfo.sysValue}</option>
								</c:forEach>
							</select>
							
						</td>
						
						 <td class="left" height="25">多故障：</td>
				  		<td>
				  		<select id="ypxxCustom.zlcc" name="maintainInfoCustom.isMultiFault" style="width:150px">
								<option value="">全部</option>
								<c:forEach items="${mutliFaultList}" var="sysInfo">
									<option value="${sysInfo.sysKey}">${sysInfo.sysValue}</option>
								</c:forEach>
						</select>
					
				  		</td>
						<td class="left" height="25">故障类型：</td>
				  		<td>
				  		<select id="gysypmlCustom.control" name="maintainInfoCustom.faultType" style="width:80px">
								<option value="">全部</option>
								<c:forEach items="${typeList}" var="sysInfo">
									<option value="${sysInfo.sysKey}">${sysInfo.sysValue}</option>
								</c:forEach>
						</select>
						<a id="btn" href="#" onclick="gysypmlquery()" class="easyui-linkbutton" iconCls='icon-search'>查询</a>
				  		</td>
					</TR>
					<tr>
					  <td colspan="12" style="text-align:center"><a id="btn" href="#" onclick="ypxxexport()" class="easyui-linkbutton" iconCls='icon-search'>导出</a></td>
					</tr>
				</TBODY>
			</TABLE>
			
</form>




</body>
</html>