package com.a2mee.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity

@Table(name = "plant_mst")
@JsonIgnoreProperties({ "hibernateLazyInitializer", "handler" })
public class Plant implements Serializable {

	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int plant_id;
	
	private String plant_code;
	private String plant_name;
	private String address;
	private String city;
	private int deletes;
	public int getPlant_id() {
		return plant_id;
	}
	public void setPlant_id(int plant_id) {
		this.plant_id = plant_id;
	}
	public String getPlant_code() {
		return plant_code;
	}
	public void setPlant_code(String plant_code) {
		this.plant_code = plant_code;
	}
	public String getPlant_name() {
		return plant_name;
	}
	public void setPlant_name(String plant_name) {
		this.plant_name = plant_name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public int getDeletes() {
		return deletes;
	}
	public void setDeletes(int deletes) {
		this.deletes = deletes;
	}
	@Override
	public String toString() {
		return "Plant [plant_id=" + plant_id + ", plant_code=" + plant_code + ", plant_name=" + plant_name
				+ ", address=" + address + ", city=" + city + ", deletes=" + deletes + "]";
	}

	
}
