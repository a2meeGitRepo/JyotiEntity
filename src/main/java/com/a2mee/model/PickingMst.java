package com.a2mee.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="picking_mst")
public class PickingMst {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="picking_id")
	private Long pickingId;
	
	@Column(name="model_code")
	private String modelCode;
	
	@Column(name="pro_ord_no")
	private String proOrdNo;
	
	@Column(name="reservation_no")
	private String reservationNo;
	
	@Column(name="qty")
	private double pickQty;
	
	@Column(name="month")
	private String month;
	
	@Column(name="year")
	private String year;
	
	@Column(name="status")
	private int status;
	
	@Column(name="assign_date")
	private Date assignDate;
	
	@Column(name="pick_complete_date")
	private Date pickDate;
	
	@ManyToOne
	@JoinColumn(name="employee_id")
	private EmployeeMst employee;
	
	@ManyToOne
	@JoinColumn(name="model_plan_id")
	private ModelPlan modelPlan;
	
	@Column(name="upd_datetime")
	private String updDatetime;
	
	@Column(name="upd_user_id")
	private String updUserId;
	
	@Column(name="active")
	private String active;

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
	
	public double getPickQty() {
		return pickQty;
	}

	public void setPickQty(double pickQty) {
		this.pickQty = pickQty;
	}

	public String getMonth() {
		return month;
	}

	public void setMonth(String month) {
		this.month = month;
	}

	public String getYear() {
		return year;
	}

	public void setYear(String year) {
		this.year = year;
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}
	
	public EmployeeMst getEmployee() {
		return employee;
	}

	public void setEmployee(EmployeeMst employee) {
		this.employee = employee;
	}	

	public Date getAssignDate() {
		return assignDate;
	}

	public void setAssignDate(Date assignDate) {
		this.assignDate = assignDate;
	}

	public Date getPickDate() {
		return pickDate;
	}

	public void setPickDate(Date pickDate) {
		this.pickDate = pickDate;
	}

	
	public ModelPlan getModelPlan() {
		return modelPlan;
	}

	public void setModelPlan(ModelPlan modelPlan) {
		this.modelPlan = modelPlan;
	}

	public String getProOrdNo() {
		return proOrdNo;
	}

	public void setProOrdNo(String proOrdNo) {
		this.proOrdNo = proOrdNo;
	}

	public String getUpdDatetime() {
		return updDatetime;
	}

	public void setUpdDatetime(String updDatetime) {
		this.updDatetime = updDatetime;
	}

	public String getUpdUserId() {
		return updUserId;
	}

	public void setUpdUserId(String updUserId) {
		this.updUserId = updUserId;
	}

	public String getActive() {
		return active;
	}

	public void setActive(String active) {
		this.active = active;
	}
	
	public String getReservationNo() {
		return reservationNo;
	}

	public void setReservationNo(String reservationNo) {
		this.reservationNo = reservationNo;
	}

	@Override
	public String toString() {
		return "PickingMst [pickingId=" + pickingId + ", modelCode=" + modelCode + ", proOrdNo=" + proOrdNo
				+ ", reservationNo=" + reservationNo + ", modelPlan=" + modelPlan + "]";
	}

	
	
	
	
}
