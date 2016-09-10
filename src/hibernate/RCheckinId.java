package hibernate;
// Generated 2016-9-9 14:57:27 by Hibernate Tools 3.5.0.Final

import java.util.Date;

/**
 * RCheckinId generated by hbm2java
 */
public class RCheckinId implements java.io.Serializable {

	private int sid;
	private int cid;
	private Date date;

	public RCheckinId() {
	}

	public RCheckinId(int sid, int cid, Date date) {
		this.sid = sid;
		this.cid = cid;
		this.date = date;
	}

	public int getSid() {
		return this.sid;
	}

	public void setSid(int sid) {
		this.sid = sid;
	}

	public int getCid() {
		return this.cid;
	}

	public void setCid(int cid) {
		this.cid = cid;
	}

	public Date getDate() {
		return this.date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof RCheckinId))
			return false;
		RCheckinId castOther = (RCheckinId) other;

		return (this.getSid() == castOther.getSid()) && (this.getCid() == castOther.getCid())
				&& ((this.getDate() == castOther.getDate()) || (this.getDate() != null && castOther.getDate() != null
						&& this.getDate().equals(castOther.getDate())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + this.getSid();
		result = 37 * result + this.getCid();
		result = 37 * result + (getDate() == null ? 0 : this.getDate().hashCode());
		return result;
	}

}
