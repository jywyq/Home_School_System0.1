package hibernate;
// Generated 2016-9-17 23:20:30 by Hibernate Tools 3.5.0.Final

/**
 * RTeachId generated by hbm2java
 */
public class RTeachId implements java.io.Serializable {

	private int cid;
	private int sid;

	public RTeachId() {
	}

	public RTeachId(int cid, int sid) {
		this.cid = cid;
		this.sid = sid;
	}

	public int getCid() {
		return this.cid;
	}

	public void setCid(int cid) {
		this.cid = cid;
	}

	public int getSid() {
		return this.sid;
	}

	public void setSid(int sid) {
		this.sid = sid;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof RTeachId))
			return false;
		RTeachId castOther = (RTeachId) other;

		return (this.getCid() == castOther.getCid()) && (this.getSid() == castOther.getSid());
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + this.getCid();
		result = 37 * result + this.getSid();
		return result;
	}

}
