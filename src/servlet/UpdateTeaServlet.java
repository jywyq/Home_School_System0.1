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

public class UpdateTeaServlet extends HttpServlet {

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
		int tid = Integer.parseInt(request.getParameter("tid"));// 获得页面传递过来的参数
		String tname = request.getParameter("tname");
		String tsex = request.getParameter("tsex");
		int tage = Integer.parseInt(request.getParameter("tage"));
		String ttel = request.getParameter("ttel");
		String tpwd = request.getParameter("tpwd");
		ET ad = new ET();
		ad.setTid(tid);
		ad.setTname(tname);
		ad.setTsex(tsex);
		ad.setTage(tage);
		ad.setTtel(ttel);
		ad.setTpwd(tpwd);
		TeaDao dao = new TeaDaoImp();
		dao.updateAd(ad);// 调用实现类的修改方法
		response.sendRedirect("ShowAllTeacherServlet");// 重定向到查询全部的Servlet
		out.flush();
		out.close();
	}
}