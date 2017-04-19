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
</head>
<body>
    <div class="register">
        <div class="regTop">
            <span>功能选择</span>
           
        </div>
        <div class="content">
        	
            <div></br></div>
            <a class="login_btn" href="${baseurl}phone/report.action">报&nbsp;&nbsp;修</a>
            <div></br></div>
            <a class="login_btn" href="${baseurl}phone/reportList.action">审&nbsp;&nbsp;核</a>
            <div></br></div>
            <a class="login_btn" href="${baseurl}phone/view.action">查&nbsp;&nbsp;看</a>
            <div></br></div>
            <a class="login_btn" href="${baseurl}phone/manager.action">管&nbsp;&nbsp;理</a>
        </div>
    </div>
</body>
</html>