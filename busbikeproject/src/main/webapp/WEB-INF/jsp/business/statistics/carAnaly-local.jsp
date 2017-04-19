<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 <%@ include file="/WEB-INF/jsp/base/tag.jsp"%>
<!DOCTYPE HTML>
<html>
	<head>
		<link rel="stylesheet" href="${baseurl}css/amap.css"/> 
		<script type="text/javascript" src="${baseurl}js/jquery-1.8.3.min.js"></script>
		<script src="${baseurl}js/Highcharts-5.0.7/code/highcharts.js"></script>
		<script src="${baseurl}js/Highcharts-5.0.7/code/modules/exporting.js"></script>
		<script src="${baseurl}js/Highcharts-5.0.7/code/modules/data.js"></script>
		<script src="${baseurl}js/Highcharts-5.0.7/code/modules/drilldown.js"></script>
		<style type="text/css">
${demo.css}
		</style>
		<script type="text/javascript">
		  var AllSeries = [{
            name: '自行车编号',
            colorByPoint: true,
            data: [{
                name: '681665',
                
                y: 864,
                drilldown: true
            }, {
                name: '681445',
                y: 479,
                drilldown: true
            }, {
                name: '682529',
                y: 231,
                drilldown: true
            }, {
                name: '681211',
                y: 159,
                drilldown: false
            }]
        }];
         var drilldowns = {
                   '681665': [{
                       name: '681665',
                       type:'line',
                       data: [
                           ['20150613092015', 29],
                           ['20150612174508', 16],
                           ['20150613153742', 18],
                           ['20150614114956', 90],
                           ['20150613141118', 48],
                           ['20150614152643', 40]
                       ]
                   }],
                   '681445': [{
                   	   type: 'area',
                       name: '681445',
                       data: [
                           [Date.UTC(2015,06,13,09,20), 29],
                           [Date.UTC(2015,06,13,10,20), 16],
                           [Date.UTC(2015,06,13,11,20), 18],
                           [Date.UTC(2015,06,13,12,20), 90],
                           [Date.UTC(2015,06,13,17,20), 48],
                           [Date.UTC(2015,06,13,18,20), 40]
                       ]
                   }],
                   '682529': [{
		                type: 'area',
		                name: 'USD to EUR',
		                data: [
							[Date.UTC(2013,5,2),0.7695],
							[Date.UTC(2013,5,3),0.7648],
							[Date.UTC(2013,5,4),0.7645],
							[Date.UTC(2013,5,5),0.7638],
							[Date.UTC(2013,5,6),0.7549],
							[Date.UTC(2013,5,7),0.7562],]
		            }]
               };
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
			                          //chart.hideLoading();
			                          // chart.addSeriesAsDrilldown(e.point, series);
			                       }, 500);
			                   }
			               }
			           }
			       },
			       title: {
			           text: '公共自行车使用情况分析表'
			       },
			        subtitle: {
			            text: '单击列以查看单车详情'
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
			       series: null,
			       drilldown: {
			           series: []
			       }
			   } ;
			var singleJson = {
		            chart: {
		                zoomType: 'x'
		            },
		            title: {
		                text: '号自行车租用时长分析图'
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
		            series: null
		        };
		
		//整体分析
		function AllCarAnaly(){
			 $("#allCarAnaly").hide(); 
		     $('#container').highcharts(chartJson);
		     
		};
		//单车分析
		 function singleCarAnaly(carNum){	 	
				//计算数据
		        singleJson.series = drilldowns[carNum];
		        Highcharts.chart('container', singleJson);
		         $("#allCarAnaly").show(); 
		 }
		 //加载完自动执行的函数
		$(function () {
				//对所有车辆属于数据
		        chartJson.series = AllSeries;
		    	AllCarAnaly();
		    	
		    	$("#allCarAnaly").click(function(){
		    		
				    AllCarAnaly();
				  
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
