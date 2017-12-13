<%@ taglib prefix="s" uri="/struts-tags"%>


<s:include value="header.jsp">
	<s:param value="%{getText('login.title')}" name="title"/>
</s:include>


<div class="row">
	<div class="col-lg-12">
		<h1 class="page-header"><s:property value="%{getText('login.title')}"/></h1>

<%-- 		<s:form action="login"> --%>
<%-- 			<s:textfield name="personne.username" label="Username" /> --%>
<%-- 			<s:password name="personne.password" label="Password" /> --%>
<%-- 			<s:submit /> --%>
<%-- 		</s:form> --%>
		
		<form action="login" method="post" role="form">
		
		<div class="form-group">
		<label><s:property value="%{getText('label.username')}"/></label>
			<input class="form-control" type="text" name="personne.username" value="<s:property value="personne.username"/>"/>
		</div>
		<div class="form-group">
		<label><s:property value="%{getText('label.password')}"/></label>
			<input class="form-control" type="password" name="personne.password" value="<s:property value="personne.password"/>"/>
		</div>
			
			<input type="submit" class="btn btn-default"/>
		</form>


	</div>
</div>

<s:include value="footer.jsp" />