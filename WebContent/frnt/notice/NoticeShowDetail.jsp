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
<title>�ޱ���ҳ</title>
<link rel="stylesheet" type="text/css" href="<%=basePath %>/css/index.css">
</head>
<body class="mian_bj">
<div class="mian_top_01">
<div class="mian_top_r">
</div>
<div class="mian_top_l">
</div>
<div class="mian_top_c">
<ul>
<li><a href="NoticeClass.html">
<p>
�������</p>
</a></li>
<li><a href="Notice.html">
<p>
�������</p>
</a></li>
<li><a href="NoticeCount.html">
<p>
����ͳ��</p>
</a></li>
<li><a href="NoticeShow.html">
<p>
����鿴</p>
</a></li>
</ul>
</div>
<div class="mian_b">
<table width="100%" border="0" cellpadding="0" cellspacing="0" class="mian_b_bg_xz">
<tr>
<td width="5%" class="mian_b_bg_lm">&nbsp;

</td>
<td colspan="3" class="mian_b_bg_lm">
����鿴��ϸ
</td>
</tr>
<tr>
<td>&nbsp;

</td>
<td colspan="4" align="left">
<table width="100%" border="0" cellpadding="0" cellspacing="0" bgcolor="#FFFFFF">
<tr>
<td width="88" rowspan="3">
<img src="<%=basePath %>images\gg_03.jpg" width="73" height="74" alt="" style="margin: 5px;">
</td>
<td width="73" align="right" valign="top">
�� �� �ˣ�
</td>
<td valign="top">
����
</td>
</tr>
<tr>
<td width="73" align="right" valign="top">
����ʱ�䣺
</td>
<td valign="top">
2012-03-23
</td>
</tr>
<tr>
<td width="73" align="right" valign="top">
�� �⣺
</td>
<td valign="top">
${ad.title }
</td>
</tr>
</table>
</td>
<td>&nbsp;

</td>
</tr>
<tr>
<td>&nbsp;

</td>
<td colspan="4">
${ad.txt }
</td>
<td>
</td>
</tr>
<tr>
<td>&nbsp;

</td>
<td>&nbsp;

</td>
<td>
<div align="center">
<img src="<%=basePath %>images\bnt_05.gif" alt="" width="80" height="22" onclick="javascript:window.history.go(-1);"></div>
</td>
<td>&nbsp;

</td>
</tr>
</table>
</div>
</div>
</body>
</html>
<script src="/common.js"></script>