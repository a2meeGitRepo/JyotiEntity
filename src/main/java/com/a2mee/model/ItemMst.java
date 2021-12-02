package com.a2mee.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.boot.autoconfigure.web.ResourceProperties.Strategy;

@Entity(name="ItemMst")
@Table(name="item_mst")
public class ItemMst implements Serializable {
	
	public String getScmMode() {
		return scmMode;
	}

	public void setScmMode(String scmMode) {
		this.scmMode = scmMode;
	}

	private static final long serialVersionUID = 1L;

//	@Id
//	@Column(name="item_mst_id")
//	private String id;
	
	@Id
	@Column(name="item_mst_id")
	private String id;
	
	@Column(name="item_detail")
	private String itemDtl;
	
	@Column(name="item_fr_name")
	private String itemFrName;
	
	@Column(name="grp_id")
	private long grpId;
	
	@Column(name="prchse_item_F")
	private char prchseItmF;
	
	@Column(name="sale_item_F	")
	private char saleItmF;
	
	@Column(name="invnt_item_F")
	private char invntItmF;
	
	@Column(name="uom")
	private String uom;

	@Column(name="item_status")
	private char itmStatus;
	
	@Column(name="item_Inspect_F")
	private char itmInspectF;
	
	
	@Column(name="material_source")
	private String materialSource;
	
	@Column(name="scm_mode")
	private String scmMode;
	
	
	@Column(name="mat_mst_log")
	private String matMstLog;

	public String getMatMstLog() {
		return matMstLog;
	}

	public void setMatMstLog(String matMstLog) {
		this.matMstLog = matMstLog;
	}

	public ItemMst() {
		super();
	}

	public ItemMst(String id) {
		super();
		this.id = id;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getItemDtl() {
		return itemDtl;
	}

	public void setItemDtl(String itemDtl) {
		this.itemDtl = itemDtl;
	}
	
	public String getItemFrName() {
		return itemFrName;
	}

	public void setItemFrName(String itemFrName) {
		this.itemFrName = itemFrName;
	}

	public long getGrpId() {
		return grpId;
	}

	public void setGrpId(long grpId) {
		this.grpId = grpId;
	}

	public char getPrchseItmF() {
		return prchseItmF;
	}

	public void setPrchseItmF(char prchseItmF) {
		this.prchseItmF = prchseItmF;
	}

	public char getSaleItmF() {
		return saleItmF;
	}

	public void setSaleItmF(char saleItmF) {
		this.saleItmF = saleItmF;
	}

	public char getInvntItmF() {
		return invntItmF;
	}

	public void setInvntItmF(char invntItmF) {
		this.invntItmF = invntItmF;
	}

	public String getUom() {
		return uom;
	}

	public void setUom(String uom) {
		this.uom = uom;
	}

	public char getItmStatus() {
		return itmStatus;
	}

	public void setItmStatus(char itmStatus) {
		this.itmStatus = itmStatus;
	}

	public char getItmInspectF() {
		return itmInspectF;
	}

	public void setItmInspectF(char itmInspectF) {
		this.itmInspectF = itmInspectF;
	}

	public String getMaterialSource() {
		return materialSource;
	}

	public void setMaterialSource(String materialSource) {
		this.materialSource = materialSource;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	
}
