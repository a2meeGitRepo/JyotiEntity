package com.a2mee.model.dto;

public class PickingAssemblyDto {

	private Long pickingAssmId;
	private String assemblyCode;
	private String assemblyDesc;
	private double pickAssmQty;
	private int status;
	
	
	public Long getPickingAssmId() {
		return pickingAssmId;
	}
	public void setPickingAssmId(Long pickingAssmId) {
		this.pickingAssmId = pickingAssmId;
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
	public double getPickAssmQty() {
		return pickAssmQty;
	}
	public void setPickAssmQty(double pickAssmQty) {
		this.pickAssmQty = pickAssmQty;
	}
	public int getStatus() {
		return status;
	}
	public void setStatus(int status) {
		this.status = status;
	}
	
	
}
