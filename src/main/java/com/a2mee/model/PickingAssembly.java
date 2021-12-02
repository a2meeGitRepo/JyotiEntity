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
@Table(name="picking_assembly")
public class PickingAssembly {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="picking_assm_id")
	private Long pickingAssmId;

	@Column(name="assm_qty")
	private double pickAssmQty;
	
	@Column(name="status")
	private int status;
	
	@Column(name="rem_qty")
	private double remQty;
	
	@Column(name="replaced_picking_assm_id")
	private int replacedPickingAssmId;
	
	@Column(name="remark")
	private String remark;
	
	@ManyToOne
	@JoinColumn(name="picking_id")
	PickingMst pickingMst;	
	
	@ManyToOne
	@JoinColumn(name="assembly_id")
	AssemblyMst assemblyMst;	

	public PickingAssembly(AssemblyMst assemblyMst, double pickAssmQty, PickingMst pickingMst) {
		this.assemblyMst = assemblyMst;
		this.pickAssmQty = pickAssmQty;
		this.pickingMst = pickingMst;
	}

	public PickingAssembly() {
	}

	public Long getPickingAssmId() {
		return pickingAssmId;
	}

	public void setPickingAssmId(Long pickingAssmId) {
		this.pickingAssmId = pickingAssmId;
	}

	public double getPickAssmQty() {
		return pickAssmQty;
	}

	public void setPickAssmQty(double pickAssmQty) {
		this.pickAssmQty = pickAssmQty;
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}
	
	

	public double getRemQty() {
		return remQty;
	}

	public void setRemQty(double remQty) {
		this.remQty = remQty;
	}

	public PickingMst getPickingMst() {
		return pickingMst;
	}

	public void setPickingMst(PickingMst pickingMst) {
		this.pickingMst = pickingMst;
	}		

	public AssemblyMst getAssemblyMst() {
		return assemblyMst;
	}

	public void setAssemblyMst(AssemblyMst assemblyMst) {
		this.assemblyMst = assemblyMst;
	}

	public int getReplacedPickingAssmId() {
		return replacedPickingAssmId;
	}

	public void setReplacedPickingAssmId(int replacedPickingAssmId) {
		this.replacedPickingAssmId = replacedPickingAssmId;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	@Override
	public String toString() {
		return "PickingAssembly [pickingAssmId=" + pickingAssmId + ", pickAssmQty=" + pickAssmQty + ", status=" + status
				+ ", remQty=" + remQty + ", pickingMst=" + pickingMst + ", assemblyMst=" + assemblyMst + "]";
	}
	
	
}
