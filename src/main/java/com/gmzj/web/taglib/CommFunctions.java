package com.gmzj.web.taglib;

import com.gmzj.service.PubService;
import com.gmzj.service.impl.PubServiceImpl;
import com.gmzj.spring.SpringUtils;


@SuppressWarnings("rawtypes")
public class CommFunctions {
	
	public static String regionName(String id) throws Exception {
    	PubService service = SpringUtils.getBean(PubServiceImpl.class);
    	return service.findRegionName(id);
    }
	
	public static String regionFullName(String id) throws Exception {
    	PubService service = SpringUtils.getBean(PubServiceImpl.class);
    	return service.findRegionFullName(id);
    }

}

