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
@Table(name = "qc_input")
public class QCInput {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "qc_input_id")
	private long qcID;

	@Column(name = "custmor_id")
	private long customerId;

	@Column(name = "po_shift_qr_code")
	private String qrCode;

//	@ManyToOne
//	@JoinColumn(name = "po_mst_id")
//	ProOrd proOrd;

	@ManyToOne
	@JoinColumn(name = "po_row_item_id")
	ItemMst itemMst;

	/*@ManyToOne
	@JoinColumn(name = "source_id")
	ProOrdShiftQRCode proOrdShiftQRCode;*/
	
	@Column(name = "source_id")
	private long sourceId;
	
	@Column(name = "source")
	private String source;

	@Column(name = "remaing_qty")
	private double remaingQty;

	@Column(name = "total_qty")
	private double totalQty;

	@Column(name = "shift_date")
	private Date shiftDate;

	public Date getShiftDate() {
		return shiftDate;
	}

	public void setShiftDate(Date shiftDate) {
		this.shiftDate = shiftDate;
	}

	public long getQcID() {
		return qcID;
	}

	public void setQcID(long qcID) {
		this.qcID = qcID;
	}

	public long getCustomerId() {
		return customerId;
	}

	public void setCustomerId(long customerId) {
		this.customerId = customerId;
	}

	public String getQrCode() {
		return qrCode;
	}

	public void setQrCode(String qrCode) {
		this.qrCode = qrCode;
	}

//	public ProOrd getProOrd() {
//		return proOrd;
//	}
//
//	public void setProOrd(ProOrd proOrd) {
//		this.proOrd = proOrd;
//	}

	public ItemMst getItemMst() {
		return itemMst;
	}

	public void setItemMst(ItemMst itemMst) {
		this.itemMst = itemMst;
	}

	/*public ProOrdShiftQRCode getProOrdShiftQRCode() {
		return proOrdShiftQRCode;
	}

	public void setProOrdShiftQRCode(ProOrdShiftQRCode proOrdShiftQRCode) {
		this.proOrdShiftQRCode = proOrdShiftQRCode;
	}*/

	public String getSource() {
		return source;
	}

	public void setSource(String source) {
		this.source = source;
	}

	public double getRemaingQty() {
		return remaingQty;
	}

	public void setRemaingQty(double remaingQty) {
		this.remaingQty = remaingQty;
	}

	public double getTotalQty() {
		return totalQty;
	}

	public void setTotalQty(double totalQty) {
		this.totalQty = totalQty;
	}

	public long getSourceId() {
		return sourceId;
	}

	public void setSourceId(long sourceId) {
		this.sourceId = sourceId;
	}

}
