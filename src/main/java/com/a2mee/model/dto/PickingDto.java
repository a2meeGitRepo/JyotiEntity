package com.a2mee.model.dto;

public class PickingDto {

	private Long pickingId;
	private String modelCode;
	private String proOrdNo;
	private String reservationNo;
	private double pickQty;
	@Override
	public String toString() {
		return "PickingDto [pickingId=" + pickingId + ", modelCode=" + modelCode + ", proOrdNo=" + proOrdNo
				+ ", reservationNo=" + reservationNo + ", pickQty=" + pickQty + ", status=" + status + "]";
	}
	private int status;
	public Long getPickingId() {
		return pickingId;
	}
	public void setPickingId(Long pickingId) {
		this.pickingId = pickingId;
	}
	public String getModelCode() {
		return modelCode;
	}
	public void setModelCode(String modelCode) {
		this.modelCode = modelCode;
	}
	public String getProOrdNo() {
		return proOrdNo;
	}
	public void setProOrdNo(String proOrdNo) {
		this.proOrdNo = proOrdNo;
	}
	
	public String getReservationNo() {
		return reservationNo;
	}
	public void setReservationNo(String reservationNo) {
		this.reservationNo = reservationNo;
	}
	public double getPickQty() {
		return pickQty;
	}
	public void setPickQty(double pickQty) {
		this.pickQty = pickQty;
	}
	public int getStatus() {
		return status;
	}
	public void setStatus(int status) {
		this.status = status;
	}
	
	
}
