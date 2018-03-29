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
	</head>
	<body style="background-color: #E6F2FB;">
		<div class="line">
			
		</div>
	</body>
	<script type="text/javascript">
	var r=confirm("${errorMsg}");
if (r==true)
{
   history.back();
}
else
{
    history.back();
}
	</script>
</html>
