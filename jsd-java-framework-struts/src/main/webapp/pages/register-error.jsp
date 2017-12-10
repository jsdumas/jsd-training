<%@ taglib prefix="s" uri="/struts-tags"%>

<s:include value="header.jsp" />

<jsp:param value="%{getText('register.error')}" name="title"/>


<div class="alert alert-danger">
<s:actionerror/>
</div>

<s:include value="footer.jsp" />