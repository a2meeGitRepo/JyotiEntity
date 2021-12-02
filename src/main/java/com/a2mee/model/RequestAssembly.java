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
@Table(name="request_assembly")
public class RequestAssembly {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="req_assm_id")
	private Long reqAssmId;

	@Column(name="assembly_code")
	private String assemblyCode;
	
	@Column(name="assembly_desc")
	private String assemblyDesc;
	
	@Column(name="qty")
	private double assemblyQty;
	
	@Column(name="uom")
	private String uom;
	
	@Column(name="requested_by")
	private String requestedBy;
	
	@Column(name="request_datetime")
	private String requestDateTime;
	
	@Column(name="required_date")
	private Date requiredDate;
	
	@Column(name="status")
	private String status;
	
	@Column(name="remark")
	private String remark;
	
	@ManyToOne
	@JoinColumn(name="model_id")
	private ModelMst model;	
	
	@ManyToOne
	@JoinColumn(name="pro_ord_id")
	private ProductionOrder productionOrder;

	public Long getReqAssmId() {
		return reqAssmId;
	}

	public void setReqAssmId(Long reqAssmId) {
		this.reqAssmId = reqAssmId;
	}

	public String getAssemblyCode() {
		return assemblyCode;
	}

	public void setAssemblyCode(String assemblyCode) {
		this.assemblyCode = assemblyCode;
	}

	public String getAssemblyDesc() {
		return assemblyDesc;
	}

	public void setAssemblyDesc(String assemblyDesc) {
		this.assemblyDesc = assemblyDesc;
	}

	public double getAssemblyQty() {
		return assemblyQty;
	}

	public void setAssemblyQty(double assemblyQty) {
		this.assemblyQty = assemblyQty;
	}

	public String getUom() {
		return uom;
	}

	public void setUom(String uom) {
		this.uom = uom;
	}

	public String getRequestedBy() {
		return requestedBy;
	}

	public void setRequestedBy(String requestedBy) {
		this.requestedBy = requestedBy;
	}

	public String getRequestDateTime() {
		return requestDateTime;
	}

	public void setRequestDateTime(String requestDateTime) {
		this.requestDateTime = requestDateTime;
	}

	public Date getRequiredDate() {
		return requiredDate;
	}

	public void setRequiredDate(Date requiredDate) {
		this.requiredDate = requiredDate;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public ModelMst getModel() {
		return model;
	}

	public void setModel(ModelMst model) {
		this.model = model;
	}

	public ProductionOrder getProductionOrder() {
		return productionOrder;
	}

	public void setProductionOrder(ProductionOrder productionOrder) {
		this.productionOrder = productionOrder;
	}	

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	@Override
	public String toString() {
		return "RequestAssembly [reqAssmId=" + reqAssmId + ", assemblyCode=" + assemblyCode + ", assemblyDesc="
				+ assemblyDesc + ", assemblyQty=" + assemblyQty + ", uom=" + uom + ", requestedBy=" + requestedBy
				+ ", requestDateTime=" + requestDateTime + ", requiredDate=" + requiredDate + ", status=" + status
				+ ", remark=" + remark + ", model=" + model + ", productionOrder=" + productionOrder + "]";
	}
	
	
}
