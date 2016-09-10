package dao;

import java.util.List;
import hibernate.Administrator;

public interface AdminDao {
	public List<Administrator> getAll(int pageNo, int pageSize);// 查询数据信息的方法

	public int maxPage();// 求最大页数的方法

	public List<Administrator> queryAllEmp();
}