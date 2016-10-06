package com.gmzj.entity.vo;

import java.util.ArrayList;
import java.util.List;

import com.gmzj.entity.Pic;

/**
 * 更新图片顺序，SpringMVC接收图片的请求类
 */
public class PicListWebRequest {
	private List<Pic> piclist=new ArrayList<Pic>();

	public List<Pic> getPiclist() {
		return piclist;
	}

	public void setPiclist(List<Pic> piclist) {
		this.piclist = piclist;
	}	
}
