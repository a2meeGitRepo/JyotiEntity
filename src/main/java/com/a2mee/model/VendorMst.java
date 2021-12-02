package com.a2mee.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="vendor_mst")
public class VendorMst {
	

	@Id
	@Column(name="ven_mst_id")
	private String id;
	
	@Column(name="ven_f_name")
	private String venName;
	
	@Column(name="ven_mob_no")
	private String venMobNo;
	
	@Column(name="ven_ph_no")
	private String venPhoneNo;
	
	@Column(name="ven_email")
	private String venEmail;
	
	@Column(name="ven_status")
	private String venStatus;
	
	@Column(name="grp_id")
	private long venGPCode;

	
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getVenName() {
		return venName;
	}

	public void setVenName(String venName) {
		this.venName = venName;
	}

	public String getVenMobNo() {
		return venMobNo;
	}

	public void setVenMobNo(String venMobNo) {
		this.venMobNo = venMobNo;
	}

	public String getVenPhoneNo() {
		return venPhoneNo;
	}

	public void setVenPhoneNo(String venPhoneNo) {
		this.venPhoneNo = venPhoneNo;
	}

	public String getVenEmail() {
		return venEmail;
	}

	public void setVenEmail(String venEmail) {
		this.venEmail = venEmail;
	}

	public String getVenStatus() {
		return venStatus;
	}

	public void setVenStatus(String venStatus) {
		this.venStatus = venStatus;
	}

	public long getVenGPCode() {
		return venGPCode;
	}

	public void setVenGPCode(long venGPCode) {
		this.venGPCode = venGPCode;
	}
	
	
}
