package com.a2mee.model.dto;

public class PoDeviationsDto {
	private long purchaseOrderNo;
	private String poItemId;
	private String poItemDtl;
	private String errors;
	private String status;
	public long getPurchaseOrderNo() {
		return purchaseOrderNo;
	}
	public void setPurchaseOrderNo(long purchaseOrderNo) {
		this.purchaseOrderNo = purchaseOrderNo;
	}
	public String getErrors() {
		return errors;
	}
	public void setErrors(String errors) {
		this.errors = errors;
	}
	public String getPoItemId() {
		return poItemId;
	}
	public void setPoItemId(String poItemId) {
		this.poItemId = poItemId;
	}
	public String getPoItemDtl() {
		return poItemDtl;
	}
	public void setPoItemDtl(String poItemDtl) {
		this.poItemDtl = poItemDtl;
	}
	
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	@Override
	public String toString() {
		return "PoDeviationsDto [purchaseOrderNo=" + purchaseOrderNo + ", poItemId=" + poItemId + ", poItemDtl="
				+ poItemDtl + ", errors=" + errors + ", status=" + status + "]";
	}
	
	
}
