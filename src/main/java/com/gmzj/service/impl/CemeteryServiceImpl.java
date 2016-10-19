package com.gmzj.service.impl;

import java.util.Collections;
import java.util.List;

import org.apache.commons.collections.CollectionUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gmzj.dao.impl.DaoSupport;
import com.gmzj.entity.Cemetery;
import com.gmzj.entity.CemeteryExample;
import com.gmzj.entity.Page;
import com.gmzj.service.CemeteryService;

@Service
public class CemeteryServiceImpl implements CemeteryService {

	@Autowired
	private DaoSupport<Cemetery> dao;
	
	private static String mapperName = "mybatis.files.CemeteryMapper";

	public List<Cemetery> listPage(Page page) throws Exception{
		return dao.findForList(mapperName+".listPage", page);
	}
	
	@SuppressWarnings("unchecked")
	public List<Cemetery> findCemeterys(CemeteryExample example) throws Exception{
		List<Cemetery> list = dao.findForList(mapperName+".selectByExample", example);
		if (CollectionUtils.isEmpty(list))
			return Collections.EMPTY_LIST;
		return list;
	}

	public Cemetery findCemeteryByKey(int key) throws Exception {
		// TODO Auto-generated method stub
		return dao.findForObject(mapperName+".selectByPrimaryKey", key);
	}

	public Cemetery findCemetery(CemeteryExample example) throws Exception {
		// TODO Auto-generated method stub
		return dao.findForObject(mapperName+".selectByExample", example);
	}

	public int insert(Cemetery cemetery) throws Exception {
		// TODO Auto-generated method stub
		return dao.insert(mapperName+".insert", cemetery);
	}

	public int update(Cemetery cemetery) throws Exception {
		// TODO Auto-generated method stub
		return dao.update(mapperName+".updateByPrimaryKey", cemetery);
	}

	public int delete(int id) throws Exception {
		// TODO Auto-generated method stub
		return dao.delete(mapperName+".deleteByPrimaryKey", id);
	}

}
