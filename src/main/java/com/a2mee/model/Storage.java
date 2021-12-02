package com.a2mee.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name = "storage_mst")
@JsonIgnoreProperties({ "hibernateLazyInitializer", "handler" })
public class Storage implements Serializable{

	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int storage_id;
	
	private String storage_location;
	private String storage_desc;
	private int deletes;
	
	public int getStorage_id() {
		return storage_id;
	}
	public void setStorage_id(int storage_id) {
		this.storage_id = storage_id;
	}
	public String getStorage_location() {
		return storage_location;
	}
	public void setStorage_location(String storage_location) {
		this.storage_location = storage_location;
	}
	public String getStorage_desc() {
		return storage_desc;
	}
	public void setStorage_desc(String storage_desc) {
		this.storage_desc = storage_desc;
	}
	public int getDeletes() {
		return deletes;
	}
	public void setDeletes(int deletes) {
		this.deletes = deletes;
	}
	
	@Override
	public String toString() {
		return "Storage [storage_id=" + storage_id + ", storage_location=" + storage_location + ", storage_desc="
				+ storage_desc + ", deletes=" + deletes + "]";
	}
	
	
}
