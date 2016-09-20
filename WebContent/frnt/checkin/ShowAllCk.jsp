<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page import="java.io.*"%>   
<%@ page import="java.util.*"%>   
<%@ page import="java.sql.*"%>  
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort()
			+ path + "/frnt/";
	String ba = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort()
	+ path + "/";
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" type="text/css" href="<%=basePath%>css/index.css">
</head>
<body>
<h5>签到表</h5>
<table width="100%" border="0" cellpadding="0" cellspacing="0" class="mian_b_bg">
<%  
	Connection con = null;   
	try{ 
		Class.forName("com.mysql.jdbc.Driver");   
		String dbUrl = "jdbc:mysql://localhost:3306/school_home_system?useUnicode=true&characterEncoding=UTF-8";   
		String dbUser = "root";   
		String dbPwd = "JYwyq1996";
		String sql="select * from  r_checkin natural join e_s";  
		con = DriverManager.getConnection(dbUrl,dbUser,dbPwd);   
		//out.print("已连接5。。。。。");   
		Statement stmt=con.createStatement();   
		ResultSet rs=stmt.executeQuery(sql); //执行查询  
		ResultSetMetaData rsmd = rs.getMetaData();   
		int columnCount = rsmd.getColumnCount();   
		// 输出列名   
		for (int i=1; i<=columnCount; i++){   
	    	if(!rsmd.getColumnName(i).contains("id") && !rsmd.getColumnName(i).contains("pwd")){
	    		out.print("<td>");
	    		out.print(rsmd.getColumnName(i));
	    		out.print("</td>");  
	    	}
	    }   
	    out.print("<tr>");
	    // 输出数据   
	    while (rs.next()){   
	        for (int i=1; i<=columnCount; i++){   
	        	if(!rsmd.getColumnName(i).contains("id") && !rsmd.getColumnName(i).contains("pwd")){
	        		out.print("<td>");   
		            out.print(rs.getString(i));   
		            out.print("</td>");   
	        	}
	        }   
	        out.print("<tr>");
	    }
	}catch(Exception e){
		
	}
%>
</table>
</body>
</html>