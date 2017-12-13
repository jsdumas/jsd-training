<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@include file="../header.jsp"%>

<div class="row">
	<div class="col-lg-12">

		<h1 class="page-header"><fmt:message key="export" /></h1>

		<p></p>
	</div>
	<!-- /.col-lg-12 -->
</div>
<!-- /.row -->
<div class="row">
	<div class="col-lg-3">
		<form:form action="export.do" method="POST" commandName="exportDTO"
			id="formExport">
			<label><fmt:message key="telecharger-donnees" /></label>
			<div class="form-group">
				<form:select path="choice" cssClass="form-control">
					<form:option value="Animal">
						<fmt:message key="animal" />
					</form:option>
					<form:option value="Proprietaire">
						<fmt:message key="proprietaire" />
					</form:option>
				</form:select>
			</div>
			<div class="form-group">
				<div>
					<label><fmt:message key="nombre-de-lignes" /></label>
				</div>
				<div>
					<form:input path="resultNumber" cssClass="form-control"
						id="resultNumber" name="resultNumber" />
					<form:errors path="resultNumber" cssclass="error"></form:errors>
				</div>
			</div>
			<div class="form-group">
				<button type="submit" value="export">
					<fmt:message key="telecharger-fichier" />
				</button>
			</div>
		</form:form>
	</div>
</div>

<%@include file="../footer.jsp"%>