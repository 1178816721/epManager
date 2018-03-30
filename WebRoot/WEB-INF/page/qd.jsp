<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<!DOCTYPE html>
<html>

	<head>
		<meta charset="UTF-8">
		<title>签到</title>
		<link rel="stylesheet" href="${pageContext.request.contextPath}/css/calendar.css">
	</head>
	<style>
		.qd {
			background-image: url(${pageContext.request.contextPath}/img/qd.png);
			background-repeat: no-repeat;
			background-size: 100% 100%;
			-moz-background-size: 100% 100%;
		}
	</style>

	<body>

		<div id="calendar" class="calendar"></div>

		<script src="${pageContext.request.contextPath}/js/jquery.min.js"></script>
		<script src="${pageContext.request.contextPath}/js/calendar.js"></script>

		<div style="text-align:center;clear:both">

		</div>
		<script>
			$(function() {
				$('#calendar').calendar({
					ifSwitch: true, // 是否切换月份
					hoverDate: true, // hover是否显示当天信息
					backToday: true, // 是否返回当天
					dataStr: "${str}"
				});
				$("li").click(function() {

					var ts = returnDateStr(new Date());
					var ns = $(this).attr("id");
					var self= $(this);
					if(ts == ns) {
						 $.ajax({url:"${pageContext.request.contextPath}/qd_qd.action",success:function(result){
        						if(eval(result)){
        						self.addClass("qd");
        						alert("签到成功！")
        						}
        						
    							}});
					
					
						
					} else {
						alert("不允许补签！");
					}
				});

				function returnDateStr(date) { // 日期转字符串
					var year = date.getFullYear();
					var month = date.getMonth() + 1;
					var day = date.getDate();

					month = month <= 9 ? ('0' + month) : ('' + month);
					day = day <= 9 ? ('0' + day) : ('' + day);

					return year + month + day;
				}
			});
		</script>
	</body>

</html>
