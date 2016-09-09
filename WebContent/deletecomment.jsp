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
		<font color="#777777"><strong>æ¥è¯¢è¯ä»·ï¼</strong></font> <input type="text"
			name="menuname" id="menuname" class="abc input-default"
			placeholder="" value="">&nbsp;&nbsp;
		<button type="submit" class="btn btn-primary">æ¥è¯¢è¯ä»·</button>
		&nbsp;&nbsp;

	</form>
	<table class="table table-bordered table-hover definewidth m10">
		<thead>
			<tr>
				<th>è¯ä»·åå®¹</th>
				<th>è¯ä»·äºº</th>
				<th>è¯ä»·æ¶é´</th>
				<th>æä½</th>

			</tr>
		</thead>

		<tr>

			<td>ä½ æ¥äººé´ä¸è¶ï¼ä½ è¦ççå¤ªé³ï¼åä½ çå¿ä¸äººï¼ä¸èµ·èµ°å¨è¡ä¸ã</td>
			<td><a href="studentdetail.html">å°å¼º</a></td>
			<td>2016.02.12</td>
			<td><button type="button" id="deletecomment">å é¤</button></td>

		</tr>


	</table>

</body>
</html>
