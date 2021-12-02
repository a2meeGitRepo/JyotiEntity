package com.a2mee.model.dto;

import java.util.List;

public class PickStockDto {
	private Long pickingCompId;
	private String compCode;
	private String assemblyCode;
	private double pickCompQty;
//	private long stockInId;
//	private String storageBinCode;

	

	public String getAssemblyCode() {
		return assemblyCode;
	}
	
	public void setAssemblyCode(String assemblyCode) {
		this.assemblyCode = assemblyCode;
	}
	
	/*public long getStockInId() {
		return stockInId;
	}
	public void setStockInId(long stockInId) {
		this.stockInId = stockInId;
	}
	public String getStorageBinCode() {
		return storageBinCode;
	}
	public void setStorageBinCode(String storageBinCode) {
		this.storageBinCode = storageBinCode;
	}*/
	public String getCompCode() {
		return compCode;
	}
	public void setCompCode(String compCode) {
		this.compCode = compCode;
	}

	public Long getPickingCompId() {
		return pickingCompId;
	}

	public void setPickingCompId(Long pickingCompId) {
		this.pickingCompId = pickingCompId;
	}

	public double getPickCompQty() {
		return pickCompQty;
	}

	public void setPickCompQty(double pickCompQty) {
		this.pickCompQty = pickCompQty;
	}

	@Override
	public String toString() {
		return "PickStockDto [pickingCompId=" + pickingCompId + ", compCode=" + compCode + ", assemblyCode="
				+ assemblyCode + ", pickCompQty=" + pickCompQty + "]";
	}
	
	
	
	

	
	
	
}
