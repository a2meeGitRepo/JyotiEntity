package com.a2mee.model.dto;

public class StorageCsvDto {

	private String plantCode;
	private String storageCode;
	private String rackCode;
	private String columnCode;
	private String rowCode;
	private String palleteSide;
	private String itemId;
	
	public String getPlantCode() {
		return plantCode;
	}
	public void setPlantCode(String plantCode) {
		this.plantCode = plantCode;
	}
	public String getStorageCode() {
		return storageCode;
	}
	public void setStorageCode(String storageCode) {
		this.storageCode = storageCode;
	}
	public String getRackCode() {
		return rackCode;
	}
	public void setRackCode(String rackCode) {
		this.rackCode = rackCode;
	}
	public String getColumnCode() {
		return columnCode;
	}
	public void setColumnCode(String columnCode) {
		this.columnCode = columnCode;
	}
	public String getRowCode() {
		return rowCode;
	}
	public void setRowCode(String rowCode) {
		this.rowCode = rowCode;
	}
	public String getPalleteSide() {
		return palleteSide;
	}
	public void setPalleteSide(String palleteSide) {
		this.palleteSide = palleteSide;
	}
	
	
	
	public String getItemId() {
		return itemId;
	}
	public void setItemId(String itemId) {
		this.itemId = itemId;
	}
	@Override
	public String toString() {
		return "StorageCsvDto [plantCode=" + plantCode + ", storageCode=" + storageCode + ", rackCode=" + rackCode
				+ ", columnCode=" + columnCode + ", rowCode=" + rowCode + ", palleteSide=" + palleteSide + "]";
	}	
}
