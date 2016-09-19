package servlet;

import java.io.*;
import java.sql.*;
import java.util.*;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import hibernate.ES;

public class QueryStuByTid extends HttpServlet {

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
		int tid = Integer.parseInt(request.getParameter("tid"));// 获得页面传递的参数
		// System.out.println("GET到了index传来的参数id=: "+csid);
		List<ES> list = new ArrayList<ES>();
		Connection con = null;
		int cnt=0;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			String dbUrl = "jdbc:mysql://localhost:3306/school_home_system?useUnicode=true&characterEncoding=UTF-8";
			String dbUser = "root";
			String dbPwd = "JYwyq1996";
			String sql = "select * from r_teacherincharge natural join r_studentclass natural join e_s where tid="+tid;
			con = DriverManager.getConnection(dbUrl, dbUser, dbPwd);
			// out.print("已连接5。。。。。");
			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery(sql); // 执行查询
			ResultSetMetaData rsmd = rs.getMetaData();
			int columnCount = rsmd.getColumnCount();
			// 输出数据
			while (rs.next()) {
				cnt++;
				ES s = new ES();
				for (int i = 1; i <= columnCount; i++) {
					out.print(rs.getString(i));
					if(rsmd.getColumnName(i).equals("sid"))s.setSid(Integer.parseInt(rs.getString(i)));
					if(rsmd.getColumnName(i).equals("sname"))s.setSname(rs.getString(i));
					if(rsmd.getColumnName(i).equals("ssex"))s.setSsex(rs.getString(i));
					if(rsmd.getColumnName(i).equals("sage"))s.setSage(Integer.parseInt(rs.getString(i)));
					if(rsmd.getColumnName(i).equals("sh"))s.setSh(Double.parseDouble(rs.getString(i)));
					if(rsmd.getColumnName(i).equals("sw"))s.setSw(Double.parseDouble(rs.getString(i)));
					if(rsmd.getColumnName(i).equals("sadd"))s.setSadd(rs.getString(i));
					if(rsmd.getColumnName(i).equals("spwd"))s.setSpwd(rs.getString(i));
				}
				list.add(s);
			}
		} catch (Exception e) {

		}
		request.setAttribute("list", list);
		System.out.println("CNT "+cnt);
		// 转发到现实单条记录的页面
		request.getRequestDispatcher("frnt/teacher_class/QueryStuByCsid.jsp").forward(request, response);
		out.flush();
		out.close();
	}
}