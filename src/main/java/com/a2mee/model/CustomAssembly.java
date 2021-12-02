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
@Table(name="custom_assembly")
public class CustomAssembly {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="custom_assm_id")
	private Long customAssmId;

	@Column(name="assembly_code")
	private String assemblyCode;
	
	@Column(name="assembly_desc")
	private String assemblyDesc;
	
	@Column(name="qty")
	private double assemblyQty;
	
	@Column(name="uom")
	private String uom;
	
	@ManyToOne
	@JoinColumn(name="model_id")
	private ModelMst model;	
	
	@ManyToOne
	@JoinColumn(name="pro_ord_id")
	private ProductionOrder productionOrder;

	public Long getCustomAssmId() {
		return customAssmId;
	}

	public void setCustomAssmId(Long customAssmId) {
		this.customAssmId = customAssmId;
	}

	public String getAssemblyCode() {
		return assemblyCode;
	}

	public void setAssemblyCode(String assemblyCode) {
		this.assemblyCode = assemblyCode;
	}

	public String getAssemblyDesc() {
		return assemblyDesc;
	}

	public void setAssemblyDesc(String assemblyDesc) {
		this.assemblyDesc = assemblyDesc;
	}

	public double getAssemblyQty() {
		return assemblyQty;
	}

	public void setAssemblyQty(double assemblyQty) {
		this.assemblyQty = assemblyQty;
	}

	public String getUom() {
		return uom;
	}

	public void setUom(String uom) {
		this.uom = uom;
	}

	public ModelMst getModel() {
		return model;
	}

	public void setModel(ModelMst model) {
		this.model = model;
	}

	public ProductionOrder getProductionOrder() {
		return productionOrder;
	}

	public void setProductionOrder(ProductionOrder productionOrder) {
		this.productionOrder = productionOrder;
	}

	@Override
	public String toString() {
		return "CustomAssembly [customAssmId=" + customAssmId + ", assemblyCode=" + assemblyCode + ", assemblyDesc="
				+ assemblyDesc + ", assemblyQty=" + assemblyQty + ", uom=" + uom + ", model=" + model
				+ ", productionOrder=" + productionOrder + "]";
	}
	
	
	
}
