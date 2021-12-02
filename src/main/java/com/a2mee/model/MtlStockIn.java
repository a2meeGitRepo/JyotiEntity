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

@Entity
@Table(name = "mtl_stock_in")
public class MtlStockIn {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "mtl_stk_in_id")
	private long id;

	@Column(name = "remain_qty")
	private double remainQty;

	@Column(name = "in_mtl_qty")
	private double inMtlQty;

	@Column(name = "u_id")
	private long uId;

	@Column(name = "grn_date")
	private Date grnDate;

	@Column(name = "create_date")
	private Date createDate;

	@Column(name = "status")
	private String status;

	@Column(name = "bar_code")
	private String barCode;	

	@Column(name="storage_bin_code")
	private String storageBinCode;

	@ManyToOne
	@JoinColumn(name = "mtl_insp_id")
	MaterialInspect materialInspect;

	@ManyToOne
	@JoinColumn(name = "item_mst_id")
	ItemMst itemMst;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public double getRemainQty() {
		return remainQty;
	}

	public void setRemainQty(double remainQty) {
		this.remainQty = remainQty;
	}

	public double getInMtlQty() {
		return inMtlQty;
	}

	public void setInMtlQty(double inMtlQty) {
		this.inMtlQty = inMtlQty;
	}

	public long getuId() {
		return uId;
	}

	public void setuId(long uId) {
		this.uId = uId;
	}

	public Date getGrnDate() {
		return grnDate;
	}

	public void setGrnDate(Date grnDate) {
		this.grnDate = grnDate;
	}

	public Date getCreateDate() {
		return createDate;
	}

	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getBarCode() {
		return barCode;
	}

	public void setBarCode(String barCode) {
		this.barCode = barCode;
	}

	public MaterialInspect getMaterialInspect() {
		return materialInspect;
	}

	public void setMaterialInspect(MaterialInspect materialInspect) {
		this.materialInspect = materialInspect;
	}

	public ItemMst getItemMst() {
		return itemMst;
	}

	public void setItemMst(ItemMst itemMst) {
		this.itemMst = itemMst;
	}

	public String getStorageBinCode() {
		return storageBinCode;
	}

	public void setStorageBinCode(String storageBinCode) {
		this.storageBinCode = storageBinCode;
	}
	
	


}
