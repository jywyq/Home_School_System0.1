package dao;

import java.util.List;
import hibernate.ET;

public interface TeaDao {
	public List<ET> getAll(int pageNo, int pageSize);// 查询数据信息的方法
	public void addEmp(ET tea);
	public int maxPage();// 求最大页数的方法

	public List<ET> queryAllEmp();
	public ET queryAdById(int tid);
	public void updateAd(ET tea);
	public void deleteAd(int tid);
	public boolean find(int tid,String tpwd);
}