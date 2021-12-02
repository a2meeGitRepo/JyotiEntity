package com.a2mee.model;

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
@Table(name = "grn_item_lot")
public class GrnItemLot {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "grn_item_lot_id", precision = 0)
	private long grnItemLotId;

	@Column(name = "item_lot_no")
	private String itemLotNo;
	
	@Column(name = "box_qty")
	private long boxQty;

	@Column(name = "batch_qty")
	private double batchQty;

	@Column(name = "grn_barcode")
	private String itemBarcode;

	@Column(name = "appro_qty")
	private double approQty;

	@Column(name = "rej_qty")
	private double rejQty;

	@Column(name = "hold_qty")
	private double holdQty;
	
	@Column(name="grn_doc_no")
	private long grnDocNo;
	
	@Column(name="grn_doc_entry")
	private long docEntry;
	
	@Column(name = "item_mst_id")
	private String itemMstId;
	
	@Column(name="grn_no")
	private long grnNo;
	
	@Column(name="sys_number")
	private long sysNum;
	
	@Column(name="dist_number")
	private String distNumber;	

	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name = "grn_item_id")
	GrnItem grnItem;

	public long getGrnItemLotId() {
		return grnItemLotId;
	}

	public void setGrnItemLotId(long grnItemLotId) {
		this.grnItemLotId = grnItemLotId;
	}

	public String getItemLotNo() {
		return itemLotNo;
	}

	public void setItemLotNo(String itemLotNo) {
		this.itemLotNo = itemLotNo;
	}

	public double getBatchQty() {
		return batchQty;
	}

	public void setBatchQty(double batchQty) {
		this.batchQty = batchQty;
	}

	public String getItemBarcode() {
		return itemBarcode;
	}

	public void setItemBarcode(String itemBarcode) {
		this.itemBarcode = itemBarcode;
	}

	public double getApproQty() {
		return approQty;
	}

	public void setApproQty(double approQty) {
		this.approQty = approQty;
	}

	public double getRejQty() {
		return rejQty;
	}

	public void setRejQty(double rejQty) {
		this.rejQty = rejQty;
	}

	public double getHoldQty() {
		return holdQty;
	}

	public void setHoldQty(double holdQty) {
		this.holdQty = holdQty;
	}

	public long getGrnDocNo() {
		return grnDocNo;
	}

	public void setGrnDocNo(long grnDocNo) {
		this.grnDocNo = grnDocNo;
	}

	public long getDocEntry() {
		return docEntry;
	}

	public void setDocEntry(long docEntry) {
		this.docEntry = docEntry;
	}

	public String getItemMstId() {
		return itemMstId;
	}

	public void setItemMstId(String itemMstId) {
		this.itemMstId = itemMstId;
	}

	public long getGrnNo() {
		return grnNo;
	}

	public void setGrnNo(long grnNo) {
		this.grnNo = grnNo;
	}

	public long getSysNum() {
		return sysNum;
	}

	public void setSysNum(long sysNum) {
		this.sysNum = sysNum;
	}

	public String getDistNumber() {
		return distNumber;
	}

	public void setDistNumber(String distNumber) {
		this.distNumber = distNumber;
	}

	public GrnItem getGrnItem() {
		return grnItem;
	}

	public void setGrnItem(GrnItem grnItem) {
		this.grnItem = grnItem;
	}

	public long getBoxQty() {
		return boxQty;
	}

	public void setBoxQty(long boxQty) {
		this.boxQty = boxQty;
	}	
	
}
