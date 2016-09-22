package com.gmzj.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.collections.CollectionUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gmzj.dao.impl.DaoSupport;
import com.gmzj.entity.News;
import com.gmzj.entity.NewsExample;
import com.gmzj.entity.Page;
import com.gmzj.service.NewsService;


@Service
public class NewsServiceImpl implements NewsService{

	@Autowired
	private DaoSupport<News> dao;
	
	private static String mapperName = "mybatis.files.NewsMapper";
	
	public List<News> listPage(Page page) throws Exception{
		return dao.findForList(mapperName+".listPage", page);
	}
	
	public List<News> findNewss(NewsExample example) throws Exception{
		return dao.findForList(mapperName+".selectByExample", example);
	}

	public News findNewsByKey(int key) throws Exception {
		// TODO Auto-generated method stub
		return dao.findForObject(mapperName+".selectByPrimaryKey", key);
	}

	public News findNews(NewsExample example) throws Exception {
		// TODO Auto-generated method stub
		return dao.findForObject(mapperName+".selectByExample", example);
	}

	public int insert(News news) throws Exception {
		// TODO Auto-generated method stub
		return dao.insert(mapperName+".insert", news);
	}

	public int update(News news) throws Exception {
		// TODO Auto-generated method stub
		return dao.update(mapperName+".updateByPrimaryKey", news);
	}

	public int delete(int id) throws Exception {
		// TODO Auto-generated method stub
		return dao.delete(mapperName+".deleteByPrimaryKey", id);
	}

	public List<News> findNews4Index(int toIndex) throws Exception {
		// TODO Auto-generated method stub
		NewsExample example = new NewsExample();
		List<News> list = this.findNewss(example);
		if (CollectionUtils.isNotEmpty(list) && list.size() > toIndex) {
			list = new ArrayList<News>(list.subList(0, toIndex));
		}
		return list;
	}
	
}

