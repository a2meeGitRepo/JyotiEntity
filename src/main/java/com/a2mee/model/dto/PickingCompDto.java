package com.a2mee.model.dto;

public class PickingCompDto {

	private Long pickingCompId;
	private String modelCode;
	private String proOrdNo;
	private double pickCompQty;
	private int status;
	
	public Long getPickingCompId() {
		return pickingCompId;
	}
	public void setPickingCompId(Long pickingCompId) {
		this.pickingCompId = pickingCompId;
	}
	public String getModelCode() {
		return modelCode;
	}
	public void setModelCode(String modelCode) {
		this.modelCode = modelCode;
	}
	public String getProOrdNo() {
		return proOrdNo;
	}
	public void setProOrdNo(String proOrdNo) {
		this.proOrdNo = proOrdNo;
	}
	
	
	public double getPickCompQty() {
		return pickCompQty;
	}
	public void setPickCompQty(double pickCompQty) {
		this.pickCompQty = pickCompQty;
	}
	public int getStatus() {
		return status;
	}
	public void setStatus(int status) {
		this.status = status;
	}
	
	
}
