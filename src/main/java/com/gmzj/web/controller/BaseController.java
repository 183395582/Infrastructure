package com.gmzj.web.controller;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class BaseController {
	
	protected String input;

	protected Map<String, Object> modelMap;
	
	protected HttpServletRequest request;
	
	static Logger logger = LoggerFactory.getLogger(BaseController.class);
	
	public String getInput() {
		return input;
	}

	public void setInput(String input) {
		this.input = input;
	}

	public Map<String, Object> getModelMap() {
		return modelMap;
	}

	public void setModelMap(Map<String, Object> modelMap) {
		this.modelMap = modelMap;
	}

	public HttpServletRequest getRequest() {
		return request;
	}

	public void setRequest(HttpServletRequest request) {
		this.request = request;
	}
	
	private String getFileName(String type, String extName) {
		StringBuffer path = new StringBuffer(type);
		path.append(String.format("%d", System.currentTimeMillis()));
		path.append(String.format("%03d", (int) (Math.random() * 1000)));
		path.append(".");
		path.append(extName);
		return path.toString();
	}
	
}
