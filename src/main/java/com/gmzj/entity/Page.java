package com.gmzj.entity;

import com.gmzj.util.Const;
import com.gmzj.util.Tools;

public class Page {
	
	private int showCount; //每页显示记录数
	private int totalPage;		//总页数
	private int totalResult;	//总记录数
	private int currentPage;	//当前页
	private int currentResult;	//当前记录起始索引
	private boolean entityOrField;	//true:需要分页的地方，传入的参数就是Page实体；false:需要分页的地方，传入的参数所代表的实体拥有Page属性
	private Object parm;
	

	
	public Page(){
		try {
			this.showCount = Integer.parseInt(Tools.readTxtFile(Const.PAGE));
		} catch (Exception e) {
			this.showCount = 10;
		}
	}
	
	public int getTotalPage() {
		if(totalResult%showCount==0)
			totalPage = totalResult/showCount;
		else
			totalPage = totalResult/showCount+1;
		return totalPage;
	}
	
	public void setTotalPage(int totalPage) {
		this.totalPage = totalPage;
	}
	
	public int getTotalResult() {
		return totalResult;
	}
	
	public void setTotalResult(int totalResult) {
		this.totalResult = totalResult;
	}
	
	public int getCurrentPage() {
		if(currentPage<=0)
			currentPage = 1;
		if(currentPage>getTotalPage())
			currentPage = getTotalPage();
		return currentPage;
	}
	
	public void setCurrentPage(int currentPage) {
		this.currentPage = currentPage;
	}
    
	public String getPageStr(){
		StringBuffer sb = new StringBuffer();
		sb.append("<li><a href='#' onclick='nextPage(1);'>首页</a></li>");
		if(currentPage - 1  > 0){
			sb.append("<li><a href='#' onclick='nextPage(" + (currentPage-1 ) + ");'>上一页</a></li>");
		}else{
			sb.append("<li class='disabled'><a href='#' >上一页</a></li>");
		}
		if(totalResult>0){
			if (totalPage < 6 || currentPage < 3) {
					for (int i = 1; i <= totalPage; i++) {
						if (i > 5) continue;
						if (currentPage == i) {
							sb.append("<li class='active'><a href='#' onclick='nextPage("+currentPage+");'>"+ i +"</a></li>");
						} else {
							sb.append("<li><a href='#' onclick='nextPage("+ i +");'>"+ i +"</a></li>");
						}
					}
				
			}
			if (totalPage > 6 && currentPage >= 3) {
					if (currentPage  == totalPage) {
						sb.append("<li><a href='#' onclick='nextPage("+ (currentPage - 4) +");'>"+ (currentPage - 4) +"</a></li>");
						sb.append("<li><a href='#' onclick='nextPage("+ (currentPage - 3) +");'>"+ (currentPage - 3) +"</a></li>");
					}
					if (currentPage + 1 == totalPage) 
						sb.append("<li><a href='#' onclick='nextPage("+ (currentPage - 3) +");'>"+ (currentPage - 3) +"</a></li>");
					sb.append("<li><a href='#' onclick='nextPage("+ (currentPage - 2) +");'>"+ (currentPage - 2) +"</a></li>");
					sb.append("<li><a href='#' onclick='nextPage("+ (currentPage - 1) +");'>"+ (currentPage - 1) +"</a></li>");
					sb.append("<li class='active'><a href='#' onclick='nextPage("+ currentPage +");'>"+ currentPage +"</a></li>");
					if (currentPage + 1 <= totalPage)
						sb.append("<li><a href='#' onclick='nextPage("+ (currentPage + 1) +");'>"+ (currentPage + 1) +"</a></li>");
					if (currentPage + 2 <= totalPage)
						sb.append("<li><a href='#' onclick='nextPage("+ (currentPage + 2) +");'>"+ (currentPage + 2) +"</a></li>");
			}
		}
		if (currentPage == totalPage) {
			sb.append("<li class='disabled'><a href='#' >下一页</a></li>");
		} else {
			sb.append("<li><a href='#' onclick='nextPage("+(currentPage+1)+");'>下一页</a></li>");
		}
		sb.append("<li><a href='#' onclick='nextPage("+totalPage+");'>末页</a></li>");
		sb.append("<script type=\"text/javascript\">\n");
		
		//换页函数
		sb.append("function nextPage(page){");
		sb.append("document.getElementById('currentPage').value=page;document.forms[0].submit();");
		sb.append("}");
		
		sb.append("</script>");
		return sb.toString();
	}
	
	public int getShowCount() {
		return showCount;
	}
	
	public void setShowCount(int showCount) {
		
		this.showCount = showCount;
	}
	
	public int getCurrentResult() {
		currentResult = (getCurrentPage()-1)*getShowCount();
		if(currentResult<0)
			currentResult = 0;
		return currentResult;
	}
	
	public void setCurrentResult(int currentResult) {
		this.currentResult = currentResult;
	}
	
	public boolean isEntityOrField() {
		return entityOrField;
	}
	
	public void setEntityOrField(boolean entityOrField) {
		this.entityOrField = entityOrField;
	}

	public Object getParm() {
		return parm;
	}

	public void setParm(Object parm) {
		this.parm = parm;
	}
	
}
