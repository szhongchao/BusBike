<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 <%@ include file="/WEB-INF/jsp/base/tag.jsp"%>
    <!DOCTYPE html>
    <html>
    <head>
        <meta charset="UTF-8">
        <meta name="viewport" content="initial-scale=1.0, maximum-scale=1.0, user-scalable=no">
        <link rel="stylesheet" type="text/css" href="${baseurl}js/jquery-easyui-1.5.1/themes/metro/easyui.css">
        <link rel="stylesheet" type="text/css" href="${baseurl}js/jquery-easyui-1.5.1/themes/mobile.css">
        <link rel="stylesheet" type="text/css" href="${baseurl}js/jquery-easyui-1.5.1/themes/icon.css">
        <link rel="stylesheet" href="${baseurl}css/amap.css"/> 
        
        <script type="text/javascript" src="${baseurl}js/jquery-1.8.3.min.js"></script>
        <script type="text/javascript" src="${baseurl}js/jquery-easyui-1.5.1/jquery.easyui.min.js"></script>
        <script type="text/javascript" src="${baseurl}js/jquery-easyui-1.5.1/jquery.easyui.mobile.js"></script>
	   
	    <script type='text/javascript' src='${baseurl}dwr/engine.js'></script>   
		<script type='text/javascript' src='${baseurl}dwr/util.js'></script>  
		<script type='text/javascript' src='${baseurl}dwr/interface/dwrService.js'></script>
	    
	    <script src="http://webapi.amap.com/maps?v=1.3&key=您申请的key值"></script>
	    <script type="text/javascript" src="http://cache.amap.com/lbs/static/addToolbar.js"></script>
         
         <script type="text/javascript" >
         //出行地图调用
          function cycle(){
             $("#scanButton").show();
	           var map = new AMap.Map("container", {
			        resizeEnable: true,
			        center: [120.36008,30.3212152],
			        zoom: 14
			    });
			    
			    var markers = [];
			    $.ajaxSettings.async = false;
			    $.getJSON('${baseurl}statistics/rentInfo.action' , function (data) {
				     var json = eval(data.rows) ;
				     for(var i=0; i<json.length; i++){ 	//json变量现在就是一个数组对象，直接读取每个数组对象。结合属性进行输出 
					       marker = new AMap.Marker({
					            map: map,
					            icon: '${baseurl}images/scIcon/blue_small.png',
					            position: [json[i].lng,json[i].lat]
					        });
					      markers.push(marker);
				    }
			    });		    
           }
           
           function rentCar(){
               javascript:dwr.engine.setAsync(false);
	            var rentCarNum = $("#rentCarNum").val();
	            if(rentCarNum == null ||rentCarNum ==""){	
	            	alert("请输入车辆编号!");
	            	return ;
	            }
	            dwrService.checkCarExist(rentCarNum,{
				     callback:function(data) {
						jin = data;
				     }});
		           if(jin == 1){
		             $("#scanButton").hide();
		             location.href='${baseurl}servicePhone/singleCarInfo.action?carNum='+rentCarNum ;
		           }else {
		           	   alert("您输入的编号不存在,请重新输入!");
		           }
           }
           //加载完页面即执行
          $(function () {
		    	cycle()
		  });
		  //任务页面
		  function taskList(){
		  		$("#scanButton").hide();
		          location.href='${baseurl}servicePhone/taskList.action' ;
		  }
		   //朋友页面
		  function friend(){
		  		alert("朋友");
		  }
		  //我的页面
		  function mine(){
		  		alert("我的");
		  }
         </script>
    </head>
    <body>
        <div class="easyui-navpanel" style="position:relative">
            <header>
                <div class="m-toolbar">
                    <div class="m-title">出行</div>
                    <div class="m-right">
	                    <a href="javascript:void(0)" class="easyui-linkbutton" data-options="iconCls:'icon-search',plain:true"></a>
	                    <a href="javascript:void(0)" class="easyui-menubutton" data-options="iconCls:'icon-more',menu:'#mm',menuAlign:'right',hasDownArrow:false"></a>
	                </div>
                </div>
            </header>
            <DIV  id="container" >
				
			</DIV>
			<div class="button-group">
			    <input type="button" hidden="hidden" class="button"  value="" id="clearMarker"/>
			</div>
            <footer>
                <div class="m-buttongroup m-buttongroup-justified" style="width:100%">
                    <a href="javascript:cycle()" class="easyui-linkbutton" data-options="iconCls:'icon-large-picture',size:'large',iconAlign:'top',plain:true">出行</a>
                    <a href="javascript:taskList()" class="easyui-linkbutton" data-options="iconCls:'icon-large-clipart',size:'large',iconAlign:'top',plain:true">任务</a>
                    <a href="javascript:friend()" class="easyui-linkbutton" data-options="iconCls:'icon-large-shapes',size:'large',iconAlign:'top',plain:true">朋友</a>
                    <a href="javascript:mine()" class="easyui-linkbutton" data-options="iconCls:'icon-large-smartart',size:'large',iconAlign:'top',plain:true">我的</a>
                </div>
            </footer>
            <div id="scanButton" style="text-align:center;margin:340px 30px">
                <a href="javascript:void(0)" class="easyui-linkbutton" data-options="plain:true,outline:true" style="width:80px;height:30px" onclick="$('#dlg1').dialog('open').dialog('center')">扫一扫</a>
            </div>
     
            <div id="dlg1" class="easyui-dialog" style="padding:20px 6px;width:80%;" data-options="inline:true,modal:true,closed:true,title:'请扫描车辆上的二维码'">
                <div style="margin-bottom:10px">
	                <input type="text" id="rentCarNum" name="rentCarNum"class="easyui-textbox" prompt="请输入车辆编号" style="width:100%;height:30px"/>
	            </div>
 
                <div class="dialog-button">
                     <a href="javascript:void(0)" class="easyui-linkbutton" iconCls="icon-no" plain="true" outline="true" style="width:100px;height:35px" onclick="$('#dlg1').dialog('close')"><span style="font-size:16px">取消</span></a>
                     <a href="javascript:rentCar()" class="easyui-linkbutton" iconCls="icon-ok" plain="true" outline="true" style="width:100px;height:35px"><span style="font-size:16px">确定</span></a>
                </div>
            </div>
        </div>
        <div id="mm" class="easyui-menu" style="width:150px;">
        <div data-options="iconCls:'icon-undo'">Undo</div>
        <div data-options="iconCls:'icon-redo'">Redo</div>
        <div class="menu-sep"></div>
        <div>Cut</div>
        <div>Copy</div>
        <div>Paste</div>
        <div class="menu-sep"></div>
        <div>Toolbar</div>
        <div data-options="iconCls:'icon-remove'">Delete</div>
        <div>Select All</div>
    </div>
    </body>
    </html>