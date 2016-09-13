package servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.CsDao;
import daoimp.CsDaoImp;
import hibernate.ECs;



public class CsAddServlet extends HttpServlet {

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
		int classs = Integer.parseInt(request.getParameter("classs"));
		int grade = Integer.parseInt(request.getParameter("grade"));
		String csadd = request.getParameter("csadd");
		ECs ad = new ECs();
		ad.setClasss(classs);
		ad.setCsadd(csadd);
		ad.setGrade(grade);
		CsDao dao = new CsDaoImp();
		dao.addEmp(ad);
		response.sendRedirect("ShowAllClassServlet");
		out.flush();
		out.close();
	}

}
