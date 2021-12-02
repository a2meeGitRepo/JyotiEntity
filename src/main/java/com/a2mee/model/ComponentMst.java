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
@Table(name="component_mst")
public class ComponentMst {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="component_id")
	private Long compId;

	@Column(name="component_code")
	private String compCode;
	
	@Column(name="component_desc")
	private String compDesc;
	
	@Column(name="qty")
	private double compQty;
	
	@Column(name="uom")
	private String uom;
	
	@Transient
	private String reservationNo;
	
	@ManyToOne
	@JoinColumn(name="assembly_id")
	private AssemblyMst assembly;	

	public ComponentMst() {
	}

	public ComponentMst(String compCode, String compDesc, double compQty, String uom) {
		super();
		this.compCode = compCode;
		this.compDesc = compDesc;
		this.compQty = compQty;
		this.uom = uom;
	}

	public Long getCompId() {
		return compId;
	}

	public void setCompId(Long compId) {
		this.compId = compId;
	}

	public String getCompCode() {
		return compCode;
	}

	public void setCompCode(String compCode) {
		this.compCode = compCode;
	}

	public String getCompDesc() {
		return compDesc;
	}

	public void setCompDesc(String compDesc) {
		this.compDesc = compDesc;
	}

	

	public double getCompQty() {
		return compQty;
	}

	public void setCompQty(double compQty) {
		this.compQty = compQty;
	}

	public AssemblyMst getAssembly() {
		return assembly;
	}

	public void setAssembly(AssemblyMst assembly) {
		this.assembly = assembly;
	}
	
	public String getUom() {
		return uom;
	}

	public void setUom(String uom) {
		this.uom = uom;
	}

	public String getReservationNo() {
		return reservationNo;
	}

	public void setReservationNo(String reservationNo) {
		this.reservationNo = reservationNo;
	}

	
}
