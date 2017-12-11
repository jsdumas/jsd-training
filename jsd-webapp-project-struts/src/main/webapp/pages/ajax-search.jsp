<%@ taglib prefix="s" uri="/struts-tags"%>
<%@ taglib prefix="sj" uri="/struts-jquery-tags"%>



<s:include value="header.jsp">
	<s:param value="%{getText('search.title')}" name="title" />

</s:include>

<div class="row">
	<div class="col-lg-12">
		<h1 class="page-header">
			<s:property value="%{getText('search.title')}" />
		</h1>

		<sj:head />


		<s:url value="updateList" id="urlUpdateList" />
		<sj:submit href="%{urlUpdateList}" targets="result" />


		<form id="showName" action="findByName" >
			<input type="text" name="personne.nom" value="testSPRING"/>
			<sj:submit formIds="showName" targets="result" button="true"/>
		</form>
		<div id="result"></div>



		<%-- 		<sj:a id="ajaxlink" href="%{ajax}" targets="result" --%>
		<%-- 			indicator="indicator" button="true" buttonIcon="ui-icon-refresh"> --%>
		<!-- 	  	Run AJAX Action -->
		<%-- 	</sj:a> --%>

	</div>
</div>

<s:include value="footer-ajax.jsp" />