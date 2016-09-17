package dao;

import java.util.List;
import hibernate.EN;

public interface NDao {
	public List<EN> getAll(int pageNo, int pageSize);// 查询数据信息的方法
	public void addEmp(EN n);
	public int maxPage();// 求最大页数的方法

	public List<EN> queryAllEmp();
	public EN queryAdById(int nid);
	public void updateAd(EN n);
	public void deleteAd(int nid);
}