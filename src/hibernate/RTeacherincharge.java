package hibernate;
// Generated 2016-9-8 14:30:58 by Hibernate Tools 3.5.0.Final

/**
 * RTeacherincharge generated by hbm2java
 */
public class RTeacherincharge implements java.io.Serializable {

	private int sid;
	private Integer tid;

	public RTeacherincharge() {
	}

	public RTeacherincharge(int sid) {
		this.sid = sid;
	}

	public RTeacherincharge(int sid, Integer tid) {
		this.sid = sid;
		this.tid = tid;
	}

	public int getSid() {
		return this.sid;
	}

	public void setSid(int sid) {
		this.sid = sid;
	}

	public Integer getTid() {
		return this.tid;
	}

	public void setTid(Integer tid) {
		this.tid = tid;
	}

}
