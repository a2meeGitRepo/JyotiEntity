package com.a2mee.model.dto;

public class ModelPoDto {

	private long modelPlanId;
	private String modelCode;
	private String prodOrdNo;
	private int status;
	public long getModelPlanId() {
		return modelPlanId;
	}
	public void setModelPlanId(long modelPlanId) {
		this.modelPlanId = modelPlanId;
	}
	public String getModelCode() {
		return modelCode;
	}
	public void setModelCode(String modelCode) {
		this.modelCode = modelCode;
	}
	public String getProdOrdNo() {
		return prodOrdNo;
	}
	public void setProdOrdNo(String prodOrdNo) {
		this.prodOrdNo = prodOrdNo;
	}
	
	public int getStatus() {
		return status;
	}
	public void setStatus(int status) {
		this.status = status;
	}
	@Override
	public String toString() {
		return "ModelPoDto [modelPlanId=" + modelPlanId + ", modelCode=" + modelCode + ", prodOrdNo=" + prodOrdNo
				+ ", getModelPlanId()=" + getModelPlanId() + ", getModelCode()=" + getModelCode() + ", getProdOrdNo()="
				+ getProdOrdNo() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()="
				+ super.toString() + "]";
	}
	
	
	
}
