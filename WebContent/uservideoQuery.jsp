<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<title></title>
<meta charset="UTF-8">
<link rel="stylesheet" type="text/css" href="Css/bootstrap.css" />
<link rel="stylesheet" type="text/css"
	href="Css/bootstrap-responsive.css" />
<link rel="stylesheet" type="text/css" href="Css/style.css" />
<script type="text/javascript" src="Js/jquery2.js"></script>
<script type="text/javascript" src="Js/jquery2.sorted.js"></script>
<script type="text/javascript" src="Js/bootstrap.js"></script>
<script type="text/javascript" src="Js/ckform.js"></script>
<script type="text/javascript" src="Js/common.js"></script>

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
	<form class="form-inline definewidth m20" action="#" method="get">
		<font color="#777777"><strong>请输入用户名称：</strong></font> <input
			type="text" name="menuname" id="menuname" class="abc input-default"
			placeholder="" value="">&nbsp;&nbsp;
		<button type="submit" class="btn btn-primary">查询</button>
		&nbsp;&nbsp;
	</form>
	<table class="table table-bordered table-hover definewidth m10">
		<thead>
			&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
			<font color="#777777"><strong>用户名称：</strong></font> &nbsp;&nbsp;
			<a href="studentdetail.html">小强</a>
			<tr>
				<th>序号</th>
				<th>视频名称</th>

				<th>分类</th>

				<th>上传日期</th>


				<th>管理菜单</th>
			</tr>
		</thead>

		<tr>
			<td>1</td>
			<td>复仇者联盟</td>
			<td>娱乐-电影</td>
			<td>2016.07.22</td>

			<td>
				<button type="submit">删除</button>
				</a>
			</td>

		</tr>
		<tr>
			<td>2</td>
			<td>北大教授讲座</td>
			<td>学习</td>
			<td>2016.07.22</td>

			<td>
				<button type="submit">删除</button>
				</a>
			</td>

		</tr>


	</table>

</body>
</html>
<script>
    $(function () {
        

		$('#addnew').click(function(){

				window.location.href="goodsAdd.html";
		 });


    });
	
</script>