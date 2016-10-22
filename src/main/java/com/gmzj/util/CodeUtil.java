package com.gmzj.util;

import java.util.Arrays;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import com.gmzj.entity.AreaInfo;
import com.gmzj.entity.CemType;
import com.gmzj.entity.Pic;
import com.gmzj.entity.RegionMap;

/** 
 * 类名称：FreemarkerController
 * 创建人：FH 
 * 创建时间：2015年1月12日
 * @version
 */
public class CodeUtil {
	
	/**
	 * 
	 * @param packageName 包名
	 * @param name 描述
	 * @param c 类
	 * @throws Exception
	 */
	public static void proCode(String packageName, String name, Class<?> c) throws Exception{
		Map<String,Object> root = new HashMap<String,Object>();		//创建数据模型
		String className = c.getSimpleName();
		root.put("fieldList", Arrays.asList(c.getDeclaredFields()));
		root.put("name", name);										//描述
		root.put("packageName", packageName);						//包名
		root.put("className", className);							//类名
		root.put("classNameLower", className.toLowerCase());		//类名(全小写)
		root.put("classNameUpper", className.toUpperCase());		//类名(全大写)
		root.put("nowDate", new Date());							//当前日期
		
		DelAllFile.delFolder(PathUtil.getClasspath()+"admin/ftl"); //生成代码前,先清空之前生成的代码
		/* ============================================================================================= */
		
		String filePath = "src/main/java/";					//存放路径
		String ftlPath = "template";		
		//ftl路径
		
		/*生成controller*/
		Freemarker.printFile("controllerTemplate.ftl", root, packageName+"/web/controller/"+className+"Controller.java", filePath, ftlPath);
		
		/*生成service*/
		Freemarker.printFile("IServiceTemplate.ftl", root, packageName+"/service/"+className+"Service.java", filePath, ftlPath);
		Freemarker.printFile("ServiceImplTemplate.ftl", root, packageName+"/service/impl/"+className+"ServiceImpl.java", filePath, ftlPath);

		/*生成mybatis xml*/
//		Freemarker.printFile("mapperMysqlTemplate.ftl", root, "mybatis_mysql/"+packageName+"/"+className+"Mapper.xml", filePath, ftlPath);
//		Freemarker.printFile("mapperOracleTemplate.ftl", root, "mybatis_oracle/"+packageName+"/"+className+"Mapper.xml", filePath, ftlPath);
		
		/*生成SQL脚本*/
//		Freemarker.printFile("mysql_SQL_Template.ftl", root, "mysql数据库脚本/TB_"+className.toUpperCase()+".sql", filePath, ftlPath);
//		Freemarker.printFile("oracle_SQL_Template.ftl", root, "oracle数据库脚本/TB_"+className.toUpperCase()+".sql", filePath, ftlPath);
		
		/*生成jsp页面*/
//		Freemarker.printFile("jsp_list_Template.ftl", root, "jsp/"+packageName+"/"+className.toLowerCase()+"/"+className.toLowerCase()+"_list.jsp", filePath, ftlPath);
//		Freemarker.printFile("jsp_edit_Template.ftl", root, "jsp/"+packageName+"/"+className.toLowerCase()+"/"+className.toLowerCase()+"_edit.jsp", filePath, ftlPath);
		
		/*生成说明文档*/
//		Freemarker.printFile("docTemplate.ftl", root, "说明.doc", filePath, ftlPath);
	}
	
	public static void main(String[] args) throws Exception {
		CodeUtil.proCode("com/gmzj", "墓型", RegionMap.class);
	}
}
