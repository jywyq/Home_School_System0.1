package hibernate;
// Generated 2016-9-18 20:33:49 by Hibernate Tools 3.5.0.Final

/**
 * EN generated by hbm2java
 */
public class EN implements java.io.Serializable {

	private Integer nid;
	private String title;
	private String txt;

	public EN() {
	}

	public EN(String title, String txt) {
		this.title = title;
		this.txt = txt;
	}

	public Integer getNid() {
		return this.nid;
	}

	public void setNid(Integer nid) {
		this.nid = nid;
	}

	public String getTitle() {
		return this.title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getTxt() {
		return this.txt;
	}

	public void setTxt(String txt) {
		this.txt = txt;
	}

}
