package com.a2mee.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="error_mst")
public class ErrorMst {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="error_id")
	private int errorId;
	
	@Column(name="error_code")
	private int errorCode;
	
	@Column(name="error_message")
	private String errorMessage;

	public ErrorMst() {
		
	}

	public int getErrorId() {
		return errorId;
	}

	public void setErrorId(int errorId) {
		this.errorId = errorId;
	}

	public int getErrorCode() {
		return errorCode;
	}

	public void setErrorCode(int errorCode) {
		this.errorCode = errorCode;
	}

	public String getErrorMessage() {
		return errorMessage;
	}

	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}

	@Override
	public String toString() {
		return "ErrorMst [errorId=" + errorId + ", errorCode=" + errorCode + ", errorMessage=" + errorMessage + "]";
	}
	
	
	
}
