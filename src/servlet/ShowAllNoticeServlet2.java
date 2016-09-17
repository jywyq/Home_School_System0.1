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

import dao.NDao;
import daoimp.NDaoImp;
import hiber_sessionfac.*;
import hibernate.EN;

public class ShowAllNoticeServlet2 extends HttpServlet {
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		this.doPost(request, response);// 调用doPost方法
		out.flush();
		out.close();
	}
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//System.err.println("FUCK!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
		//System.out.print("----------------------------------------------");
		//System.out.println("----------------------------------------------");
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		List<EN> list = new ArrayList<EN>();
		NDao dao = new NDaoImp();
		list = dao.queryAllEmp();// 调用实现类的查询全部方法
		System.out.println("----------------------------------------------"+list.size());
		request.setAttribute("list", list);// 把查询结果放入request对象中
		request.getRequestDispatcher("frnt/notice/NoticeShow.jsp").forward(request, response);// 转发到现实全部的页面
		out.flush();
		out.close();
		//out.print("----------------------------------------------");
		//System.out.println("----------------------------------------------");
	}

}
