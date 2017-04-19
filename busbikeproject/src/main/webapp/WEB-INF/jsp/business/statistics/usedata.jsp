<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 <%@ include file="/WEB-INF/jsp/base/tag.jsp"%>
    
<!DOCTYPE HTML>
<html>
	<head>

		<script type="text/javascript" src="${baseurl}js/jquery-1.8.3.min.js"></script>
		<script src="${baseurl}js/Highcharts-5.0.7/code/highcharts.js"></script>
		<script src="${baseurl}js/Highcharts-5.0.7/code/modules/exporting.js"></script>
		<style type="text/css">
${demo.css}
		</style>
		<script type="text/javascript">
$(function () {
		//alert("ok");
		
		var userName=<%=session.getAttribute("city")%>;
		console.log("输入数据");
		console.log(userName);
});
		</script>
	</head>
	<body>

       1、 time:${requestScope.time}
  <br/>2、names:${requestScope.names }
  <br/>3、city:${requestScope.city }
 <br/>4、gender:${requestScope.gender }
	</body>
</html>
