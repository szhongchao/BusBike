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
    		formID : "reportform",
    		mode:'AlertTip',
    		onError : function(msg) {
    			alert(msg);
    		},
    		onAlert : function(msg) {
    			alert(msg);
    		}
    	});
    	$("#rentNetId").formValidator({
    		onShow : "",
    		onCorrect:"&nbsp;"
    	}).inputValidator({
    		min : 4,
    		onError:"请输入服务点编号"
    	});
    	$("#rentNum").formValidator({
    		onShow : "",
    		onCorrect:"&nbsp;"
    	}).inputValidator({
    		min : 2,
    		onError:"请输入锁装编号"
    	});
    	$("#carNum").formValidator({
    		onShow : "",
    		onCorrect:"&nbsp;"
    	}).inputValidator({
    		min : 6,
    		onError:"请输入自行车编号"
    	});
    	$("#remark").formValidator({
    		onShow : "",
    		onCorrect:"&nbsp;"
    	}).inputValidator({
    		min : 2,
    		onError:"请输车辆故障描述"
    	});
    
    	//*****************表单校验******************
    });

    	//校验表单输入
    	function checkinput() {
    		//return $('#loginform').form('validate');
    		return $.formValidator.pageIsValid();
    	}

		  function reportsubmit(){
			 
			  if(checkinput()){//校验表单，如果校验通过则执行jquerySubByFId
			  jquerySubByFId('reportform',reportsubmit_callback,null,"json");
			  }
		  }
		 function reportsubmit_callback(data){
			  
			  message_alert(data);
			  if(data.resultInfo.type =='1'){
					 //延迟1秒执行关闭方法
			 setTimeout("parent.closemodalwindow()", 1000);
			 //window.parent.location.reload();
		 }

  }
 
</script>
</head>
<body>
    <div class="register">
        <div class="regTop">
            <span>用户报修</span>
            <a class="back"  href="${baseurl}phone/main.action">&lt;&nbsp;返回</a>
        </div>
        <div class="content">
            
            <form id="reportform" name="reportform"  action="${baseurl}report/addreportsubmit.action" method="post">
                <div class="message">
                    <input type="text" id="rentNetId" name="reportInfoCustom.rentNetId" placeholder="请输入4位服务点编号" pattern="[0-9]{4,6}" required/>
                    <input type="text" id="rentNum" name="reportInfoCustom.rentNum" placeholder="请输入2位锁装编号" pattern="[0-9]{2}" required/>
                    <input type="text" id="carNum" name="reportInfoCustom.carNum" placeholder="请输入6-8位自行车编号" pattern="[0-9]{6,8}" required/>
                    <input type="text" id="remark" name="reportInfoCustom.remark" placeholder="请输简单的描述车辆故障" >
                   
                </div>
                 <input type="button" class="submit" onclick="reportsubmit()" value="提&nbsp;&nbsp;交" />
            </form>
        </div>
    </div>
</body>
</html>