package dao;

import java.util.List;
import hibernate.ECs;

public interface CsDao {
	public List<ECs> getAll(int pageNo, int pageSize);// 查询数据信息的方法
	public void addEmp(ECs cs);
	public int maxPage();// 求最大页数的方法

	public List<ECs> queryAllEmp();
	public ECs queryAdById(int csid);
	public void updateAd(ECs cs);
	public void deleteAd(int csid);
}