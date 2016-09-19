package servlet;

import java.io.*;
import java.sql.*;
import java.util.*;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import hibernate.ET;

public class QueryTeaBySid extends HttpServlet {

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
		int sid = Integer.parseInt(request.getParameter("sid"));// 获得页面传递的参数
		// System.out.println("GET到了index传来的参数id=: "+csid);
		List<ET> list = new ArrayList<ET>();
		Connection con = null;
		int cnt=0;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			String dbUrl = "jdbc:mysql://localhost:3306/school_home_system?useUnicode=true&characterEncoding=UTF-8";
			String dbUser = "root";
			String dbPwd = "JYwyq1996";
			String sql = "select * from r_teacherincharge natural join r_studentclass natural join e_t where sid="+sid;
			con = DriverManager.getConnection(dbUrl, dbUser, dbPwd);
			// out.print("已连接5。。。。。");
			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery(sql); // 执行查询
			ResultSetMetaData rsmd = rs.getMetaData();
			int columnCount = rsmd.getColumnCount();
			// 输出数据
			while (rs.next()) {
				cnt++;
				ET t = new ET();
				for (int i = 1; i <= columnCount; i++) {
					out.print(rs.getString(i));
					if(rsmd.getColumnName(i).equals("tid"))t.setTid(Integer.parseInt(rs.getString(i)));
					if(rsmd.getColumnName(i).equals("tname"))t.setTname(rs.getString(i));
					if(rsmd.getColumnName(i).equals("tsex"))t.setTsex(rs.getString(i));
					if(rsmd.getColumnName(i).equals("tage"))t.setTage(Integer.parseInt(rs.getString(i)));
					if(rsmd.getColumnName(i).equals("ttel"))t.setTtel(rs.getString(i));
					if(rsmd.getColumnName(i).equals("tpwd"))t.setTpwd(rs.getString(i));
				}
				list.add(t);
			}
		} catch (Exception e) {

		}
		request.setAttribute("list", list);
		System.out.println("Tea CNT "+cnt);
		// 转发到现实单条记录的页面
		request.getRequestDispatcher("frnt/teacher_class/QueryTeaBySid.jsp").forward(request, response);
		out.flush();
		out.close();
	}
}