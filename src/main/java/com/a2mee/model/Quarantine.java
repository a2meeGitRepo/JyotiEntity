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
@Table(name = "quarantine")

public class Quarantine {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "qurt_id")
	private long qurtId;

	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name = "item_mst_id")
	ItemMst itemMst;

	@Column(name = "qrcode")
	private String qrcode;

	@Column(name = "uom")
	private String uom;

	@Column(name = "stage_name")
	String stageName;

	public long getQurtId() {
		return qurtId;
	}

	public void setQurtId(long qurtId) {
		this.qurtId = qurtId;
	}

	public ItemMst getItemMst() {
		return itemMst;
	}

	public void setItemMst(ItemMst itemMst) {
		this.itemMst = itemMst;
	}

	public String getQrcode() {
		return qrcode;
	}

	public void setQrcode(String qrcode) {
		this.qrcode = qrcode;
	}

	public String getUom() {
		return uom;
	}

	public void setUom(String uom) {
		this.uom = uom;
	}

	public String getStageName() {
		return stageName;
	}

	public void setStageName(String stageName) {
		this.stageName = stageName;
	}
}
