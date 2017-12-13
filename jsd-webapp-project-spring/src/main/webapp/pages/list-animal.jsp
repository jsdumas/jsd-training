<%@ page language="java" contentType="text/html; charset=UTF-8"	pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="sec"
	uri="http://www.springframework.org/security/tags"%>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@include file="../header.jsp"%>

<div class="row">
	<div class="col-lg-12">
		<h1 class="page-header">
			<fmt:message key="lister-animaux" />
		</h1>
	</div>
	<!-- /.col-lg-12 -->
</div>
<!-- /.row -->
<div class="row">
	<div class="col-lg-12">
		<div class="panel panel-default">
			<div class="panel-heading"></div>
			<div class="panel-body">
				
				<c:if test="${msgErreur != null}"><div class="alert alert-danger"><fmt:message key="Impossibledesupprimerunanimalavecdesvaccins!" /></div></c:if>
				<div class="dataTable_wrapper">
					<table class="table table-striped table-bordered table-hover"
						id="dataTables-example">
						<thead>
							<tr>
								<th><fmt:message key="animal.type" /></th>
								<th><fmt:message key="animal.nom" /></th>
								<th><fmt:message key="animal.dateNaissance" /></th>
								<th><fmt:message key="proprietaire.nom" /></th>
								<sec:authorize access="hasRole('ADMIN')">
									<th><fmt:message key="actions" /></th>
								</sec:authorize>
							</tr>
						</thead>

						<c:forEach items="${animals}" var="a">
							<tr>
								<td>${a.getTypeLabel()}</td>
								<td>${a.nom}</td>
								<td>${a.dateDeNaissance}</td>
								<td>${a.proprietaire.firstName}${a.proprietaire.lastName}</td>
								<sec:authorize access="hasRole('ADMIN')">
									<td><a href="update.do?id=${a.id}"
										class="btn btn-success btn-circle"><i class="fa fa-list"></i></a>
										<a href="remove.do?id=${a.id}"
										class="btn btn-danger btn-circle"><i class="fa fa-times"></i></a>
									</td>
								</sec:authorize>
							</tr>
						</c:forEach>
					</table>
				</div>
			</div>
		</div>
	</div>
</div>

<%@include file="../footer.jsp"%>