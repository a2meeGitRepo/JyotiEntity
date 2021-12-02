package com.a2mee.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="model_mst")
public class ModelMst {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="model_id")
	private Long modelId;

	@Column(name="model_code")
	private String modelCode;

	public Long getModelId() {
		return modelId;
	}

	public void setModelId(Long modelId) {
		this.modelId = modelId;
	}

	public String getModelCode() {
		return modelCode;
	}

	public void setModelCode(String modelCode) {
		this.modelCode = modelCode;
	}

	@Override
	public String toString() {
		return "ModelMst [modelId=" + modelId + ", modelCode=" + modelCode + "]";
	}

	
	
	
}
