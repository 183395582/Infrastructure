<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="gmfn" uri="http://www.gmzj.co/tags/functions"%>
<jsp:include page="../comm/script.jsp" flush="true" />
<jsp:include page="../comm/css.jsp" flush="true" />
<jsp:include page="../comm/mapJs.jsp" flush="true" />
<%@ include file="../comm/taglib.jsp" %>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>
<html>
<head>
	<style>
		label{
			margin-top: 7px;
		}
		.row{
			margin-top: 10px;
		}
		#city select {
			height: 32px;
		}
	</style>
</head>
<body>

    <div class="box border">
				<div class="box-title">
					<h4>
						<span>${op }</span>
					</h4>
					<div class="tools"></div>
				</div>
				<div class="box-body">
					<div class="box-body big">
						<form:form id="editform" modelAttribute="${classNameLower}" class="form-horizontal" method="POST">
							<form:hidden path="id"/>
							<#list fieldList as var>
							<#if var_index%2 != 1>
							<div class="row">
								<div class="col-md-2" style="text-align: right;">
									<label for="${fieldList[var_index]}">：</label>
								</div>
								<div class="col-md-3">
									<form:input path="${fieldList[var_index]}" class="form-control pull-left" placeholder=""/>
								</div>
								<div class="col-md-2 col-md-offset-1" style="text-align: right">
									<label for="${fieldList[var_index+1]}">：</label>
								</div>
								<div class="col-md-3">
								<form:input path="${fieldList[var_index+1]}" class="form-control pull-left" placeholder=""/>
								</div>
							</div>
							</#list>
							<br>
							<div class="row">
								<div class="col-md-offset-9">
									<button type="submit" class="btn btn-success">保存</button>
									<a class="btn btn-primary" href="<%=basePath%>/${classNameLower}/" target="content" role="button">返回</a>
								</div>
							</div>
							<div class="row">
								<div class="col-md-12" style="text-align: center;">
									<c:if test="${msg != null }">
										<div id="myAlert" class="alert alert-success">
											<a href="#" class="close" data-dismiss="alert">&times;</a>
											<strong>${msg }！</strong>
										</div>
									</c:if>
								</div>
							</div>
						</form:form>

					</div>
				</div>
				<!-- /BOX -->
			</div>
<#list fieldList as var>
	<#if var == 'prov'>
	<script type="text/javascript">
	$(function(){
		$("#city").citySelect({
			prov:"${${classNameLower}.prov}", 
			city:"${${classNameLower}.city}",
			dist:"${${classNameLower}.dist}",
			nodata:"none",
			required:false
		});
	});
	</script>
	</#if>
</#list>
</body>
</html>