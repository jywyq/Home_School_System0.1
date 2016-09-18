package dao;

import java.util.List;

import hibernate.EP;
import hibernate.ES;
import hibernate.RStudentparent;

public interface SPDao {
	public List<RStudentparent> getAll(int pageNo, int pageSize);// 查询数据信息的方法
	public void addEmp(RStudentparent par);
	public int maxPage();// 求最大页数的方法

	public List<RStudentparent> queryAllEmp();
	public RStudentparent queryAdById(int sid,int pid);
	public void updateAd(RStudentparent par);
	public void deleteAd(int sid,int pid);
	public List<EP> queryParBySid(int sid);
	public List<ES> queryStuByPid(int pid);
}