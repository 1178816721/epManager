<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@taglib prefix="s" uri="/struts-tags"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
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
		<div class="Manage-line line">
			<div class="tab table-bordered">
				<div class="tab-head">
					<strong><i class="fa fa-user"></i>员工管理</strong> <span class="tab-more"><a href="javascript:history.go(-1)">返回上一页</a></span>
					<ul class="tab-nav">
						
						<li class="active"><a href="#tab-css">添加薪资</a> </li>
						
					</ul>
				</div>
				<div class="tab-body">
					<div class="tab-panel active" id="tab-start">
						<!-- <div class="line">
							<div class="x9">

							</div>
							<div class="x3">
								<button class="modify dialogs" data-toggle="click" data-target="#Admin-Info-modify" data-mask="1" data-width="40%">修改信息</button>
							</div>
						</div> -->
						
					<div class="tab-panel active" id="tab-css">
						<form action="${pageContext.request.contextPath}/${link}" method="post">
							<input type="hidden" class="input" name="userId" value="${userId}" />
							<input type="hidden" name="id" value="${wage.id}">
							<div class="line">
								<div class="x2">
									<strong>基本工资：</strong>
								</div>
								<div class="x3">
									<input type="text" class="input" name="baseWage" value="${wage.baseWage}" />
								</div>
								<div class="x7">

								</div>
							</div>
							<div class="line">
								<div class="x2">
									<strong>提成：</strong>
								</div>
								<div class="x3">
									<input type="text" class="input" name="cm" value="${wage.cm}" />
								</div>
								<div class="x7">

								</div>
							</div>
							<div class="line">
								<div class="x2">
									<strong>奖金：</strong>
								</div>
								<div class="x3">
									<input type="text" class="input" name="bonus" value="${wage.bonus}" />
								</div>
								<div class="x7">

								</div>
							</div>
												
							<div class="line">
								<div class="x2">

								</div>
								<div class="x3">
									<input type="submit" class="button bg-yellow button-block" id="" value="提交信息" />
								</div>
								<div class="x7">

								</div>
							</div>
						</form>
					</div>
					
				</div>
			</div>
		</div>
		<!--    *****************************     提示修改信息DIV                    *******************************************  div id="Admin-Info-modify">
			<div class="dialog">
				<div class="dialog-head">
					<span class="close rotate-hover"></span><strong>修改信息</strong>
				</div>
				<div class="dialog-body">
					<form>
						<div class="line">
							<div class="x3">
								<p><strong>职工编号：</strong></p>
							</div>
							<div class="x2">

							</div>
							<div class="x3">
								<p><strong>姓名：</strong></p>
							</div>
							<div class="x4">

							</div>
						</div>
						<div class="line">
							<div class="x3">
								<input type="text" class="input" value="541313440202" />
							</div>
							<div class="x2">

							</div>
							<div class="x3">
								<input type="text" class="input" value="陈柯琪" />
							</div>
							<div class="x4">

							</div>
						</div>
						<div class="line">
							<div class="x3">
								<p><strong>性别：</strong></p>
							</div>
							<div class="x2">

							</div>
							<div class="x3">
								<p><strong>年龄：</strong></p>
							</div>
							<div class="x4">

							</div>
						</div>
						<div class="line">
							<div class="x3">
								<input type="text" class="input" value="男" />
							</div>
							<div class="x2">

							</div>
							<div class="x3">
								<input type="text" class="input" value="22" />
							</div>
							<div class="x4">

							</div>
						</div>
						<div class="line">
							<p><strong>联系方式：</strong></p>
						</div>
						<div class="line">
							<div class="x8">
								<input type="text" class="input" value="18037455549" />
							</div>
							<div class="x4">

							</div>
						</div>
						<div class="line">
							<div class="x3">
								<p><strong>入职年份：</strong></p>
							</div>
							<div class="x2">

							</div>
							<div class="x3">
								<p><strong>工作性质：</strong></p>
							</div>
							<div class="x4">

							</div>
						</div>
						<div class="line">
							<div class="x3">
								<input type="text" class="input" value="2013" />
							</div>
							<div class="x2">

							</div>
							<div class="x3">
								<input type="text" class="input" value="管理类" />
							</div>
							<div class="x4">

							</div>
						</div>
						<div class="line">
							<p><strong>邮箱：</strong></p>
						</div>
						<div class="line">
							<div class="x8">
								<input type="text" class="input" value="1054095822@qq.com" />
							</div>
							<div class="x4">

							</div>
						</div>
						<div class="line">
							<ul>
								<li>&nbsp;</li>
								<li>&nbsp;</li>
							</ul>
						</div>
						<div class="line">
							<div class="x4">
								<input type="submit" class="button bg-green" value="确认修改" />
							</div>
							<div class="x4">
								<input type="reset" class="button bg" value="重新填写" />
							</div>
							<div class="x4">

							</div>
						</div>
					</form>
				</div>
			</div>
		</div>          -->
		
		
	</body>

</html>