<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<%@ page contentType="text/html; charset=UTF-8"%>
<%@ include file="/WEB-INF/jsp/base/tag.jsp"%>
<html>
<head lang="en">
    <TITLE><fmt:message key="title" bundle="${messagesBundle}" /></TITLE>
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="content-type" content="text/html; charset=UTF-8">
	 
    <link rel="stylesheet" href="${baseurl}css/common.css"/>
    <link rel="stylesheet" href="${baseurl}css/login.css"/>
    <style>
        .login_bg{
            background: #ffffff;
        }
        .login_btn{
            width: 80%;
            margin: 10%;
        }
        .other_login{
            top: 70%;
        }
        .other_choose{
            top: 80%;
        }
    </style>
</head>
<body>
<div class="login_bg">
    <div id="logo">
        <img src="images/logo.png" alt=""/>
    </div>
    <a class="login_btn" href="${baseurl}phone/login.action">登&nbsp;&nbsp;录</a>
    <a class="login_btn" href="${baseurl}phone/register.action">用&nbsp;&nbsp;户&nbsp;&nbsp;注&nbsp;&nbsp;册</a>
    <div class="other_login">
        <div class="other"></div>
        <span>其他方法登录</span>
        <div class="other"></div>
    </div>
    <div class="other_choose">
        <a href="">
            <img src="images/qq.png" alt=""/>
        </a>
        <a href="">
            <img src="images/wx.png" alt=""/>
        </a>
        <a href="">
            <img src="images/wb.png" alt=""/>
        </a>
    </div>
</div>
</body>
</html>