<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<!DOCTYPE html>
<html>

<head>
<meta charset="UTF-8">
<title></title>
<link rel="stylesheet"
	href="${pageContext.request.contextPath}/css/pintuer.css" />
<link rel="stylesheet"
	href="${pageContext.request.contextPath}/css/web.css" />
<link rel="stylesheet"
	href="${pageContext.request.contextPath}/js/font-awesome-4.5.0/css/font-awesome.min.css" />
<script type="text/javascript"
	src="${pageContext.request.contextPath}/js/jquery.js"></script>
<script type="text/javascript"
	src="${pageContext.request.contextPath}/js/pintuer.js"></script>
</head>

<body class="My-Oreders-body">
	<div class="Main-line line">
		<div class="x3">
			<div class="panel border bg-white">
				<div class="panel-body text-center">
					<br /> ${sessionScope.user.usen}
				</div>
				<div class="panel-foot bg-back border-back">
					您好，${sessionScope.user.usen}，当前时间<span id="time"></span>
				</div>
			</div>
		</div>
		<div class="x5"></div>
		<div class="x4"></div>
	</div>
	<div class="Main-line">
		<!-- <div class="x3">
				<div class="panel bg-white">
					<div class="panel-head"><strong>站点统计</strong></div>
					<ul class="list-group">
						<li><span class="float-right badge bg-red">88</span><span class="icon-user"></span> 会员</li>
						<li><span class="float-right badge bg-main">828</span><span class="icon-file"></span> 文件</li>
						<li><span class="float-right badge bg-main">828</span><span class="icon-shopping-cart"></span> 订单</li>
						<li><span class="float-right badge bg-main">828</span><span class="icon-file-text"></span> 内容</li>
						<li><span class="float-right badge bg-main">828</span><span class="icon-database"></span> 数据库</li>
					</ul>
				</div>
			</div> -->
		<!-- <div class="x5">
				<div class="panel bg-white">
					<div class="panel-head"><strong>系统信息</strong></div>
					<table class="table">
						<tr>
							<td width="110" align="right">操作系统：</td>
							<td>Windows 2008</td>
							<td width="90" align="right">系统开发：</td>
							<td><a href="#"target="_blank">拼图前端框架</a></td>
						</tr>
						<tr>
							<td align="right">Web服务器：</td>
							<td>Apache</td>
							<td align="right">主页：</td>
							<td><a href="#" target="_blank">http://www.pintuer.com</a></td>
						</tr>
						<tr>
							<td align="right">程序语言：</td>
							<td>PHP</td>
							<td align="right">演示：</td>
							<td><a href="#" target="_blank">demo/</a></td>
						</tr>
						<tr>
							<td align="right">数据库：</td>
							<td>MySQL</td>
							<td align="right">群交流：</td>
							<td><a href="#" target="_blank">201916085</a> (点击加入)</td>
						</tr>
					</table>
				</div>
			</div> -->
		<div class="x4"></div>
	</div>
	<script type="text/javascript">
setInterval(function() {
					$("#time").html(new Date().toLocaleDateString());
				}, 1000);
</script>
</body>

</html>