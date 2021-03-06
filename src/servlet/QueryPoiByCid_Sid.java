package servlet;

import java.io.*;
import java.sql.*;
import java.util.*;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import hibernate.RTeach;

public class QueryPoiByCid_Sid extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		this.doPost(request, response);// 调用doPost方法
		out.flush();
		out.close();
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		int cid = Integer.parseInt(request.getParameter("cid"));// 获得页面传递的参数
		int id=Integer.parseInt(request.getParameter("id"));
		int tp=Integer.parseInt(request.getParameter("tp"));
		// System.out.println("GET到了index传来的参数id=: "+csid);
		Connection con = null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			String dbUrl = "jdbc:mysql://localhost:3306/school_home_system?useUnicode=true&characterEncoding=UTF-8";
			String dbUser = "root";
			String dbPwd = "JYwyq1996";
			String sql ;
			if(tp==1) sql = "select * from r_teach natural join e_s natural join e_c where cid="+cid+" and sid="+id;
			else if(tp==2) sql = "select * from r_teach natural join e_t natural join e_s natural join e_c where cid="+cid+" and tid="+id;
			else sql = "select * from r_studentparent natural join e_p natural join e_s natural join r_teach natural join e_c where cid="+cid+" and pid="+id;
			con = DriverManager.getConnection(dbUrl, dbUser, dbPwd);
			// out.print("已连接5。。。。。");
			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery(sql); // 执行查询
			ResultSetMetaData rsmd = rs.getMetaData();
			request.setAttribute("rs", rs);
			request.setAttribute("rsmd", rsmd);
		}catch(Exception e){
			
		}
		
		// 转发到现实单条记录的页面
		request.getRequestDispatcher("frnt/teacher_class/ShowList.jsp").forward(request, response);
		out.flush();
		out.close();
	}
}