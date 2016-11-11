package com.gmzj.service.impl;

import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.gmzj.entity.CemeteryExample;
import com.gmzj.service.CemeteryService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"/spring-config.xml"})
public class CemeteryServiceImplTest {

	@Autowired
	ApplicationContext ctx;
	
	private CemeteryService cemeteryService;
	
	@Before
	public void setUp() throws Exception {
		cemeteryService = ctx.getBean(CemeteryServiceImpl.class);
	}

	@Test
	public void test() throws Exception {
//		List list = cemeteryService.findCemeterys(new CemeteryExample());
//		System.out.println(list.size());
	}
	

}
