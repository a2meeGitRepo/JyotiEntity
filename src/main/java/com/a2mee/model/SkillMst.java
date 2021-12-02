package com.a2mee.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "skill_mst")
public class SkillMst {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="skill_id")
	private long skillId;
	
	@Column(name="skill_code")
	private String skillCode;
	
	@Column(name="skill_name")
	private String skillName;

	public long getSkillId() {
		return skillId;
	}

	public void setSkillId(long skillId) {
		this.skillId = skillId;
	}

	public String getSkillCode() {
		return skillCode;
	}

	public void setSkillCode(String skillCode) {
		this.skillCode = skillCode;
	}

	public String getSkillName() {
		return skillName;
	}

	public void setSkillName(String skillName) {
		this.skillName = skillName;
	}

	@Override
	public String toString() {
		return "SkillMst [skillId=" + skillId + ", skillCode=" + skillCode + ", skillName=" + skillName + "]";
	}	

}
