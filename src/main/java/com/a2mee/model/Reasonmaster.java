package com.a2mee.model;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

@Entity
@Table(name = "reason_mst")

public class Reasonmaster {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int reason_id;

	@Column(name = "rejection_code")
	private String rejection_code;

	@Transient
	private List<List<String>> resultset;

	@Column(name = "rejection_reason")
	private String rejection_reason;

	@Column(name = "color")
	private String color;

	@Column(name = "end_users_ite_profile_id")
	private long end_users_ite_profile_id;

	public long getEnd_users_ite_profile_id() {
		return end_users_ite_profile_id;
	}

	public void setEnd_users_ite_profile_id(long end_users_ite_profile_id) {
		this.end_users_ite_profile_id = end_users_ite_profile_id;
	}

	public int getReason_id() {
		return reason_id;
	}

	public void setReason_id(int reason_id) {
		this.reason_id = reason_id;
	}

	public String getRejection_code() {
		return rejection_code;
	}

	public void setRejection_code(String rejection_code) {
		this.rejection_code = rejection_code;
	}

	public List<List<String>> getResultset() {
		return resultset;
	}

	public void setResultset(List<List<String>> resultset) {
		this.resultset = resultset;
	}

	public String getRejection_reason() {
		return rejection_reason;
	}

	public void setRejection_reason(String rejection_reason) {
		this.rejection_reason = rejection_reason;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

}