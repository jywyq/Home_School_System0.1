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
public class UpdateNServlet extends HttpServlet {

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
		int nid = Integer.parseInt(request.getParameter("nid"));// 获得页面传递过来的参数
		String title = request.getParameter("title");
		String txt = request.getParameter("txt");
		System.out.println("title: "+title);
		System.out.println("txt: "+txt);
		EN ad = new EN();
		ad.setNid(nid);
		ad.setTitle(title);
		ad.setTxt(txt);
		NDao dao = new NDaoImp();
		dao.updateAd(ad);// 调用实现类的修改方法
		response.sendRedirect("ShowAllNoticeServlet");// 重定向到查询全部的Servlet
		out.flush();
		out.close();
	}
}