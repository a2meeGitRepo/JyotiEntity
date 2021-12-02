package com.a2mee.model.dto;

import java.util.List;

public class PickingComponentDto {

	private Long pickingCompId;
	private String compCode;
	private String compDesc;
	private String assemblyCode;
	private String assemblyDesc;
	private double pickCompQty;
	private double pickedQty;
	private double availableQty;
	private int status;
	//private List<String> locations;
	private String location ;
	
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public Long getPickingCompId() {
		return pickingCompId;
	}
	public void setPickingCompId(Long pickingCompId) {
		this.pickingCompId = pickingCompId;
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
	public String getAssemblyCode() {
		return assemblyCode;
	}
	public void setAssemblyCode(String assemblyCode) {
		this.assemblyCode = assemblyCode;
	}
	public double getPickCompQty() {
		return pickCompQty;
	}
	
	public double getPickedQty() {
		return pickedQty;
	}
	public void setPickedQty(double pickedQty) {
		this.pickedQty = pickedQty;
	}
	public void setPickCompQty(double pickCompQty) {
		this.pickCompQty = pickCompQty;
	}
	
	public double getAvailableQty() {
		return availableQty;
	}
	public void setAvailableQty(double availableQty) {
		this.availableQty = availableQty;
	}
	public int getStatus() {
		return status;
	}
	public void setStatus(int status) {
		this.status = status;
	}
	/*public List<String> getLocations() {
		return locations;
	}
	public void setLocations(List<String> locations) {
		this.locations = locations;
	}
	
	
	
	*/
	public String getAssemblyDesc() {
		return assemblyDesc;
	}
	public void setAssemblyDesc(String assemblyDesc) {
		this.assemblyDesc = assemblyDesc;
	}
}
