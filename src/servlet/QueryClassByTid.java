package servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.TCDao;
import daoimp.TCDaoImp;
import hibernate.EC;
import hibernate.ECs;




public class QueryClassByTid extends HttpServlet {

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
		int tid = Integer.parseInt(request.getParameter("tid"));// 获得页面传递的参数
		System.out.println("GET到了index传来的参数id=: "+tid);
		List<ECs> list = new ArrayList<ECs>();
		TCDao dao = new TCDaoImp();
		list = dao.queryCByTId(tid);// 调用实现类中根据id查询的方法
		request.setAttribute("list", list);// 把获得的对象放入request对象中
		// 转发到现实单条记录的页面
		request.getRequestDispatcher("frnt/teacher_class/QueryClassByTid.jsp").forward(request, response);
		out.flush();
		out.close();
	}
}