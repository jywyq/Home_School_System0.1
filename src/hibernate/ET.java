package hibernate;
// Generated 2016-9-17 23:20:30 by Hibernate Tools 3.5.0.Final

/**
 * ET generated by hbm2java
 */
public class ET implements java.io.Serializable {

	private Integer tid;
	private String tname;
	private String tsex;
	private Integer tage;
	private String ttel;
	private String tpwd;

	public ET() {
	}

	public ET(String ttel, String tpwd) {
		this.ttel = ttel;
		this.tpwd = tpwd;
	}

	public ET(String tname, String tsex, Integer tage, String ttel, String tpwd) {
		this.tname = tname;
		this.tsex = tsex;
		this.tage = tage;
		this.ttel = ttel;
		this.tpwd = tpwd;
	}

	public Integer getTid() {
		return this.tid;
	}

	public void setTid(Integer tid) {
		this.tid = tid;
	}

	public String getTname() {
		return this.tname;
	}

	public void setTname(String tname) {
		this.tname = tname;
	}

	public String getTsex() {
		return this.tsex;
	}

	public void setTsex(String tsex) {
		this.tsex = tsex;
	}

	public Integer getTage() {
		return this.tage;
	}

	public void setTage(Integer tage) {
		this.tage = tage;
	}

	public String getTtel() {
		return this.ttel;
	}

	public void setTtel(String ttel) {
		this.ttel = ttel;
	}

	public String getTpwd() {
		return this.tpwd;
	}

	public void setTpwd(String tpwd) {
		this.tpwd = tpwd;
	}

}
