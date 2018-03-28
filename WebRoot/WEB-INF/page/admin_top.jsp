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
		<link rel="stylesheet" href="${pageContext.request.contextPath}/css/pintuer.css" />
		<link rel="stylesheet" href="${pageContext.request.contextPath}/css/web.css" />
		<link rel="stylesheet" href="${pageContext.request.contextPath}/js/font-awesome-4.5.0/css/font-awesome.min.css" />
		<script type="text/javascript" src="${pageContext.request.contextPath}/js/jquery.js"></script>
		<script type="text/javascript" src="${pageContext.request.contextPath}/js/pintuer.js"></script>
	</head>

	<body>
		<div class="Nav-top-line line">
			<div class="x12">
				<div class="Nav-top-first-line line">
					<div class="x4">
						<div class="line">
							<div class="x2">
								<a href="Main.html" target="main"><i class="fa fa-home"></i>开始</a>
							</div>
							<div class="x2">
								<a href="Orders-manage.html" target="main"><i class="fa fa-shopping-cart"></i>订单</a>
							</div>
							<div class="x2">
								<a href="Member-manage.html" target="main"><i class="fa fa-users"></i>会员</a>
							</div>
							<div class="x2">
								<a href="#"><i class="fa fa-file-text-o"></i>文件</a>
							</div>
							<div class="x2">
								<a href="Column.html" target="main"><i class="fa fa-list-ul"></i>栏目</a>
							</div>
						</div>
					</div>
					<div class="x7">

					</div>
					<div class="x1">
						<a href="../Login.html" target="_parent"><i class="fa fa-sign-out"></i>退出系统</a>
					</div>
				</div>
				<div class="line" style="border-left:1px solid #B5CFD9; border-bottom: 1px solid #B5CFD9;">
					<div class="x6">
						<div class="admin-bread">
							<ul class="bread">
								<li><a href="Main.html" target="main"><i class="fa fa-home"></i>开始</a></li>
								<li>后台首页</li>
							</ul>
						</div>
					</div>
					<div class="x6" style="text-align: right;">
						<div class="line">
							<strong>您好，admin，欢迎您的光临。</strong>
						</div>
						<div class="line">
							<div class="x2">
							</div>
							<div class="x9">
								<strong>2016-4-4 13:33:33</strong>
							</div>
							<div class="x1">
							</div>
						</div>
					</div>
				</div>
			</div>
		</div>
	</body>
</html>