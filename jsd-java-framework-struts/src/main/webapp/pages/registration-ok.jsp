<%@ taglib prefix="s" uri="/struts-tags"%>

<s:include value="header.jsp" >
	<s:param value="%{getText('register.success')}" name="title"/>
</s:include>

<div class="alert alert-success">
	<s:actionmessage />
</div>

<s:include value="footer.jsp" />