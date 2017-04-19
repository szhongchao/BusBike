<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 <%@ include file="/WEB-INF/jsp/base/tag.jsp"%>

    <!DOCTYPE html>
    <html>
    <head>
        <link rel="stylesheet" type="text/css" href="${baseurl}js/jquery-easyui-1.5.1/themes/metro/easyui.css">
        <link rel="stylesheet" type="text/css" href="${baseurl}js/jquery-easyui-1.5.1/themes/mobile.css">
        <link rel="stylesheet" type="text/css" href="${baseurl}js/jquery-easyui-1.5.1/themes/icon.css">
        <script type="text/javascript" src="${baseurl}js/jquery-easyui-1.5.1/jquery.min.js"></script>
        <script type="text/javascript" src="${baseurl}js/jquery-easyui-1.5.1/jquery.easyui.min.js"></script>
        <script type="text/javascript" src="${baseurl}js/jquery-easyui-1.5.1/jquery.easyui.mobile.js"></script>
        <script type="text/javascript" src="${baseurl}js/custom.jquery.form.js"></script>
        <script type="text/javascript" src="${baseurl}js/jquery.form.min.js"></script>
        <script type="text/javascript" src="${baseurl}js/custom.box.main.js"></script>
    
        <script type="text/javascript">
          function reportsave(){
           
          jquerySubByFId('reportform',save_callback,null,"json");
          }
           function save_callback(data){
			  message_alert(data);
			  if(data.resultInfo.type =='1'){
					 //延迟1秒执行关闭方法
					 setTimeout("parent.closemodalwindow()", 2000);
					 //window.parent.location.reload();
					  location.href='${baseurl}phone/mMain.action';
				 }
		  }
        </script>
    </head>
    <body>
        <div class="easyui-navpanel" style="position:relative;padding:20px">
            <header>
                <div class="m-toolbar">
	                <div class="m-left">
	                    <a href="${baseurl}phone/mMain.action" class="easyui-linkbutton m-back" plain="true" outline="true">Back</a>
	                </div>
                    <div class="m-title">详细信息</div>
                    <div class="m-right">
                        <a href="javascript:void(0)" class="easyui-linkbutton" plain="true" outline="true" onclick="$('#reportform').form('reset')" style="width:60px">Reset</a>
                    </div>
                </div>
            </header>
            <form id="reportform" action="${baseurl}report/addreportsubmit.action" method="post">
                
                <div style="margin-bottom:10px">
                    <input class="easyui-datetimebox" label="最后租用日期:" name="reportbackup2"  value="${singleCarUseInfo.rentDateTime}"data-options="editable:false,panelWidth:220,panelHeight:240,iconWidth:30" style="width:100%" editable="false"/>
                </div>
                <div style="margin-bottom:10px">
                    <input class="easyui-textbox" label="车辆编号:"  style="width:100%"name="carNum" value="${singleCarUseInfo.carNum}" editable="false"/>
                </div>
                <div style="margin-bottom:10px">
                    <input class="easyui-textbox" label="服务点编号:"  style="width:100%"name="rentNetId" value="${singleCarUseInfo.rentNetid}" editable="false"/>
                </div>
                <div style="margin-bottom:10px">
                    <input class="easyui-textbox" label="锁装号:"  style="width:100%"name="rentNum"  value="${singleCarUseInfo.rentNum}" editable="false"/>
                </div>
                 <div style="margin-bottom:10px">
                    <input class="easyui-textbox" label="故障描述:" prompt="请输入详细信息.." name="carFaultDesc"  value="${singleCarUseInfo.carFaultDesc}" style="width:100%" />
                </div>
                <div style="text-align:center;margin-top:30px">
	                <a href="javascript:reportsave()" class="easyui-linkbutton" iconCls="icon-ok" plain="true" outline="true" style="width:100px;height:35px"><span style="font-size:16px">确定</span></a> 
	            </div>
            </form>
        </div>
    </body>
    </html>
