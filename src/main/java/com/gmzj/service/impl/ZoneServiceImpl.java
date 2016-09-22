package com.gmzj.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gmzj.dao.impl.DaoSupport;
import com.gmzj.entity.Zone;
import com.gmzj.entity.ZoneExample;
import com.gmzj.entity.Page;
import com.gmzj.service.ZoneService;


@Service
public class ZoneServiceImpl implements ZoneService{

	@Autowired
	private DaoSupport<Zone> dao;
	
	private static String mapperName = "mybatis.files.ZoneMapper";
	
	public List<Zone> listPage(Page page) throws Exception{
		return dao.findForList(mapperName+".listPage", page);
	}
	
	public List<Zone> findZones(ZoneExample example) throws Exception{
		return dao.findForList(mapperName+".selectByExample", example);
	}

	public Zone findZoneByKey(int key) throws Exception {
		// TODO Auto-generated method stub
		return dao.findForObject(mapperName+".selectByPrimaryKey", key);
	}

	public Zone findZone(ZoneExample example) throws Exception {
		// TODO Auto-generated method stub
		return dao.findForObject(mapperName+".selectByExample", example);
	}

	public int insert(Zone zone) throws Exception {
		// TODO Auto-generated method stub
		return dao.insert(mapperName+".insert", zone);
	}

	public int update(Zone zone) throws Exception {
		// TODO Auto-generated method stub
		return dao.update(mapperName+".updateByPrimaryKey", zone);
	}

	public int delete(int id) throws Exception {
		// TODO Auto-generated method stub
		return dao.delete(mapperName+".deleteByPrimaryKey", id);
	}
	
}

