package com.a2mee.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "materail_tranaction")
public class MaterialTransaction {
	

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="transacction_id")
	private long transacctionId;
	
	@Column(name = "item_detial")
	private String itemDetial;
	
	
	

	@Column(name = "item_id")
	private String itemId;
	
	@Column(name = "quntity")
	private double quntity;
	
	@Column(name = "tranaction_type")
	private String tranactionType;
	
	@Column(name = "tranaction_date")
	private Date tranactionDate;

	public long getTransacctionId() {
		return transacctionId;
	}

	public void setTransacctionId(long transacctionId) {
		this.transacctionId = transacctionId;
	}

	public String getItemDetial() {
		return itemDetial;
	}

	public void setItemDetial(String itemDetial) {
		this.itemDetial = itemDetial;
	}

	public String getItemId() {
		return itemId;
	}

	public void setItemId(String itemId) {
		this.itemId = itemId;
	}

	public double getQuntity() {
		return quntity;
	}

	public void setQuntity(double quntity) {
		this.quntity = quntity;
	}

	public String getTranactionType() {
		return tranactionType;
	}

	public void setTranactionType(String tranactionType) {
		this.tranactionType = tranactionType;
	}

	public Date getTranaction_date() {
		return tranactionDate;
	}

	public void setTranaction_date(Date tranaction_date) {
		this.tranactionDate = tranaction_date;
	}
	
	
	
}
