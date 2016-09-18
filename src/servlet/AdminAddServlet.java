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


public class AdminAddServlet extends HttpServlet {

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
		String aname = request.getParameter("aname");
		String apwd = request.getParameter("apwd");
		Administrator ad = new Administrator();
		ad.setAname(aname);
		ad.setApwd(apwd);
		//System.out.println("ADD1 aname: "+ad.getAname()+"  apwd: "+ad.getApwd());
		//System.out.println("WHAT!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
		AdminDao dao = new AdminDaoImp();
		dao.addEmp(ad);
		response.sendRedirect("ShowAllAdminServlet");//�ض�����ʵȫ����Servlet��
		out.flush();
		out.close();
	}

}
