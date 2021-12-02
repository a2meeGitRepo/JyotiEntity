package com.a2mee.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name ="grn")
public class GRN {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="grn_id")
	private long grnId;
	
	@Column(name="purchase_order_no")
	private long purchaseOrderNo;
	
	@Column(name="grn_no")
	private long grnNo;

	@Column(name="grn_date")
	private Date grnEntryDate;
	
	@Column(name = "ven_name")
	private String venName;
	
	@Column(name = "grn_status")
	private String grnStatus;
	
	@Column(name = "grn_by")
	private String grnBy;	
	
	@Column(name = "doc_condition_no")
	private String docConditionNo;		
	
	@Column(name = "error_solve_date_time")
	private Date errorSolveDate;
	
	@Column(name = "inward_time")
	private String inwardTime;
	
	@OneToMany(cascade=CascadeType.ALL)
	@JoinColumn(name="grn_id")
	List<GrnItem> grnItems;
	
	@ManyToOne
	@JoinColumn(name="ven_mst_id")
	VendorMst vendorMst;

	public long getGrnId() {
		return grnId;
	}

	public void setGrnId(long grnId) {
		this.grnId = grnId;
	}

	public long getPurchaseOrderNo() {
		return purchaseOrderNo;
	}

	public void setPurchaseOrderNo(long purchaseOrderNo) {
		this.purchaseOrderNo = purchaseOrderNo;
	}

	public long getGrnNo() {
		return grnNo;
	}

	public void setGrnNo(long grnNo) {
		this.grnNo = grnNo;
	}

	public Date getGrnEntryDate() {
		return grnEntryDate;
	}

	public void setGrnEntryDate(Date grnEntryDate) {
		this.grnEntryDate = grnEntryDate;
	}

	public String getVenName() {
		return venName;
	}

	public void setVenName(String venName) {
		this.venName = venName;
	}

	public String getGrnStatus() {
		return grnStatus;
	}

	public void setGrnStatus(String grnStatus) {
		this.grnStatus = grnStatus;
	}

	public String getGrnBy() {
		return grnBy;
	}

	public void setGrnBy(String grnBy) {
		this.grnBy = grnBy;
	}

	public String getDocConditionNo() {
		return docConditionNo;
	}

	public void setDocConditionNo(String docConditionNo) {
		this.docConditionNo = docConditionNo;
	}

	public Date getErrorSolveDate() {
		return errorSolveDate;
	}

	public void setErrorSolveDate(Date errorSolveDate) {
		this.errorSolveDate = errorSolveDate;
	}

	public String getInwardTime() {
		return inwardTime;
	}

	public void setInwardTime(String inwardTime) {
		this.inwardTime = inwardTime;
	}

	public List<GrnItem> getGrnItems() {
		return grnItems;
	}

	public void setGrnItems(List<GrnItem> grnItems) {
		this.grnItems = grnItems;
	}

	public VendorMst getVendorMst() {
		return vendorMst;
	}

	public void setVendorMst(VendorMst vendorMst) {
		this.vendorMst = vendorMst;
	}	
}
