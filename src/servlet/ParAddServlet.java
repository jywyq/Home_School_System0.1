package servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.ParDao;
import daoimp.ParDaoImp;
import hibernate.EP;


public class ParAddServlet extends HttpServlet {

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
		String pname = request.getParameter("pname");
		String psex = request.getParameter("psex");
		int page = Integer.parseInt(request.getParameter("page"));
		String ptel = request.getParameter("ptel");
		String pcpy = request.getParameter("pcpy");
		String ppwd = request.getParameter("ppwd");
		EP ad = new EP();
		ad.setPname(pname);
		ad.setPsex(psex);
		ad.setPage(page);
		ad.setPtel(ptel);
		ad.setPcpy(pcpy);
		ad.setPpwd(ppwd);
		ParDao dao = new ParDaoImp();
		dao.addEmp(ad);
		response.sendRedirect("ShowAllParentServlet");
		out.flush();
		out.close();
	}

}
