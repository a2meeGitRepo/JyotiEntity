package com.a2mee.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "grn_item")
public class GrnItem {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="grn_item_id")
	private long grnItemId;
	
	@Column(name = "item_dtils")
	private String itemDtils;
	
	@Column(name = "item_qty")
	private double itemQty;
	
	@Column(name = "item_msr_unit")
	private String itemMsrUnit;
	
	@Column(name = "item_tol_recd")
	private double itemTolRecd;
	
	@Column(name = "item_status")
	private char itemStatus;
	
	@Column(name = "net_price")
	private long netPrice;
	
	@Column(name = "currency")
	private String currency;
	
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
	
	@OneToMany(cascade=CascadeType.ALL)
	@JoinColumn(name="grn_item_id")
	List<GrnItemLot> grnItemLots;
	
	@ManyToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="grn_id")
	GRN grn;
	
	@ManyToOne
	@JoinColumn(name="item_mst_id")
	ItemMst itemMst;
	
//	@ManyToOne
//	@JoinColumn(name="whs_id")
//	WhsMst whsMst;
	
	public void addGrnItemLot(GrnItemLot tempGrnItemLot) {
		if (grnItemLots == null) {
			grnItemLots = new ArrayList<>();
		}
		grnItemLots.add(tempGrnItemLot);
	}

	public long getGrnItemId() {
		return grnItemId;
	}

	public void setGrnItemId(long grnItemId) {
		this.grnItemId = grnItemId;
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

	public double getItemTolRecd() {
		return itemTolRecd;
	}

	public void setItemTolRecd(double itemTolRecd) {
		this.itemTolRecd = itemTolRecd;
	}

	public char getItemStatus() {
		return itemStatus;
	}

	public void setItemStatus(char itemStatus) {
		this.itemStatus = itemStatus;
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

	public List<GrnItemLot> getGrnItemLots() {
		return grnItemLots;
	}

	public void setGrnItemLots(List<GrnItemLot> grnItemLots) {
		this.grnItemLots = grnItemLots;
	}

	public GRN getGrn() {
		return grn;
	}

	public void setGrn(GRN grn) {
		this.grn = grn;
	}

	public ItemMst getItemMst() {
		return itemMst;
	}

	public void setItemMst(ItemMst itemMst) {
		this.itemMst = itemMst;
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

	@Override
	public String toString() {
		return "GrnItem [grnItemId=" + grnItemId + ", itemDtils=" + itemDtils + ", itemQty=" + itemQty
				+ ", itemMsrUnit=" + itemMsrUnit + ", itemTolRecd=" + itemTolRecd + ", itemStatus=" + itemStatus
				+ ", netPrice=" + netPrice + ", currency=" + currency + ", inwardDate=" + inwardDate
				+ ", invoiceNumber=" + invoiceNumber + ", challanNumber=" + challanNumber + ", docDate=" + docDate
				+ ", remarks=" + remarks + ", type=" + type + ", boe=" + boe + ", courier=" + courier + ", docketNo="
				+ docketNo + ", sapGrnNo=" + sapGrnNo + ", sapGrnDate=" + sapGrnDate + ", delayDays=" + delayDays
				+ ", resPerson=" + resPerson + ", delayPerc=" + delayPerc + ", accDocHandover=" + accDocHandover
				+ ", handoverDate=" + handoverDate + ", vehicleNo=" + vehicleNo + ", vehicleStatus=" + vehicleStatus
				+ ", unloadType=" + unloadType + ", packingType=" + packingType + ", grnItemLots=" + grnItemLots
				+ ", grn=" + grn + ", itemMst=" + itemMst + "]";
	}

	
//	public WhsMst getWhsMst() {
//		return whsMst;
//	}
//
//	public void setWhsMst(WhsMst whsMst) {
//		this.whsMst = whsMst;
//	}

	
}
