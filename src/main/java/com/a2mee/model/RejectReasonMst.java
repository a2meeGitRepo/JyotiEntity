package com.a2mee.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name ="reason_mst")
public class RejectReasonMst {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="reason_id")
	private long rejId;

	@Column(name = "rejection_reason")
	private String reason;

	public long getRejId() {
		return rejId;
	}

	public void setRejId(long rejId) {
		this.rejId = rejId;
	}

	public String getReason() {
		return reason;
	}

	public void setReason(String reason) {
		this.reason = reason;
	}
	
	
}
