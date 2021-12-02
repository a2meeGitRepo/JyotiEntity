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

import com.fasterxml.jackson.annotation.JsonFormat;

@Entity
@Table(name ="purchase_order")
public class PurchaseOrder {
	
	@Id
	@Column(name="purchase_order_no")
	private long purchaseOrderNo;
	
	@Column(name = "ven_name")
	private String venName;
	
	@Column(name = "purchase_order_status")
	private String purchaseOrderStatus;
	
	@Column(name = "doc_condition_no")
	private String docConditionNo;
	
	@Column(name = "purchase_owner")
	private String purchaseOwner;	
	
	@Column(name = "delivery_date")
	private String deliveryDate;
	
	@Column(name = "create_on")
	private String createOn;
	
	@ManyToOne
	@JoinColumn(name="ven_mst_id")
	VendorMst vendorMst;

	public long getPurchaseOrderNo() {
		return purchaseOrderNo;
	}

	public void setPurchaseOrderNo(long purchaseOrderNo) {
		this.purchaseOrderNo = purchaseOrderNo;
	}

	public String getVenName() {
		return venName;
	}

	public void setVenName(String venName) {
		this.venName = venName;
	}

	public String getPurchaseOrderStatus() {
		return purchaseOrderStatus;
	}

	public void setPurchaseOrderStatus(String purchaseOrderStatus) {
		this.purchaseOrderStatus = purchaseOrderStatus;
	}

	public String getDocConditionNo() {
		return docConditionNo;
	}

	public void setDocConditionNo(String docConditionNo) {
		this.docConditionNo = docConditionNo;
	}

	public String getPurchaseOwner() {
		return purchaseOwner;
	}

	public void setPurchaseOwner(String purchaseOwner) {
		this.purchaseOwner = purchaseOwner;
	}

	public String getDeliveryDate() {
		return deliveryDate;
	}

	public void setDeliveryDate(String deliveryDate) {
		this.deliveryDate = deliveryDate;
	}

	public String getCreateOn() {
		return createOn;
	}

	public void setCreateOn(String createOn) {
		this.createOn = createOn;
	}

	public VendorMst getVendorMst() {
		return vendorMst;
	}

	public void setVendorMst(VendorMst vendorMst) {
		this.vendorMst = vendorMst;
	}

	@Override
	public String toString() {
		return "PurchaseOrder [purchaseOrderNo=" + purchaseOrderNo + "]";
	}

	
}
