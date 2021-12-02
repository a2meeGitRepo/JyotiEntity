package com.a2mee.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

@Entity
@Table(name="production_order")
public class ProductionOrder {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="pro_ord_id")
	private long prodOrdId;
	
	@Column(name = "pro_ord_no")
	private long prodOrdNo;
	
	@Column(name="priority_order")
	private String priorityOrder;
	
	@Column(name = "sales_ord_no")
	private long salesOrdNo;
	
	@Column(name = "uid")
	private String uid;
	
	@Column(name = "model_code")
	private String modelCode;	
	
	@Column(name = "customer_name")
	private String customerName;
	
	@Column(name = "start_date_ideal")
	private Date startDateIdeal;
	
	@Column(name = "start_date_actual")
	private Date startDateActual;
	
	@Column(name = "machine_end_date")
	private Date machineEndDate;
	
	@Column(name = "dispatch_date")
	private Date dispatchDate;
	
	@Column(name = "header")
	private String header;
	
	@Column(name = "oct")
	private String oct;
	
	@Column(name = "finix_id")
	private long finixId;
	
	@Column(name = "ctrl")
	private String ctrl;
	
	@Column(name = "branch")
	private String branch;
	
	@Column(name = "payment_status")
	private String paymentStatus;
	
	@Column(name = "on_floor_status")
	private String onFloorStatus;
	
	@Column(name = "is_approved")
	private int isApproved;
	@Column(name = "active")
	private int active;
	
	public int getActive() {
		return active;
	}

	public void setActive(int active) {
		this.active = active;
	}

	@Transient
	private String flag;

	public long getProdOrdId() {
		return prodOrdId;
	}

	public void setProdOrdId(long prodOrdId) {
		this.prodOrdId = prodOrdId;
	}

	public long getProdOrdNo() {
		return prodOrdNo;
	}

	public void setProdOrdNo(long prodOrdNo) {
		this.prodOrdNo = prodOrdNo;
	}

	public long getSalesOrdNo() {
		return salesOrdNo;
	}

	public void setSalesOrdNo(long salesOrdNo) {
		this.salesOrdNo = salesOrdNo;
	}

	public String getUid() {
		return uid;
	}

	public void setUid(String uid) {
		this.uid = uid;
	}

	public String getModelCode() {
		return modelCode;
	}

	public void setModelCode(String modelCode) {
		this.modelCode = modelCode;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public Date getStartDateIdeal() {
		return startDateIdeal;
	}

	public void setStartDateIdeal(Date startDateIdeal) {
		this.startDateIdeal = startDateIdeal;
	}

	public Date getStartDateActual() {
		return startDateActual;
	}

	public void setStartDateActual(Date startDateActual) {
		this.startDateActual = startDateActual;
	}

	public Date getMachineEndDate() {
		return machineEndDate;
	}

	public void setMachineEndDate(Date machineEndDate) {
		this.machineEndDate = machineEndDate;
	}

	public Date getDispatchDate() {
		return dispatchDate;
	}

	public void setDispatchDate(Date dispatchDate) {
		this.dispatchDate = dispatchDate;
	}

	public String getHeader() {
		return header;
	}

	public void setHeader(String header) {
		this.header = header;
	}

	public String getOct() {
		return oct;
	}

	public void setOct(String oct) {
		this.oct = oct;
	}

	public long getFinixId() {
		return finixId;
	}

	public void setFinixId(long finixId) {
		this.finixId = finixId;
	}

	public String getCtrl() {
		return ctrl;
	}

	public void setCtrl(String ctrl) {
		this.ctrl = ctrl;
	}

	public String getBranch() {
		return branch;
	}

	public void setBranch(String branch) {
		this.branch = branch;
	}

	public String getPaymentStatus() {
		return paymentStatus;
	}

	public void setPaymentStatus(String paymentStatus) {
		this.paymentStatus = paymentStatus;
	}

	public String getOnFloorStatus() {
		return onFloorStatus;
	}

	public void setOnFloorStatus(String onFloorStatus) {
		this.onFloorStatus = onFloorStatus;
	}	

	public String getFlag() {
		return flag;
	}

	public void setFlag(String flag) {
		this.flag = flag;
	}	

	public int getIsApproved() {
		return isApproved;
	}

	public void setIsApproved(int isApproved) {
		this.isApproved = isApproved;
	}

	public String getPriorityOrder() {
		return priorityOrder;
	}

	public void setPriorityOrder(String priorityOrder) {
		this.priorityOrder = priorityOrder;
	}

	
	
}
