<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>  
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@include file="../header.jsp" %>

<div class="row">
        <div class="col-lg-12">
            <h1 class="page-header"><fmt:message key="edit" /></h1>
        </div>
        <!-- /.col-lg-12 -->
    </div>

    <!-- /.row -->
    <div class="row">
    	<div class="col-lg-12">
    		<div class="panel panel-default">
                <div class="panel-heading">
                     <fmt:message key="form" />
                 </div>
                 <div class="panel-body">
	                 <div class="row">
                 		 <form:form action="edit.do" method="POST" commandName="proprietaire" enctype="multipart/form-data">
	                     <div class="col-lg-6">

								<spring:hasBindErrors name="proprietaire">
									<div class="alert alert-danger">
				                     	<form:errors path="lastName"/>
				                     	<form:errors path="firstName"/>
				                     	<form:errors path="birthDate"/>
				                     	<form:errors path="email"/>
										<form:errors path="password"/>
									</div>
								</spring:hasBindErrors>
							
								   <form:hidden path="id"/>
																       
							       <div class="form-group">
									   <label><fmt:message key="proprietaire.nom" /></label>
									   <form:input path="lastName" cssClass="form-control"/>
								   </div>
							       
							       <div class="form-group">
									   <label><fmt:message key="proprietaire.prenom" /></label>
									   <form:input path="firstName" cssClass="form-control"/>
								   </div>
							       
							       <div class="form-group">
									   <label><fmt:message key="proprietaire.dateNaissance" /></label>
									   <form:input path="birthDate" cssClass="form-control"/>
								   </div>
							       
							       <div class="form-group">
									   <label><fmt:message key="proprietaire.email" /></label>
									   <form:input path="email" cssClass="form-control"/>
								   </div>
							       
							       <div class="form-group">
									   <label><fmt:message key="proprietaire.password" /></label>
									   <form:input path="password" cssClass="form-control"/>									   
								   </div>
								
						</div>
						<div class="col-lg-6">
							
								<div class="form-group">
								   <label><fmt:message key="fileUpload" /></label>
								   <input type="file" name="file"/>									   
							   </div>
							   <div class="form-group">
							   		<img alt="no profile pic yet" src="${host}/upload/proprietaire/${proprietaire.id}.jpeg" class="img-responsive" alt="Responsive image">
							   </div>
							   <input type="submit" class="btn btn-default"/>
							
						</div>
						</form:form>
                     </div>
                  </div>
	         </div>            
    	
    	</div>
	</div>

<%@include file="../footer.jsp" %>