 <%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 <%@ include file="/WEB-INF/jsp/base/tag.jsp"%>
    <!doctype html>
    <html>
    <head>
         
        <link rel="stylesheet" type="text/css" href="${baseurl}js/jquery-easyui-1.5.1/themes/metro/easyui.css">  
        <link rel="stylesheet" type="text/css" href="${baseurl}js/jquery-easyui-1.5.1/themes/mobile.css">  
        <link rel="stylesheet" type="text/css" href="${baseurl}js/jquery-easyui-1.5.1/themes/icon.css">  
        <script type="text/javascript" src="${baseurl}js/jquery-easyui-1.5.1/jquery.min.js"></script>  
        <script type="text/javascript" src="${baseurl}js/jquery-easyui-1.5.1/jquery.easyui.min.js"></script> 
        <script type="text/javascript" src="${baseurl}js/jquery-easyui-1.5.1/jquery.easyui.mobile.js"></script> 
    </head>
    <body>
        <table id="dg" data-options="header:'#hh',singleSelect:true,border:false,fit:true,fitColumns:true,scrollbarSize:0">  
            
        </table>
        <input id ="empType"hidden ="hidden" value ="${empType}">
        <div id="hh">
            <div class="m-toolbar">
           			 <div class="m-left">
	                    <a href="${baseurl}phone/mMain.action" class="easyui-linkbutton m-back" plain="true" outline="true">Back</a>
	                </div>
                <div class="m-title">任务列表</div>
                	<div class="m-right">
                	
                	</div>
            </div>
        </div>
        <script>
		var columns = [[{
			field : 'remark',
			title : '审核',
			width : 40,
			formatter:function(value, row, index){
				return '<a href=javascript:reportcheck(\''+row.reportId+'\')>审核</a>';
			}
		},{
			field : 'reportId',
			title : '序号',
			width : 45
		},{
			field : 'rentNetId',
			title : '服务点',
			width : 45
		},{
			field : 'rentNum',
			title : '锁桩',
			width : 30
		},{
			field : 'carNum',
			title : '自行车编号',
			width : 65
		},{
			field : 'reportDate',
			title : '报修日期',
			width : 60
		},{
			field : 'carAddr',
			title : '故障车地址',
			width : 65
		}]];
		//datagrid加载
		function initGrid(){
			$('#dg').datagrid({
				striped : true,
				url : '${baseurl}report/queryReport_result.action',
				idField : 'id',//json数据集的主键
				columns : columns,
				pagination : true,
				pageList:[10,15,30,50,100] ,//设置每页显示个数
				});
			}
		function reportcheck(reportId){
			
			alert(reportId);
		}
           
       $(function(){
       	  
          initGrid();
       });
        </script>
    </body>    
    </html>