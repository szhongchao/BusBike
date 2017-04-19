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

var columns = [ [{
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
		loadMsg:"",
		pageList:[15,30,50,100] ,//设置每页显示个数
		onClickRow : function(index, field, value) {//点击行时触发事件，取消该行的选择
					$('#reportlist').datagrid('unselectRow', index);
				}
		});

	}
	$(function() {
		initGrid();
	});

	//列表查询
	function reportquery() {
		var formdata = $("#reportqueryForm").serializeJson();	
		$('#reportlist').datagrid('load', formdata);
	}
</script>
</HEAD>
<BODY>
<div id="ypxxquery_div">
    <form id="reportqueryForm" name="reportqueryForm"method="post">
		
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

