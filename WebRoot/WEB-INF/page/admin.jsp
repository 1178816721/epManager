<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="utf-8">
		<title>企业人事管理系统</title>
	</head>
	<frameset rows="95px,*" border="0" >
		<frameset cols="160px,*">
		    <frame src="${pageContext.request.contextPath}/index_head.action"/>
			<frame src="${pageContext.request.contextPath}/index_top.action">
		</frameset>
		<frameset cols="160px,*">
			<frame src="${pageContext.request.contextPath}/index_left.action"/>
			<frame src="${pageContext.request.contextPath}/index_login.action" name="login">
			<frame src="${pageContext.request.contextPath}/index_index.action" name="main">
		</frameset>
	</frameset>
</html>
