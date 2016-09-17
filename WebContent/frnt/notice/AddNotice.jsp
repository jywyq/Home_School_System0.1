<%@ page language="java" contentType="text/html; charset=gb2312"
	pageEncoding="gb2312"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort()
			+ path + "/frnt/";
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<title>无标题页</title>
<link rel="stylesheet" type="text/css" href="../css/index.css">
</head>
<body class="mian_bj">
<div class="mian_top_01">
<div class="mian_top_r"></div>
<div class="mian_top_l"></div>
<div class="mian_top_c">
<ul>
<li><a href="NoticeClass.html">
<p>
公告类别</p>
</a></li>
<li><a href="Notice.html">
<p>
公告管理</p>
</a></li>
<li><a href="NoticeCount.html">
<p>
公告统计</p>
</a></li>
<li><a href="NoticeShow.html">
<p>
公告查看</p>
</a></li>
</ul>
</div>
<form action="../../NAddServlet" method="post" class="mian_b"
		id="myform">
<table width="100%" border="0" cellpadding="0" cellspacing="0" class="mian_b_bg_xz">
<tr>
<td width="5%" class="mian_b_bg_lm">&nbsp;</td>
<td colspan="3" class="mian_b_bg_lm">添加公告</td>
</tr>
<tr>
<td>&nbsp;</td>
<td width="10%" valign="top">公告标题：</td>
<td width="55%">
<input type="text" class="input_01" name="title" id="textfield"> </td>
<td width="35%">&nbsp;</td>
</tr>
<tr>
<td>&nbsp;</td>
<td valign="top">公告内容：</td>
<td>
<textarea type="text" name="txt" id="text1"></textarea>
</td>
<td>&nbsp;</td>
</tr>
<tr>
<td>&nbsp;</td>
<td>&nbsp;</td>
<td>&nbsp;</td>
</tr>
</table>
<button style="margin-left: 5px;" type="submit"
	type="button">保&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;存</button>
	&nbsp;&nbsp;
<button type="button" name="backid"
	id="backid">
	<a href="../ShowAllNoticeServlet"> 返回列表</a>
</button>
</form>

</div>
</body>
</html>
<script src="/common.js"></script>