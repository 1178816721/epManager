<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!doctype html>
<html lang="zh">
<head>
	<meta charset="UTF-8">
	<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1"> 
	<meta name="viewport" content="width=device-width, initial-scale=1.0">
	<title>登录</title>
	<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/css/normalize.css" />
	<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/css/default.css">
	<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/css/styles.css">
</head>
<body>
	<div class="htmleaf-container">
		
		<div class="wrapper">
			<div class="container">
				<h1>Welcome</h1>
				
				  <form action="${pageContext.request.contextPath}/index_tologin.action" method="post">
					<input type="text" placeholder="Username" name="usen">
					<input type="password" placeholder="Password" name="psd">
					<button type="submit" id="login-button">Login</button>
				</form>
			</div>
			
			<ul class="bg-bubbles">
				<li></li>
				<li></li>
				<li></li>
				<li></li>
				<li></li>
				<li></li>
				<li></li>
				<li></li>
				<li></li>
				<li></li>
			</ul>
		</div>
		
	</div>
	
	<script src="${pageContext.request.contextPath}/js/jquery-2.1.1.min.js"></script>
	<script>
	$('#login-button').click(function (event) {
	    event.preventDefault();
	    $('form').fadeOut(500);
	    $('.wrapper').addClass('form-success');
	    document.forms[0].submit();
	});
	</script>
</body>
</html>