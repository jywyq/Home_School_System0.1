package servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.AdminDao;
import daoimp.AdminDaoImp;
import hibernate.Administrator;
import hiber_sessionfac.*;
/**
 * Servlet implementation class ShowAllAdminServlet1
 */
@WebServlet("/ShowAllAdminServlet1")
public class ShowAllAdminServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public ShowAllAdminServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		this.doPost(request, response);// 调用doPost方法
		out.flush();
		out.close();
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.err.println("FUCK!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
		System.out.print("----------------------------------------------");
		System.out.println("----------------------------------------------");
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		List<Administrator> list = new ArrayList<Administrator>();
		AdminDao dao = new AdminDaoImp();
		list = dao.queryAllEmp();// 调用实现类的查询全部方法
		request.setAttribute("list", list);// 把查询结果放入request对象中
		request.getRequestDispatcher("ShowAllAdmin.jsp").forward(request, response);// 转发到现实全部的页面
		out.flush();
		out.close();
		out.print("----------------------------------------------");
		System.out.println("----------------------------------------------");
	}

}
