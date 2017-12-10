<%@ taglib prefix="s" uri="/struts-tags"%>

<s:include value="header.jsp">
	<s:param value="%{getText('register.title')}" name="title" />
</s:include>


<hr>
<h1>
	<s:property value="%{getText('register.h1')}" />
</h1>
<hr>



<%-- 	<s:form action="registration"> --%>
<%-- 		<s:fielderror/> --%>

<%-- 		<s:textfield name="personne.nom" label="%{getText('label.firstname')}"/> --%>
<%-- 		<s:textfield name="personne.prenom" label="%{getText('label.lastname')}"/> --%>
<%-- 		<s:textfield name="personne.age" label="%{getText('label.old')}"/> --%>
<%-- 		<s:textfield name="personne.email" label="%{getText('label.mail')}"/> --%>
<%-- 		<s:textfield name="personne.username" label="%{getText('label.username')}"/> --%>
<%-- 		<s:password name="personne.password" label="%{getText('label.password')}"/> --%>
<%-- 		<s:submit /> --%>
<%-- 	</s:form> --%>

<form action="registration" method="post" role="form">

	<input type="hidden" name="personne.id" value="<s:property value="personne.id"/>"/>

	<div class="form-group">
		<label><s:property value="%{getText('label.firstname')}" /></label>
		<input class="form-control"
			type="text" name="personne.nom"
			value="<s:property value="personne.nom"/>" />
	</div>

	<div class="form-group">
		<label><s:property value="%{getText('label.lastname')}" /></label>
		<input class="form-control"
			type="text" name="personne.prenom"
			value="<s:property value="personne.prenom"/>" />
	</div>

	<div class="form-group">
		<label><s:property value="%{getText('label.old')}" /></label>
		<input class="form-control"
			type="text" name="personne.age"
			value="<s:property value="personne.age"/>" />
	</div>

	<div class="form-group">
		<label><s:property value="%{getText('label.mail')}" /></label>
		<input class="form-control"
			type="text" name="personne.email"
			value="<s:property value="personne.email"/>" />
	</div>

	<div class="form-group">
		<label><s:property value="%{getText('label.username')}" /></label>
		<input class="form-control"
			type="text" name="personne.username"
			value="<s:property value="personne.username"/>" />
	</div>

	<div class="form-group">
		<label><s:property value="%{getText('label.password')}" /></label>
		<input class="form-control"
			type="password" name="personne.password"
			value="<s:property value="personne.password"/>" />
	</div>

	<input type="submit" class="btn btn-default" />

</form>

<s:include value="footer.jsp" />