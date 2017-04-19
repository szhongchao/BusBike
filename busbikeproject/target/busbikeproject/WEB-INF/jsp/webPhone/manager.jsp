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
    $(document).ready(function(){
    	//*****************表单校验******************
    	$.formValidator.initConfig({
    		formID : "registerform",
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
    		min : 4,
    		onError:"请输入用户名"
    	});
    	$("#pwd").formValidator({
    		onShow : "",
    		onCorrect:"&nbsp;"
    	}).inputValidator({
    		min : 6,
    		onError:"请输入密码"
    	});
    	
    	//*****************表单校验******************
    });
    	//校验表单输入
    	function checkinput() {
    		
    		
    		return $.formValidator.pageIsValid();
    	}
		  function registersubmit(){
			  if(checkinput()){//校验表单，如果校验通过则执行jquerySubByFId
			  jquerySubByFId('registerform',reportsubmit_callback,null,"json");
			  }
		  }
		 function reportsubmit_callback(data){			  
			  message_alert(data);
			  if(data.resultInfo.type =='1'){
					 //延迟1秒执行关闭方法
			 setTimeout("parent.closemodalwindow()", 1000);
			 window.location='${baseurl}phone/main.action';
			 //window.parent.location.reload();
		 }
  }
</script>
</head>
<body>
    <div class="register">
        <div class="regTop">
            <span>任务管理</span>
            <a class="back" href="${baseurl}phone/main.action">&lt;&nbsp;返回</a>
        </div>
        <div class="content">
            <div class="point">
                <span> </span>
            </div>
            <form id="registerform" name="registerform"  action="${baseurl}emp/addempsubmit.action" method="post">
                <div class="message">
                    <input type="text" ID="empName" name="empInfoCustom.empName" placeholder="请输入4-25位用户名" pattern="[0-9A-Za-z]{4,25}" required/>
                    <input type="password" ID="pwd" name="empInfoCustom.empPassword"  placeholder="请输入6-25位密码" pattern="[0-9A-Za-z]{6,25}" required/>
                    <input type="password"  ID="repwd" name="repwd"  placeholder="请再次输入密码" pattern="[0-9A-Za-z]{6,25}" required/>
                    
                    <select name="empInfoCustom.empTypeId">
                        <option  type="text"  ID="empType" value="0101">普通用户</option>
                        <option  type="text"  ID="empType" value="3001">管理员</option>
                        <option  type="text"  ID="empType" value="3004">审核</option>
                        <option  type="text"  ID="empType" value="3003">维修</option>
                        
                    </select>
                    
                </div>
                <div class="agree">
                    <input type="checkbox"/><span>&nbsp;同意&nbsp;</span><a href="">《注册协议》</a>
                </div>
                <input type="button" class="submit" onclick="registersubmit()" value="提&nbsp;&nbsp;交" />
            </form>
        </div>
    </div>
</body>
</html>