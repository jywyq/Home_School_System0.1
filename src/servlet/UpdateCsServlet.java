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
public class UpdateCsServlet extends HttpServlet {

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
		int csid = Integer.parseInt(request.getParameter("csid"));// 获得页面传递过来的参数
		int classs = Integer.parseInt(request.getParameter("classs"));
		int grade = Integer.parseInt(request.getParameter("grade"));
		String csadd = request.getParameter("csadd");
		ECs ad = new ECs();
		ad.setCsid(csid);
		ad.setClasss(classs);
		ad.setCsadd(csadd);
		ad.setGrade(grade);
		CsDao dao = new CsDaoImp();
		dao.updateAd(ad);// 调用实现类的修改方法
		response.sendRedirect("ShowAllClassServlet");// 重定向到查询全部的Servlet
		out.flush();
		out.close();
	}
}