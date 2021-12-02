package com.a2mee.model.dto;

import java.util.List;

import com.a2mee.model.Plant;
import com.a2mee.model.Storage;

public class StockRequestDto {

	private List<ItemMstDto> items;
	private List<Plant> plants;
	private List<Storage> stores;
	private String date;
	private String startDate;
	private String endDate;
	
	public List<ItemMstDto> getItems() {
		return items;
	}
	public void setItems(List<ItemMstDto> items) {
		this.items = items;
	}
	public List<Plant> getPlants() {
		return plants;
	}
	public void setPlants(List<Plant> plants) {
		this.plants = plants;
	}
	public List<Storage> getStores() {
		return stores;
	}
	public void setStores(List<Storage> stores) {
		this.stores = stores;
	}
	
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}	
	
	public String getStartDate() {
		return startDate;
	}
	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}
	public String getEndDate() {
		return endDate;
	}
	public void setEndDate(String endDate) {
		this.endDate = endDate;
	}
	
	@Override
	public String toString() {
		return "StockRequestDto [items=" + items + ", plants=" + plants + ", stores=" + stores + ", date=" + date + "]";
	}
	
	
	
}
