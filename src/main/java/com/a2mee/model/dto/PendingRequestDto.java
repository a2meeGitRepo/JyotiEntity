package com.a2mee.model.dto;

public class PendingRequestDto {

	private String itemMstId;
	private String itemDtl;
	private String uom;
	private boolean ticked;
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
	
	public String getUom() {
		return uom;
	}
	public void setUom(String uom) {
		this.uom = uom;
	}
	public boolean isTicked() {
		return ticked;
	}
	public void setTicked(boolean ticked) {
		this.ticked = ticked;
	}
	
	
}
