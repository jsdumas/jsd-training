<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@include file="../header.jsp"%>

<div class="row">
	<div class="col-lg-12">
		<h1 class="page-header"><fmt:message key="lister-animaux" /></h1>
	</div>
	<!-- /.col-lg-12 -->
</div>
<!-- /.row -->
<div class="row">
	<div class="col-lg-12">
		<div class="panel panel-default">
			<div class="panel-heading"><fmt:message key="animal" /></div>
			<div class="panel-body">
				<div class="row">
					<form:form action="edit.do" method="POST" commandName="animalDTO"
						enctype="multipart/form-data">
						<div class="col-lg-6">
							<%-- 							<spring:hasBindErrors name="animal"> --%>
							<!-- 								<div class="alert alert-danger"> -->
							<%-- 									<form:errors path="nom" /> --%>
							<%-- 									<form:errors path="dateDeNaissance" /> --%>
							<!-- 								</div> -->
							<%-- 							</spring:hasBindErrors> --%>

							<form:hidden path="id" />

							<c:if test="${animalDTO.id == null}">
								<div class="form-group">
									<label>Type d'animal</label>
									<form:select path="type" cssClass="form-control">
										<form:option value="chat" />
										<form:option value="cheval" />
										<form:option value="chien" />
										<form:option value="tortue" />
									</form:select>
								</div>
							</c:if>
							<c:if test="${animalDTO.id != null}">
								<form:hidden path="type" />
							</c:if>

							<div class="form-group">
								<label><fmt:message key="animal.nom" /></label>
								<form:input path="nom" cssClass="form-control" />
							</div>

							<div class="form-group">
								<label><fmt:message key="animal.dateNaissance" /></label>
								<form:input path="dateDeNaissance" cssClass="form-control" />
							</div>

							<div class="form-group">
								<label><fmt:message key="proprietaire" /></label>
								<form:select path="proprietaireId" cssClass="form-control" >
									<form:options items="${animalDTO.proprietaires}"  itemLabel="firstName" itemValue="id"></form:options>
								</form:select>
							</div>

						</div>
						<div class="col-lg-6">

							<div class="form-group">
								<label><fmt:message key="fileUpload" /></label> <input type="file" name="file" />
							</div>
							<div class="form-group">
								<img alt="no profile pic yet"
									src="${host}/upload/animal/${animalDTO.id}.jpeg"
									class="img-responsive" alt="Responsive image">
							</div>
							<input type="submit" class="btn btn-default" />

						</div>
					</form:form>
				</div>
			</div>
		</div>

	</div>
</div>

<%@include file="../footer.jsp"%>