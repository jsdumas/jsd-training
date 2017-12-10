<%@ taglib prefix="s" uri="/struts-tags"%>

<s:include value="header.jsp">
	<s:param value="Identification réussie" name="title" />
</s:include>


<div class="alert alert-success">
	<s:actionmessage />
</div>

<a href="personneList">List de personnes</a>

<s:include value="footer.jsp" />