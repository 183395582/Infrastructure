package com.gmzj.service.impl;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.gmzj.service.CemeteryService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"/spring-config.xml"})
public class CemeteryServiceImplTest {

	@Autowired
	ApplicationContext ctx;
	
	private CemeteryService companyService;
	
	@Before
	public void setUp() throws Exception {
		companyService = ctx.getBean(CemeteryServiceImpl.class);
	}

	@Test
	public void test() throws Exception {
//		List list = companyService.findCemeterys4Index("", 4);
//		System.out.println(list.size());
	}
	

}
