package com.a2mee.model.dto;

public class StockDto {

	private String itemMstId;
	private String itemDtl;
	private String storageBinCode;
	private double qty;
	private long mtlStockInId; 
	
	
	@Override
	public String toString() {
		return "StockDto [itemMstId=" + itemMstId + ", itemDtl=" + itemDtl + ", storageBinCode=" + storageBinCode
				+ ", qty=" + qty + ", mtlStockInId=" + mtlStockInId + "]";
	}
	public String getItemMstId() {
		return itemMstId;
	}
	public void setItemMstId(String itemMstId) {
		this.itemMstId = itemMstId;
	}
	public String getItemDtl() {
		return itemDtl;
	}
	public void setItemDtl(String itemDtl) {
		this.itemDtl = itemDtl;
	}
	public String getStorageBinCode() {
		return storageBinCode;
	}
	public void setStorageBinCode(String storageBinCode) {
		this.storageBinCode = storageBinCode;
	}
	public double getQty() {
		return qty;
	}
	public void setQty(double qty) {
		this.qty = qty;
	}
	public long getMtlStockInId() {
		return mtlStockInId;
	}
	public void setMtlStockInId(long mtlStockInId) {
		this.mtlStockInId = mtlStockInId;
	}
	
}
