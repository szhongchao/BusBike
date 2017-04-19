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
<%@ include file="/WEB-INF/jsp/base/common_js.jsp"%>

<script type="text/javascript">
$(document).ready(function(){
	//*****************表单校验******************
	$.formValidator.initConfig({
		formID : "loginform",
		mode:'AlertTip',
		onError : function(msg) {
			alert(msg);
		},
		onAlert : function(msg) {
			alert(msg);
		}
	});
	$("#empName").formValidator({
		onShow : "",
		onCorrect:"&nbsp;"
	}).inputValidator({
		min : 1,
		onError:"请输入用户名"
	});
	$("#pwd").formValidator({
		onShow : "",
		onCorrect:"&nbsp;"
	}).inputValidator({
		min : 1,
		onError:"请输入密码"
	});
	//*****************表单校验******************
});

	//校验表单输入
	function checkinput() {
		//return $('#loginform').form('validate');
		return $.formValidator.pageIsValid();
	}

	//登录提示方法
	function loginsubmit() {
		if(checkinput()){//校验表单，如果校验通过则执行jquerySubByFId
			//ajax form提交
			jquerySubByFId('loginform', login_commit_callback,null,'json'); 
		}

	}
	//登录提示回调方法
	function login_commit_callback(data) {
		message_alert(data);
		var type = data.resultInfo.type;
		if (1 == type) {//如果登录成功，这里1秒后执行跳转到首页
			setTimeout("tofirst()", 1000);
		} else {
			//登录错误，重新刷新验证码
			randomcode_refresh();
		}

	}
	//刷新验证码
	//实现思路，重新给图片的src赋值，后边加时间，防止缓存 
	function randomcode_refresh() {
		$("#randomcode_img").attr('src',
				'${baseurl}validatecode.jsp?time' + new Date().getTime());
	}
	//回首页
	function tofirst(){
		//window.location='${baseurl}first.action';
		 if(parent.parent.parent){
			 //让最外层页面执行跳转
			parent.parent.parent.location='${baseurl}phone/main.action';
		}else if(parent.parent){
			parent.parent.location='${baseurl}phone/main.action';
		}else if(parent){
			parent.location='${baseurl}phone/main.action';
		}else{
			window.location='${baseurl}phone/main.action';
		}  
	  
	}
</SCRIPT>
</HEAD>
<body>
    <div id="login"></div>
    <div class="login_bg">
      
        <div id="logo">
            <img src="${baseurl}images/logo.png" alt=""/>
        </div>
        <form id="loginform" name="loginform" action="${baseurl}loginsubmit.action" method="post">
           <div class="userName">
                <lable>用户名：</lable>
                <input type="text" id="empName" name="empName" placeholder="请输入用户名" pattern="[0-9A-Za-z]{4,16}" required/>
            </div>
            <div class="passWord">
                <lable>密&nbsp;&nbsp;&nbsp;码：</lable>
                <input type="password"id="pwd" name="pwd" placeholder="请输入密码" pattern="[0-9A-Za-z]{4,25}" required/>
            </div>
        
            <%-- <div class="passWord">
                <div><img src="${baseurl}validatecode.jsp" width="20" height="20"/>
                 <a href=javascript:randomcode_refresh()>刷新</a></div>
                <input type="text" name="validateCode" placeholder="请输入密码" pattern="[0-9A-Za-z]{4,25}" required/>
            </div> --%>
            
            <div class="choose_box">
                <div>
                    <input type="checkbox" checked="checked" name="checkbox"/>
                    <lable>记住密码</lable>
                </div>
                <a href="newPassword.html">忘记密码</a>
            </div>

            
            
            <input type="button" class="login_btn" onclick="loginsubmit()" value="登&nbsp;&nbsp;录" />
             <a class="back" href="${baseurl}phone.action">返回</a>
				</form>
        <div class="other_login">
            <div class="other"></div>
            <span>其他方式登录</span>
            <div class="other"></div>
        </div>
        <div class="other_choose">
            <a href="">
                <img src="${baseurl}images/qq.png" alt=""/>
            </a>
            <a href="">
                <img src="${baseurl}images/wx.png" alt=""/>
            </a>
            <a href="">
                <img src="${baseurl}images/wb.png" alt=""/>
            </a>
        </div>
        
    </div>
    
</body>
</HTML>
