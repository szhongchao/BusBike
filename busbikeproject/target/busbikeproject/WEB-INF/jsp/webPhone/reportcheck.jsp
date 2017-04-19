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
		  function checksubmit(){
			  //if(checkinput()){//校验表单，如果校验通过则执行jquerySubByFId
			  jquerySubByFId('checkform',reportsubmit_callback,null,"json");
			  //}
		  }
		 function reportsubmit_callback(data){			  
			  message_alert(data);
			  if(data.resultInfo.type =='1'){
					 //延迟1秒执行关闭方法
			 setTimeout("parent.closemodalwindow()", 1000);
			 //window.location='${baseurl}phone/main.action';
			 window.parent.location.reload();
		 }
  }
</script>
</head>
<body>
    <div class="register">
        
        <div class="content">
            <div class="point">
                <span> </span>
            </div>
            <form id="checkform" name="registerform"  action="${baseurl}report/reportCheckPass.action" method="post">
                <input type="hidden" name="reportInfoCustom.reportId" value="${reportInfoCustom.reportId}" />
            <div class="userName">
                <lable>服务点信息：</lable>
                <input type="text" ID="rentNetId" name="reportInfoCustom.rentNetId" value="${reportInfoCustom.rentNetId}" placeholder="请输入用户名" pattern="[0-9A-Za-z]{4,16}" required/>
            </div>
            <div class="userName">
                <lable>锁&nbsp;桩&nbsp;编&nbsp;号：</lable>
                <input type="text" ID="rentNetId" name="reportInfoCustom.rentNum" value="${reportInfoCustom.rentNum}" placeholder="请输入用户名" pattern="[0-9A-Za-z]{4,16}" required/>
            </div>
            <div class="userName">
                <lable>车&nbsp;辆&nbsp;编&nbsp;号：</lable>
                <input type="text" ID="rentNetId" name="reportInfoCustom.carNum" value="${reportInfoCustom.carNum}" pattern="[0-9A-Za-z]{4,25}" required/>
            </div>
            <div class="userName">
                <lable>故&nbsp;障&nbsp;信&nbsp;息：</lable>
                <input type="text" ID="rentNetId" name="reportInfoCustom.carFaultDesc" value="${reportInfoCustom.carFaultDesc}" pattern="[0-9A-Za-z]{4,25}" required/>
            </div>
   
                <input type="button" class="submit" onclick="checksubmit()" value="通&nbsp;&nbsp;过" />
            </form>
        </div>
    </div>
</body>
</html>