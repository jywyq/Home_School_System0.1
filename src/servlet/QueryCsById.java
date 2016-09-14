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




public class QueryCsById extends HttpServlet {

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
		int csid = Integer.parseInt(request.getParameter("csid"));// 获得页面传递的参数
		ECs ad = new ECs();
		CsDao dao = new CsDaoImp();
		ad = dao.queryAdById(csid);// 调用实现类中根据id查询的方法
		request.setAttribute("ad", ad);// 把获得的对象放入request对象中
		// 转发到现实单条记录的页面
		request.getRequestDispatcher("backgr/ShowCsById.jsp").forward(request, response);
		out.flush();
		out.close();
	}
}