package com.a2mee.model.dto;

public class ItemMstDto {

	@Override
	public String toString() {
		return "ItemMstDto [itemMstId=" + itemMstId + ", itemDtl=" + itemDtl + ", uom=" + uom + ", mtlGroup=" + mtlGroup
				+ ", materialSource=" + materialSource + ", scmMode=" + scmMode + ", matMstLog=" + matMstLog + "]";
	}

	private String itemMstId;
	private String itemDtl;
	private String uom;
	private String mtlGroup;
	private String materialSource;
	private String scmMode;
	private String matMstLog;
	
	public String getMatMstLog() {
		return matMstLog;
	}

	public void setMatMstLog(String matMstLog) {
		this.matMstLog = matMstLog;
	}

	public String getScmMode() {
		return scmMode;
	}

	public void setScmMode(String scmMode) {
		this.scmMode = scmMode;
	}

	public String getMtlGroup() {
		return mtlGroup;
	}

	public void setMtlGroup(String mtlGroup) {
		this.mtlGroup = mtlGroup;
	}

	public String getItemDtl() {
		return itemDtl;
	}

	public void setItemDtl(String itemDtl) {
		this.itemDtl = itemDtl;
	}

	public String getUom() {
		return uom;
	}

	public void setUom(String uom) {
		this.uom = uom;
	}

	public String getItemMstId() {
		return itemMstId;
	}

	public void setItemMstId(String itemMstId) {
		this.itemMstId = itemMstId;
	}

	public String getMaterialSource() {
		return materialSource;
	}

	public void setMaterialSource(String materialSource) {
		this.materialSource = materialSource;
	}

	
}
