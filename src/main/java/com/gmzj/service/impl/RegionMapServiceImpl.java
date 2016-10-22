package com.gmzj.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gmzj.dao.impl.DaoSupport;
import com.gmzj.entity.RegionMap;
import com.gmzj.entity.RegionMapExample;
import com.gmzj.entity.Page;
import com.gmzj.service.RegionMapService;


@Service
public class RegionMapServiceImpl implements RegionMapService{

	@Autowired
	private DaoSupport<RegionMap> dao;
	
	private static String mapperName = "mybatis.files.RegionMapMapper";
	
	public List<RegionMap> listPage(Page page) throws Exception{
		return dao.findForList(mapperName+".listPage", page);
	}
	
	public List<RegionMap> findRegionMaps(RegionMapExample example) throws Exception{
		return dao.findForList(mapperName+".selectByExample", example);
	}

	public RegionMap findRegionMapByKey(String key) throws Exception {
		// TODO Auto-generated method stub
		return dao.findForObject(mapperName+".selectByPrimaryKey", key);
	}

	public RegionMap findRegionMap(RegionMapExample example) throws Exception {
		// TODO Auto-generated method stub
		return dao.findForObject(mapperName+".selectByExample", example);
	}

	public int insert(RegionMap regionmap) throws Exception {
		// TODO Auto-generated method stub
		return dao.insert(mapperName+".insert", regionmap);
	}

	public int update(RegionMap regionmap) throws Exception {
		// TODO Auto-generated method stub
		return dao.update(mapperName+".updateByPrimaryKey", regionmap);
	}

	public int delete(int id) throws Exception {
		// TODO Auto-generated method stub
		return dao.delete(mapperName+".deleteByPrimaryKey", id);
	}
	
	public String findRegionFullName(String no) throws Exception {
		RegionMap region = this.findRegionMapByKey(no);
		if (region == null) return "";
		if(region.getLvl().intValue() == 1) {
			return region.getName();
		} else {
			return findRegionFullName(region.getManageno()) + "-" + region.getName();
		}
	}

}

