package com.a2mee.model.dto;

public class PickingReportDto {

	private String compCode;
	private String plantCode;
	private String locationCode;
	private double issueQty;
	private String proOrdNo;
	private String movement;
	private String reservationNo;
	private String itemNo;
	private String postingDocNo;
	
	public String getCompCode() {
		return compCode;
	}
	public void setCompCode(String compCode) {
		this.compCode = compCode;
	}
	public String getPlantCode() {
		return plantCode;
	}
	public void setPlantCode(String plantCode) {
		this.plantCode = plantCode;
	}
	public String getLocationCode() {
		return locationCode;
	}
	public void setLocationCode(String locationCode) {
		this.locationCode = locationCode;
	}
	
	public double getIssueQty() {
		return issueQty;
	}
	public void setIssueQty(double issueQty) {
		this.issueQty = issueQty;
	}
	public String getProOrdNo() {
		return proOrdNo;
	}
	public void setProOrdNo(String proOrdNo) {
		this.proOrdNo = proOrdNo;
	}
	public String getMovement() {
		return movement;
	}
	public void setMovement(String movement) {
		this.movement = movement;
	}
	public String getReservationNo() {
		return reservationNo;
	}
	public void setReservationNo(String reservationNo) {
		this.reservationNo = reservationNo;
	}
	public String getItemNo() {
		return itemNo;
	}
	public void setItemNo(String itemNo) {
		this.itemNo = itemNo;
	}
	public String getPostingDocNo() {
		return postingDocNo;
	}
	public void setPostingDocNo(String postingDocNo) {
		this.postingDocNo = postingDocNo;
	}
	
	
}
