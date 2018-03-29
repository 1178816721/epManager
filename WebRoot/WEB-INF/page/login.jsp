<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<%@ taglib prefix="s" uri="/struts-tags" %>
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
		<script src="${pageContext.request.contextPath}/js/Select-More.js" type="text/javascript" charset="utf-8"></script>
		
	</head>

	<body>
		<div class="Manage-line line">
			<div class="tab table-bordered">
				<h1 align="center" style="color: blue">企业人事管理系统</h1>
	    <form action="${pageContext.request.contextPath}/index_tologin.action" method="post">
	   			<div class="btnLogin" align="center">
	    	
	        	<input type="text" name="psd"/><br/>
	            <br/><input type="psd" name="psd"/>
	        
	   		   </div>
	   		<p align="center"> 
	   		<input type="submit" value="登录" >
	   		</p>
		</form>		
			</div>
		</div>
		
	</body>

</html>