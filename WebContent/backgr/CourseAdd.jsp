<%@ page language="java" contentType="text/html; charset=gb2312"
	pageEncoding="gb2312"%>
<!DOCTYPE html>
<html>
<head>
<title></title>
<meta charset="UTF-8">
<link rel="stylesheet" type="text/css" href="../Css/bootstrap.css" />
<link rel="stylesheet" type="text/css"
	href="../Css/bootstrap-responsive.css" />
<link rel="stylesheet" type="text/css" href="../Css/style.css" />
<script src="http://code.jquery.com/jquery-1.11.1.min.js"></script>
<script
	src="http://jqueryvalidation.org/files/dist/jquery.validate.min.js"></script>
<script
	src="http://jqueryvalidation.org/files/dist/additional-methods.min.js"></script>

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

<script type="text/javascript">
	$().ready(function() {

		//验证指定表单
		$("#myform").validate({
			//设置默认的状态为keyup，也可以设置为blur
			event : "keyup", //触发验证的事件
			//设定规则
			rules : {
				//对应id为'username'的input
				username : {
					//必填项
					required : true,
					//最多和最少的字符数
					rangeLength : [ 4, 16 ]
				},
				mail : {
					required : true,
					//声明这是一个电子邮件
					email : true
				},
				password : {
					required : true,
					//最少4个字符
					minLength : 4
				},
				confirm_password : {
					required : true,
					minLength : 4,
					// 与哪个等同，这里是id为password的input等同
					equalTo : "#password"
				},
				agree : "required"

			},

			//这里是与规则对应的错误代码
			messages : {
				username : {
					//如果用户名为空，则显示下面的信息
					required : '请输入用户名',
					//如果字符串的长度不符合，则显示下面的信息
					rangeLength : '用户名必须在4-16个字符之间'
				},
				password : {
					required : '请输入密码',
					minLength : '密码必须大于4个字符'
				},
				confirm_password : {
					required : '请确认你的密码',
					equalTo : '两次密码输入不一致',
					minLength : '密码必须大于4个字符'
				},
				agree : '请同意我们的条款',
				mail : '请输入有效的E-MAIL帐户'
			}
		});
	});
</script>

<body>
	<br> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
	<font color="#777777"><strong>添加班级：</strong></font>
	<form action="../CAddServlet" method="post" class="definewidth m20"
		id="myform">
		<table style="margin-left: 10px; margin-top: 3px;">
			<tr>
				<td>课程名：</td>
				<td><input id="username" type="text" name="cname"
					style="width: 200px;" placeholder='请输入课程名' /></td>
			</tr>
			<tr>
				<td>开设学期：</td>
				<td><input id="username" type="text" name="cterm"
					style="width: 200px;" placeholder='请输入开设学期' /></td>
			</tr>
		</table>
		<button style="margin-left: 5px;" type="submit"
			class="btn btn-primary" type="button">保&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;存</button>
		&nbsp;&nbsp;
		<button type="button" class="btn btn-success" name="backid"
			id="backid">
			<a href="../ShowAllCourseServlet"> 返回列表</a>
		</button>
	</form>

</body>
</html>


