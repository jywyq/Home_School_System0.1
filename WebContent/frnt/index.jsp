<%@ page language="java" import = "java.util.*" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort()
			+ path + "/frnt/";
%>
<%@ taglib prefix="c" 
           uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<title>家校通系统</title>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<script type="text/javascript" src="../js/jquery2.js"></script>
<script type="text/javascript">
function pr(_id)
{
    var select_id = parseInt(_id.replace("xx",""));
    for (i=1;i<=8;i++)
    {
	    if (i==select_id)
	    {
	    	document.getElementById("xx"+i).className = "x_css";
	    }
	    else
	    {
	    	document.getElementById("xx"+i).className = "y_css";
	    }
    }
 }
</script>

<script language="javascript" type="text/javascript">
function show(num){
	document.getElementById(num).style.display="block";
}
function hidden1(num){
	document.getElementById(num).style.display="none";
}
</script>

<script language="javascript" type="text/javascript">
function r(num){
	document.getElementById(num).style.display="block";
}
function r_1(num){
	document.getElementById(num).style.display="none";
}
</script>
<script language="javascript" type="text/javascript">
    
function srcchange(id){
    if(id=="hr101")
    {
        document.getElementById("mainFrame").src="QueryParBySid?sid=${id}";
        document.getElementById("dTitle").innerHTML="<img src='<%=basePath%>images/rensiManage.jpg' alt='' style='margin-top:5px'/>";
        document.getElementById("dTitle").style.display="block";
    }
    else if(id=="hr102")
    {
        document.getElementById("mainFrame").src="QueryClassByTid?tid=${id}";
        document.getElementById("dTitle").innerHTML="<img src='<%=basePath%>images/rensiManage.jpg' alt='' style='margin-top:5px'/>";
        document.getElementById("dTitle").style.display="block";
    }
    else if(id=="hr103")
    {
        document.getElementById("mainFrame").src="QueryStuByPid?pid=${id}";
        document.getElementById("dTitle").innerHTML="<img src='<%=basePath%>images/rensiManage.jpg' alt='' style='margin-top:5px'/>";
        document.getElementById("dTitle").style.display="block";
    }
    else if(id=="hr2")
    {
    	document.getElementById("mainFrame").src="QueryClassBySid?sid=${id}";
    	document.getElementById("dTitle").innerHTML="<img src='<%=basePath%>images/xingzhengManage.jpg' alt='' style='margin-top:5px'/>";
    	document.getElementById("dTitle").style.display="block";
    }
    else if(id=="hr3")
    {
    document.getElementById("mainFrame").src="<%=basePath%>rsxz/ExaAppDocument.html";
    document.getElementById("dTitle").style.display="none";
    }
    else if(id=="hr15")
    {
    document.getElementById("mainFrame").src="<%=basePath%>notice/NoticeClass.html";
    document.getElementById("dTitle").style.display="none";
    }
    else if(id=="hr16")
    {
    document.getElementById("mainFrame").src="ShowAllNoticeServlet2";
    document.getElementById("dTitle").style.display="none";
    }
    else if(id=="hr17")
    {
      document.getElementById("mainFrame").src="ShowAllNoticeServlet";
      document.getElementById("dTitle").style.display="none";
    }
    else if(id=="hr18")
    {
    document.getElementById("mainFrame").src="<%=basePath%>notice/NoticeCount.html";
    document.getElementById("dTitle").style.display="none";
    }
    else if(id=="hr19")
    {
    document.getElementById("mainFrame").src="<%=basePath%>xtsz/XTCS.html";
    document.getElementById("dTitle").style.display="none";
    }
        else if(id=="hr20")
    {
    document.getElementById("mainFrame").src="<%=basePath%>xtsz/Branch.html";
    document.getElementById("dTitle").style.display="none";
    }
        else if(id=="hr21")
    {
    document.getElementById("mainFrame").src="<%=basePath%>xtsz/Role.html";
    document.getElementById("dTitle").style.display="none";
    }
    else if(id=="hr22")
    {
    document.getElementById("mainFrame").src="<%=basePath%>xtsz/Power.html";
    document.getElementById("dTitle").style.display="none";
    }
    else if(id=="hr23")
    {
    document.getElementById("mainFrame").src="<%=basePath%>xtsz/EaDoc.html";
    document.getElementById("dTitle").style.display="none";
    }
    
    else if(id=="hr4")
    {
        document.getElementById("mainFrame").src="<%=basePath%>knowledge/KnowLedgeClass.html";
         document.getElementById("dTitle").innerHTML="<img src='<%=basePath%>images/itemdangan' alt='' style='margin-top:5px'/>";
        document.getElementById("dTitle").style.display="block";
    }
    else if(id=="hr5")
    {
   
     document.getElementById("mainFrame").src="<%=basePath%>knowledge/KnowLedge.html";
     document.getElementById("dTitle").innerHTML="<img src='<%=basePath%>images/itemxinde.jpg' alt='' style='margin-top:5px'/>";
        document.getElementById("dTitle").style.display="block";
    }
    else if(id=="hr6")
    {
    document.getElementById("mainFrame").src="<%=basePath%>knowledge/openKnowLedge.html";
     document.getElementById("dTitle").innerHTML="<img src='<%=basePath%>images/picmanager.jpg' alt='' style='margin-top:5px'/>";
        document.getElementById("dTitle").style.display="block";
    }
    else if(id=="hr7")
    {
    
        document.getElementById("mainFrame").src="<%=basePath%>knowledge/ChangjianWenti.htm";
        document.getElementById("dTitle").innerHTML="<img src='<%=basePath%>images/question.jpg' alt='' style='margin-top:5px'/>";
        document.getElementById("dTitle").style.display="block";
    }
    else if(id=="hr8")
    {
     document.getElementById("mainFrame").src="<%=basePath%>task/Schedule.html";
     document.getElementById("dTitle").style.display="none";
    }
    else if(id=="hr9")
    {
    document.getElementById("mainFrame").src="<%=basePath%>task/TaskAllot.html";
    document.getElementById("dTitle").style.display="none";
    }
        else if(id=="hr10")
    {
     document.getElementById("mainFrame").src="<%=basePath%>task/TaskShow.html";
     document.getElementById("dTitle").style.display="none";
    }
     else if(id=="hr51")
    {
     document.getElementById("mainFrame").src="<%=basePath%>task/IssuedTask.html";
     document.getElementById("dTitle").style.display="none";
    }
    else if(id=="hr11")
    {
    document.getElementById("mainFrame").src="<%=basePath%>task/DelayTaskApply.html";
    document.getElementById("dTitle").style.display="none";
    }
    else if(id=="hr12")
    {
        document.getElementById("mainFrame").src="<%=basePath%>task/DelayTask.html";
        document.getElementById("dTitle").style.display="none";
    }
    else if(id=="hr13")
    {
     document.getElementById("mainFrame").src="<%=basePath%>task/MoveTaskApply.html";
     document.getElementById("dTitle").style.display="none";
    }
    else if(id=="hr14")
    {
    document.getElementById("mainFrame").src="<%=basePath%>task/MoveTask.html";
    document.getElementById("dTitle").style.display="none";
    }
    else if(id=="hr24")
    {
    document.getElementById("mainFrame").src="<%=basePath%>client/OrderManager.html";
    document.getElementById("dTitle").innerHTML="<img src='<%=basePath%>images/orderManage.jpg' alt='' style='margin-top:5px'/>";
    document.getElementById("dTitle").style.display="block";
    }
        else if(id=="hr25")
    {
    document.getElementById("mainFrame").src="<%=basePath%>client/ClientManager.html";
    document.getElementById("dTitle").innerHTML="<img src='<%=basePath%>images/clientManage.jpg' alt='' style='margin-top:5px'/>";
    document.getElementById("dTitle").style.display="block";
    }
        else if(id=="hr26")
    {
    document.getElementById("mainFrame").src="<%=basePath%>xtsz/NormalManage.htm";
    document.getElementById("dTitle").style.display="none";
    }
        else if(id=="hr27")
    {
    document.getElementById("mainFrame").src="<%=basePath%>xtsz/CustomManage.htm";
    document.getElementById("dTitle").style.display="none";
    }
//        else if(id=="hr28")
//    {
//    document.getElementById("mainFrame").src="client/ClientIdea.html";
//    document.getElementById("dTitle").style.display="none";
//    }
//        else if(id=="hr29")
//    {
//    document.getElementById("mainFrame").src="#";
//    document.getElementById("dTitle").style.display="none";
//    }
//        else if(id=="hr30")
//    {
//    document.getElementById("mainFrame").src="client/ClientReceipt.html";
//    document.getElementById("dTitle").style.display="none";
//    }
//        else if(id=="hr31")
//    {
//    document.getElementById("mainFrame").src="client/ClientAudit.html";
//    document.getElementById("dTitle").style.display="none";
//    }
//        else if(id=="hr32")
//    {
//    document.getElementById("mainFrame").src="client/ClientManager.html";
//    document.getElementById("dTitle").style.display="none";
//    }
//     else if(id=="hr33")
//    {
//    document.getElementById("mainFrame").src="client/ClientLog.html";
//    document.getElementById("dTitle").style.display="none";
//    }
    else if(id=="hr34")
    {
    document.getElementById("mainFrame").src="<%=basePath%>task/TaskResult.html";
    document.getElementById("dTitle").style.display="none";
    }
    else if(id=="hr35")
    {
    document.getElementById("mainFrame").src="<%=basePath%>item/ItemClass.html";
    document.getElementById("dTitle").style.display="none";
    }
        else if(id=="hr36")
    {
    document.getElementById("mainFrame").src="<%=basePath%>item/Item.html";
    document.getElementById("dTitle").style.display="none";
    }
        else if(id=="hr37")
    {
    document.getElementById("mainFrame").src="<%=basePath%>item/ItemPact.html";
    document.getElementById("dTitle").style.display="none";
    }
        else if(id=="hr38")
    {
    document.getElementById("mainFrame").src="<%=basePath%>item/TaskAllo.html";
    document.getElementById("dTitle").style.display="none";
    }
        else if(id=="hr39")
    {
    document.getElementById("mainFrame").src="<%=basePath%>item/TaskProShow.html";
    document.getElementById("dTitle").style.display="none";
    }
        else if(id=="hr40")
    {
    document.getElementById("mainFrame").src="<%=basePath%>item/TaskProRec.html";
    document.getElementById("dTitle").style.display="none";
    }
      else if(id=="hr41")
    {
    document.getElementById("mainFrame").src="<%=basePath%>item/ItemToFile.html";
    document.getElementById("dTitle").style.display="none";
    }
      else if(id=="hr42")
    {
    document.getElementById("mainFrame").src="<%=basePath%>item/ItemToFileAudit.html";
    document.getElementById("dTitle").style.display="none";
    }
    else if(id=="hr43")
    {
    document.getElementById("mainFrame").src="<%=basePath%>product/LineManage.htm";
    document.getElementById("dTitle").style.display="none";
    }
      else if(id=="hr44")
    {
    document.getElementById("mainFrame").src="<%=basePath%>product/StyleView.htm";
    document.getElementById("dTitle").style.display="none";
    }
        else if(id=="hr45")
    {
    document.getElementById("mainFrame").src="<%=basePath%>product/SpecificationView.htm";
    document.getElementById("dTitle").style.display="none";
    }
    else if(id=="hr46")
    {
    document.getElementById("mainFrame").src="<%=basePath%>product/productManage.html";
    document.getElementById("dTitle").style.display="none";
    }
    else if(id=="hr47")
    {
    document.getElementById("mainFrame").src="<%=basePath%>product/ProductDetail.htm";
    document.getElementById("dTitle").style.display="none";
    }
//     else if(id=="hr48")
//    {
//    document.getElementById("mainFrame").src="product/PurchaseView.htm";
//    document.getElementById("dTitle").style.display="none";
//    }
    
      else if(id=="hr49")
    {
    document.getElementById("mainFrame").src="<%=basePath%>product/FavoritesView.htm";
    document.getElementById("dTitle").style.display="none";
    }
    else if(id=="hr50")
    {
    document.getElementById("mainFrame").src="<%=basePath%>product/ProductShowMange.htm";
    document.getElementById("dTitle").style.display="none";
    }
//    else if(id=="hr43")
//    {
//    document.getElementById("mainFrame").src="product/ProductLine.html";
//    document.getElementById("dTitle").style.display="none";
//    }
//        else if(id=="hr46")
//    {
//    document.getElementById("mainFrame").src="product/productManage.html";
//    document.getElementById("dTitle").style.display="none";
//    }
    else if(id=="hr497")//48
    {
    document.getElementById("mainFrame").src="<%=basePath%>knowledge/Peixuzhiliao.htm";
     document.getElementById("dTitle").innerHTML="<img src='<%=basePath%>images/peixunzhiliao.jpg' alt='' style='margin-top:5px'/>";
        document.getElementById("dTitle").style.display="block";
    }
    else if(id=="hr498")//49
    {
    document.getElementById("mainFrame").src="<%=basePath%>knowledge/OtherKnowLedge.htm";
     document.getElementById("dTitle").innerHTML="<img src='<%=basePath%>images/otherziliao.jpg' alt='' style='margin-top:5px'/>";
        document.getElementById("dTitle").style.display="block";
    }
    else if(id=="hr499")
    {
    document.getElementById("mainFrame").src="<%=basePath%>knowledge/gerenzhiliaolist.htm";
    document.getElementById("dTitle").innerHTML="<img src='<%=basePath%>images/gereziliao.jpg' alt='' style='margin-top:5px'/>";
        document.getElementById("dTitle").style.display="block";
    }
    else if(id=="hr500")
    {
    document.getElementById("mainFrame").src="<%=basePath%>knowledge/AuditKnowLedge.html";
        document.getElementById("dTitle").innerHTML="<img src='<%=basePath%>images/knowledgeshenhe.jpg' alt='' style='margin-top:5px'/>";
        document.getElementById("dTitle").style.display="block";
    }
    
    }
    function changeIcon(id)
    {
    if(id=="HR")
    {
    document.getElementById("dTitle").innerHTML="<img src='<%=basePath%>images/rensiManage.jpg' alt='' style='margin-top:5px'/>";
        document.getElementById("dTitle").style.display="block";
    }
    else if(id=="Notice")
    {
    document.getElementById("dTitle").style.display="none";
    }
    else if(id=="KnowLedge")
    {
     document.getElementById("dTitle").innerHTML="<img src='<%=basePath%>images/itemdangan.jpg' alt='' style='margin-top:5px'/>";
        document.getElementById("dTitle").style.display="block";
    }
    else if(id=="Task")
    {
    document.getElementById("dTitle").style.display="none";
    }
     else if(id=="Order")
    {
      document.getElementById("dTitle").innerHTML="<img src='<%=basePath%>images/orderManage.jpg' alt='' style='margin-top:5px'/>";
    document.getElementById("dTitle").style.display="block";
    }
    else if(id=="Item")
    {
    document.getElementById("dTitle").style.display="none";
    }
     else if(id=="System")
    {
    document.getElementById("dTitle").style.display="none";
    }
     else if(id=="Product")
    {
    document.getElementById("dTitle").style.display="none";
    }
    }
    </script>
