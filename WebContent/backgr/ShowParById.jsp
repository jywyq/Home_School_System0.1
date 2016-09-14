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
	<form action="UpdateParServlet" method="post">
		<table class="table table-bordered table-hover definewidth m10"
			id="table">
			<tr>
				<td>家长账号</td>
				<td><input type="text" name="pid" value="${ad.pid }"
					readonly="readonly"></td>
			</tr>
			<tr>
				<td>家长名字</td>
				<td><input type="text" name="pname" value="${ad.pname }"></td>
			</tr>
			<tr>
				<td>家长性别</td>
				<td><input type="text" name="psex" value="${ad.psex }"></td>
			</tr>
			<tr>
				<td>家长年龄</td>
				<td><input type="text" name="page" value="${ad.page }"></td>
			</tr>
			<tr>
				<td>家长电话</td>
				<td><input type="text" name="ptel" value="${ad.ptel }"></td>
			</tr>
			<tr>
				<td>工作单位</td>
				<td><input type="text" name="pcpy" value="${ad.pcpy }"></td>
			</tr>
			<tr>
				<td>密码</td>
				<td><input type="text" name="ppwd" value="${ad.ppwd }"></td>
			</tr>
		</table>
		<button style="margin-left: 5px;" type="submit"
			class="btn btn-primary" type="button">保&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;存</button>
		&nbsp;&nbsp;
		<button type="button" class="btn btn-success" name="backid"
			id="backid">
			<a href="ShowAllParentServlet"> 返回列表</a>
		</button>
	</form>
</body>
</html>
