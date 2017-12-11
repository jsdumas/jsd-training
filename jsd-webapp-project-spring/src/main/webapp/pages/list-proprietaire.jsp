<%@ page language="java" contentType="text/html; charset=UTF-8"
   pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="sec"
	uri="http://www.springframework.org/security/tags"%>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@include file="../header.jsp" %>

	<div class="row">
        <div class="col-lg-12">
            <h1 class="page-header"><fmt:message key="lister" /></h1>
        </div>
        <!-- /.col-lg-12 -->
    </div>
    <!-- /.row -->
    <div class="row">
    	<div class="col-lg-12">
    		<div class="panel panel-default">
                <div class="panel-heading">
                    <fmt:message key="table" />
                </div>
				<div class="panel-body">
					<c:if test="${msgErreur1 != null}"><div class="alert alert-danger"><fmt:message key="Impossibledesupprimerunproprietaireavecdesanimaux!" /></div></c:if>
	            	<div class="dataTable_wrapper">
	                    <table class="table table-striped table-bordered table-hover" id="dataTables-example">
	                        <thead>
								<tr>

									<th><fmt:message key="proprietaire.nom" /></th>
									<th><fmt:message key="proprietaire.prenom" /></th>
									<th><fmt:message key="proprietaire.dateNaissance" /></th>
									<th><fmt:message key="proprietaire.email" /></th>
									<sec:authorize access="hasRole('ADMIN')">
									<th><fmt:message key="actions" /></th>
									</sec:authorize>

								</tr>
							</thead>
		
							<c:forEach items="${proprietaires}" var="p">
								<tr>
									<td>${p.firstName}</td>
									<td>${p.lastName}</td>
									<td>${p.birthDate}</td>
									<td>${p.email}</td>
									<sec:authorize access="hasRole('ADMIN')">
									<td>
				                       <a href="update.do?id=${p.id}" class="btn btn-success btn-circle"><i class="fa fa-list"></i></a>
				                       <a href="remove.do?id=${p.id}" class="btn btn-danger btn-circle"><i class="fa fa-times"></i></a>
				                       
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

<%@include file="../footer.jsp" %>
