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
public class UpdateCServlet extends HttpServlet {

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
		int cid = Integer.parseInt(request.getParameter("cid"));// 获得页面传递过来的参数
		String cname = request.getParameter("cname");
		int cterm = Integer.parseInt(request.getParameter("cterm"));
		EC ad = new EC();
		ad.setCid(cid);
		ad.setCname(cname);
		ad.setCterm(cterm);
		CDao dao = new CDaoImp();
		dao.updateAd(ad);// 调用实现类的修改方法
		response.sendRedirect("ShowAllCourseServlet");// 重定向到查询全部的Servlet
		out.flush();
		out.close();
	}
}