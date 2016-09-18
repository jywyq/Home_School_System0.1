package dao;

import java.util.List;

import hibernate.ECs;
import hibernate.ES;
import hibernate.RStudentclass;

public interface SCsDao {
	public List<RStudentclass> getAll(int pageNo, int pageSize);// 查询数据信息的方法
	public void addEmp(RStudentclass par);
	public int maxPage();// 求最大页数的方法

	public List<RStudentclass> queryAllEmp();
	public RStudentclass queryAdById(int csid);
	public void updateAd(RStudentclass par);
	public void deleteAd(int csid);
	public List<ES> querySByCsid(int csid);
	public List<ECs> queryClassBySid(int sid);
}