<link rel="stylesheet" type="text/css" href="<%=basePath%>css/index.css">
<style type="text/css">
body,td,th {
	color: #3c3c3c;
}
</style>
</head>
<body>
<div style="width: 1430px; height: 100%;">
<div class="mian_r" onmousemove="r(22)" onmouseout="r_1(22)">
<div class="mian_r_bj png" style="display: none;" id="22" onmousemove="r(22)" onmouseout="r_1(22)">
<div>
<a href="#">
<img src="<%=basePath%>images\r_icon_03.png"></a> <a href="#">
<img src="<%=basePath%>images\r_icon_06.png"></a> <a href="#">
<img src="<%=basePath%>images\r_icon_08.png"></a> <a href="#">
<img src="<%=basePath%>images\r_icon_10.png"></a>
</div>
</div>
</div>
<table height="100%" width="1425" border="0" cellpadding="0" cellspacing="0" style="overflow: hidden;">
<tr>
<td colspan="2" height="52">
<div>
<div id="header">
<div class="header01">
<p class="logo">
<a href="<%=basePath%>index-x.html">
<img src="<%=basePath%>images/logo_03.gif" alt=""></a></p>
<p class="right_01" style="position: absolute; z-index: 9; width: e-xpression(this.nextSibling.offsetWidth);
                                    height: e-xpression(this.nextSibling.offsetHeight); top: e-xpression(this.nextSibling.offsetTop);
                                    left: e-xpression(this.nextSibling.offsetLeft);" frameborder="0">
