package hibernate;
// Generated 2016-9-9 14:57:27 by Hibernate Tools 3.5.0.Final

/**
 * EP generated by hbm2java
 */
public class EP implements java.io.Serializable {

	private Integer pid;
	private String pname;
	private String psex;
	private Integer page;
	private String ptel;
	private String pcpy;
	private String ppwd;

	public EP() {
	}

	public EP(String ppwd) {
		this.ppwd = ppwd;
	}

	public EP(String pname, String psex, Integer page, String ptel, String pcpy, String ppwd) {
		this.pname = pname;
		this.psex = psex;
		this.page = page;
		this.ptel = ptel;
		this.pcpy = pcpy;
		this.ppwd = ppwd;
	}

	public Integer getPid() {
		return this.pid;
	}

	public void setPid(Integer pid) {
		this.pid = pid;
	}

	public String getPname() {
		return this.pname;
	}

	public void setPname(String pname) {
		this.pname = pname;
	}

	public String getPsex() {
		return this.psex;
	}

	public void setPsex(String psex) {
		this.psex = psex;
	}

	public Integer getPage() {
		return this.page;
	}

	public void setPage(Integer page) {
		this.page = page;
	}

	public String getPtel() {
		return this.ptel;
	}

	public void setPtel(String ptel) {
		this.ptel = ptel;
	}

	public String getPcpy() {
		return this.pcpy;
	}

	public void setPcpy(String pcpy) {
		this.pcpy = pcpy;
	}

	public String getPpwd() {
		return this.ppwd;
	}

	public void setPpwd(String ppwd) {
		this.ppwd = ppwd;
	}

}
