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

import dao.StuDao;
import daoimp.StuDaoImp;
import hibernate.ES;
import hiber_sessionfac.*;
public class ShowAllStudentServlet extends HttpServlet {
	public ShowAllStudentServlet() {
		super();
		// TODO Auto-generated constructor stub
	}
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
		List<ES> list = new ArrayList<ES>();
		StuDao dao = new StuDaoImp();
		list = dao.queryAllEmp();// 调用实现类的查询全部方法
		request.setAttribute("list", list);// 把查询结果放入request对象中
		request.getRequestDispatcher("backgr/studentQuery.jsp").forward(request, response);// 转发到现实全部的页面
		out.flush();
		out.close();
	}

}
