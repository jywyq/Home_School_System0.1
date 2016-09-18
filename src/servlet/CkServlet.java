package servlet;

import java.io.*;
import java.sql.*;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class CkServlet extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		this.doPost(request, response);// 调用doPost方法
		out.flush();
		out.close();
	}
	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		String sid = request.getParameter("sid");
		System.out.println("SID "+sid);
		Connection con = null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			String dbUrl = "jdbc:mysql://localhost:3306/school_home_system?useUnicode=true&characterEncoding=UTF-8";
			String dbUser = "root";
			String dbPwd = "JYwyq1996";
			System.out.println(sid);
			String sql = "insert into r_checkin(sid,date) values('"+sid+"',CURDATE())";
			con = DriverManager.getConnection(dbUrl, dbUser, dbPwd);
			//out.print("已连接5。。。。。");   
			Statement stmt = con.createStatement();
			ResultSet rs=stmt.executeQuery("select count(*) as rowcount from r_checkin where sid="+sid+" and date=CURDATE()"); //执行查询  
			rs.next();
			try {
				if(rs.getInt("rowCount")>0)throw new Exception();
				stmt.clearBatch();
				stmt.addBatch(sql);
				stmt.executeBatch();
				System.out.println("数据插入成功!");
				response.sendRedirect("frnt/checkin/Ck.jsp");
				out.flush();
				out.close();
			} catch (Exception e) {
				//e.printStackTrace();
				System.out.println("数据插入失败!");
				response.sendRedirect("frnt/checkin/Ckerror.jsp");
				out.flush();
				out.close();
			}
		} catch (Exception e) {

		}
		
	}

}
