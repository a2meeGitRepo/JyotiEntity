package com.a2mee.model.dto;

import java.util.Date;

public class TransactionDto {

	private String itemMstId;
	private String stage;
	private Date date;
	private String orderNo;
	private double qty;
	private double balanceQty;
	private String empName;
	public String getStage() {
		return stage;
	}
	public void setStage(String stage) {
		this.stage = stage;
	}
	
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public double getQty() {
		return qty;
	}
	public void setQty(double qty) {
		this.qty = qty;
	}
	public double getBalanceQty() {
		return balanceQty;
	}
	public void setBalanceQty(double balanceQty) {
		this.balanceQty = balanceQty;
	}
	public String getItemMstId() {
		return itemMstId;
	}
	public void setItemMstId(String itemMstId) {
		this.itemMstId = itemMstId;
	}
	public String getOrderNo() {
		return orderNo;
	}
	public void setOrderNo(String orderNo) {
		this.orderNo = orderNo;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	
	
	
}