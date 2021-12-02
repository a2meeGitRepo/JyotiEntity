package com.a2mee.model.dto;

import java.util.Date;

public class GrnDto {
	
	private long grnId;
	private long grnNo;
	private long grnItmLotID;
	private String itemDtils;
	private String venName;
	private String itemLotNo;
	private double batchQty;
	private String barcode;
	private String grnBy;
	private Date inwardDate;
	private String invoiceNumber;
	private String challanNumber;
	private Date docDate;
	private String remarks;
	private Date errorSolveDate;
	private String inwardTime;
	private String grnStatus;
	private Date grnEntryDate;
	private double itemTolRecd;
	private String itemMstId;
	private long purchaseOrderNo;
	
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
	private long boxQty;
	
	private long grnItemId;
	
	public String getBarcode() {
		return barcode;
	}
	
	public long getGrnNo() {
		return grnNo;
	}	

	public Date getGrnEntryDate() {
		return grnEntryDate;
	}

	public void setGrnEntryDate(Date grnEntryDate) {
		this.grnEntryDate = grnEntryDate;
	}

	public void setGrnNo(long grnNo) {
		this.grnNo = grnNo;
	}

	public void setBarcode(String barcode) {
		this.barcode = barcode;
	}
	public long getGrnId() {
		return grnId;
	}
	public void setGrnId(long grnId) {
		this.grnId = grnId;
	}
	
	public long getGrnItmLotID() {
		return grnItmLotID;
	}
	public void setGrnItmLotID(long grnItmLotID) {
		this.grnItmLotID = grnItmLotID;
	}
	public String getItemDtils() {
		return itemDtils;
	}
	public void setItemDtils(String itemDtils) {
		this.itemDtils = itemDtils;
	}
	public String getVenName() {
		return venName;
	}
	public void setVenName(String venName) {
		this.venName = venName;
	}
	public String getItemLotNo() {
		return itemLotNo;
	}
	public void setItemLotNo(String itemLotNo) {
		this.itemLotNo = itemLotNo;
	}
	public double getBatchQty() {
		return batchQty;
	}
	public void setBatchQty(double batchQty) {
		this.batchQty = batchQty;
	}
	public String getGrnBy() {
		return grnBy;
	}
	public void setGrnBy(String grnBy) {
		this.grnBy = grnBy;
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
		
	public Date getErrorSolveDate() {
		return errorSolveDate;
	}
	public void setErrorSolveDate(Date errorSolveDate) {
		this.errorSolveDate = errorSolveDate;
	}
	public String getInwardTime() {
		return inwardTime;
	}
	public void setInwardTime(String inwardTime) {
		this.inwardTime = inwardTime;
	}
	public String getGrnStatus() {
		return grnStatus;
	}
	public void setGrnStatus(String grnStatus) {
		this.grnStatus = grnStatus;
	}

	public double getItemTolRecd() {
		return itemTolRecd;
	}

	public void setItemTolRecd(double itemTolRecd) {
		this.itemTolRecd = itemTolRecd;
	}

	public String getItemMstId() {
		return itemMstId;
	}

	public void setItemMstId(String itemMstId) {
		this.itemMstId = itemMstId;
	}

	public long getPurchaseOrderNo() {
		return purchaseOrderNo;
	}

	public void setPurchaseOrderNo(long purchaseOrderNo) {
		this.purchaseOrderNo = purchaseOrderNo;
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

	public long getGrnItemId() {
		return grnItemId;
	}

	public void setGrnItemId(long grnItemId) {
		this.grnItemId = grnItemId;
	}

	public long getBoxQty() {
		return boxQty;
	}

	public void setBoxQty(long boxQty) {
		this.boxQty = boxQty;
	}
	
	
	
}
