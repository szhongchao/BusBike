<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<%@ page contentType="text/html; charset=UTF-8"%>
<%@ include file="/WEB-INF/jsp/base/tag.jsp"%>
<html> 
<head>
<title>报修信息列表</title>
<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="content-type" content="text/html; charset=UTF-8">

<%@ include file="/WEB-INF/jsp/base/common_css.jsp"%>
<%@ include file="/WEB-INF/jsp/base/common_js.jsp"%>

<script type="text/javascript">

var gysypmldel = function(){
	_confirm('您确定要执行删除选中的信息吗?',null,
	  function(){
		var indexs = [];//定义一个数组准备存放删除记录的序号
		//通过jquery easyui的datagrid的getSelections函数，得到当前所有选中的行(对象数组)
		var rows = $('#gysypmllist').datagrid('getSelections');
		//循环遍历选中行
		for(var i=0;i<rows.length;i++){
			//通过jquery easyui的datagrid的getRowIndex方法得行的序号
			var index=$('#gysypmllist').datagrid('getRowIndex',rows[i]);
			//将选中行的序号放入indexs数组
			indexs.push(index);
		}
		//如果存在选中的行
		if(rows.length>0){
			//将选中的行通过indexs.join(',')，将选中行的序号中间以逗号分隔组成一个字符串，调用$("#indexs").val方法，将这个字符串放入indexs对象
			$("#indexs").val(indexs.join(','));
			//执行ajax的form提交
			jquerySubByFId('gysypmldeleteForm', gysypmldel_callback, null);
		}else{
			alert_warn("请选择要删除的信息");
		}
		
	  }
	)
	
};

function gysypmldel_callback(data) {
	var result = getCallbackData(data);
	_alert(result);//显示失败明细的
    gysypmlquery();//删除完成刷新页面（重新执行查询方法）
}

function reportcheck(id){
	var sendUrl = "${baseurl}report/reportCheck.action?id="+id;
	createmodalwindow("报修信息审核", 1000, 500, sendUrl);
}
var reportadd = function (){
	var sendUrl = "${baseurl}report/addReport.action";
	createmodalwindow("报修信息添加", 1000, 500, sendUrl);
	
};
//维修信息导出
var maintainexport = function(){
	jquerySubByFId('ypxxlistFrom',ypxxExprot_callback,null,"json");
	
};
function ypxxExprot_callback(data){
	
	//在这里提示信息中有文件下载链接
	message_alert(data);
	
}

//工具栏

var toolbar = [ {
	id : 'gysypmladd',
	text : '报修信息添加',
	iconCls : 'icon-add',
	handler : reportadd
	},{
	id : 'maintainexport',
	text : '导出',
	iconCls : 'icon-save',
	handler : maintainexport
	}];

var frozenColumns;

var columns = [ [{
	checkbox:true //显示一个复选框
},{
	field : 'id',
	hidden : true,//该列隐藏
	formatter: function(value,row,index){
		//gysypmls对应action接收对象中list的名称，[]括号中是从0开始序号,id是list中对象属性 carNum
		return '<input type="hidden" name="ypxxCustoms['+index+'].id" value="'+value+'" />';
	}
},{
	field : 'reportId',
	title : '序号',
	width : 50
},{
	field : 'state',
	title : '报修状态',
	width : 75
},{
	field : 'faultName',
	title : '故障类型',
	width : 60
},{
	field : 'zoneName',
	title : '区域',
	width : 60
},{
	field : 'rentNetId',
	title : '服务点编号',
	width : 75
},{
	field : 'rentNum',
	title : '锁桩号',
	width : 45
},{
	field : 'carNum',
	title : '自行车编号',
	width : 75
},{
	field : 'reportSource',
	title : '报修来源',
	width : 90
},{
	field : 'reportName',
	title : '报修用户名',
	width : 75
},{
	field : 'report',
	title : '用户信用等级',
	width : 75
},{
	field : 'reportDate',
	title : '报修日期',
	width : 110
},{
	field : 'isMultiFault',
	title : '多故障',
	width : 45
},{
	field : 'carAddr',
	title : '故障车地址',
	width : 200
},{
	field : 'isLock',
	title : '是否在桩',
	width : 60,
	formatter : function(value, row, index) {//通过此方法格式化显示内容,value表示从json中取出该单元格的值，row表示这一行的数据，是一个对象,index:行的序号
		if(value =='0'){
			return "否";
		}else if(value =='1'){
			return "是";
		}
	} 
}
,{
	field : 'remark',
	title : '详细信息',
	width : 60,
	formatter:function(value, row, index){
		return '<a href=javascript:reportcheck(\''+row.reportId+'\')>审核</a>';
	}
}]];

