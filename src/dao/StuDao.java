package dao;

import java.util.List;
import hibernate.ES;

public interface StuDao {
	public List<ES> getAll(int pageNo, int pageSize);// 查询数据信息的方法
	public void addEmp(ES stu);
	public int maxPage();// 求最大页数的方法

	public List<ES> queryAllEmp();
	public ES queryAdById(int sid);
	public void updateAd(ES stu);
	public void deleteAd(int sid);
	public int find(int sid,String spwd);
}