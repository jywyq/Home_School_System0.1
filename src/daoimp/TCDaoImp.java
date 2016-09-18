package daoimp;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import dao.TCDao;
import hiber_sessionfac.HibernateSessionFactory;
import hibernate.ECs;
import hibernate.RTeacherincharge;


public class TCDaoImp implements TCDao {
	Session session = HibernateSessionFactory.getSession();// 获得Session
	Transaction tr = session.beginTransaction();// 开启事务

	public void addEmp(RTeacherincharge TC) {
		System.out.println("-----ADD csid: "+TC.getCsid()+"  tpwd: "+TC.getTid());
		session.save(TC);// 添加数据
		tr.commit();// 提交事务
	}

	public List<RTeacherincharge> getAll(int pageNo, int pageSize) {
		session.beginTransaction();
		List<RTeacherincharge> list = new ArrayList<RTeacherincharge>();
		// 把查询结果放入list集合中，查询结果是根据页数来显示记录数
		list = session.createQuery("from hibernate.RTeacherincharge").setFirstResult((pageNo - 1) * pageSize)// 每页显示的起始数据，pageNo表示页数
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
		count = (Integer) session.createQuery("select count(*) from hibernate.RTeacherincharge").uniqueResult();
		maxpage = (count + 4) / 5;// 这里的5是每页显示的条数，4是每页显示条数减1
		return maxpage;
	}

	public List<RTeacherincharge> queryAllEmp() {
		List<RTeacherincharge> list = session.createQuery("from hibernate.RTeacherincharge").list();// 查询全部
		tr.commit();// 提交事务
		System.out.println("--------QueryALLEMP-------");
		return list;
	}

	@Override
	public RTeacherincharge queryAdById(int csid) {
		RTeacherincharge ad = new RTeacherincharge();
		ad = (RTeacherincharge) session.load(RTeacherincharge.class, csid);//根据id查询
		return ad;
	}

	@Override
	public void updateAd(RTeacherincharge TC) {
		// TODO Auto-generated method stub
		session.update(TC);//修改 
		tr.commit();//提交事务
	}

	@Override
	public void deleteAd(int csid) {
		// TODO Auto-generated method stub
		Query query = (Query) session.createQuery("delete RTeacherincharge where csid=:id");
		query.setParameter("id", csid);
		query.executeUpdate();//删除
		tr.commit();//提交事务
	}

	@Override
	public List<RTeacherincharge> queryTCByTId(int tid) {
		List<RTeacherincharge> c = session.createQuery("from hibernate.RTeacherincharge where tid ="+tid).list();// 查询全部
		tr.commit();// 提交事务
		System.out.println("--------QueryTCBYTID-------"+c.size());
		return c;
	}

	public List<ECs> queryCByTId(int tid) {
		List<Object[]> c = session.createQuery("from hibernate.ECs cs , hibernate.RTeacherincharge rtc where cs.csid=rtc.csid").list();// 查询全部
		//for(Object o[]:c)System.out.println(o);
		tr.commit();// 提交事务
		System.out.println("--------QueryCBYTID-------"+c.size());
		List<ECs> res = new ArrayList<ECs>();
		for(Object o[]:c){
			ECs ecs =(ECs)o[0];
			if(((RTeacherincharge)o[1]).getTid()==tid)res.add(ecs);
			System.out.println(((RTeacherincharge)o[1]).getTid()+" "+tid);
		}
		return res;
	}
}