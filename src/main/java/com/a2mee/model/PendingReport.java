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
@Table(name="pending_report")
public class PendingReport {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "pending_report_id")
	private long pendingReportId;
	
	
	@Column(name = "assign_date")
	private Date assignDate;
	
	@Column(name = "model_code")
	private String modelCode;
	
	@Column(name = "picker")
	private String picker;
	
	@Column(name = "pro_ord_no")
	private String proOrdNo;
	
	@Column(name="priority_order")
	private String priorityOrder;
	
	@Column(name = "comp_code")
	private String compCode;
	
	@Column(name = "comp_desc")
	private String compDesc;
	
	@Column(name = "pick_comp_qty")
	private double pickCompQty;
	
	@Column(name = "uom")
	private String uom;
	
	@Column(name = "mtl_group")
	private String mtlGroup;
	
	@Column(name = "indicator")
	private String indicator;
	
	@Column(name = "status")
	private String status;
	
	
	@Column(name = "stock_qty")
	private double stockQty;
	
	@Column(name = "report_date")
	private Date reportDate;
	
	@Column(name = "order_start_date")
	private Date orderStartDate;

	@Column(name = "assembly_mat_stage_priority")
	private String assemblyMatStagePriority;
	
	
	@Column(name="material_source")
	private String materialSource;
	
	
	@Column(name = "mat_master_log")
	private String matMasterLog;
	
	public String getMatMasterLog() {
		return matMasterLog;
	}

	public void setMatMasterLog(String matMasterLog) {
		this.matMasterLog = matMasterLog;
	}



	public Supplier getSupplier() {
		return supplier;
	}

	public void setSupplier(Supplier supplier) {
		this.supplier = supplier;
	}

	public double getUnitPrice() {
		return unitPrice;
	}

	public void setUnitPrice(double unitPrice) {
		this.unitPrice = unitPrice;
	}

	public String getTotalPrice() {
		return totalPrice;
	}

	public void setTotalPrice(String totalPrice) {
		this.totalPrice = totalPrice;
	}

	public String getScmMode() {
		return scmMode;
	}

	public void setScmMode(String scmMode) {
		this.scmMode = scmMode;
	}

	public String getDerivedPaymentPriority() {
		return derivedPaymentPriority;
	}

	public void setDerivedPaymentPriority(String derivedPaymentPriority) {
		this.derivedPaymentPriority = derivedPaymentPriority;
	}

	public String getPaymentType() {
		return paymentType;
	}

	public void setPaymentType(String paymentType) {
		this.paymentType = paymentType;
	}

	public String getDerivedPaymentPriorityWrtType() {
		return derivedPaymentPriorityWrtType;
	}

	public void setDerivedPaymentPriorityWrtType(String derivedPaymentPriorityWrtType) {
		this.derivedPaymentPriorityWrtType = derivedPaymentPriorityWrtType;
	}

	public String getDerivedPaymentPriorityWrtTypeReqDate() {
		return derivedPaymentPriorityWrtTypeReqDate;
	}

	public void setDerivedPaymentPriorityWrtTypeReqDate(String derivedPaymentPriorityWrtTypeReqDate) {
		this.derivedPaymentPriorityWrtTypeReqDate = derivedPaymentPriorityWrtTypeReqDate;
	}

	public Date getPaymentDoneDate() {
		return paymentDoneDate;
	}

	public void setPaymentDoneDate(Date paymentDoneDate) {
		this.paymentDoneDate = paymentDoneDate;
	}

	@ManyToOne
	@JoinColumn(name="supplier_id")
	private Supplier supplier;
	
	
	@Column(name = "unit_price")
	private double unitPrice;
	
	@Column(name = "total_price")
	private String totalPrice;
	
	
	@Column(name = "scm_mode")
	private String scmMode;
	
	@Column(name = "derived_payment_priority")
	private String derivedPaymentPriority;
	
	
	@Column(name = "payment_type")
	private String paymentType;
	
	@Column(name = "derived_payment_priority_wrt_type")
	private String derivedPaymentPriorityWrtType;
	
	
	@Column(name = "derived_payment_priority_wrt_type_req_date")
	private String derivedPaymentPriorityWrtTypeReqDate;
	

	@Column(name = "payment_done_date")
	private Date paymentDoneDate;
	
	
	
	
	

	public String getMaterialSource() {
		return materialSource;
	}

	public void setMaterialSource(String materialSource) {
		this.materialSource = materialSource;
	}

	public String getAssemblyMatStagePriority() {
		return assemblyMatStagePriority;
	}

	public void setAssemblyMatStagePriority(String assemblyMatStagePriority) {
		this.assemblyMatStagePriority = assemblyMatStagePriority;
	}

	public Date getOrderStartDate() {
		return orderStartDate;
	}

	public void setOrderStartDate(Date orderStartDate) {
		this.orderStartDate = orderStartDate;
	}

	public long getPendingReportId() {
		return pendingReportId;
	}

	public void setPendingReportId(long pendingReportId) {
		this.pendingReportId = pendingReportId;
	}

	public Date getAssignDate() {
		return assignDate;
	}

	public void setAssignDate(Date assignDate) {
		this.assignDate = assignDate;
	}

	public String getModelCode() {
		return modelCode;
	}

	public void setModelCode(String modelCode) {
		this.modelCode = modelCode;
	}

	public String getPicker() {
		return picker;
	}

	public void setPicker(String picker) {
		this.picker = picker;
	}

	public String getProOrdNo() {
		return proOrdNo;
	}

	public void setProOrdNo(String proOrdNo) {
		this.proOrdNo = proOrdNo;
	}

	public String getCompCode() {
		return compCode;
	}

	public void setCompCode(String compCode) {
		this.compCode = compCode;
	}

	public String getCompDesc() {
		return compDesc;
	}

	public void setCompDesc(String compDesc) {
		this.compDesc = compDesc;
	}

	public double getPickCompQty() {
		return pickCompQty;
	}

	public void setPickCompQty(double pickCompQty) {
		this.pickCompQty = pickCompQty;
	}

	public String getUom() {
		return uom;
	}

	public void setUom(String uom) {
		this.uom = uom;
	}

	public String getMtlGroup() {
		return mtlGroup;
	}

	public void setMtlGroup(String mtlGroup) {
		this.mtlGroup = mtlGroup;
	}

	public String getIndicator() {
		return indicator;
	}

	public void setIndicator(String indicator) {
		this.indicator = indicator;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public double getStockQty() {
		return stockQty;
	}

	public void setStockQty(double stockQty) {
		this.stockQty = stockQty;
	}

	public Date getReportDate() {
		return reportDate;
	}

	public void setReportDate(Date reportDate) {
		this.reportDate = reportDate;
	}

	public String getPriorityOrder() {
		return priorityOrder;
	}

	public void setPriorityOrder(String priorityOrder) {
		this.priorityOrder = priorityOrder;
	}
	
	
	
	
	
}
