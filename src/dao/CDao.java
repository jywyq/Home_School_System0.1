package dao;

import java.util.List;
import hibernate.EC;

public interface CDao {
	public List<EC> getAll(int pageNo, int pageSize);// 查询数据信息的方法
	public void addEmp(EC c);
	public int maxPage();// 求最大页数的方法

	public List<EC> queryAllEmp();
	public EC queryAdById(int cid);
	public void updateAd(EC c);
	public void deleteAd(int cid);
}