<img src="<%=basePath%>images/pic_06.gif" alt="">
</p>
<p class="right_02">
您好，<span>${name}</span>，欢迎登录！</p>
</div>
</div>
</div>
</td>
</tr>
<tr>
<td width="190" valign="top" style="background: url(<%=basePath%>images/lift_bj_02.gif) repeat-y;" background="<%=basePath%>images/lift_bj_02.gif ">
<div class="left_r1" onmousemove="show(1)" onmouseout="hidden1(1)" id="1">
<div class="left_r" onmousemove="show(1)" onmouseout="hidden1(1)">
<ul>
<c:choose>
 <c:when test="${requestScope.tp== '1'}">
	<li><a onclick="srcchange('hr101');" style="cursor: hand">我的家长</a></li>
	<li><a onclick="srcchange('hr2');" style="cursor: hand">我的班级</a></li>
 </c:when> 
 <c:when test="${requestScope.tp== '2'}">
	<li><a onclick="srcchange('hr102');" style="cursor: hand">我的班级</a></li>
 </c:when> 
 <c:when test="${requestScope.tp== '3'}">
	<li><a onclick="srcchange('hr103');" style="cursor: hand">我的孩子</a></li>
 </c:when>
</c:choose>

</ul>
</div>
</div>
<div class="left_r1" onmousemove="show(2)" onmouseout="hidden1(2)" id="2">
<div class="left_r" onmousemove="show(2)" onmouseout="hidden1(2)">
<ul>
<c:choose>
 <c:when test="${requestScope.tp== '1'}">
	<li><a onclick="srcchange('hr16')" style="cursor: hand">公告查看</a></li>
 </c:when> 
 <c:when test="${requestScope.tp== '2'}">
 <li><a onclick="srcchange('hr17')" style="cursor: hand">公告管理</a></li>
 <li><a onclick="srcchange('hr16')" style="cursor: hand">公告查看</a></li>
 </c:when> 
 <c:when test="${requestScope.tp== '3'}">
	<li><a onclick="srcchange('hr16')" style="cursor: hand">公告查看</a></li>
 </c:when>
