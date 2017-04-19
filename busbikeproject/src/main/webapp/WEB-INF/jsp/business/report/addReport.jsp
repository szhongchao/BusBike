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
<title>报修信息添加</title>
<script type="text/javascript">
  function reportsave(){
	 
	  //准备使用jquery 提供的ajax Form提交方式
	  //将form的id传入，方法自动将form中的数据组成成key/value数据，通过ajax提交，提交方法类型为form中定义的method，
	  //使用ajax form提交时，不用指定url，url就是form中定义的action
	  //此种方式和原始的post方式差不多，只不过使用了ajax方式
	  
	  //第一个参数：form的id
	  //第二个参数：sysusersave_callback是回调函数，sysusersave_callback当成一个方法的指针
	  //第三个参数：传入的参数， 可以为空
	  //第四个参数：dataType预期服务器返回的数据类型,这里action返回json
	  //根据form的id找到该form的action地址
	  jquerySubByFId('reportform',sysusersave_callback,null,"json");
	  
  }
  //ajax调用的回调函数，ajax请求完成调用此函数，传入的参数是action返回的结果
 function sysusersave_callback(data){
	  
	  message_alert(data);
	  if(data.resultInfo.type =='1'){
			 //延迟1秒执行关闭方法
			 setTimeout("parent.closemodalwindow()", 1000);
			 window.parent.location.reload();
		 }

  }
 
</script>
</head>
<body>


<form id="reportform" action="${baseurl}report/addreportsubmit.action" method="post">
<TABLE border=0 cellSpacing=0 cellPadding=0 width="100%" bgColor=#c4d8ed>

   <TBODY>
 
			<TR>
				<TD>
					<TABLE class="toptable grid" border=1 cellSpacing=1 cellPadding=4
						align=center>
						<TBODY>
							
							<TR>
								<TD  height=30 width="15%" align=right>故障类型：</td>
									<td class=category width="35%"><select name="reportInfo.faultTypeNum">
										<option value="">请选择故障类型</option>
										<!-- 改成从数据字典取 -->
										 <c:forEach items="${faultType}" var="dictInfo">
									      <option value="${dictInfo.dictCode}">${dictInfo.info}</option>
										</c:forEach> 
									</select></TD>
								<TD  height=30 width="15%" align=right>自行车编号：</TD>
								<TD class=category width="35%">
								<input type="text" name="reportInfo.carNum" />
								</TD>
							</TR>
							<TR>
								<TD  height=30 width="15%" align=right>区域：</td>
									<TD class=category width="35%">
								     <input type="text" name="reportInfo.zoneName" />
								    </TD>
								 <TD height=30 width="15%" align=right >车辆位置：</TD>
								<TD class=category width="35%">
								<input type="text" name="reportInfo.carAddr" />
								</TD>
							</TR>
							
							<TR>
								<TD height=30 width="15%" align=right >服务点编号：</TD>
								<TD class=category width="35%">
								<input type="text" name="reportInfo.rentNetId" />
								</TD>
								
								<TD  height=30 width="15%" align=right>是否多故障：</TD>
								<TD class=category width="35%">
								<input type="radio" name="reportInfo.isMultiFault" value="是"  />是
								<input type="radio" name="reportInfo.isMultiFault" value="否" checked/>否
								</TD>
								
							</TR>
							<TR>
							    <TD height=30 width="15%" align=right >锁装编号：</TD>
								<TD class=category width="35%">
								<input type="text" name="reportInfo.rentNum" />
								</TD>
								<TD height=30 width="15%" align=right>是否在桩：</TD>
								<TD class=category width="35%">
								<input type="radio" name="reportInfo.isLock" value="1" checked />是
								<input type="radio" name="reportInfo.isLock" value="0" />否
								</TD>
								
							</TR>
							       
                                  
                             <TR>
                                <TD  colspan=4 align=center class=category>故障详细信息：</td>
                                    
                            </TR>
                            
                            <TR>
                            
                                <TD colspan=4 align=center class=category>
								<input class="easyui-textbox" data-options="multiline:true" 
									value="" 
									style="width:800px;height:100px"
									name="reportInfo.carFaultDesc">
								</TD>                         
                                    
                            </TR>  
							
							<tr>
							  <td colspan=4 align=center class=category>
								<a id="submitbtn"  class="easyui-linkbutton"   iconCls="icon-ok" href="#" onclick="reportsave()">提交</a>
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