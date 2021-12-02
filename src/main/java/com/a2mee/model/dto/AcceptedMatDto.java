package com.a2mee.model.dto;

import java.util.Date;

public class AcceptedMatDto {
	private long grnNo;
	private Date grnEntryDate;
	private String itemDetails;
	private String qrCode;
	private String itemId;
	
	public long getGrnNo() {
		return grnNo;
	}
	public void setGrnNo(long grnNo) {
		this.grnNo = grnNo;
	}
	public Date getGrnEntryDate() {
		return grnEntryDate;
	}
	public void setGrnEntryDate(Date grnEntryDate) {
		this.grnEntryDate = grnEntryDate;
	}
	public String getItemDetails() {
		return itemDetails;
	}
	public void setItemDetails(String itemDetails) {
		this.itemDetails = itemDetails;
	}
	public String getQrCode() {
		return qrCode;
	}
	public void setQrCode(String qrCode) {
		this.qrCode = qrCode;
	}
	public String getItemId() {
		return itemId;
	}
	public void setItemId(String itemId) {
		this.itemId = itemId;
	}
	
	
}
