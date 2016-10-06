package com.gmzj.service.impl;

import java.util.List;

import org.apache.commons.collections.CollectionUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gmzj.dao.impl.DaoSupport;
import com.gmzj.entity.Pic;
import com.gmzj.entity.PicExample;
import com.gmzj.entity.Page;
import com.gmzj.service.PicService;


@Service
public class PicServiceImpl implements PicService{

	@Autowired
	private DaoSupport<Pic> dao;
	
	private static String mapperName = "mybatis.files.PicMapper";
	
	public List<Pic> listPage(Page page) throws Exception{
		return dao.findForList(mapperName+".listPage", page);
	}
	
	public List<Pic> findPics(PicExample example) throws Exception{
		return dao.findForList(mapperName+".selectByExample", example);
	}

	public Pic findPicByKey(int key) throws Exception {
		// TODO Auto-generated method stub
		return dao.findForObject(mapperName+".selectByPrimaryKey", key);
	}

	public Pic findPic(PicExample example) throws Exception {
		// TODO Auto-generated method stub
		return dao.findForObject(mapperName+".selectByExample", example);
	}

	public int insert(Pic pic) throws Exception {
		// TODO Auto-generated method stub
		return dao.insert(mapperName+".insert", pic);
	}

	public int update(Pic pic) throws Exception {
		// TODO Auto-generated method stub
		return dao.update(mapperName+".updateByPrimaryKey", pic);
	}

	public int delete(int id) throws Exception {
		// TODO Auto-generated method stub
		return dao.delete(mapperName+".deleteByPrimaryKey", id);
	}
	
	public boolean updateSeqs(List<Pic> list) throws Exception {
		if(CollectionUtils.isNotEmpty(list)){
			for(Pic pic:list){
				dao.update(mapperName+".updateByPrimaryKeySelective", pic);
			}
		}
		return true;
	}
	
}

