package com.a2mee.model.dto;

import java.util.List;

public class PickStockMultipleDto {

	private List<PickStockDto> pickStockDtos;
	private double totalQty;
	private long stockInId;
	private String storageBinCode;
	public List<PickStockDto> getPickStockDtos() {
		return pickStockDtos;
	}
	public void setPickStockDtos(List<PickStockDto> pickStockDtos) {
		this.pickStockDtos = pickStockDtos;
	}
	public double getTotalQty() {
		return totalQty;
	}
	public void setTotalQty(double totalQty) {
		this.totalQty = totalQty;
	}
	public long getStockInId() {
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
	}
	@Override
	public String toString() {
		return "PickStockMultipleDto [pickStockDtos=" + pickStockDtos + ", totalQty=" + totalQty + ", stockInId="
				+ stockInId + ", storageBinCode=" + storageBinCode + "]";
	}
	
	
}
