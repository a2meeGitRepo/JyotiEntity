package com.a2mee.model.dto;

public class StockListDto {

	private String plantCode;
	private String storeLoc;
	private String itemId;
	private String itemDtl;
	private String storageBins;
	private double approQty;
	private double holdQty;
	private double rejQty;
	
	public String getPlantCode() {
		return plantCode;
	}
	public void setPlantCode(String plantCode) {
		this.plantCode = plantCode;
	}
	public String getStoreLoc() {
		return storeLoc;
	}
	public void setStoreLoc(String storeLoc) {
		this.storeLoc = storeLoc;
	}
	public String getItemId() {
		return itemId;
	}
	public void setItemId(String itemId) {
		this.itemId = itemId;
	}
	public String getItemDtl() {
		return itemDtl;
	}
	public void setItemDtl(String itemDtl) {
		this.itemDtl = itemDtl;
	}
	public String getStorageBins() {
		return storageBins;
	}
	public void setStorageBins(String storageBins) {
		this.storageBins = storageBins;
	}
	public double getApproQty() {
		return approQty;
	}
	public void setApproQty(double approQty) {
		this.approQty = approQty;
	}
	public double getHoldQty() {
		return holdQty;
	}
	public void setHoldQty(double holdQty) {
		this.holdQty = holdQty;
	}
	public double getRejQty() {
		return rejQty;
	}
	public void setRejQty(double rejQty) {
		this.rejQty = rejQty;
	}
	@Override
	public String toString() {
		return "StockListDto [plantCode=" + plantCode + ", storeLoc=" + storeLoc + ", itemId=" + itemId + ", itemDtl="
				+ itemDtl + ", storageBins=" + storageBins + ", approQty=" + approQty + ", holdQty=" + holdQty
				+ ", rejQty=" + rejQty + "]";
	}
	
	
}