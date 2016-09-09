package hibernate;
import javax.persistence.Entity;
import org.hibernate.Session;


public class AddAdministrator {
	/*
	 * 测试代码！！！
	public static void main(String[] args) {
		AddAdministrator mgr = new AddAdministrator();
		mgr.createAndStoreadmin("123456");
		HibernateUtil.getSessionFactory().close();
	}
	*/
	private void createAndStoreadmin(String pwd) {
		Session session = HibernateUtil.getSessionFactory().getCurrentSession();
		session.beginTransaction();

		Administrator admin = new Administrator();
		admin.setApwd(pwd);
		session.save(admin);
		//session.delete(theEvent);
		session.getTransaction().commit();
		session.close();
		
	}
}
