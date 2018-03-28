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
				<div class="tab-head">
					<strong><i class="fa fa-users"></i>员工管理</strong> <span class="tab-more"><a href="javascript:history.go(-1)">返回上一页</a></span>
					<ul class="tab-nav">
						<li class="active"><a href="#tab-start">员工成员</a></li>
					</ul>
				</div>
				<div class="tab-body">
					<div class="tab-panel active" id="tab-start">
						<div class="line">
							<form action="${pageContext.request.contextPath}/person_list.action" method="post">
								<div class="x6">
									<strong>员工账号：</strong>
									<input type="text" value="${usen}" name="usen" placeholder="请输入员工账号" />
									<input type="submit" id="" name="" class="much-search" value="搜索" />
								</div>
							</form>
							<div class="x6">
								<a href="${pageContext.request.contextPath}/person_add.action" class="Member-modify dialogs">添加员工</a>
							</div>
						</div>
						<div class="table-responsive-y">
							<table class="table table-hover">
								<thead>
									<tr class="current">
										<th>
											员工账号
										</th>
										<th>
											姓名
										</th>
										<th>
											入职时间
										</th>
										<th>
											操作
										</th>
									</tr>
								</thead>
								<tbody>
								<s:iterator value="recordList" status="l">
									<tr>
										<td>
											<a href="Member-manage-info.html">${user.usen}</a>
										</td>
										<td>
											${name}
										</td>
										<td>
											${inJobTime}
										</td>
										<td>
											<button class="modify-button" onclick="javascript:window.location.href='${pageContext.request.contextPath}/person_edit.action?id=${id}'">修改</button>
										<button class="modify-button" onclick="javascript:window.location.href='${pageContext.request.contextPath}/person_delete.action?id=${id}'">删除</button>
										
										<button class="modify-button" onclick="javascript:window.location.href='${pageContext.request.contextPath}/wage_addsave.action?userId=${user.id}'">添加薪资</button>
										</td>
									</tr>
									</s:iterator>
								</tbody>
								
							</table>
						</div>
						<div class="line">
							<div class="x9">

							</div>
							<div class="x3">
							<form action="${pageContext.request.contextPath}/person_list.action" method="post">
    						<%@include file="pagebean.jspf" %>
    						</form>
							</div>
						</div>
					</div>
				</div>
			</div>
		</div>
		<!--    *****************************     提示修改信息DIV                    *******************************************            -->
	</body>

</html>