<%@ page language="java" contentType="text/html; charset=UTF-8"
   pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="sec"
	uri="http://www.springframework.org/security/tags"%>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@include file="../header.jsp" %>

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
                <div class="panel-heading">
                    
                </div>
				<div class="panel-body">
	            	<div class="dataTable_wrapper">
	                    <table class="table table-striped table-bordered table-hover" id="dataTables-example">
	                        <thead>
								<tr>
									<th><fmt:message key="vaccin.type" /></th>
									<th><fmt:message key="vaccin.inoculation" /></th>
									<th><fmt:message key="vaccin.rappel" /></th>
									<th><fmt:message key="animal" /></th>
									<th><fmt:message key="vaccin.emailSent" /></th>
									<sec:authorize access="hasRole('ADMIN')">
									<th><fmt:message key="actions" /></th>
									</sec:authorize>
								</tr>
							</thead>
		
							<c:forEach items="${vaccins}" var="v">
								<tr>
									<td>${v.type}</td>
									<td>${v.inoculation}</td>
									<td>${v.rappel}</td>
									<td>${v.animal.nom}</td>
									<td>${v.emailSent}</td>
									<sec:authorize access="hasRole('ADMIN')">
									<td>
				                       <a href="update.do?id=${v.id}" class="btn btn-success btn-circle"><i class="fa fa-list"></i></a>
				                       <a href="remove.do?id=${v.id}" class="btn btn-danger btn-circle"><i class="fa fa-times"></i></a>
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