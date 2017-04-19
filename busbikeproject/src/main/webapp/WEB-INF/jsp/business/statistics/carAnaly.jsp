<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 <%@ include file="/WEB-INF/jsp/base/tag.jsp"%>
<!DOCTYPE HTML>
<html>
	<head>
	
	<LINK rel="stylesheet" type="text/css"	href="${baseurl}js/jquery-easyui-1.5.1/themes/default/easyui.css" />
	<LINK rel="stylesheet" type="text/css"	href="${baseurl}js/jquery-easyui-1.5.1/themes/icon.css">
	<link rel="stylesheet" href="${baseurl}css/amap.css"/>
	 
		<script type="text/javascript" src="${baseurl}js/jquery-1.8.3.min.js"></script>
		<script src="${baseurl}js/Highcharts-5.0.7/code/highcharts.js"></script>
		<script src="${baseurl}js/Highcharts-5.0.7/code/modules/exporting.js"></script>
		<script src="${baseurl}js/Highcharts-5.0.7/code/modules/data.js"></script>
		<script src="${baseurl}js/Highcharts-5.0.7/code/modules/drilldown.js"></script>
		
		

		<SCRIPT type="text/javascript" src="${baseurl}js/jquery-easyui-1.5.1/jquery.easyui.min.js"></SCRIPT>
		<script type="text/javascript" src="${baseurl}js/jquery-easyui-1.5.1/locale/easyui-lang-zh_CN.js"></script>

		<script type="text/javascript" src="${baseurl}js/custom.box.main.js"></script>



		
		<style type="text/css">
				${demo.css}
		</style>
		<script type="text/javascript">

        var chartJson = {
			       chart: {
			           type: 'column',
			           zoomType: 'x',
			           events: {
			               drillup: function(e) {
			                   // 上钻回调事件
			                   console.log(e.seriesOptions);
			               },
			               drilldown: function (e) {
			                   if (!e.seriesOptions) {
			                       var chart = this,
			                           
			                         series = null;
			                       // Show the loading label
			                       chart.showLoading('数据处理中请稍后 ...');
			                       setTimeout(function () {
			                           singleCarAnaly(e.point.name);

			                       }, 500);
			                   }
			               }
			           }
			       },
			       title: {
			           text: '公共自行车使用情况分析表'
			       },
			        subtitle: {
			            text: '单击列以查看单车详情,单击并拖动绘图区域以放大'
			        },
			       xAxis: {
			           type: 'category'
			       }, 
			       yAxis: {
			           title: {
			               text: '租用次数'
			           }
			        },
			       legend: {
			           enabled: false
			       },
			       plotOptions: {
			           series: {
			               borderWidth: 0,
			               dataLabels: {
			                   enabled: true
			               }
			           }
			       },
			       tooltip: {
			           headerFormat: '<span style="font-size:11px">{series.name}</span><br>',
			           pointFormat: '<span style="color:{point.color}">{point.name}</span>:租用 <b>{point.y:.0f}次</b> <br/>'
			       },
			       series: [{}]
			       
			   } ;
			var singleJson = {
		            chart: {
		                zoomType: 'x'
		            },
		            title: {
		                text: '单车租用时长分析图'
		            },
		            subtitle: {
		                text: document.ontouchstart === undefined ?
		                        '单击并拖动绘图区域以放大' : 'Pinch the chart to zoom in'
		            },
		            xAxis: {
		                type: 'datetime',
		                labels: {
				                formatter :function() {
				                    return Highcharts.dateFormat('%Y-%m-%d', this.value);
				                }
				            }
		            },
		            yAxis: {
		                title: {
		                    text: '租用时长/分钟'
		                }
		            },
		            tooltip: {
			           xDateFormat: '%m/%d.%H:%M:%S',
			        },
		            legend: {
		                enabled: false
		            },
		            plotOptions: {
		                area: {
		                    fillColor: {
		                        linearGradient: {
		                            x1: 0,
		                            y1: 0,
		                            x2: 0,
		                            y2: 1
		                        },
		                        stops: [
		                            [0, Highcharts.getOptions().colors[0]],
		                            [1, Highcharts.Color(Highcharts.getOptions().colors[0]).setOpacity(0).get('rgba')]
		                        ]
		                    },
		                    marker: {
		                        radius: 2
		                    },
		                    lineWidth: 1,
		                    states: {
		                        hover: {
		                            lineWidth: 1
		                        }
		                    },
		                    threshold: null
		                }
		            },
		            series: [{}]
		        };
  
		  //获取所有车辆的使用次数
		function AllCarData(bottomNum,topNum) {
			var AllSeriesData =[];
		   $.ajaxSettings.async = false;
		   $.getJSON('${baseurl}statistics/allCarUseInfo.action?bottomNum='+bottomNum+'&topNum='+topNum, function (data) {
		           
		            if(data.resultInfo != null && data.resultInfo.type =='0'){
						 //延迟1秒执行关闭方法
						 message_alert(data);
						// setTimeout("parent.closemodalwindow()", 1000);
					 }
		             
		           
 					var json = eval(data.rows) 
			         for(var i=0; i<json.length; i++){
			            var temp = {};
				        temp.name = json[i].carNum;
				        temp.y = json[i].countSum;
				        temp.drilldown = true;
				        AllSeriesData.push(temp);} 
					      AllSeriesData.sort(function(a,b){
				           return a.y-b.y}); 
			           });
			 //赋值操作
		   chartJson.series[0].name = '自行车编号';
           chartJson.series[0].colorByPoint = true; 
		   chartJson.series[0].data = AllSeriesData ;
		};
		//获取单车辆使用时间
		function singleCarData(carNum) {
			var singleSeriesData =[];
		   $.getJSON('${baseurl}statistics/singleCarUserInfo.action?carNum='+ carNum , function (data) {
 					 var json = eval(data.rows) 
			         for(var i=0; i<json.length; i++){
			            var temp = [];
				        var yearStr = json[i].rentDateTime.substr(0,4);
			         	var mouthStr = json[i].rentDateTime.substr(4,2);
			         	var dayStr = json[i].rentDateTime.substr(6,2);
			         	var hourStr = json[i].rentDateTime.substr(8,2);
			         	var minStr = json[i].rentDateTime.substr(10,2);
			         	var secStr = json[i].rentDateTime.substr(12,2);
				        temp[0] = Date.UTC(yearStr,mouthStr,dayStr,hourStr,minStr,secStr);
				        temp[1] = json[i].useMin;
				        singleSeriesData.push(temp) ;
			           
						} 
					      singleSeriesData.sort(function(a,b){
				           return a[0]-b[0]}); 
			           });
			 //赋值操作
		   singleJson.series[0].name = carNum;
           singleJson.series[0].type = 'area'; 
		   singleJson.series[0].data = singleSeriesData ;
		};          
		
		//整体分析
		function AllCarAnaly(bottomNum,topNum){
			 $("#allCarAnaly").hide(); 
		     //计算所有车辆的使用次数
		     AllCarData(bottomNum,topNum)
		     $('#container').highcharts(chartJson);
		};
		//单车分析
		 function singleCarAnaly(carNum){	 	
				//计算单车辆使用时间
		        singleCarData(carNum);
		        Highcharts.chart('container', singleJson);
		        $("#allCarAnaly").show(); 
		 }
		 //加载完自动执行的函数
		$(function () {
		      //  $.messager.alert('提示信息','你好','error');
				var bottomNum = "680004";
				var topNum ="682281"; //小于1000
				//var topNum = "922201"; //大于1000
		    	AllCarAnaly(bottomNum,topNum);
		    	
		    	$("#allCarAnaly").click(function(){
				    AllCarAnaly(bottomNum,topNum);
		 		})
		});
		 
		</script>
	</head>
	<body>
          <div id="container" style="min-width: 310px; height: 400px; margin: 0 auto"></div>
          <div class="button-group">
			    <input type="button" class="button" value="整体分析" id="allCarAnaly"/>
		  </div>
	</body>
</html>
