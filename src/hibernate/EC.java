package hibernate;
// Generated 2016-9-13 19:11:22 by Hibernate Tools 3.5.0.Final

/**
 * EC generated by hbm2java
 */
public class EC implements java.io.Serializable {

	private Integer cid;
	private String cname;
	private Integer cterm;

	public EC() {
	}

	public EC(String cname, Integer cterm) {
		this.cname = cname;
		this.cterm = cterm;
	}

	public Integer getCid() {
		return this.cid;
	}

	public void setCid(Integer cid) {
		this.cid = cid;
	}

	public String getCname() {
		return this.cname;
	}

	public void setCname(String cname) {
		this.cname = cname;
	}

	public Integer getCterm() {
		return this.cterm;
	}

	public void setCterm(Integer cterm) {
		this.cterm = cterm;
	}

}
