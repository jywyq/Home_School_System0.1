package hibernate;
// Generated 2016-9-9 14:57:27 by Hibernate Tools 3.5.0.Final

/**
 * RTeach generated by hbm2java
 */
public class RTeach implements java.io.Serializable {

	private RTeachId id;
	private Integer tid;
	private Double points;

	public RTeach() {
	}

	public RTeach(RTeachId id) {
		this.id = id;
	}

	public RTeach(RTeachId id, Integer tid, Double points) {
		this.id = id;
		this.tid = tid;
		this.points = points;
	}

	public RTeachId getId() {
		return this.id;
	}

	public void setId(RTeachId id) {
		this.id = id;
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