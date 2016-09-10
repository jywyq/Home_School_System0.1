package daoimp;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

import dao.AdminDao;
import hiber_sessionfac.HibernateSessionFactory;
import hibernate.Administrator;

public class AdminDaoImp implements AdminDao {
	Session session = HibernateSessionFactory.getSession();// 获得Session
	Transaction tr = session.beginTransaction();// 开启事务

	public void addEmp(Administrator ad) {
		session.save(ad);// 添加数据
		tr.commit();// 提交事务
	}

	public List<Administrator> getAll(int pageNo, int pageSize) {
		session.beginTransaction();
		List<Administrator> list = new ArrayList<Administrator>();
		// 把查询结果放入list集合中，查询结果是根据页数来显示记录数
		list = session.createQuery("from hibernate.Administrator").setFirstResult((pageNo - 1) * pageSize)// 每页显示的起始数据，pageNo表示页数
				.setMaxResults(pageSize) // 每页显示的末条数据，pageSize表示每页显示的数量
				.list();
		session.getTransaction().commit(); // 提交事务
		return list;
	}

	public int maxPage() {// 求最大页数的方法
		int count = 0;// 声明一个count变量，用于存储记录数
		int maxpage = 0;// 声明一个maxpage变量，原来表示最大页数
		session.beginTransaction();
		// 获取总记录数
		count = (Integer) session.createQuery("select count(*) from hibernate.Administrator").uniqueResult();
		maxpage = (count + 4) / 5;// 这里的5是每页显示的条数，4是每页显示条数减1
		return maxpage;
	}

	public List<Administrator> queryAllEmp() {
		List<Administrator> list = session.createQuery("from hibernate.Administrator").list();// 查询全部
		tr.commit();// 提交事务
		System.out.println("---------------QueryALLEMP--------------");
		return list;
	}
}