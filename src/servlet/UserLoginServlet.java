package servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.ParDao;
import dao.StuDao;
import dao.TeaDao;
import daoimp.ParDaoImp;
import daoimp.StuDaoImp;
import daoimp.TeaDaoImp;


public class UserLoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UserLoginServlet() {
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
		int id = Integer.parseInt(request.getParameter("id"));// 获得页面传递的empno
		String pwd = request.getParameter("pwd");
		int tp = Integer.parseInt(request.getParameter("tp"));
		System.out.println("id: "+id+" pwd: "+pwd+" tp: "+tp);
		request.setAttribute("id",id);// 把获得的对象放入request对象中
		request.setAttribute("tp",tp);// 把获得的对象放入request对象中
		if(tp==1){
			StuDao dao = new StuDaoImp();
			if(dao.find(id, pwd)){
				String name = dao.queryAdById(id).getSname();// 调用实现类中根据id查询的方法
				request.setAttribute("name", name+"学生");// 把获得的对象放入request对象中
				// 转发到现实单条记录的页面
				request.getRequestDispatcher("frnt/index.jsp").forward(request, response);
			}
			else response.sendRedirect("backgr/error.jsp");// 重定向到显示全部员工信息页面 
		}
		else if(tp==2){
			TeaDao dao = new TeaDaoImp();
			if(dao.find(id, pwd)){
				String name = dao.queryAdById(id).getTname();// 调用实现类中根据id查询的方法
				request.setAttribute("name", name+"老师");// 把获得的对象放入request对象中
				// 转发到现实单条记录的页面
				request.getRequestDispatcher("frnt/index.jsp").forward(request, response);
			}
			else response.sendRedirect("backgr/error.jsp");// 重定向到显示全部员工信息页面
		}else{
			ParDao dao = new ParDaoImp();
			if(dao.find(id, pwd)){
				String name = dao.queryAdById(id).getPname();// 调用实现类中根据id查询的方法
				request.setAttribute("name", name+"家长");// 把获得的对象放入request对象中
				// 转发到现实单条记录的页面
				request.getRequestDispatcher("frnt/index.jsp").forward(request, response);
			}
			else response.sendRedirect("backgr/error.jsp");// 重定向到显示全部员工信息页面
		}
		out.flush();
		out.close();
	}

}
