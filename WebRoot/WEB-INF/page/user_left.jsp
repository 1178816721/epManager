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

	<body style="background-color: #F2F9FD;">
		<div class="list-link" style=" border-top: 1px solid #B5CFD9; text-align: center;">
			<a href="${pageContext.request.contextPath}/person_list.action" target="main">签到</a>
			<a href="${pageContext.request.contextPath}/wage_list.action" target="main">薪资信息</a>
			<a href="Member-manage.html" target="main">个人信息管理</a>
		</div>
	</body>

</html>