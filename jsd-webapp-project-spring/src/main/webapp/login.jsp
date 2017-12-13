<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="sec"
	uri="http://www.springframework.org/security/tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<%@include file="header.jsp"%>
<div class="row">
        <div class="col-lg-12">
            <h1 class="page-header"><fmt:message key="identification" /></h1>
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
	                 <div class="row">
	                     <div class="col-lg-6">
	                     	<form action="login" method="POST">
								<div class="form-group">
									<label><fmt:message key="login" /></label>
									<input type="text" name="username" class="form-control"/>
								</div>
								<div class="form-group">
									<label><fmt:message key="proprietaire.password" /></label>
									<input type="password" name="password" class="form-control"/>
								</div>
								<input type="submit" value="OK" class="btn btn-default"/>
							</form>
	                     
	                     </div>
                     </div>
                  </div>
	         </div>            
    	
    	</div>
	</div>
<%@include file="footer.jsp"%>