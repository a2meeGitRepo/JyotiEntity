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
@Table(name="picking_component")
public class PickingComponent {
	
	@Override
	public String toString() {
		return "PickingComponent [pickingCompId=" + pickingCompId + ", itemNo=" + itemNo + ", postingDocNo="
				+ postingDocNo + ", itemBit=" + itemBit + ", pickingMst=" + pickingMst + ", componentMst="
				+ componentMst + "]";
	}

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="picking_comp_id")
	private Long pickingCompId;

	@Column(name="comp_qty")
	private double pickCompQty;
	
	@Column(name="status")
	private int status;
	
	@Column(name="picked_qty")
	private double pickedQty;
	
	@Column(name="storage_bin_code")
	private String storageBinCode;
	
	@Column(name="picked_date_time")
	private Date pickedDate;
	
	@Column(name="item_no")
	private int itemNo;
	
	@Column(name="posting_doc_no")
	private String postingDocNo;
	
	@Column(name="item_bit")
	private int itemBit;
	
	@ManyToOne
	@JoinColumn(name="picking_id")
	PickingMst pickingMst;
	
	@ManyToOne
	@JoinColumn(name="picking_assm_id")
	PickingAssembly pickingAssembly;
	
	@ManyToOne
	@JoinColumn(name="component_id")
	ComponentMst componentMst;

	public Long getPickingCompId() {
		return pickingCompId;
	}

	public void setPickingCompId(Long pickingCompId) {
		this.pickingCompId = pickingCompId;
	}

	public double getPickCompQty() {
		return pickCompQty;
	}

	public void setPickCompQty(double pickCompQty) {
		this.pickCompQty = pickCompQty;
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	public PickingMst getPickingMst() {
		return pickingMst;
	}

	public void setPickingMst(PickingMst pickingMst) {
		this.pickingMst = pickingMst;
	}

	public PickingAssembly getPickingAssembly() {
		return pickingAssembly;
	}

	public void setPickingAssembly(PickingAssembly pickingAssembly) {
		this.pickingAssembly = pickingAssembly;
	}

	public ComponentMst getComponentMst() {
		return componentMst;
	}

	public void setComponentMst(ComponentMst componentMst) {
		this.componentMst = componentMst;
	}
	
	public double getPickedQty() {
		return pickedQty;
	}

	public void setPickedQty(double pickedQty) {
		this.pickedQty = pickedQty;
	}

	public String getStorageBinCode() {
		return storageBinCode;
	}

	public void setStorageBinCode(String storageBinCode) {
		this.storageBinCode = storageBinCode;
	}

	public Date getPickedDate() {
		return pickedDate;
	}

	public void setPickedDate(Date pickedDate) {
		this.pickedDate = pickedDate;
	}

	public int getItemNo() {
		return itemNo;
	}

	public void setItemNo(int itemNo) {
		this.itemNo = itemNo;
	}

	public String getPostingDocNo() {
		return postingDocNo;
	}

	public void setPostingDocNo(String postingDocNo) {
		this.postingDocNo = postingDocNo;
	}
	
	

	


	public int getItemBit() {
		return itemBit;
	}

	public void setItemBit(int itemBit) {
		this.itemBit = itemBit;
	}


}
