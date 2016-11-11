package com.gmzj.entity.custom;

import com.gmzj.entity.CemType;


@SuppressWarnings("serial")
public class CemTypeCustom extends CemType{
	
	private String cemeteryName;
	
	public String getCemeteryName() {
		return cemeteryName;
	}

	public void setCemeteryName(String cemeteryName) {
		this.cemeteryName = cemeteryName;
	}

}
