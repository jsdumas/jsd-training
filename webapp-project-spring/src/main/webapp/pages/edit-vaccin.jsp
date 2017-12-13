<%@ page language="java" contentType="text/html; charset=UTF-8"	pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@include file="../header.jsp"%>

<div class="row">
	<div class="col-lg-12">
		<h1 class="page-header"><fmt:message key="lister-vaccins" /></h1>
	</div>
	<!-- /.col-lg-12 -->
</div>
<!-- /.row -->
<div class="row">
	<div class="col-lg-12">
		<div class="panel panel-default">
			<div class="panel-heading"></div>
			<div class="panel-body">
				<div class="row">
					<div class="col-lg-6">
						<form:form action="edit.do" method="POST" commandName="vaccinDTO">
							<form:hidden path="id" />
<%-- 							<form:hidden path="animalId" /> --%>

							<div class="form-group">
								<label><fmt:message key="vaccin.type" /></label>
								<form:input path="type" cssClass="form-control" />
							</div>

							<div class="form-group">
								<label><fmt:message key="vaccin.inoculation" /></label>
								<form:input path="inoculation" cssClass="form-control" />
							</div>

							<div class="form-group">
								<label><fmt:message key="vaccin.rappel" /></label>
								<form:input path="rappel" cssClass="form-control" />
							</div>
							
							<div class="form-group">
								<label><fmt:message key="animal" /></label>
								<form:select path="animalId" cssClass="form-control" >
									<form:options items="${vaccinDTO.animals}"  itemLabel="nom" itemValue="id"></form:options>
								</form:select>
							</div>

							<input type="submit" class="btn btn-default" />
						</form:form>
					</div>
				</div>
			</div>
		</div>

	</div>
</div>

<%@include file="../footer.jsp"%>