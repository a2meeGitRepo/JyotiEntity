package com.a2mee.model;

import java.time.LocalDate;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "final_quality_check")
public class FinalQualityCheck {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "quality_check_id")
	private long qualityCheckId;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "qc_input_id")
	QCInput qCInput;

	@ManyToOne
	@JoinColumn(name = "id")
	RejectReasonMst rejectReasonMst;

	@Column(name = "qrcode")
	private String qrcode;

	@Column(name = "actual_qty")
	private double actualQty;

	@Column(name = "date_of_inspection")
	private LocalDate dateOfInspection;

	@Column(name = "quantity")
	private double quantity;

	@Column(name = "status")
	private String status;

	@Column(name = "reason")
	private String reason;

	@Column(name = "operator")
	private long operator;

	@Column(name = "flag")
	private String flag;

	public long getQualityCheckId() {
		return qualityCheckId;
	}

	public void setQualityCheckId(long qualityCheckId) {
		this.qualityCheckId = qualityCheckId;
	}

	public QCInput getqCInput() {
		return qCInput;
	}

	public void setqCInput(QCInput qCInput) {
		this.qCInput = qCInput;
	}

	public RejectReasonMst getRejectReasonMst() {
		return rejectReasonMst;
	}

	public void setRejectReasonMst(RejectReasonMst rejectReasonMst) {
		this.rejectReasonMst = rejectReasonMst;
	}

	public String getQrcode() {
		return qrcode;
	}

	public void setQrcode(String qrcode) {
		this.qrcode = qrcode;
	}

	public double getActualQty() {
		return actualQty;
	}

	public void setActualQty(double actualQty) {
		this.actualQty = actualQty;
	}

	public LocalDate getDateOfInspection() {
		return dateOfInspection;
	}

	public void setDateOfInspection(LocalDate dateOfInspection) {
		this.dateOfInspection = dateOfInspection;
	}

	public double getQuantity() {
		return quantity;
	}

	public void setQuantity(double quantity) {
		this.quantity = quantity;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getReason() {
		return reason;
	}

	public void setReason(String reason) {
		this.reason = reason;
	}

	public long getOperator() {
		return operator;
	}

	public void setOperator(long operator) {
		this.operator = operator;
	}

	public String getFlag() {
		return flag;
	}

	public void setFlag(String flag) {
		this.flag = flag;
	}

}