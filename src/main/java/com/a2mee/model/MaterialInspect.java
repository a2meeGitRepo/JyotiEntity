package com.a2mee.model;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity(name="MaterialInspect")
@Table(name="material_inspection")
public class MaterialInspect {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="mtl_insp_id")
	private long mtlId;

	@Column(name="mtl_qty")
	private double mtlQty;
	
	@Column(name="mtl_status")
	private String mtlStatus;
	
	@Column(name="mtl_reason")
	private String mtlReason;
	
	@Column(name="original_status")
	private String originalStatus;
	
	@ManyToOne
	@JoinColumn(name="grn_item_lot_id")
	GrnItemLot grnItemLot;
		
	@ManyToOne
	@JoinColumn(name="reject_rson_id")
	RejectReasonMst rejectReasonMst;
	
	@Column(name="storage_bin_code")
	private String storageBinCode;	

	@Column(name="date")
	private LocalDate date;

	public String getStorageBinCode() {
		return storageBinCode;
	}

	public void setStorageBinCode(String storageBinCode) {
		this.storageBinCode = storageBinCode;
	}

	public LocalDate getDate() {
		return date;
	}

	public void setDate(LocalDate date) {
		this.date = date;
	}

	public long getMtlId() {
		return mtlId;
	}

	public void setMtlId(long mtlId) {
		this.mtlId = mtlId;
	}

	public double getMtlQty() {
		return mtlQty;
	}

	public void setMtlQty(double mtlQty) {
		this.mtlQty = mtlQty;
	}

	public String getMtlStatus() {
		return mtlStatus;
	}

	public void setMtlStatus(String mtlStatus) {
		this.mtlStatus = mtlStatus;
	}

	public String getMtlReason() {
		return mtlReason;
	}

	public void setMtlReason(String mtlReason) {
		this.mtlReason = mtlReason;
	}

	public String getOriginalStatus() {
		return originalStatus;
	}

	public void setOriginalStatus(String originalStatus) {
		this.originalStatus = originalStatus;
	}

	public GrnItemLot getGrnItemLot() {
		return grnItemLot;
	}

	public void setGrnItemLot(GrnItemLot grnItemLot) {
		this.grnItemLot = grnItemLot;
	}

	public RejectReasonMst getRejectReasonMst() {
		return rejectReasonMst;
	}

	public void setRejectReasonMst(RejectReasonMst rejectReasonMst) {
		this.rejectReasonMst = rejectReasonMst;
	}
	

	
	
}
