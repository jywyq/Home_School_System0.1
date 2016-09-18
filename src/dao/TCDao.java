package dao;

import java.util.List;

import hibernate.ECs;
import hibernate.RTeacherincharge;

public interface TCDao {
	public List<RTeacherincharge> getAll(int pageNo, int pageSize);// 查询数据信息的方法
	public void addEmp(RTeacherincharge par);
	public int maxPage();// 求最大页数的方法

	public List<RTeacherincharge> queryAllEmp();
	public RTeacherincharge queryAdById(int csid);
	public void updateAd(RTeacherincharge par);
	public void deleteAd(int csid);
	public List<RTeacherincharge> queryTCByTId(int tid);
	public List<ECs> queryCByTId(int tid);
}