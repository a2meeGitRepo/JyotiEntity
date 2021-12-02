package com.a2mee.model;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Transient;

@Entity
@Table(name="assembly_mst")
public class AssemblyMst {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="assembly_id")
	private Long assmblyId;

	@Column(name="assembly_code")
	private String assemblyCode;
	
	@Column(name="assembly_desc")
	private String assemblyDesc;
	
	@Column(name="qty")
	private double assemblyQty;
	
	@Column(name="uom")
	private String uom;
	
	@Column(name="assm_cat")
	private String assmCat;
	
	@Column(name="material_stage_priority")
	private String materialStagePriority;
	
	@ManyToOne
	@JoinColumn(name="model_id")
	private ModelMst model;	
	  
	@Transient
	private String proOrdNo;

	public AssemblyMst() {
	}

	public AssemblyMst(String assemblyCode, String assemblyDesc, double assemblyQty, String uom) {
		super();
		this.assemblyCode = assemblyCode;
		this.assemblyDesc = assemblyDesc;
		this.assemblyQty = assemblyQty;
		this.uom = uom;
	}

//	/*Quantity addition for month - refer AssemblyServiceImpl*/
//	public void incrementQty(Double qty) {
//		this.assemblyQty=this.assemblyQty + qty;
//	}

	public Long getAssmblyId() {
		return assmblyId;
	}

	public void setAssmblyId(Long assmblyId) {
		this.assmblyId = assmblyId;
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

	public ModelMst getModel() {
		return model;
	}

	public void setModel(ModelMst model) {
		this.model = model;
	}
	
	public String getUom() {
		return uom;
	}

	public void setUom(String uom) {
		this.uom = uom;
	}
	
	
//	 @Override
//	  public boolean equals(Object o) {
//		AssemblyMst a = (AssemblyMst)o;
//	    return a.getAssemblyCode().equals(this.getAssemblyCode());
//	  }
//	 
//	 @Override
//	 public int hashCode() {
//	      return assemblyCode.hashCode();
//	  }

	public String getAssmCat() {
		return assmCat;
	}

	public void setAssmCat(String assmCat) {
		this.assmCat = assmCat;
	}

	public String getMaterialStagePriority() {
		return materialStagePriority;
	}

	public void setMaterialStagePriority(String materialStagePriority) {
		this.materialStagePriority = materialStagePriority;
	}

	public String getProOrdNo() {
		return proOrdNo;
	}

	public void setProOrdNo(String proOrdNo) {
		this.proOrdNo = proOrdNo;
	}

	
	
}
