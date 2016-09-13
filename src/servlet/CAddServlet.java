package servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.CDao;
import daoimp.CDaoImp;
import hibernate.EC;



public class CAddServlet extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.flush();
		out.close();
	}
	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		String cname = request.getParameter("cname");
		int cterm = Integer.parseInt(request.getParameter("cterm"));
		EC ad = new EC();
		ad.setCname(cname);
		ad.setCterm(cterm);
		
		CDao dao = new CDaoImp();
		dao.addEmp(ad);
		response.sendRedirect("ShowAllCourseServlet");
		out.flush();
		out.close();
	}

}
