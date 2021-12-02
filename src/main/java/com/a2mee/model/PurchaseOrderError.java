package com.a2mee.model;

import java.time.LocalDate;
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
@Table(name="purchase_order_errors")
public class PurchaseOrderError {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="id")
	private int id;
	
	@Column(name="purchase_order_no")
	private long purchaseOrderNo;	

	@Column(name="purchase_order_item_id")
	private long purchaseOrderItemId;
	
	@ManyToOne
	@JoinColumn(name="error_id")
	private ErrorMst errorMst;
	
	@Column(name="date")
	private Date date;
	
	@Column(name="deletes")
	private int deletes;
	
	@Column(name="status")
	private String status;

	public PurchaseOrderError() {
		
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	public long getPurchaseOrderNo() {
		return purchaseOrderNo;
	}

	public void setPurchaseOrderNo(long purchaseOrderNo) {
		this.purchaseOrderNo = purchaseOrderNo;
	}
	
	public long getPurchaseOrderItemId() {
		return purchaseOrderItemId;
	}

	public void setPurchaseOrderItemId(long purchaseOrderItemId) {
		this.purchaseOrderItemId = purchaseOrderItemId;
	}

	public ErrorMst getErrorMst() {
		return errorMst;
	}

	public void setErrorMst(ErrorMst errorMst) {
		this.errorMst = errorMst;
	}	

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}
	

	public int getDeletes() {
		return deletes;
	}

	public void setDeletes(int deletes) {
		this.deletes = deletes;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	@Override
	public String toString() {
		return "PurchaseOrderError [id=" + id + ", purchaseOrderNo=" + purchaseOrderNo + ", purchaseOrderItemId="
				+ purchaseOrderItemId + ", errorMst=" + errorMst + ", date=" + date + ", deletes=" + deletes
				+ ", status=" + status + "]";
	}
	
	
	
}
