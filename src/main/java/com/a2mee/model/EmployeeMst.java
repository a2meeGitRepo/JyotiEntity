package com.a2mee.model;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="employee_mst")
public class EmployeeMst {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="employee_id")
	private long empId;
	
	@Column(name="employee_code")
	private String empCode;
	
	@Column(name="first_name")
	private String firstName;
	
	@Column(name="middle_name")
	private String middleName;
	
	@Column(name="last_name")
	private String lastName;
	
	@Column(name="gender")
	private String gender;
	
	@Column(name="employee_designation")
	private String designation;
	
	@Column(name="email_id")
	private String emailId;
	
	@Column(name="contact_number")
	private String contactNo;
	
	@Column(name="date_of_birth")
	private Date dateOfBirth;
	
	@Column(name="date_of_joining")
	private Date dateOfJoining;
	
	@Column(name="nationality")
	private String nationality;
	
	@Column(name="blood_group")
	private String bloodGroup;
	
	@Column(name="aadhar_no")
	private String aadharNo;
	
	@Column(name="physically_handicapped")
	private String isHandicap;
	
	@Column(name="rf_id")
	private String rfId;
	
	@Column(name="employee_added_date")
	private Date empEntryDate;
	
	@Column(name="upd_user_id")
	private String updUserId;
	
	@Column(name="upd_datetime")
	private String updDateTime;
	
	@Column(name="active")
	private int active;
	
	@ManyToOne
	@JoinColumn(name = "skill_id")
	private SkillMst skillMst;
	
	@ManyToOne
	@JoinColumn(name = "title_id")
	private TitleMst titleMst;
	
	@ManyToOne
	@JoinColumn(name="dept_id")
	private DeptMst deptMst;
	
	public EmployeeMst() {
		
	}

	public long getEmpId() {
		return empId;
	}

	public void setEmpId(long empId) {
		this.empId = empId;
	}

	public String getEmpCode() {
		return empCode;
	}

	public void setEmpCode(String empCode) {
		this.empCode = empCode;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getMiddleName() {
		return middleName;
	}

	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public String getContactNo() {
		return contactNo;
	}

	public void setContactNo(String contactNo) {
		this.contactNo = contactNo;
	}

	public Date getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public Date getDateOfJoining() {
		return dateOfJoining;
	}

	public void setDateOfJoining(Date dateOfJoining) {
		this.dateOfJoining = dateOfJoining;
	}

	public String getNationality() {
		return nationality;
	}

	public void setNationality(String nationality) {
		this.nationality = nationality;
	}

	public String getBloodGroup() {
		return bloodGroup;
	}

	public void setBloodGroup(String bloodGroup) {
		this.bloodGroup = bloodGroup;
	}

	public String getAadharNo() {
		return aadharNo;
	}

	public void setAadharNo(String aadharNo) {
		this.aadharNo = aadharNo;
	}

	public String getIsHandicap() {
		return isHandicap;
	}

	public void setIsHandicap(String isHandicap) {
		this.isHandicap = isHandicap;
	}

	public String getRfId() {
		return rfId;
	}

	public void setRfId(String rfId) {
		this.rfId = rfId;
	}

	public Date getEmpEntryDate() {
		return empEntryDate;
	}

	public void setEmpEntryDate(Date empEntryDate) {
		this.empEntryDate = empEntryDate;
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
	
	public SkillMst getSkillMst() {
		return skillMst;
	}

	public void setSkillMst(SkillMst skillMst) {
		this.skillMst = skillMst;
	}
	
	public TitleMst getTitleMst() {
		return titleMst;
	}

	public void setTitleMst(TitleMst titleMst) {
		this.titleMst = titleMst;
	}	

	public DeptMst getDeptMst() {
		return deptMst;
	}

	public void setDeptMst(DeptMst deptMst) {
		this.deptMst = deptMst;
	}

	@Override
	public String toString() {
		return "EmployeeMst [empId=" + empId + ", empCode=" + empCode + ", firstName=" + firstName + ", middleName="
				+ middleName + ", lastName=" + lastName + ", gender=" + gender + ", designation=" + designation
				+ ", emailId=" + emailId + ", contactNo=" + contactNo + ", dateOfBirth=" + dateOfBirth
				+ ", dateOfJoining=" + dateOfJoining + ", nationality=" + nationality + ", bloodGroup=" + bloodGroup
				+ ", aadharNo=" + aadharNo + ", isHandicap=" + isHandicap + ", rfId=" + rfId + ", empEntryDate="
				+ empEntryDate + ", updUserId=" + updUserId + ", updDateTime=" + updDateTime + ", active=" + active
				+ ", skillMst=" + skillMst + ", titleMst=" + titleMst + ", deptMst=" + deptMst + "]";
	}
	
}
