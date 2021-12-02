package com.a2mee.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "quarantine_inspection_summary")
public class QuarantineInspectionSummary {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "quar_inspe_summ_id")
	private long quarInspeSummId;

	@Column(name = "hold_qty")
	private double holdQty;

	@Column(name = "quar_inspect_qty")
	private double quarInspectQty;

	@Column(name = "status")
	private String status;

	@ManyToOne
	@JoinColumn(name = "rej_id")
	RejectReasonMst rejectReasonMst;

	@Column(name = "operator")
	private long operator;

	@ManyToOne
	@JoinColumn(name = "qurt_id")
	Quarantine quarantine;

	public long getQuarInspeSummId() {
		return quarInspeSummId;
	}

	public void setQuarInspeSummId(long quarInspeSummId) {
		this.quarInspeSummId = quarInspeSummId;
	}

	public double getHoldQty() {
		return holdQty;
	}

	public void setHoldQty(double holdQty) {
		this.holdQty = holdQty;
	}

	public double getQuarInspectQty() {
		return quarInspectQty;
	}

	public void setQuarInspectQty(double quarInspectQty) {
		this.quarInspectQty = quarInspectQty;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public RejectReasonMst getRejectReasonMst() {
		return rejectReasonMst;
	}

	public void setRejectReasonMst(RejectReasonMst rejectReasonMst) {
		this.rejectReasonMst = rejectReasonMst;
	}

	public long getOperator() {
		return operator;
	}

	public void setOperator(long operator) {
		this.operator = operator;
	}

	public Quarantine getQuarantine() {
		return quarantine;
	}

	public void setQuarantine(Quarantine quarantine) {
		this.quarantine = quarantine;
	}

}
