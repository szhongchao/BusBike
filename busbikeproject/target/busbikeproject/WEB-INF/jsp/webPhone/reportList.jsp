<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<%@ page contentType="text/html; charset=UTF-8"%>
<%@ include file="/WEB-INF/jsp/base/tag.jsp"%>
<html>
<head lang="en">
    <TITLE><fmt:message key="title" bundle="${messagesBundle}" /></TITLE>
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="content-type" content="text/html; charset=UTF-8">

    <LINK rel="stylesheet" type="text/css"	href="${baseurl}js/easyui/themes/default/easyui.css">
     <link rel="stylesheet" href="${baseurl}css/common.css"/>
    <link rel="stylesheet" href="${baseurl}css/login.css"/>
    <link rel="stylesheet" href="${baseurl}css/register.css"/>
    
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

function reportcheck(id){
	var sendUrl = "${baseurl}phone/reportCheck.action?id="+id;
	createmodalwindow("报修信息审核", 360, 400, sendUrl);
}
//datagrid加载
function initGrid(){
	$('#reportlist').datagrid({
		
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
</script>
</head>
<body>
    <div class="register">
        <div class="regTop">
            <span>审核</span>
            <a class="back" href="${baseurl}phone/main.action">&lt;&nbsp;返回</a>
		 </div>
        <div class="content">
          
		    <table id="reportlist"></table>
        </div>
    </div>
</body>
</html>