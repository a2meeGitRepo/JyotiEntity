package com.a2mee.model.dto;

public class QuarantineInspectionDto {

	private double acceptQty;
	private long rejectReason;
	private double rejectQty;
	private long operator;
	private long quarantineId;

	public double getAcceptQty() {
		return acceptQty;
	}

	public void setAcceptQty(double acceptQty) {
		this.acceptQty = acceptQty;
	}

	public double getRejectQty() {
		return rejectQty;
	}

	public void setRejectQty(double rejectQty) {
		this.rejectQty = rejectQty;
	}

	public long getRejectReason() {
		return rejectReason;
	}

	public void setRejectReason(long rejectReason) {
		this.rejectReason = rejectReason;
	}

	public long getOperator() {
		return operator;
	}

	public void setOperator(long operator) {
		this.operator = operator;
	}

	public long getQuarantineId() {
		return quarantineId;
	}

	public void setQuarantineId(long quarantineId) {
		this.quarantineId = quarantineId;
	}

}
