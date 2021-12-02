package com.a2mee.model.dto;

public class PurchaseOrderCsvDto {

	private String plant;
	private long purchaseOrder;
	private String item;
	private String created_on;
	private double order_qty;
	private double open_qty;
	private String vendorCode;
	private String vendorName;
	private String purchaseOrg;
	private String purchasingGrp;
	private String company;
	private String materialCode;
	private String materialDesc;
	private String deliveryDate;
	private double netPrice;
	private String currency;
	private String order_unit;
	private String doc_condition_no;
	public String getPlant() {
		
		return plant;
	}
	public void setPlant(String plant) {
		this.plant = plant;
	}
	
	public long getPurchaseOrder() {
		return purchaseOrder;
	}
	public void setPurchaseOrder(long purchaseOrder) {
		this.purchaseOrder = purchaseOrder;
	}
	public String getItem() {
		return item;
	}
	public void setItem(String item) {
		this.item = item;
	}
	public String getCreated_on() {
		return created_on;
	}
	public void setCreated_on(String created_on) {
		this.created_on = created_on;
	}
	
	public double getOrder_qty() {
		return order_qty;
	}
	public void setOrder_qty(double order_qty) {
		this.order_qty = order_qty;
	}
	public double getOpen_qty() {
		return open_qty;
	}
	public void setOpen_qty(double open_qty) {
		this.open_qty = open_qty;
	}
	public String getVendorCode() {
		return vendorCode;
	}
	public void setVendorCode(String vendorCode) {
		this.vendorCode = vendorCode;
	}
	public String getVendorName() {
		return vendorName;
	}
	public void setVendorName(String vendorName) {
		this.vendorName = vendorName;
	}
	public String getPurchaseOrg() {
		return purchaseOrg;
	}
	public void setPurchaseOrg(String purchaseOrg) {
		this.purchaseOrg = purchaseOrg;
	}
	public String getPurchasingGrp() {
		return purchasingGrp;
	}
	public void setPurchasingGrp(String purchasingGrp) {
		this.purchasingGrp = purchasingGrp;
	}
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	public String getMaterialCode() {
		return materialCode;
	}
	public void setMaterialCode(String materialCode) {
		this.materialCode = materialCode;
	}
	public String getMaterialDesc() {
		return materialDesc;
	}
	public void setMaterialDesc(String materialDesc) {
		this.materialDesc = materialDesc;
	}
	public String getDeliveryDate() {
		return deliveryDate;
	}
	public void setDeliveryDate(String deliveryDate) {
		this.deliveryDate = deliveryDate;
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
	public String getOrder_unit() {
		return order_unit;
	}
	public void setOrder_unit(String order_unit) {
		this.order_unit = order_unit;
	}
	public String getDoc_condition_no() {
		return doc_condition_no;
	}
	public void setDoc_condition_no(String doc_condition_no) {
		this.doc_condition_no = doc_condition_no;
	}
	
	
}