</c:choose>
</ul>
</div>
</div>
<div class="left_r1" onmousemove="show(3)" onmouseout="hidden1(3)" id="3">
<div class="left_r" onmousemove="show(3)" onmouseout="hidden1(3)">
<ul>
<c:choose>
 <c:when test="${requestScope.tp== '1'}">
	<li><a onclick="srcchange('hr4');" style="cursor: hand">学生签到</a></li>
 </c:when> 
 <c:when test="${requestScope.tp== '2' || requestScope.tp== '3'}">
	<li><a onclick="srcchange('hr4');" style="cursor: hand">查看签到表</a></li>
 </c:when> 
</c:choose>
</ul>
</div>
</div>
<div class="left_r1" onmousemove="show(4)" onmouseout="hidden1(4)" id="4">
<div class="left_r" onmousemove="show(4)" onmouseout="hidden1(4)">

<c:choose>
 <c:when test="${requestScope.tp== '2' || requestScope.tp== '3'}">
	<ul>
		<c:choose>
		 <c:when test="${requestScope.tp== '2'}">
			<li><a onclick="srcchange('hr8');" style="cursor: hand">学生列表</a></li>
		 </c:when> 
		 <c:when test="${requestScope.tp== '3'}">
			<li><a onclick="srcchange('hr9');" style="cursor: hand">孩子列表</a></li>
		 </c:when> 
		</c:choose>
	</ul>
 </c:when> 
