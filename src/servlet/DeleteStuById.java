package servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.StuDao;
import daoimp.StuDaoImp;


public class DeleteStuById extends HttpServlet {
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
		int sid = Integer.parseInt(request.getParameter("sid"));// 获得页面传递的empno
		StuDao dao = new StuDaoImp();
		dao.deleteAd(sid);// 调用实现类中的查询方法
		response.sendRedirect("ShowAllStudentServlet");// 重定向到显示全部员工信息页面
		out.flush();
		out.close();
	}
}