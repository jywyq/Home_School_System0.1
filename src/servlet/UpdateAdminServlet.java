package servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.AdminDao;
import daoimp.AdminDaoImp;
import hibernate.Administrator;

public class UpdateAdminServlet extends HttpServlet {

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
		int aid = Integer.parseInt(request.getParameter("aid"));// 获得页面传递过来的参数
		String aname = request.getParameter("aname");
		String apwd = request.getParameter("apwd");
		Administrator ad = new Administrator();
		ad.setAid(aid);
		ad.setAname(aname);
		ad.setApwd(apwd);
		AdminDao dao = new AdminDaoImp();
		dao.updateAd(ad);// 调用实现类的修改方法
		response.sendRedirect("ShowAllAdminServlet");// 重定向到查询全部的Servlet
		out.flush();
		out.close();
	}
}