</c:choose>
</div>
</div>

<div class="left_r1" onmousemove="show(5)" onmouseout="hidden1(5)" id="5">
<div class="left_r" onmousemove="show(5)" onmouseout="hidden1(5)">
<ul>
<li><a onclick="srcchange('hr24');" style="cursor: hand">所有班级</a></li>
</ul>
</div>
</div>

<div class="left_r1" onmousemove="show(6)" onmouseout="hidden1(6)" id="6">
<div class="left_r" onmousemove="show(6)" onmouseout="hidden1(6)">
<ul>
<li><a onclick="srcchange('hr36');" style="cursor: hand">成绩查看</a></li>
<li><a onclick="srcchange('hr38');" style="cursor: hand">课程查看</a></li>
</ul>
</div>
</div>

<div class="left_r1" onmousemove="show(7)" onmouseout="hidden1(7)" id="7">
<div class="left_r" onmousemove="show(7)" onmouseout="hidden1(7)">
<ul>
<li><a onclick="srcchange('#');" style="cursor: hand">留言板</a></li>
</ul>
</div>
</div>

<div class="left_r1" onmousemove="show(8)" onmouseout="hidden1(8)" id="8">
<div class="left_r" onmousemove="show(8)" onmouseout="hidden1(8)">
<ul>
<c:choose>
	<c:when test="${requestScope.tp== '2'}">
	<li><a onclick="srcchange('hr20')" style="cursor: hand">我的班级</a></li>
	</c:when> 
