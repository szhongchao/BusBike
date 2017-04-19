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
                        <a href="javascript:void(0)" class="easyui-linkbutton" plain="true" outline="true" onclick="$('#ff').form('reset')" style="width:60px">Reset</a>
                    </div>
                </div>
            </header>
            <form id="ff">
                
                <div style="margin-bottom:10px">
                    <input class="easyui-datebox" label="报修日期:" value="${requestScope.time}"data-options="editable:false,panelWidth:220,panelHeight:240,iconWidth:30" style="width:100%" editable="false"/>
                </div>
                <div style="margin-bottom:10px">
                    <input class="easyui-textbox" label="车辆编号:"  style="width:100%" value="${requestScope.carNum}" editable="false"/>
                </div>
                <div style="margin-bottom:10px">
                    <input class="easyui-textbox" label="服务点编号:"  style="width:100%" value="${requestScope.carNum}" editable="false"/>
                </div>
                <div style="margin-bottom:10px">
                    <input class="easyui-textbox" label="锁装号:"  style="width:100%" value="${requestScope.carNum}" editable="false"/>
                </div>
                 <div style="margin-bottom:10px">
                    <input class="easyui-textbox" label="故障描述:" prompt="请输入详细信息.." style="width:100%" />
                </div>
                
            </form>
        </div>
    </body>
    </html>
