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
@Table(name="model_plan")
public class ModelPlan {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="model_plan_id")
	private Long modelPlanId;

	@Column(name="model_code")
	private String modelCode;
	
	@Column(name="qrcode")
	private String qrcode;
	
	@Column(name="pro_ord_no")
	private String proOrdNo;
	
	@Column(name="qty")
	private double qty;
	
	@Column(name="month")
	private String month;
	
	@Column(name="year")
	private String year;
	
	@Column(name="picker_assigned")
	private int assigned;
	
	@ManyToOne
	@JoinColumn(name="employee_id")
	private EmployeeMst employee;
	
	@Column(name="upd_datetime")
	private String updDatetime;
	
	@Column(name="upd_user_id")
	private String updUserId;
	
	
	public ModelPlan() {
	}

	public ModelPlan(String modelCode, double qty, String month, String year) {
		this.modelCode = modelCode;
		this.qty = qty;
		this.month = month;
		this.year = year;
	}

	public Long getModelPlanId() {
		return modelPlanId;
	}

	public void setModelPlanId(Long modelPlanId) {
		this.modelPlanId = modelPlanId;
	}

	public String getModelCode() {
		return modelCode;
	}

	public void setModelCode(String modelCode) {
		this.modelCode = modelCode;
	}

	public double getQty() {
		return qty;
	}

	public void setQty(double qty) {
		this.qty = qty;
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

	public int getAssigned() {
		return assigned;
	}

	public void setAssigned(int assigned) {
		this.assigned = assigned;
	}

	public EmployeeMst getEmployee() {
		return employee;
	}

	public void setEmployee(EmployeeMst employee) {
		this.employee = employee;
	}

	public String getQrcode() {
		return qrcode;
	}

	public void setQrcode(String qrcode) {
		this.qrcode = qrcode;
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

	@Override
	public String toString() {
		return "ModelPlan [modelPlanId=" + modelPlanId + ", modelCode=" + modelCode + ", qty=" + qty + ", month="
				+ month + ", year=" + year + ", assigned=" + assigned + ", employee=" + employee + "]";
	}
	
	
	
}
