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


public class UpdateParServlet extends HttpServlet {

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
		int pid = Integer.parseInt(request.getParameter("pid"));// 获得页面传递过来的参数
		String pname = request.getParameter("pname");
		String psex = request.getParameter("psex");
		int page = Integer.parseInt(request.getParameter("page"));
		String ptel = request.getParameter("ptel");
		String pcpy = request.getParameter("pcpy");
		String ppwd = request.getParameter("ppwd");
		EP ad = new EP();
		ad.setPid(pid);
		ad.setPname(pname);
		ad.setPsex(psex);
		ad.setPage(page);
		ad.setPtel(ptel);
		ad.setPcpy(pcpy);
		ad.setPpwd(ppwd);
		ParDao dao = new ParDaoImp();
		dao.updateAd(ad);// 调用实现类的修改方法
		response.sendRedirect("ShowAllParentServlet");// 重定向到查询全部的Servlet
		out.flush();
		out.close();
	}
}