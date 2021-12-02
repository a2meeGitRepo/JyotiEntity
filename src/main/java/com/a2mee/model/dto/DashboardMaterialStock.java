package com.a2mee.model.dto;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import com.a2mee.model.ItemMst;

public class DashboardMaterialStock {
	
	ItemMst itemMst;
	private String quantiry;
	private Date updateDate;
	public ItemMst getItemMst() {
		return itemMst;
	}
	public void setItemMst(ItemMst itemMst) {
		this.itemMst = itemMst;
	}
	public String getQuantiry() {
		return quantiry;
	}
	public void setQuantiry(String quantiry) {
		this.quantiry = quantiry;
	}
	public Date getUpdateDate() {
		return updateDate;
	}
	public void setUpdateDate(Date updateDate) {
		this.updateDate = updateDate;
	}
	
	

}
