package com.a2mee.model.dto;

import java.util.Date;

public class MtlStockInDto {

	private double fifoRemainQty;
	private Date grnDate;
	private String qrcode;
	private double itemTolQty;

	public double getItemTolQty() {
		return itemTolQty;
	}

	public void setItemTolQty(double itemTolQty) {
		this.itemTolQty = itemTolQty;
	}

	public double getFifoRemainQty() {
		return fifoRemainQty;
	}

	public void setFifoRemainQty(double fifoRemainQty) {
		this.fifoRemainQty = fifoRemainQty;
	}

	public Date getGrnDate() {
		return grnDate;
	}

	public void setGrnDate(Date grnDate) {
		this.grnDate = grnDate;
	}

	public String getQrcode() {
		return qrcode;
	}

	public void setQrcode(String qrcode) {
		this.qrcode = qrcode;
	}

}
