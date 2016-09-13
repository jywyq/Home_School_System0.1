package servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.StuDao;
import daoimp.StuDaoImp;
import hibernate.ES;



public class StuAddServlet extends HttpServlet {

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
		String sname = request.getParameter("sname");
		String ssex = request.getParameter("ssex");
		int sage = Integer.parseInt(request.getParameter("sage"));
		double sh=Double.parseDouble(request.getParameter("sh"));
		double sw=Double.parseDouble(request.getParameter("sw"));
		String sadd = request.getParameter("sadd");
		String spwd = request.getParameter("spwd");
		ES ad = new ES();
		ad.setSname(sname);
		ad.setSsex(ssex);
		ad.setSage(sage);
		ad.setSh(sh);
		ad.setSw(sw);
		ad.setSadd(sadd);
		ad.setSpwd(spwd);
		StuDao dao = new StuDaoImp();
		dao.addEmp(ad);
		response.sendRedirect("ShowAllStudentServlet");
		out.flush();
		out.close();
	}

}
