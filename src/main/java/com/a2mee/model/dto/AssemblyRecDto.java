package com.a2mee.model.dto;

import java.util.Date;

import javax.persistence.Column;

import com.a2mee.model.ModelMst;
import com.a2mee.model.ProductionOrder;

public class AssemblyRecDto {

	private long proOrderNo;
	private String assemblyCode;
	private String assemblyDesc;
	private double assemblyQty;
	private String uom;	
	private ModelMst model;
	private String requestedBy;	
	private String requestDateTime;
	private Date requiredDate;
	private String status;
	private String remark;
	
	public long getProOrderNo() {
		return proOrderNo;
	}
	public void setProOrderNo(long proOrderNo) {
		this.proOrderNo = proOrderNo;
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
	public ModelMst getModel() {
		return model;
	}
	public void setModel(ModelMst model) {
		this.model = model;
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
	public String getRemark() {
		return remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}
	
	@Override
	public String toString() {
		return "AssemblyRecDto [proOrderNo=" + proOrderNo + ", assemblyCode=" + assemblyCode + ", assemblyDesc="
				+ assemblyDesc + ", assemblyQty=" + assemblyQty + ", uom=" + uom + ", model=" + model + ", requestedBy="
				+ requestedBy + ", requestDateTime=" + requestDateTime + ", requiredDate=" + requiredDate + ", status="
				+ status + ", remark=" + remark + "]";
	}	
}
