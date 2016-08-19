package com.gmzj.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import com.gmzj.dao.impl.DaoSupport;
import com.gmzj.entity.RegionMap;
import com.gmzj.entity.RegionMapExample;
import com.gmzj.service.PubService;

@Service
@SuppressWarnings("rawtypes")
public class PubServiceImpl implements PubService{

	@Autowired
	private DaoSupport<?> dao;
	
	private static String mapperName = "mybatis.files.RegionMapMapper";
	
	public String findRegionName(String no) throws Exception {
		// TODO Auto-generated method stub
		RegionMap region = this.findRegion(no);
		if (region == null) return "";
		return region.getName();
	}
	
	public String findRegionFullName(String no) throws Exception {
		// TODO Auto-generated method stub
		RegionMap region = this.findRegion(no);
		if (region == null) return "";
		if(region.getLvl().intValue() == 1) {
			return region.getName();
		} else {
			return findRegionFullName(region.getManageno()) + "-" + region.getName();
		}
	}
	
	public List findRegionByManageNo(String key) throws Exception {
		// TODO Auto-generated method stub
		RegionMapExample example = new RegionMapExample();
		example.createCriteria().andManagenoEqualTo(key);
		return dao.findForList(mapperName+".selectByExample", example);
	}
	
	@Cacheable(value="region")
	private RegionMap findRegion(String no) throws Exception{
		RegionMap region = (RegionMap) dao.findForObject(mapperName+".selectByPrimaryKey", no);
		return region;
	}
}
