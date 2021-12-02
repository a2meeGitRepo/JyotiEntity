package com.a2mee.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="supplier_componant")
public class SupplierComponants {
	public int getPriority() {
		return priority;
	}

	public void setPriority(int priority) {
		this.priority = priority;
	}

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="supplier_componant_id")
	private Long supplierComponantId;

	@ManyToOne
	@JoinColumn(name="item_mst_id")
	ItemMst itemMst;
	
	@ManyToOne
	@JoinColumn(name="supplier_id")
	Supplier supplier;
	
	@Column(name="priority")
	private int priority;
	
	@Column(name="unit_price")
	private double unitPrice;
	
	public double getUnitPrice() {
		return unitPrice;
	}

	public void setUnitPrice(double unitPrice) {
		this.unitPrice = unitPrice;
	}

	@Column(name="active")
	private int active;
	
	@Column(name="added_date")
	private Date addedDate;

	public Long getSupplierComponantId() {
		return supplierComponantId;
	}

	public void setSupplierComponantId(Long supplierComponantId) {
		this.supplierComponantId = supplierComponantId;
	}

	public ItemMst getItemMst() {
		return itemMst;
	}

	public void setItemMst(ItemMst itemMst) {
		this.itemMst = itemMst;
	}

	public Supplier getSupplier() {
		return supplier;
	}

	public void setSupplier(Supplier supplier) {
		this.supplier = supplier;
	}

	public int getActive() {
		return active;
	}

	public void setActive(int active) {
		this.active = active;
	}

	public Date getAddedDate() {
		return addedDate;
	}

	public void setAddedDate(Date addedDate) {
		this.addedDate = addedDate;
	}
	
	
}
