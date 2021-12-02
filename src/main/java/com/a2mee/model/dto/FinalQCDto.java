package com.a2mee.model.dto;

public class FinalQCDto {

	private double poActualQty;
	private long qcInputId;
	private String itemMstId;
	private String itemDetails;
	private double remaingQty;
	private long acceptQty;

	private long rejectQty;

	private long rejectReasonMst;

	private long holdQty;
	private String holdReason;

	private long operator;

	private String qrcode;

	private String source;

	private String flag; // A or M

	public String getItemMstId() {
		return itemMstId;
	}

	public void setItemMstId(String itemMstId) {
		this.itemMstId = itemMstId;
	}

	public String getItemDetails() {
		return itemDetails;
	}

	public void setItemDetails(String itemDetails) {
		this.itemDetails = itemDetails;
	}

	public double getPoActualQty() {
		return poActualQty;
	}

	public void setPoActualQty(double poActualQty) {
		this.poActualQty = poActualQty;
	}

	public long getQcInputId() {
		return qcInputId;
	}

	public void setQcInputId(long qcInputId) {
		this.qcInputId = qcInputId;
	}

	public long getAcceptQty() {
		return acceptQty;
	}

	public void setAcceptQty(long acceptQty) {
		this.acceptQty = acceptQty;
	}

	public long getRejectQty() {
		return rejectQty;
	}

	public void setRejectQty(long rejectQty) {
		this.rejectQty = rejectQty;
	}

	public long getRejectReasonMst() {
		return rejectReasonMst;
	}

	public void setRejectReasonMst(long rejectReasonMst) {
		this.rejectReasonMst = rejectReasonMst;
	}

	public long getHoldQty() {
		return holdQty;
	}

	public void setHoldQty(long holdQty) {
		this.holdQty = holdQty;
	}

	public String getHoldReason() {
		return holdReason;
	}

	public void setHoldReason(String holdReason) {
		this.holdReason = holdReason;
	}

	public long getOperator() {
		return operator;
	}

	public void setOperator(long operator) {
		this.operator = operator;
	}

	public String getQrcode() {
		return qrcode;
	}

	public void setQrcode(String qrcode) {
		this.qrcode = qrcode;
	}

	public double getRemaingQty() {
		return remaingQty;
	}

	public void setRemaingQty(double remaingQty) {
		this.remaingQty = remaingQty;
	}

	public String getSource() {
		return source;
	}

	public void setSource(String source) {
		this.source = source;
	}

	public String getFlag() {
		return flag;
	}

	public void setFlag(String flag) {
		this.flag = flag;
	}

}
