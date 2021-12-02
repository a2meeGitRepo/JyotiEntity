package com.a2mee.model.dto;

import java.util.Date;

public class PurchaseOrderErrDto {
	private long purchaseOrderNo;
	private String createOn;
	private String itemDetails;
	private String venName;
	private String purchaseOwner;
	private Date inwardDate;
	private String invoiceNumber;
	private String challanNumber;
	private Date docDate;
	private String remarks;
	private double itemQty;
	private String itemMsrUnit;
	private String itemMstId;
	private double netPrice;
	private String currency;
	private int errorId;
	private long purchaseOrderItemId;
	
	private String type;
	private String boe;
	private String courier;
	private String docketNo;
	private String sapGrnNo;
	private Date sapGrnDate;
	private String delayDays;
	private String resPerson;
	private String delayPerc;
	private String accDocHandover;
	private Date handoverDate;
	private String vehicleNo;
	private String vehicleStatus;
	private String unloadType;
	private String packingType;
	
	public long getPurchaseOrderNo() {
		return purchaseOrderNo;
	}
	public void setPurchaseOrderNo(long purchaseOrderNo) {
		this.purchaseOrderNo = purchaseOrderNo;
	}
	public int getErrorId() {
		return errorId;
	}
	public void setErrorId(int errorId) {
		this.errorId = errorId;
	}
	public String getCreateOn() {
		return createOn;
	}
	public void setCreateOn(String createOn) {
		this.createOn = createOn;
	}
	public String getItemDetails() {
		return itemDetails;
	}
	public void setItemDetails(String itemDetails) {
		this.itemDetails = itemDetails;
	}
	public String getVenName() {
		return venName;
	}
	public void setVenName(String venName) {
		this.venName = venName;
	}
	public String getPurchaseOwner() {
		return purchaseOwner;
	}
	public void setPurchaseOwner(String purchaseOwner) {
		this.purchaseOwner = purchaseOwner;
	}
	public Date getInwardDate() {
		return inwardDate;
	}
	public void setInwardDate(Date inwardDate) {
		this.inwardDate = inwardDate;
	}
	public String getInvoiceNumber() {
		return invoiceNumber;
	}
	public void setInvoiceNumber(String invoiceNumber) {
		this.invoiceNumber = invoiceNumber;
	}
	public String getChallanNumber() {
		return challanNumber;
	}
	public void setChallanNumber(String challanNumber) {
		this.challanNumber = challanNumber;
	}
	public Date getDocDate() {
		return docDate;
	}
	public void setDocDate(Date docDate) {
		this.docDate = docDate;
	}
	public String getRemarks() {
		return remarks;
	}
	public void setRemarks(String remarks) {
		this.remarks = remarks;
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
	public double getNetPrice() {
		return netPrice;
	}
	public void setNetPrice(double netPrice) {
		this.netPrice = netPrice;
	}
	public String getCurrency() {
		return currency;
	}
	public void setCurrency(String currency) {
		this.currency = currency;
	}
	public long getPurchaseOrderItemId() {
		return purchaseOrderItemId;
	}
	public void setPurchaseOrderItemId(long purchaseOrderItemId) {
		this.purchaseOrderItemId = purchaseOrderItemId;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getBoe() {
		return boe;
	}
	public void setBoe(String boe) {
		this.boe = boe;
	}
	public String getCourier() {
		return courier;
	}
	public void setCourier(String courier) {
		this.courier = courier;
	}
	public String getDocketNo() {
		return docketNo;
	}
	public void setDocketNo(String docketNo) {
		this.docketNo = docketNo;
	}
	public String getSapGrnNo() {
		return sapGrnNo;
	}
	public void setSapGrnNo(String sapGrnNo) {
		this.sapGrnNo = sapGrnNo;
	}
	public Date getSapGrnDate() {
		return sapGrnDate;
	}
	public void setSapGrnDate(Date sapGrnDate) {
		this.sapGrnDate = sapGrnDate;
	}
	public String getDelayDays() {
		return delayDays;
	}
	public void setDelayDays(String delayDays) {
		this.delayDays = delayDays;
	}
	public String getResPerson() {
		return resPerson;
	}
	public void setResPerson(String resPerson) {
		this.resPerson = resPerson;
	}
	public String getDelayPerc() {
		return delayPerc;
	}
	public void setDelayPerc(String delayPerc) {
		this.delayPerc = delayPerc;
	}
	public String getAccDocHandover() {
		return accDocHandover;
	}
	public void setAccDocHandover(String accDocHandover) {
		this.accDocHandover = accDocHandover;
	}
	public Date getHandoverDate() {
		return handoverDate;
	}
	public void setHandoverDate(Date handoverDate) {
		this.handoverDate = handoverDate;
	}
	public String getVehicleNo() {
		return vehicleNo;
	}
	public void setVehicleNo(String vehicleNo) {
		this.vehicleNo = vehicleNo;
	}
	public String getVehicleStatus() {
		return vehicleStatus;
	}
	public void setVehicleStatus(String vehicleStatus) {
		this.vehicleStatus = vehicleStatus;
	}
	public String getUnloadType() {
		return unloadType;
	}
	public void setUnloadType(String unloadType) {
		this.unloadType = unloadType;
	}
	public String getPackingType() {
		return packingType;
	}
	public void setPackingType(String packingType) {
		this.packingType = packingType;
	}
	
	
}
