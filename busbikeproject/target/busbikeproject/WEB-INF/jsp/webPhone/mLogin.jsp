  <%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 <%@ include file="/WEB-INF/jsp/base/tag.jsp"%>
    <!doctype html>
    <html>
    <head>
        <meta charset="UTF-8">  
        <meta name="viewport" content="initial-scale=1.0, maximum-scale=1.0, user-scalable=no">
        <link rel="stylesheet" type="text/css" href="${baseurl}js/jquery-easyui-1.5.1/themes/metro/easyui.css">  
        <link rel="stylesheet" type="text/css" href="${baseurl}js/jquery-easyui-1.5.1/themes/mobile.css">  
        <link rel="stylesheet" type="text/css" href="${baseurl}js/jquery-easyui-1.5.1/themes/icon.css">  
        <script type="text/javascript" src="${baseurl}js/jquery-easyui-1.5.1/jquery.min.js"></script>  
        <script type="text/javascript" src="${baseurl}js/jquery-easyui-1.5.1/jquery.easyui.min.js"></script> 
        <script type="text/javascript" src="${baseurl}js/jquery-easyui-1.5.1/jquery.easyui.mobile.js"></script> 
        <script type="text/javascript" src="${baseurl}js/custom.jquery.form.js"></script> 
        <script type="text/javascript" src="${baseurl}js/custom.box.main.js"></script> 
        <script type="text/javascript" src="${baseurl}js/custom.jquery.form.js"></script>
        

		<script type="text/javascript" src="${baseurl}js/jquery-easyui-1.5.1/locale/easyui-lang-zh_CN.js"></script>
		<script type="text/javascript" src="${baseurl}js/jquery.form.min.js"></script>
		<script type="text/javascript" src="${baseurl}js/custom.jquery.form.js"></script>
		<script type="text/javascript" src="${baseurl}js/custom.box.main.js"></script>
		<script type="text/javascript" src="${baseurl}js/jquery.ajax.custom.extend.js"></script>
		<SCRIPT type="text/javascript" src="${baseurl}js/menuload.js"></SCRIPT>		
		<script type="text/javascript" src="${baseurl}js/My97DatePicker/WdatePicker.js"></script>	
		<script src="${baseurl}js/jqueryvalidator/formValidator-4.1.3.js" type="text/javascript" charset="UTF-8"></script>
		<script src="${baseurl}js/jqueryvalidator/formValidatorRegex.js" type="text/javascript" charset="UTF-8"></script>	
		<script type='text/javascript' src='${baseurl}dwr/engine.js'></script>   
		<script type='text/javascript' src='${baseurl}dwr/util.js'></script>  
		<script type='text/javascript' src='${baseurl}dwr/interface/dwrService.js'></script>

        
        
   		<script type="text/javascript">
   			function loginSubmit(){
   				//alert("ok");
   				jquerySubByFId('loginform', login_commit_callback,null,'json'); 
   				
   			}
   			//登录提示回调方法
			function login_commit_callback(data) {
				message_alert(data);
				var type = data.resultInfo.type;
				if (1 == type) {//如果登录成功，这里1秒后执行跳转到首页
					setTimeout("toMain()", 1000);
				} else {
					//登录错误，重新刷新验证码
					//randomcode_refresh();
				}
			}
			function randomcode_refresh() {
				$("#randomcode_img").attr('src',
						'${baseurl}validatecode.jsp?time' + new Date().getTime());
			}
			//回首页
			function toMain(){
				//window.location='${baseurl}first.action';
				 if(parent.parent.parent){
					 //让最外层页面执行跳转
					parent.parent.parent.location='${baseurl}phone/mMain.action';
				}else if(parent.parent){
					parent.parent.location='${baseurl}phone/mMain.action';
				}else if(parent){
					parent.location='${baseurl}phone/mMain.action';
				}else{
					window.location='${baseurl}phone/mMain.action';
				}  
			  
			}
   		</script>
    </head>
    <body>
        <div class="easyui-navpanel">
            <header>
                <div class="m-toolbar">
                    <span class="m-title">智能交通研究所</span>
                </div>
            </header>
            <div style="margin:20px auto;width:100px;height:100px;border-radius:100px;overflow:hidden">
                <img src="../images/login1.jpg" style="margin:0;width:100%;height:100%;">
            </div>
            <div style="padding:0 20px">
	            <FORM id="loginform" name="loginform" action="${baseurl}loginsubmit.action" method="post">
	                  <div style="margin-bottom:10px">
		                    <input type="text" class="easyui-textbox" data-options="prompt:'Type username',iconCls:'icon-man'" name="empName" style="width:100%;height:38px">
		               </div>
	               	   <div>
		                    <input type="password" class="easyui-passwordbox" data-options="prompt:'Type password'" id="password" name="pwd" style="width:100%;height:38px">
		               </div>
						<div hidden="hidden" style="margin-bottom:10px">
							 <input id="randomcode" name="validateCode" size="8" /> <img
									id="randomcode_img" src="${baseurl}validatecode.jsp" alt=""
									width="56" height="20" align='absMiddle' /> <a
									href=javascript:randomcode_refresh()>刷新</a>
						</div>
			    </FORM>
                <div style="text-align:center;margin-top:30px">
                    <a href="#" onclick="loginSubmit()" class="easyui-linkbutton" style="width:100%;height:40px"><span style="font-size:16px">登录</span></a>
                </div>
                <div style="text-align:center;margin-top:30px">
                    <a href="#" class="easyui-linkbutton" plain="true" outline="true" style="width:100px;height:35px"><span style="font-size:16px">注册</span></a> 
                </div>
            </div>
        </div>
    </body>    
    </html>