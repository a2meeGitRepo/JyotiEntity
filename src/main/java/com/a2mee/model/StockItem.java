package com.a2mee.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity(name = "StockItem")
@Table(name = "item_stock")
public class StockItem {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "itm_stok_id")
	private long id;

	@Column(name = "item_total_qty")
	private double itemTolQty;
	
	@Column(name = "user_id")
	private long uId;
	
	@Column(name = "update_date")
	private Date update;
	
	/*@Column(name = "update_time")
	private Long upTime;*/

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "item_mst_id")
	ItemMst itemMst;

	public ItemMst getItemMst() {
		return itemMst;
	}

	public void setItemMst(ItemMst itemMst) {
		this.itemMst = itemMst;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	
	public double getItemTolQty() {
		return itemTolQty;
	}

	public void setItemTolQty(double itemTolQty) {
		this.itemTolQty = itemTolQty;
	}

	public long getuId() {
		return uId;
	}

	public void setuId(long uId) {
		this.uId = uId;
	}

	public Date getUpdate() {
		return update;
	}

	public void setUpdate(Date update) {
		this.update = update;
	}

	/*public Long getUpTime() {
		return upTime;
	}

	public void setUpTime(Long upTime) {
		this.upTime = upTime;
	}*/

}
