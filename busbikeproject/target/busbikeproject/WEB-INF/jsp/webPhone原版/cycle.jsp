<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/jsp/base/tag.jsp"%>

<!doctype html>

<html>
<head>
    <link rel="stylesheet" href="${baseurl}css/amap.css"/> 
    <script type="text/javascript" src="${baseurl}js/jquery-1.8.3.min.js"></script>
    <script src="http://webapi.amap.com/maps?v=1.3&key=您申请的key值"></script>
    <script type="text/javascript" src="http://cache.amap.com/lbs/static/addToolbar.js"></script>
</head>
<body>
<div id="container">  </div>
<div class="button-group">
    <input hidden="hidden" type="button" class="button" value="城东服务点分布" id="clearMarker"/>
    
</div>
<script>
   function cycle(){
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
            //加载完页面即执行
          $(function () {
		    	cycle()
		  });
  		
</script>

</body>
</html>