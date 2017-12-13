<%@ taglib prefix="s" uri="/struts-tags"%>

<s:include value="header.jsp">
	<s:param value="username inexistant" name="title" />
</s:include>

<div class="alert alert-danger">
	<s:actionerror />
</div>

<s:include value="footer.jsp" />