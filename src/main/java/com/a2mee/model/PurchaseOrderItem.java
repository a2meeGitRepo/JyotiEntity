package com.a2mee.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "purchase_order_item")
public class PurchaseOrderItem {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="purchase_order_item_id")
	private long purchaseOrderItemId;
	
	@Column(name = "item_dtils")
	private String itemDtils;
	
	@Column(name = "item_qty")
	private double itemQty;
	
	@Column(name = "order_unit")
	private String itemMsrUnit;
	
	@Column(name = "net_price")
	private double netPrice;
	
	@Column(name = "currency")
	private String currency;
	
	@Column(name = "poi_status")
	private String poiStatus;
	
	@Column(name = "inward_date")
	private Date inwardDate;
	
	@Column(name = "invoice_number")
	private String invoiceNumber;
	
	@Column(name = "challan_number")
	private String challanNumber;
	
	@Column(name = "doc_date")
	private Date docDate;
	
	@Column(name = "remarks")
	private String remarks;
	
	@Column(name = "type")
	private String type;
	
	@Column(name = "boe")
	private String boe;
	
	@Column(name = "courier")
	private String courier;
	
	@Column(name = "docket_number")
	private String docketNo;
	
	@Column(name = "sap_grn_number")
	private String sapGrnNo;
	
	@Column(name = "sap_grn_date")
	private Date sapGrnDate;
	
	@Column(name = "delay_days")
	private String delayDays;
	
	@Column(name = "res_person")
	private String resPerson;
	
	@Column(name = "delay_perc")
	private String delayPerc;
	
	@Column(name = "acc_doc_handover")
	private String accDocHandover;
	
	@Column(name = "handover_date")
	private Date handoverDate;
	
	@Column(name = "vehicle_number")
	private String vehicleNo;
	
	@Column(name = "vehicle_status")
	private String vehicleStatus;
	
	@Column(name = "unload_type")
	private String unloadType;
	
	@Column(name = "packing_type")
	private String packingType;
	
	@Column(name = "upd_date_time")
	private Date updDateTime;
	
	@ManyToOne
	@JoinColumn(name="purchase_order_no")
	PurchaseOrder purchaseOrder;
	
	@ManyToOne
	@JoinColumn(name="item_mst_id")
	ItemMst itemMst;

	public long getPurchaseOrderItemId() {
		return purchaseOrderItemId;
	}

	public void setPurchaseOrderItemId(long purchaseOrderItemId) {
		this.purchaseOrderItemId = purchaseOrderItemId;
	}

	public String getItemDtils() {
		return itemDtils;
	}

	public void setItemDtils(String itemDtils) {
		this.itemDtils = itemDtils;
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

	public String getPoiStatus() {
		return poiStatus;
	}

	public void setPoiStatus(String poiStatus) {
		this.poiStatus = poiStatus;
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

	public PurchaseOrder getPurchaseOrder() {
		return purchaseOrder;
	}

	public void setPurchaseOrder(PurchaseOrder purchaseOrder) {
		this.purchaseOrder = purchaseOrder;
	}

	public ItemMst getItemMst() {
		return itemMst;
	}

	public void setItemMst(ItemMst itemMst) {
		this.itemMst = itemMst;
	}
	
	

	public Date getUpdDateTime() {
		return updDateTime;
	}

	public void setUpdDateTime(Date updDateTime) {
		this.updDateTime = updDateTime;
	}

	@Override
	public String toString() {
		return "PurchaseOrderItem [purchaseOrderItemId=" + purchaseOrderItemId + ", itemDtils=" + itemDtils
				+ ", itemQty=" + itemQty + ", itemMsrUnit=" + itemMsrUnit + ", netPrice=" + netPrice + ", currency="
				+ currency + ", poiStatus=" + poiStatus + ", inwardDate=" + inwardDate + ", invoiceNumber="
				+ invoiceNumber + ", challanNumber=" + challanNumber + ", docDate=" + docDate + ", remarks=" + remarks
				+ ", type=" + type + ", boe=" + boe + ", courier=" + courier + ", docketNo=" + docketNo + ", sapGrnNo="
				+ sapGrnNo + ", sapGrnDate=" + sapGrnDate + ", delayDays=" + delayDays + ", resPerson=" + resPerson
				+ ", delayPerc=" + delayPerc + ", accDocHandover=" + accDocHandover + ", handoverDate=" + handoverDate
				+ ", vehicleNo=" + vehicleNo + ", vehicleStatus=" + vehicleStatus + ", unloadType=" + unloadType
				+ ", packingType=" + packingType + ", updDateTime=" + updDateTime + ", purchaseOrder=" + purchaseOrder
				+ ", itemMst=" + itemMst + "]";
	}

	
}
