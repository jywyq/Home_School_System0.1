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

public class UpdateStuServlet extends HttpServlet {

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
		int sid = Integer.parseInt(request.getParameter("sid"));// 获得页面传递过来的参数
		String sname = request.getParameter("sname");
		String ssex = request.getParameter("ssex");
		int sage = Integer.parseInt(request.getParameter("sage"));
		double sh=Double.parseDouble(request.getParameter("sh"));
		double sw=Double.parseDouble(request.getParameter("sw"));
		String sadd = request.getParameter("sadd");
		String spwd = request.getParameter("spwd");
		ES ad = new ES();
		ad.setSid(sid);
		ad.setSname(sname);
		ad.setSsex(ssex);
		ad.setSage(sage);
		ad.setSh(sh);
		ad.setSw(sw);
		ad.setSadd(sadd);
		ad.setSpwd(spwd);
		StuDao dao = new StuDaoImp();
		dao.updateAd(ad);// 调用实现类的修改方法
		response.sendRedirect("ShowAllStudentServlet");// 重定向到查询全部的Servlet
		out.flush();
		out.close();
	}
}