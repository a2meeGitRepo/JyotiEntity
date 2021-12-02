package com.a2mee.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "title_mst")
public class TitleMst {
	
	@Id
	@GeneratedValue(strategy= GenerationType.AUTO)
	@Column(name = "title_id")
	private int titleId; 
	
	@Column(name = "title_name")
	private String titleName;

	public int getTitleId() {
		return titleId;
	}

	public void setTitleId(int titleId) {
		this.titleId = titleId;
	}

	public String getTitleName() {
		return titleName;
	}

	public void setTitleName(String titleName) {
		this.titleName = titleName;
	}

	@Override
	public String toString() {
		return "TitleMst [titleId=" + titleId + ", titleName=" + titleName + "]";
	}
	
}
