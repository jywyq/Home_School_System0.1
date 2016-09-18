package hibernate;
// Generated 2016-9-18 20:33:49 by Hibernate Tools 3.5.0.Final

/**
 * RTeach generated by hbm2java
 */
public class RTeach implements java.io.Serializable {

	private Integer rtcid;
	private int cid;
	private int sid;
	private Integer tid;
	private Double points;

	public RTeach() {
	}

	public RTeach(int cid, int sid) {
		this.cid = cid;
		this.sid = sid;
	}

	public RTeach(int cid, int sid, Integer tid, Double points) {
		this.cid = cid;
		this.sid = sid;
		this.tid = tid;
		this.points = points;
	}

	public Integer getRtcid() {
		return this.rtcid;
	}

	public void setRtcid(Integer rtcid) {
		this.rtcid = rtcid;
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

	public Integer getTid() {
		return this.tid;
	}

	public void setTid(Integer tid) {
		this.tid = tid;
	}

	public Double getPoints() {
		return this.points;
	}

	public void setPoints(Double points) {
		this.points = points;
	}

}
