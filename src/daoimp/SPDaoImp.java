package daoimp;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import dao.SPDao;
import hiber_sessionfac.HibernateSessionFactory;
import hibernate.EP;
import hibernate.ES;
import hibernate.RStudentparent;


public class SPDaoImp implements SPDao {
	Session session = HibernateSessionFactory.getSession();// 获得Session
	Transaction tr = session.beginTransaction();// 开启事务

	public void addEmp(RStudentparent sp) {
		System.out.println("-----ADD sid: "+sp.getSid()+"  sid: "+sp.getPid());
		session.save(sp);// 添加数据
		tr.commit();// 提交事务
	}

	public List<RStudentparent> getAll(int pageNo, int pageSize) {
		session.beginTransaction();
		List<RStudentparent> list = new ArrayList<RStudentparent>();
		// 把查询结果放入list集合中，查询结果是根据页数来显示记录数
		list = session.createQuery("from hibernate.RStudentparent").setFirstResult((pageNo - 1) * pageSize)// 每页显示的起始数据，pageNo表示页数
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
		count = (Integer) session.createQuery("select count(*) from hibernate.RStudentparent").uniqueResult();
		maxpage = (count + 4) / 5;// 这里的5是每页显示的条数，4是每页显示条数减1
		return maxpage;
	}

	public List<RStudentparent> queryAllEmp() {
		List<RStudentparent> list = session.createQuery("from hibernate.RStudentparent").list();// 查询全部
		tr.commit();// 提交事务
		System.out.println("--------QueryALLEMP-------");
		return list;
	}

	@Override
	public RStudentparent queryAdById(int sid,int pid) {
		RStudentparent ad = new RStudentparent();
		ad = (RStudentparent) session.load(RStudentparent.class, sid);//根据id查询
		return ad;
	}

	@Override
	public void updateAd(RStudentparent SP) {
		// TODO Auto-generated method stub
		session.update(SP);//修改 
		tr.commit();//提交事务
	}

	@Override
	public void deleteAd(int sid,int pid) {
		// TODO Auto-generated method stub
		Query query = (Query) session.createQuery("delete RStudentparent where sid=:id");
		query.setParameter("id", sid);
		query.executeUpdate();//删除
		tr.commit();//提交事务
	}


	public List<EP> queryParBySid(int sid) {
		List<Object[]> c = session.createQuery("from hibernate.EP p , hibernate.RStudentparent rsp where p.pid=rsp.pid").list();// 查询全部
		//for(Object o[]:c)System.out.println(o);
		tr.commit();// 提交事务
		System.out.println("--------QueryCBYTID-------"+c.size());
		List<EP> res = new ArrayList<EP>();
		for(Object o[]:c){
			EP ecs =(EP)o[0];
			if(((RStudentparent)o[1]).getSid()==sid)res.add(ecs);
			//System.out.println(((RStudentparent)o[1]).getsid()+" "+sid);
		}
		return res;
	}

	@Override
	public List<ES> queryStuByPid(int pid) {
		List<Object[]> c = session.createQuery("from hibernate.ES s , hibernate.RStudentparent rsp where s.sid=rsp.sid").list();// 查询全部
		//for(Object o[]:c)System.out.println(o);
		tr.commit();// 提交事务
		System.out.println("--------QueryCBYTID-------"+c.size());
		List<ES> res = new ArrayList<ES>();
		for(Object o[]:c){
			ES ecs =(ES)o[0];
			if(((RStudentparent)o[1]).getPid()==pid)res.add(ecs);
			//System.out.println(((RStudentparent)o[1]).getsid()+" "+sid);
		}
		return res;
	}
}