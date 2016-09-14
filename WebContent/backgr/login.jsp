<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!doctype html>
<html lang="zh">
<head>
<meta charset="UTF-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>家校通后台管理登录界面</title>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
	String css=basePath+"Css/styles.css";
	//System.out.println(css);
%>
<link rel="stylesheet" type="text/css" href="<%=css%>">

</head>
<body>


	<div class="wrapper">

		<div class="container">
			<h1>家校通后台管理 ╰(*°▽°*)╯</h1>
			<form id='my' class="form" action="AdminLoginServlet" method="post" onsubmit="return false;">
				<input type="text" name="aid" placeholder="管理员账号"> <input
					type="password" name ="apwd" placeholder="密码"><br>
				<input type="submit" value = "登录" onclick="document.getElementById('my').submit()">
			</form>
		</div>

		<ul class="bg-bubbles">
			<li></li>
			<li></li>

		</ul>

	</div>

</body>
</html>