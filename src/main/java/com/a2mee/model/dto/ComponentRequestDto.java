package com.a2mee.model.dto;

import java.util.List;

public class ComponentRequestDto {
	private List<PickingDto> modelPos;
	private List<String> assemblyCodes;
	public List<PickingDto> getModelPos() {
		return modelPos;
	}
	public void setModelPos(List<PickingDto> modelPos) {
		this.modelPos = modelPos;
	}
	public List<String> getAssemblyCodes() {
		return assemblyCodes;
	}
	public void setAssemblyCodes(List<String> assemblyCodes) {
		this.assemblyCodes = assemblyCodes;
	}
	
	

}
