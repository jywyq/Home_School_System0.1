<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%
	String path = request.getContextPath();
String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort()
+ path + "/frnt/";
String ba = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort()
+ path;
	//String css=basePath+"Css/styles.css";
	System.out.println(ba);
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>家校通登录系统</title>

<link rel="stylesheet" type="text/css"
	href=<%=basePath + "css/index.css"%>>
</head>
<body
	style="background-image:url(<%=basePath + "images/bc.png"%>);background-position:center; background-repeat: no-repeat">
	<!-- <div class="png login_logo">
		<img src=<%=basePath + "images/logo_03.png"%> alt="">
	</div> -->
	<form id='my' action=<%=ba+"/UserLoginServlet"%> method="post"
		onsubmit="return false;">
		<input type="text" name="id" placeholder="账号" class="input"> 
		<br>
		<input type="password" name="pwd" placeholder="密码" class="input-pwd">
		<br> 
		<input type="submit" value="登录" onclick="document.getElementById('my').submit()" class="input-sub">
		<input type="button" value="后台管理" onclick="window.location.href=('<%=ba+"/backgr/login.jsp"%>')">
		<br>
		<input type="radio" name="tp" value="1" class="input-radio" checked>学生
		<input type="radio" name="tp" value="2" class="input-radio2" >老师
		<input type="radio" name="tp" value="3" class="input-radio2" >家长
	</form>

</body>
</html>
<!-- 
	<script src='<%=basePath + "common.js"%>'></script>
 -->