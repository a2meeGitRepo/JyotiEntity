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
@Table(name = "attendance_mst")
public class AttendanceMst {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="attendance_id")
	private long attId;
	
	@Column(name="attendance_date")
	private String attDate;
	
	@Column(name="in_time")
	private String inTime;
	
	@Column(name="out_time")
	private String outTime;
	
	@Column(name="device_id")
	private String deviceId;
	
	@Column(name="status")
	private String status;
	
	@Column(name="present")
	private int isPresent;
	
	@Column(name="upd_user_id")
	private String updUserId;
	
	@Column(name="upd_datetime")
	private String updDateTime;
	
	@Column(name="active")
	private int active;
	
	@ManyToOne
	@JoinColumn(name = "employee_id")
	private EmployeeMst employeeMst;
	
	public AttendanceMst() {
		
	}

	public long getAttId() {
		return attId;
	}

	public void setAttId(long attId) {
		this.attId = attId;
	}

	public String getAttDate() {
		return attDate;
	}

	public void setAttDate(String attDate) {
		this.attDate = attDate;
	}

	public String getInTime() {
		return inTime;
	}

	public void setInTime(String inTime) {
		this.inTime = inTime;
	}

	public String getOutTime() {
		return outTime;
	}

	public void setOutTime(String outTime) {
		this.outTime = outTime;
	}

	public String getDeviceId() {
		return deviceId;
	}

	public void setDeviceId(String deviceId) {
		this.deviceId = deviceId;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public int getIsPresent() {
		return isPresent;
	}

	public void setIsPresent(int isPresent) {
		this.isPresent = isPresent;
	}

	public String getUpdUserId() {
		return updUserId;
	}

	public void setUpdUserId(String updUserId) {
		this.updUserId = updUserId;
	}

	public String getUpdDateTime() {
		return updDateTime;
	}

	public void setUpdDateTime(String updDateTime) {
		this.updDateTime = updDateTime;
	}

	public int getActive() {
		return active;
	}

	public void setActive(int active) {
		this.active = active;
	}
	
	public EmployeeMst getEmployeeMst() {
		return employeeMst;
	}

	public void setEmployeeMst(EmployeeMst employeeMst) {
		this.employeeMst = employeeMst;
	}

	@Override
	public String toString() {
		return "AttendanceMst [attId=" + attId + ", attDate=" + attDate + ", inTime=" + inTime + ", outTime=" + outTime
				+ ", deviceId=" + deviceId + ", status=" + status + ", isPresent=" + isPresent + ", updUserId="
				+ updUserId + ", updDateTime=" + updDateTime + ", active=" + active + ", employeeMst=" + employeeMst.toString()
				+ "]";
	}
	
	
	
}
