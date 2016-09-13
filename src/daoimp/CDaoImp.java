package daoimp;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import dao.CDao;
import hiber_sessionfac.HibernateSessionFactory;
import hibernate.EC;


public class CDaoImp implements CDao {
	Session session = HibernateSessionFactory.getSession();// 获得Session
	Transaction tr = session.beginTransaction();// 开启事务

	public void addEmp(EC cs) {
		System.out.println("-----ADD cname: "+cs.getCname()+" cterm: "+cs.getCterm());
		session.save(cs);// 添加数据
		tr.commit();// 提交事务
	}

	public List<EC> getAll(int pageNo, int pageSize) {
		session.beginTransaction();
		List<EC> list = new ArrayList<EC>();
		// 把查询结果放入list集合中，查询结果是根据页数来显示记录数
		list = session.createQuery("from hibernate.EC").setFirstResult((pageNo - 1) * pageSize)// 每页显示的起始数据，pageNo表示页数
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
		count = (Integer) session.createQuery("select count(*) from hibernate.EC").uniqueResult();
		maxpage = (count + 4) / 5;// 这里的5是每页显示的条数，4是每页显示条数减1
		return maxpage;
	}

	public List<EC> queryAllEmp() {
		List<EC> list = session.createQuery("from hibernate.EC").list();// 查询全部
		tr.commit();// 提交事务
		System.out.println("--------QueryALLEMP-------");
		return list;
	}

	@Override
	public EC queryAdById(int cid) {
		EC ad = new EC();
		ad = (EC) session.load(EC.class, cid);//根据id查询
		return ad;
	}

	@Override
	public void updateAd(EC c) {
		// TODO Auto-generated method stub
		session.update(c);//修改 
		tr.commit();//提交事务
	}

	@Override
	public void deleteAd(int cid) {
		// TODO Auto-generated method stub
		Query query = (Query) session.createQuery("delete EC where cid=:id");
		query.setParameter("id", cid);
		query.executeUpdate();//删除
		tr.commit();//提交事务
	}

}