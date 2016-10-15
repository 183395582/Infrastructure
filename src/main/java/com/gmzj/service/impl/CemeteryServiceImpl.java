package com.gmzj.service.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
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
	
	public List<Cemetery> findCemeterys(CemeteryExample example) throws Exception{
		return dao.findForList(mapperName+".selectByExample", example);
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
	
	@Cacheable(value={"cemetery", "index"})
	public List<Cemetery> findCemeterys4Index(String type, int toIndex) throws Exception{
		Map<String, Object> param = new HashMap<String, Object>(2);
		CemeteryExample example = new CemeteryExample();
//		example.createCriteria().andTypeEqualTo(type);
		param.put("example", example);
		param.put("num", 4);
		return dao.findForList(mapperName+".selectByExample_limit", example);
//		//根据评分排序
//		example.setOrderByClause("score desc");
//		List<Cemetery> list = this.findCemeterys(example);
//		if (CollectionUtils.isNotEmpty(list) && list.size() > toIndex) {
//			list = new ArrayList<Cemetery>(list.subList(0, toIndex));
//		}
//		return list;
		
	}

}
