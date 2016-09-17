package servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.NDao;
import daoimp.NDaoImp;
import hibernate.EN;



public class NAddServlet extends HttpServlet {

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
		String title = request.getParameter("title");
		String txt = request.getParameter("txt");
		EN ad = new EN();
		ad.setTitle(title);
		ad.setTxt(txt);
		NDao dao = new NDaoImp();
		dao.addEmp(ad);
		response.sendRedirect("ShowAllNoticeServlet");
		out.flush();
		out.close();
	}

}
