package com.gmzj.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gmzj.dao.impl.DaoSupport;
import com.gmzj.entity.CemType;
import com.gmzj.entity.CemTypeExample;
import com.gmzj.entity.Page;
import com.gmzj.service.CemTypeService;


@Service
public class CemTypeServiceImpl implements CemTypeService{

	@Autowired
	private DaoSupport<CemType> dao;
	
	private static String mapperName = "mybatis.files.CemTypeMapper";
	
	public List<CemType> listPage(Page page) throws Exception{
		return dao.findForList(mapperName+".listPage", page);
	}
	
	public List<CemType> findCemTypes(CemTypeExample example) throws Exception{
		return dao.findForList(mapperName+".selectByExample", example);
	}

	public CemType findCemTypeByKey(int key) throws Exception {
		// TODO Auto-generated method stub
		return dao.findForObject(mapperName+".selectByPrimaryKey", key);
	}

	public CemType findCemType(CemTypeExample example) throws Exception {
		// TODO Auto-generated method stub
		return dao.findForObject(mapperName+".selectByExample", example);
	}

	public int insert(CemType cemtype) throws Exception {
		// TODO Auto-generated method stub
		return dao.insert(mapperName+".insert", cemtype);
	}

	public int update(CemType cemtype) throws Exception {
		// TODO Auto-generated method stub
		return dao.update(mapperName+".updateByPrimaryKey", cemtype);
	}

	public int delete(int id) throws Exception {
		// TODO Auto-generated method stub
		return dao.delete(mapperName+".deleteByPrimaryKey", id);
	}
	
}

