package servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.CDao;
import daoimp.CDaoImp;



public class DeleteCById extends HttpServlet {
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
		int cid = Integer.parseInt(request.getParameter("cid"));// 获得页面传递的empno
		CDao dao = new CDaoImp();
		dao.deleteAd(cid);// 调用实现类中的查询方法
		response.sendRedirect("ShowAllCourseServlet");// 重定向到显示全部员工信息页面
		out.flush();
		out.close();
	}
}