package com.a2mee.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="dept_mst")
public class DeptMst {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="dept_id")
	private long deptId;
	
	@Column(name="dept_name")
	private String deptName;
	
	@Column(name="dept_desc")
	private String deptDesc;

	public long getDeptId() {
		return deptId;
	}

	public DeptMst() {
		super();
	}

	public void setDeptId(long deptId) {
		this.deptId = deptId;
	}

	public String getDeptName() {
		return deptName;
	}

	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}

	public String getDeptDesc() {
		return deptDesc;
	}

	public void setDeptDesc(String deptDesc) {
		this.deptDesc = deptDesc;
	}

	@Override
	public String toString() {
		return "DeptMst [deptId=" + deptId + ", deptName=" + deptName + ", deptDesc=" + deptDesc + "]";
	}

}
