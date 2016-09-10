package jv;

import java.util.List;

import org.hibernate.Session;

import hiber_sessionfac.HibernateSessionFactory;
import hibernate.Administrator;

public class AdministratorTest {

	// 测试代码！！！
	public static void main(String[] args) {
		AdministratorTest mgr = new AdministratorTest();
		mgr.createAndStoreadmin("123456", "admin4");
		HibernateSessionFactory.getSession().close();
	}

	private void createAndStoreadmin(String pwd, String aname) {
		Session session = HibernateSessionFactory.getSession();
		session.beginTransaction();

		Administrator admin = new Administrator();
		// admin.setAid(10000);
		admin.setApwd(pwd);
		admin.setAname(aname);
		session.save(admin);
		// session.delete(theEvent);
		session.getTransaction().commit();
		session.close();

	}

}
