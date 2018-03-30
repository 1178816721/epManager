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
					<strong><i class="fa fa-users"></i>薪资管理</strong> <span class="tab-more"><a href="javascript:history.go(-1)">返回上一页</a></span>
					<ul class="tab-nav">
						<li class="active"><a href="#tab-start">薪资详情</a></li>
					</ul>
				</div>
				<div class="tab-body">
					<div class="tab-panel active" id="tab-start">
						<div class="line">
							<form action="${pageContext.request.contextPath}/wage_list.action" method="post">
								
								<div class="x6">
									<strong>员工账号：</strong>
									<input type="text" value="${userId}" name="userId" placeholder="请输入员工账号" />
									<input type="submit" id="" name="" class="much-search" value="搜索" />
								</div>
							</form>
							<!--<div class="x6">
								<a href="${pageContext.request.contextPath}/wage_list.action" class="Member-modify dialogs">薪资管理</a>
							</div>
							-->
						</div>
						<div class="table-responsive-y">
							<table class="table table-hover">
								<thead>
									<tr class="current">
										
										<th>
											员工账号	
										</th>
										<th>
											员工姓名	
										</th>
										<th>
											基本工资
										</th>
										<th>
											提成
										</th>
										<th>
											奖金
										</th>
										<th>
											创建日期
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
											${user.usen}
										</td>
										<td>
											${user.person.name}
										</td>
										<td>
											${baseWage}
										</td>
										<td>
											${cm}
										</td>
										<td>
											${bonus}
										</td>
										<td>
											${createDate}
										</td>
										<td>
											<button class="modify-button" onclick="javascript:window.location.href='${pageContext.request.contextPath}/wage_addsave.action?userId=${user.id}'">修改</button>										
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
							
    						<%@include file="pagebean.jspf" %>
    						
							</div>
						</div>
					</div>
				</div>
			</div>
		</div>
		<!--    *****************************     提示修改信息DIV                    *******************************************            -->
	</body>

</html>