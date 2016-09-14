<%@ page language="java"
	import="java.util.*,dao.*,daoimp.*,hibernate.*,servlet.*,hiber_sessionfac.*"
	contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<title></title>
<meta charset="UTF-8">
<link rel="stylesheet" type="text/css" href="Css/bootstrap.css" />
<link rel="stylesheet" type="text/css"
	href="Css/bootstrap-responsive.css" />
<link rel="stylesheet" type="text/css" href="Css/style.css" />
<script type="text/javascript" src="../js/jquery2.js"></script>
<script type="text/javascript" src="../js/bootstrap.js"></script>
<script type="text/javascript" src="../js/ckform.js"></script>
<script type="text/javascript" src="../js/common.js"></script>

<style type="text/css">
body {
	font-size: 20px;
	padding-bottom: 40px;
	background-color: #e9e7ef;
}

.sidebar-nav {
	padding: 9px 0;
}

@media ( max-width : 980px) {
	/* Enable use of floated navbar text */
	.navbar-text.pull-right {
		float: none;
		padding-left: 5px;
		padding-right: 5px;
	}
}
</style>
</head>
<body>

	<font color="#777777"><strong>管理员昵称：</strong></font>
	<input type="text" name="menuname" id="menuname"
		class="abc input-default" placeholder="" value="">&nbsp;&nbsp;
	<button type="submit" class="btn btn-primary">查询</button>
	&nbsp;&nbsp;
	<button type="button" id="addnew">
		<a href="backgr/adminAdd.jsp">添加管理员 
	</button>
	</a>
	<table class="table table-bordered table-hover definewidth m10"
		id="table">
		<tr>
			<td>管理员昵称</td>
			<td>管理员账号</td>
			<td>管理员密码</td>
		</tr>
		<c:forEach var="list" items="${list}">
			<tr>
				<td>${list.aname }</td>
				<td>${list.aid }</td>
				<td>${list.apwd }</td>
				<td><a href="QueryAdminById?aid=${list.aid }">修改</a> <a
					href="DeleteAdminById?aid=${list.aid }">删除</a></td>
			</tr>
		</c:forEach>
	</table>
</body>
</html>
