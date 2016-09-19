<%@ page language="java"
	import="java.util.*,dao.*,daoimp.*,hibernate.*,servlet.*,hiber_sessionfac.*"
	contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort()
			+ path + "/frnt/";
%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<title>无标题页</title>
<link rel="stylesheet" type="text/css" href="<%=basePath%>css/index.css">
</head>
<body class="mian_bj">
<div class="mian_top_01">
<div class="mian_top_r">
</div>
<div class="mian_top_l">
</div>
<div class="mian_top_c">
<ul>
<li><a href="<%=basePath%>notice/NoticeClass.html">
<p>
公告类别</p>
</a></li>
<li><a href="<%=basePath%>notice/Notice.html">
<p>
公告管理</p>
</a></li>
<li><a href="<%=basePath%>notice/NoticeCount.html">
<p>
公告统计</p>
</a></li>
<li><a href="<%=basePath%>notice/NoticeShow.html">
<p>
公告查看</p>
</a></li>
</ul>
</div>
<div class="mian_b">
<div class="mian_b1">
<a href="<%=basePath%>notice/AddNotice.jsp" title="添加">
<p class="mian_b1_a1">
</p>
</a><a href="#" title="删除">
<p class="mian_b1_a2">
</p>
</a>
<p class="mian_b1_sousuo">
<input name="" type="text"></p>
<a href="#" title="搜索">
<p class="mian_b1_a3">
</p>
</a><a href="#" title="最后">
<p class="mian_b1_a4">
</p>
</a><a href="#" title="下一页">
<p class="mian_b1_a5">
</p>
</a>
<p class="mian_b1_list">
1 2 3 4……</p>
<a href="#" title="上一页">
<p class="mian_b1_a6">
</p>
</a><a href="#" title="最前">
<p class="mian_b1_a7">
</p>
</a>
</div>
<table width="100%" border="0" cellpadding="0" cellspacing="0" class="mian_b_bg">
<tr>
<td width="3%" class="mian_b_bg_lm">
<input name="" type="checkbox" value="">
</td>
<td width="10%" colspan="2" class="mian_b_bg_lm">
学号
</td>
<td width="10%" class="mian_b_bg_lm">
姓名
</td>
<td width="10%" class="mian_b_bg_lm">
性别
</td>
<td width="10%" class="mian_b_bg_lm">
年龄
</td>

<td width="7%" class="mian_b_bg_lm">
身高
</td>
<td width="7%" class="mian_b_bg_lm">
体重
</td>
<td width="18%" class="mian_b_bg_lm">
地址
</td>

<td width="18%" class="mian_b_bg_lm" colspan="2">
操作
</td>
</tr>
	<c:forEach var="list" items="${list}">
		<tr>
			<td><input name="" type="checkbox" value=""></td>
			<td width="44"><img src="<%=basePath%>images\pic_03.jpg" width="40" height="40" alt="" style="margin: 3px;"></td>
			<td><span style="color: #307d74;">${list.sid  }</span></td>
			<td>${list. sname }</td>
			<td>${list. ssex }</td>
			<td>${list. sage }</td>
			<td>${list. sh }</td>
			<td>${list. sw }</td>
			<td>${list. sadd }</td>
			<td width="6%"><div class="mian_b_icon_04"><a href="QueryParBySid?sid=${list.sid }">查看家长</a></div></td>
			<td width="6%"><div class="mian_b_icon_04"><a href="QueryTeaBySid?sid=${list.sid }">查看老师</a></div></td>
			<td width="6%"><div class="mian_b_icon_04"><a href="QueryPoiBySid?sid=${list.sid }">查看成绩</a></div></td>
		</tr>
	</c:forEach>
<td class="mian_b_bg_lm">
<input name="" type="checkbox" value="">
</td>
<td width="10%" colspan="2" class="mian_b_bg_lm">
学号
</td>
<td width="10%" class="mian_b_bg_lm">
姓名
</td>
<td width="10%" class="mian_b_bg_lm">
性别
</td>
<td width="10%" class="mian_b_bg_lm">
年龄
</td>

<td width="7%" class="mian_b_bg_lm">
身高
</td>
<td width="7%" class="mian_b_bg_lm">
体重
</td>
<td width="18%" class="mian_b_bg_lm">
地址
</td>
<td width="18%" class="mian_b_bg_lm" colspan="2">
操作
</td>
</tr>
</table>
</div>
</div>
</body>
</html>
<script src="<%=basePath%>common.js"></script>