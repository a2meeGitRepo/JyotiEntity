package com.a2mee.model.dto;

public class QuarantineDto {

	private String itemMasterId;
	private String itemMstDetails;
	private String qrcode;
	private double holdQty;
	private String uom;
	private String stage;
	private long quar_id;

	public String getItemMstDetails() {
		return itemMstDetails;
	}

	public void setItemMstDetails(String itemMstDetails) {
		this.itemMstDetails = itemMstDetails;
	}

	public String getItemMasterId() {
		return itemMasterId;
	}

	public void setItemMasterId(String itemMasterId) {
		this.itemMasterId = itemMasterId;
	}

	public String getQrcode() {
		return qrcode;
	}

	public void setQrcode(String qrcode) {
		this.qrcode = qrcode;
	}

	public double getHoldQty() {
		return holdQty;
	}

	public void setHoldQty(double holdQty) {
		this.holdQty = holdQty;
	}

	public String getUom() {
		return uom;
	}

	public void setUom(String uom) {
		this.uom = uom;
	}

	public String getStage() {
		return stage;
	}

	public void setStage(String stage) {
		this.stage = stage;
	}

	public long getQuar_id() {
		return quar_id;
	}

	public void setQuar_id(long quar_id) {
		this.quar_id = quar_id;
	}

}
