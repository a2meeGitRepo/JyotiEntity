package com.a2mee.model.dto;

import java.util.Date;

public class GrnSaveDto {
	@Override
	public String toString() {
		return "GrnSaveDto [purchaseOrderNo=" + purchaseOrderNo + ", grnNo=" + grnNo + ", grnEntryDate=" + grnEntryDate
				+ ", grnStatus=" + grnStatus + ", grnBy=" + grnBy + ", inwardTime=" + inwardTime + ", errorSolveDate="
				+ errorSolveDate + ", itemDetails=" + itemDetails + ", grnQty=" + grnQty + ", itemQty=" + itemQty
				+ ", itemMsrUnit=" + itemMsrUnit + ", itemMstId=" + itemMstId + ", netPrice=" + netPrice + ", currency="
				+ currency + ", poiStatus=" + poiStatus + ", batchQty=" + batchQty + ", boxQty=" + boxQty + ", type="
				+ type + ", getType()=" + getType() + ", getPurchaseOrderNo()=" + getPurchaseOrderNo() + ", getGrnNo()="
				+ getGrnNo() + ", getGrnEntryDate()=" + getGrnEntryDate() + ", getGrnStatus()=" + getGrnStatus()
				+ ", getGrnBy()=" + getGrnBy() + ", getInwardTime()=" + getInwardTime() + ", getErrorSolveDate()="
				+ getErrorSolveDate() + ", getItemDetails()=" + getItemDetails() + ", getGrnQty()=" + getGrnQty()
				+ ", getItemQty()=" + getItemQty() + ", getItemMsrUnit()=" + getItemMsrUnit() + ", getItemMstId()="
				+ getItemMstId() + ", getNetPrice()=" + getNetPrice() + ", getCurrency()=" + getCurrency()
				+ ", getPoiStatus()=" + getPoiStatus() + ", getBatchQty()=" + getBatchQty() + ", getBoxQty()="
				+ getBoxQty() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()="
				+ super.toString() + "]";
	}
	private long purchaseOrderNo;
	private long grnNo;
	private Date grnEntryDate;
	private String grnStatus;
	private String grnBy;
	private String inwardTime;
	private Date errorSolveDate;
	private String itemDetails;
	private double grnQty;	
	private double itemQty;
	private String itemMsrUnit;
	private String itemMstId;
	private long netPrice;
	private String currency;
	private String poiStatus;
	private double batchQty;
	private long boxQty;
	private String type;
	
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public long getPurchaseOrderNo() {
		return purchaseOrderNo;
	}
	public void setPurchaseOrderNo(long purchaseOrderNo) {
		this.purchaseOrderNo = purchaseOrderNo;
	}
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
	public String getGrnStatus() {
		return grnStatus;
	}
	public void setGrnStatus(String grnStatus) {
		this.grnStatus = grnStatus;
	}
	public String getGrnBy() {
		return grnBy;
	}
	public void setGrnBy(String grnBy) {
		this.grnBy = grnBy;
	}
	public String getInwardTime() {
		return inwardTime;
	}
	public void setInwardTime(String inwardTime) {
		this.inwardTime = inwardTime;
	}
	public Date getErrorSolveDate() {
		return errorSolveDate;
	}
	public void setErrorSolveDate(Date errorSolveDate) {
		this.errorSolveDate = errorSolveDate;
	}	
	public String getItemDetails() {
		return itemDetails;
	}
	public void setItemDetails(String itemDetails) {
		this.itemDetails = itemDetails;
	}
	public double getGrnQty() {
		return grnQty;
	}
	public void setGrnQty(double itemQty) {
		this.grnQty = itemQty;
	}
	public double getItemQty() {
		return itemQty;
	}
	public void setItemQty(double itemQty) {
		this.itemQty = itemQty;
	}
	public String getItemMsrUnit() {
		return itemMsrUnit;
	}
	public void setItemMsrUnit(String itemMsrUnit) {
		this.itemMsrUnit = itemMsrUnit;
	}
	public String getItemMstId() {
		return itemMstId;
	}
	public void setItemMstId(String itemMstId) {
		this.itemMstId = itemMstId;
	}
	public long getNetPrice() {
		return netPrice;
	}
	public void setNetPrice(long netPrice) {
		this.netPrice = netPrice;
	}
	public String getCurrency() {
		return currency;
	}
	public void setCurrency(String currency) {
		this.currency = currency;
	}
	public String getPoiStatus() {
		return poiStatus;
	}
	public void setPoiStatus(String poiStatus) {
		this.poiStatus = poiStatus;
	}
	public double getBatchQty() {
		return batchQty;
	}
	public void setBatchQty(double batchQty) {
		this.batchQty = batchQty;
	}
	public long getBoxQty() {
		return boxQty;
	}
	public void setBoxQty(long boxQty) {
		this.boxQty = boxQty;
	}		
	
	
}
