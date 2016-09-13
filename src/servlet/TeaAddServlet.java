package servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.TeaDao;
import daoimp.TeaDaoImp;
import hibernate.ET;



public class TeaAddServlet extends HttpServlet {

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
		String tname = request.getParameter("tname");
		String tsex = request.getParameter("tsex");
		int tage = Integer.parseInt(request.getParameter("tage"));
		String ttel = request.getParameter("ttel");
		String tpwd = request.getParameter("tpwd");
		ET ad = new ET();
		ad.setTname(tname);
		ad.setTsex(tsex);
		ad.setTage(tage);
		ad.setTtel(ttel);
		ad.setTpwd(tpwd);
		TeaDao dao = new TeaDaoImp();
		dao.addEmp(ad);
		response.sendRedirect("ShowAllTeacherServlet");
		out.flush();
		out.close();
	}

}
