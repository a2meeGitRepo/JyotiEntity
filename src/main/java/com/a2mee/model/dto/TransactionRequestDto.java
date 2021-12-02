package com.a2mee.model.dto;

public class TransactionRequestDto {
	private String itemMstId;
	private String startDate;
	private String endDate;
	public String getItemMstId() {
		return itemMstId;
	}
	public void setItemMstId(String itemMstId) {
		this.itemMstId = itemMstId;
	}
	public String getStartDate() {
		return startDate;
	}
	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}
	public String getEndDate() {
		return endDate;
	}
	public void setEndDate(String endDate) {
		this.endDate = endDate;
	}
	
	

}
