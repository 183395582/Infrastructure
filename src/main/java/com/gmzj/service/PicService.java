package com.gmzj.service;

import java.util.List;

import org.springframework.transaction.annotation.Transactional;

import com.gmzj.entity.Pic;
import com.gmzj.entity.PicExample;
import com.gmzj.entity.Page;


public interface PicService {

	/**
	 * 分页查询
	 * @param page
	 * @return
	 * @throws Exception
	 */
	List<Pic> listPage(Page page) throws Exception;

	/**
	 * 查询信息
	 * @param example
	 * @return
	 * @throws Exception
	 */
	List<Pic> findPics(PicExample example) throws Exception;
	
	/**
	 * 通过主键查询信息
	 * @param key
	 * @return
	 * @throws Exception
	 */
	Pic findPicByKey(int key) throws Exception;
	
	/**
	 * 新增信息
	 * @param pic
	 * @return
	 * @throws Exception
	 */
	@Transactional(rollbackFor=Exception.class)
	int insert(Pic pic) throws Exception;
	
	/**
	 * 更新信息
	 * @param pic
	 * @return
	 * @throws Exception
	 */
	@Transactional(rollbackFor=Exception.class)
	int update(Pic pic) throws Exception;
	
	/**
	 * 删除信息
	 * @param id
	 * @return
	 * @throws Exception
	 */
	@Transactional(rollbackFor=Exception.class)
	int delete(int id) throws Exception;

	/**
	 * 更新图片顺序
	 * @param list
	 * @return
	 * @throws Exception 
	 */
	@Transactional(rollbackFor=Exception.class)
	boolean updateSeqs(List<Pic> list) throws Exception;
	
}