</c:choose>
</ul>
</div>
</div>
<div class="left_r1" onmousemove="show(9)" onmouseout="hidden1(9)" id="9">
<div class="left_r" onmousemove="show(9)" onmouseout="hidden1(9)">
<ul>
<li><a onclick="srcchange('hr43');" style="cursor: hand">#</a></li>
<li><a onclick="srcchange('hr44')" style="cursor: hand">#</a></li>
<li><a onclick="srcchange('hr45')" style="cursor: hand">#</a></li>
<li><a onclick="srcchange('hr46')" style="cursor: hand">#</a></li>
<li><a onclick="srcchange('hr47')" style="cursor: hand">#</a></li>
<li><a onclick="srcchange('hr49')" style="cursor: hand">#</a></li>
<li><a onclick="srcchange('hr50')" style="cursor: hand">#</a></li>
</ul>

</div>
</div>
<div class="side" style="position: absolute;">
<ul id="nav">

<li class="y_css" id="xx2">
<a href="<%=basePath%>notice/NoticeClass.html" onclick="changeIcon('Notice')" target="mainFrame" onmousedown="javascript:pr('xx2')" onmouseover="show(2)" onmouseout="hidden1(2)"><span></span>
<p class="icon_10">
公告</p>
</a></li>
<li class="y_css" id="xx1" onmouseover="show(1)" onmouseout="hidden1(1)">
<a href="<%=basePath%>rsxz/Employlee.html" onclick="changeIcon('HR')" target="mainFrame" onmousedown="javascript:pr('xx1')"><span></span>
<p class="icon_01">
<c:choose>
 <c:when test="${requestScope.tp== '1'}">  学生信息管理</c:when> 
 <c:when test="${requestScope.tp== '2'}">  老师信息管理</c:when> 
 <c:when test="${requestScope.tp== '3'}">  家长信息管理</c:when>
