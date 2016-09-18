package servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.AdminDao;
import daoimp.AdminDaoImp;

public class AdminLoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AdminLoginServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		this.doPost(request, response);// 调用doPost方法
		out.flush();
		out.close();
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		int aid = Integer.parseInt(request.getParameter("aid"));// 获得页面传递的empno
		String apwd = request.getParameter("apwd");
		AdminDao dao = new AdminDaoImp();
		int res=dao.find(aid,apwd);
		if(res==2)response.sendRedirect("backgr/index.jsp");// 调用实现类中的查询方法
		else if(res==0)response.sendRedirect("backgr/error.jsp");// 重定向到显示全部员工信息页面
		else response.sendRedirect("backgr/error2.jsp");
		out.flush();
		out.close();
	}

}
