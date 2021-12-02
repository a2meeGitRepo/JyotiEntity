package com.a2mee.model.dto;

import java.util.Date;

public class PendingDto {

	private Date assignDate;
	private String modelCode;
	private String picker;
	private String proOrdNo;
	private String compCode;
	private String compDesc;
	private double pickCompQty;
	private String uom;
	private String mtlGroup;
	private String indicator;
	private String status;
	private double stockQty;
	
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
	
	
	
}
