package dao;

import java.util.List;
import hibernate.EP;

public interface ParDao {
	public List<EP> getAll(int pageNo, int pageSize);// 查询数据信息的方法
	public void addEmp(EP par);
	public int maxPage();// 求最大页数的方法

	public List<EP> queryAllEmp();
	public EP queryAdById(int pid);
	public void updateAd(EP par);
	public void deleteAd(int pid);
	public int find(int pid,String ppwd);
}