package com.a2mee.model.dto;

public class MaterialInspDto {


	@Override
	public String toString() {
		return "MaterialInspDto [id=" + id + ", itmLotId=" + itmLotId + ", acceptqty=" + acceptqty + ", barCode="
				+ barCode + ", rejqty=" + rejqty + ", rejtreasonid=" + rejtreasonid + ", holdqty=" + holdqty
				+ ", holdreason=" + holdreason + ", userId=" + userId + "]";
	}

	private long id;
	private long itmLotId;
	private double acceptqty;
	private String barCode;
	private double rejqty;
	private int rejtreasonid;
	private double holdqty;
	private String holdreason;
	private String userId;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public long getItmLotId() {
		return itmLotId;
	}

	public void setItmLotId(long itmLotId) {
		this.itmLotId = itmLotId;
	}

	public double getAcceptqty() {
		return acceptqty;
	}

	public void setAcceptqty(double acceptqty) {
		this.acceptqty = acceptqty;
	}

	public String getBarCode() {
		return barCode;
	}

	public void setBarCode(String barCode) {
		this.barCode = barCode;
	}

	public double getRejqty() {
		return rejqty;
	}

	public void setRejqty(double rejqty) {
		this.rejqty = rejqty;
	}

	public int getRejtreasonid() {
		return rejtreasonid;
	}

	public void setRejtreasonid(int rejtreasonid) {
		this.rejtreasonid = rejtreasonid;
	}

	public double getHoldqty() {
		return holdqty;
	}

	public void setHoldqty(double holdqty) {
		this.holdqty = holdqty;
	}

	public String getHoldreason() {
		return holdreason;
	}

	public void setHoldreason(String holdreason) {
		this.holdreason = holdreason;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

}