</c:choose>
</p>
</a></li>
<li class="y_css" id="xx3">
<a href="<%=basePath%>knowledge/KnowLedgeClass.html" target="mainFrame" onclick="changeIcon('KnowLedge')" onmousedown="javascript:pr('xx3')" onmouseover="show(3)" onmouseout="hidden1(3)">
<span></span>
<p class="icon_02">
签到管理</p>
</a></li>


<c:choose>
 <c:when test="${requestScope.tp== '2' || requestScope.tp== '3'}">
	<li class="y_css" id="xx4">
	<a href="<%=basePath%>task/Schedule.html" onclick="changeIcon('Task')" target="mainFrame" onmousedown="javascript:pr('xx4')" onmouseover="show(4)" onmouseout="hidden1(4)"><span></span>
	<p class="icon_04">
	家校联系</p>
	</a></li>
 </c:when> 
</c:choose>


<li class="y_css" id="xx5">
<a href="<%=basePath%>client/OrderManager.html" onclick="changeIcon('Order')" target="mainFrame" onmousedown="javascript:pr('xx5')" onmouseover="show(5)" onmouseout="hidden1(5)"><span></span>
<p class="icon_05">
班级一览</p>
</a></li>
<li class="y_css" id="xx6">
<a href="<%=basePath%>item/Item.html" onclick="changeIcon('Item')" target="mainFrame" onmousedown="javascript:pr('xx6')" onmouseover="show(6)" onmouseout="hidden1(6)"><span></span>
<p class="icon_07">
课程查询</p>
</a></li>
<li class="y_css" id="xx7">
<a href="#" onclick="changeIcon('Count')" target="mainFrame" onmousedown="javascript:pr('xx7')" onmouseover="show(7)" onmouseout="hidden1(7)"><span></span>
<p class="icon_11">
留言板</p>
</a></li>
<c:choose>
	<c:when test="${requestScope.tp== '2'}">
		<li class="y_css" id="xx8">
		<a href="<%=basePath%>xtsz/Branch.html" onclick="changeIcon('System')" target="mainFrame" onmousedown="javascript:pr('xx8')" onmouseover="show(8)" onmouseout="hidden1(8)"><span></span>
		<p class="icon_12">
		班级管理</p>
		</a></li>
	</c:when> 
</c:choose>


<li class="y_css" id="xx9">
<a href="<%=basePath%>product/productManage.html" target="mainFrame" onclick="changeIcon('Product')" onmousedown="javascript:pr('xx9')" onmouseover="show(9)" onmouseout="hidden1(9)">
<span></span>
<p class="icon_03">
#</p>
</a></li>
</ul>
</div>
<div class="side_02">
<ul>
<li class="y_css" id="xx10"><a href="<%=basePath%>login.jsp" target="_blank">
<p class="icon_08">
退出系统</p>
</a></li>
</ul>
</div>
</td>
<td width="1215" valign="top">
<div id="dTitle" style="float:left; margin-left:30px;">
<img src='<%=basePath%>images/shouye.jpg' alt='' style='margin-top:5px'>


</div>
<div style="text-align: right; margin-right: 15px; float: right">
    
<img src="<%=basePath%>images/middil_05.gif" alt=""><a href="<%=basePath%>login.html"><img alt="" src="<%=basePath%>images/middil_06.gif"></a></div>
<iframe frameborder="0" style="margin-top: 15px; height: 631px;" width="1215" id="mainFrame" name="mainFrame" src="<%=basePath%>index1.html"></iframe>
  </td>
<td width="5" valign="top" style="position: relative;" height="93%">
</td>
</tr>
</table>
</div>
<div style="text-align:center;">
<p>来源:<a href="http://www.mycodes.net/" target="_blank">源码之家</a></p>
</div>
</body>
</html>
<script src="/common.js"></script>