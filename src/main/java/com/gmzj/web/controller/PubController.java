package com.gmzj.web.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.collections.CollectionUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.gmzj.entity.RegionMap;
import com.gmzj.entity.RegionMapExample;
import com.gmzj.entity.RegionMapExample.Criteria;
import com.gmzj.service.RegionMapService;

@Controller
@Scope("prototype")
@RequestMapping("pub/")
public class PubController{
	@Autowired
	private RegionMapService regionMapService;
	
	/**
	 * 根据父编号查询省市县
	 * @param req
	 * @return
	 * @throws Exception 
	 */
	@ResponseBody
	@RequestMapping(value="findRegion", method = RequestMethod.GET)
	public Map<String, Object> ajaxfindRegion(String key) throws Exception {  
		RegionMapExample example = new RegionMapExample();
		Criteria criteria = example.createCriteria();
		criteria.andManagenoEqualTo(key);
		List<RegionMap> list = regionMapService.findRegionMaps(example);
		Map<String, Object> map = new HashMap<String, Object>(3);
		map.put("succflag", 0);
		map.put("msg", null);
		map.put("data", list);
		return map;
    }
	
	/**
	 * 根据城市名称查询省市县
	 * @param req
	 * @return
	 * @throws Exception 
	 */
	@ResponseBody
	@RequestMapping(value="findRegionByName", method = RequestMethod.GET)
	public Map<String, Object> ajaxfindRegionByName(String cityName) throws Exception {  
		RegionMapExample example = new RegionMapExample();
		Criteria criteria = example.createCriteria();
		criteria.andNameLike(cityName+"%");
		List<RegionMap> list = regionMapService.findRegionMaps(example);
		if (CollectionUtils.isNotEmpty(list) && list.size() == 1) {
			RegionMap regionMap = list.get(0);
			return this.ajaxfindRegion(regionMap.getNo());
		}
		return null;
    }
	
	/**
	 * 查询省市县名称
	 * @param req
	 * @return
	 * @throws Exception 
	 */
	@ResponseBody
	@RequestMapping(value="findRegionName", method = RequestMethod.GET)
	public Map<String, Object> ajaxfindRegionName(String no) throws Exception {
		RegionMap region = regionMapService.findRegionMapByKey(no);
		if (region == null) return null;
		Map<String, Object> map = new HashMap<String, Object>(1);
		map.put("regionName", region.getName());
		return map;
    }
	
	@ResponseBody
	@RequestMapping(value="findRegionFullName", method = RequestMethod.GET)
	public String findRegionFullName(String no) throws NumberFormatException, Exception {
		RegionMap region = regionMapService.findRegionMapByKey(no);
		if (region == null) return "";
		if(region.getLvl().intValue() == 1) {
			return region.getName();
		} else {
			return findRegionFullName(region.getManageno()) + "-" + region.getName();
		}
	}
	
}
