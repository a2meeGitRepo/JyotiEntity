package com.a2mee.model.dto;

import java.util.List;

public class PickingRequestDto {

	private List<PickingDto> pickingDtos;
	private String date;
	private String startDate;
	private String endDate;
	public List<PickingDto> getPickingDtos() {
		return pickingDtos;
	}
	public void setPickingDtos(List<PickingDto> pickingDtos) {
		this.pickingDtos = pickingDtos;
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
	
	
}
