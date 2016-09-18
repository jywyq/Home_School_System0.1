package daoimp;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import dao.SCsDao;
import hiber_sessionfac.HibernateSessionFactory;
import hibernate.ECs;
import hibernate.ES;
import hibernate.RStudentclass;


public class SCsDaoImp implements SCsDao {
	Session session = HibernateSessionFactory.getSession();// 获得Session
	Transaction tr = session.beginTransaction();// 开启事务

	public void addEmp(RStudentclass SCs) {
		System.out.println("-----ADD csid: "+SCs.getCsid()+"  sid: "+SCs.getSid());
		session.save(SCs);// 添加数据
		tr.commit();// 提交事务
	}

	public List<RStudentclass> getAll(int pageNo, int pageSize) {
		session.beginTransaction();
		List<RStudentclass> list = new ArrayList<RStudentclass>();
		// 把查询结果放入list集合中，查询结果是根据页数来显示记录数
		list = session.createQuery("from hibernate.RStudentclass").setFirstResult((pageNo - 1) * pageSize)// 每页显示的起始数据，pageNo表示页数
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
		count = (Integer) session.createQuery("select count(*) from hibernate.RStudentclass").uniqueResult();
		maxpage = (count + 4) / 5;// 这里的5是每页显示的条数，4是每页显示条数减1
		return maxpage;
	}

	public List<RStudentclass> queryAllEmp() {
		List<RStudentclass> list = session.createQuery("from hibernate.RStudentclass").list();// 查询全部
		tr.commit();// 提交事务
		System.out.println("--------QueryALLEMP-------");
		return list;
	}

	@Override
	public RStudentclass queryAdById(int csid) {
		RStudentclass ad = new RStudentclass();
		ad = (RStudentclass) session.load(RStudentclass.class, csid);//根据id查询
		return ad;
	}

	@Override
	public void updateAd(RStudentclass SCs) {
		// TODO Auto-generated method stub
		session.update(SCs);//修改 
		tr.commit();//提交事务
	}

	@Override
	public void deleteAd(int csid) {
		// TODO Auto-generated method stub
		Query query = (Query) session.createQuery("delete RStudentclass where csid=:id");
		query.setParameter("id", csid);
		query.executeUpdate();//删除
		tr.commit();//提交事务
	}


	public List<ES> querySByCsid(int csid) {
		List<Object[]> c = session.createQuery("from hibernate.ES s , hibernate.RStudentclass rsc where s.sid=rsc.sid").list();// 查询全部
		//for(Object o[]:c)System.out.println(o);
		tr.commit();// 提交事务
		System.out.println("--------QueryCBYTID-------"+c.size());
		List<ES> res = new ArrayList<ES>();
		for(Object o[]:c){
			ES ecs =(ES)o[0];
			if(((RStudentclass)o[1]).getCsid()==csid)res.add(ecs);
			//System.out.println(((RStudentclass)o[1]).getCsid()+" "+csid);
		}
		return res;
	}

	@Override
	public List<ECs> queryClassBySid(int sid) {
		List<Object[]> c = session.createQuery("from hibernate.ECs cs , hibernate.RStudentclass rsc where cs.csid=rsc.csid").list();// 查询全部
		//for(Object o[]:c)System.out.println(o);
		tr.commit();// 提交事务
		System.out.println("--------QueryCBYTID-------"+c.size());
		List<ECs> res = new ArrayList<ECs>();
		for(Object o[]:c){
			ECs ecs =(ECs)o[0];
			if(((RStudentclass)o[1]).getSid()==sid)res.add(ecs);
			//System.out.println(((RStudentclass)o[1]).getCsid()+" "+csid);
		}
		return res;
	}
}