//datagrid加载
function initGrid(){
	
	$('#reportlist').datagrid({
		title : '报修信息列表',
		striped : true,
		url : '${baseurl}report/queryReport_result.action',
		idField : 'id',//json数据集的主键
		columns : columns,
		pagination : true,
		rownumbers : true,
		toolbar : toolbar,
		loadMsg:"",
		pageList:[15,30,50,100] ,//设置每页显示个数
		onClickRow : function(index, field, value) {//点击行时触发事件，取消该行的选择
					$('#reportlist').datagrid('unselectRow', index);
				}/* ,
		//将加载成功后执行：清除所有选中的行
		onLoadSuccess:function(){
			$('#gysypmllist').datagrid('clearSelections');
		}  */
		});
		alert("ok");
	}
	$(function() {
		initGrid();
		
		/* //加载维修类型
		getDictinfoIdlist('001','ypxxCustom_lb','00101');

		//加载状态
		getDictinfoCodelist('003','ypxxCustom.jyzt'); */
	});

	//列表查询
	function reportquery() {
 		//将form中的数据组成json
		var formdata = $("#reportqueryForm").serializeJson();
		console.log(formdata);
		//alert(formdata);
		//取消所有datagrid中的选择
		//$('#gysypmllist').datagrid('unselectAll');
		//json是datagrid需要格式数据，向服务器发送的是key/value
		$('#reportlist').datagrid('load', formdata);
	}
</script>
</HEAD>
<BODY>
<div id="ypxxquery_div">
	<%-- <form id="ypxxlistFrom" name="gysypmldeleteForm" action="${baseurl}report/exportMaintainSubmit.action" method="post">
	</form>  --%>
    <form id="reportqueryForm" name="reportqueryForm" <%-- action="${baseurl}report/eportquerysubmit.action"  --%>method="post">
			<input type="hidden" name="indexs" id="indexs" />
			<TABLE  class="table_search">
				<TBODY>
					<TR>
						<!-- 自行添加 -->
						<TD class="left">服务点编号：</TD>
						<td ><INPUT type="text" name="reportInfoCustom.rentNetId" /></td>
						<TD class="left">报修用户：</td>
						<td><INPUT type="text"  name="reportInfoCustom.reportName" /></TD>
						<!-- 自行添加 -->
						<TD class="left">锁装编号：</TD>
						<td ><INPUT type="text" name="reportInfoCustom.rentNum" /></td>
						<!-- 自行添加 -->
						<TD class="left">报修日期：</TD>
						<td ><INPUT type="text" name="reportInfoCustom.reportDate" /></td>
					</TR>
					
					<tr>
					   <!-- 自行添加 -->
						<TD class="left">故障车地址：</TD>
						<td><INPUT type="text"  name="reportInfoCustom.carAddr" /></TD>
						<TD class="left">报修来源：</TD>
						<td >
							<select id="ypxxCustom.jyzt" name="reportInfoCustom.reportSource" style="width:150px">
							    <option value="">全部</option>
								<!-- 改成从数据字典取 -->
									 <c:forEach items="${reportSource}" var="dictInfo">
									 <option value="${dictInfo.info}">${dictInfo.info}</option>
								</c:forEach>
							</select>
							
						</td>
				 		 <TD class="left">报修状态：</TD>
						<td >
							<select id="ypxxCustom_lb" name="reportInfoCustom.state" style="width:150px">	
							    <option value="">全部</option>
								<!-- 改成从数据字典取 -->
									 <c:forEach items="${state}" var="dictInfo">
									 <option value="${dictInfo.info}">${dictInfo.info}</option>
								</c:forEach>
							</select>
						</td>
				  		<td class="left" height="25">故障类型：</td>
				  		<td>
				  		<select id="gysypmlCustom.control" name="reportInfoCustom.faultTypeNum" style="width:80px">
								<option value="">全部</option>
								<!-- 改成从数据字典取 -->
									 <c:forEach items="${faultType}" var="dictInfo">
									 <option value="${dictInfo.dictCode}">${dictInfo.info}</option>
								</c:forEach>
						</select>
						<a id="btn" href="#" onclick="reportquery()" class="easyui-linkbutton" iconCls='icon-search'>查询</a>
				  		</td>
						
					</TR>
					
				</TBODY>
			</TABLE>
	   
		<TABLE border=0 cellSpacing=0 cellPadding=0 width="99%" align=center>
			<TBODY>
				<TR>
					<TD>
						<table id="reportlist"></table>
					</TD>
				</TR>
			</TBODY>
		</TABLE>
		 </form>
	</div>


</BODY>
</HTML>

