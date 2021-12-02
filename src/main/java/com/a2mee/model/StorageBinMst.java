package com.a2mee.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="storage_bin_mst")
public class StorageBinMst {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="storage_bin_id")
	private long storageBinId;
	
	@Column(name = "storage_bin_code")
	private String storageBinCode;
	
	@Column(name = "rack_letter")
	private String rackLetter;
	
	@Column(name = "column_no")
	private String columnNo;
	
	@Column(name = "row_letter")
	private String rowLetter;
	
	@Column(name = "palette_side")
	private String paletteSide;
	
	@ManyToOne
	@JoinColumn(name="plant_id")
	private Plant plant;
	
	@ManyToOne
	@JoinColumn(name="storage_id")
	private Storage storage;
	
	@Column(name="upd_user_id")
	private String updUserId;
	
	@Column(name="upd_datetime")
	private String updDateTime;
	
	@Column(name="active")
	private int active;

	
	public StorageBinMst() {
		
	}

	public long getStorageBinId() {
		return storageBinId;
	}

	public void setStorageBinId(long storageBinId) {
		this.storageBinId = storageBinId;
	}

	public String getStorageBinCode() {
		return storageBinCode;
	}

	public void setStorageBinCode(String storageBinCode) {
		this.storageBinCode = storageBinCode;
	}

	public String getRackLetter() {
		return rackLetter;
	}

	public void setRackLetter(String rackLetter) {
		this.rackLetter = rackLetter;
	}

	public String getColumnNo() {
		return columnNo;
	}

	public void setColumnNo(String columnNo) {
		this.columnNo = columnNo;
	}

	public String getRowLetter() {
		return rowLetter;
	}

	public void setRowLetter(String rowLetter) {
		this.rowLetter = rowLetter;
	}

	public String getPaletteSide() {
		return paletteSide;
	}

	public void setPaletteSide(String paletteSide) {
		this.paletteSide = paletteSide;
	}

	public String getUpdUserId() {
		return updUserId;
	}

	public void setUpdUserId(String updUserId) {
		this.updUserId = updUserId;
	}

	public String getUpdDateTime() {
		return updDateTime;
	}

	public void setUpdDateTime(String updDateTime) {
		this.updDateTime = updDateTime;
	}

	public int getActive() {
		return active;
	}

	public void setActive(int active) {
		this.active = active;
	}
	
	public Plant getPlant() {
		return plant;
	}

	public void setPlant(Plant plant) {
		this.plant = plant;
	}

	public Storage getStorage() {
		return storage;
	}

	public void setStorage(Storage storage) {
		this.storage = storage;
	}

	@Override
	public String toString() {
		return "StorageBinMst [storageBinId=" + storageBinId + ", storageBinCode=" + storageBinCode + ", rackLetter="
				+ rackLetter + ", columnNo=" + columnNo + ", rowLetter=" + rowLetter + ", paletteSide=" + paletteSide
				+ ", updUserId=" + updUserId + ", updDateTime=" + updDateTime + ", active=" + active + "]";
	}
	
	
}
