package hibernate;
// Generated 2016-9-13 19:11:22 by Hibernate Tools 3.5.0.Final

/**
 * Administrator generated by hbm2java
 */
public class Administrator implements java.io.Serializable {

	private Integer aid;
	private String apwd;
	private String aname;

	public Administrator() {
	}

	public Administrator(String apwd, String aname) {
		this.apwd = apwd;
		this.aname = aname;
	}

	public Integer getAid() {
		return this.aid;
	}

	public void setAid(Integer aid) {
		this.aid = aid;
	}

	public String getApwd() {
		return this.apwd;
	}

	public void setApwd(String apwd) {
		this.apwd = apwd;
	}

	public String getAname() {
		return this.aname;
	}

	public void setAname(String aname) {
		this.aname = aname;
	}

}
