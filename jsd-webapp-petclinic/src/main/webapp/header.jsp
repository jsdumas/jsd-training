<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<%@ taglib prefix="sec"
	uri="http://www.springframework.org/security/tags"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ page session="true"%>

<c:set var="sessionCust" value="${sessionScope.SPRING_SECURITY_CONTEXT}" />
<c:set var="req" value="${pageContext.request}" />
<c:set var="url">${req.requestURL}</c:set>
<c:set var="uri" value="${req.requestURI}" />
<c:set var="host"
	value="${fn:substring(url, 0, fn:length(url) - fn:length(uri))}${req.contextPath}" />

<c:set var="lang"
	value="${not empty param.lang ? param.lang : not empty lang ? lang : pageContext.request.locale}"
	scope="session" />
<fmt:setLocale value="${lang}" scope="session" />
<html>

<head>

<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta name="description" content="">
<meta name="author" content="">

<title>Petclinic - Bootstrap Admin Theme</title>

<!-- Bootstrap Core CSS -->
<link
	href="${host}/bower_components/bootstrap/dist/css/bootstrap.min.css"
	rel="stylesheet">

<!-- MetisMenu CSS -->
<link href="${host}/bower_components/metisMenu/dist/metisMenu.min.css"
	rel="stylesheet">

<!-- DataTables CSS -->
<link
	href="${host}/bower_components/datatables-plugins/integration/bootstrap/3/dataTables.bootstrap.css"
	rel="stylesheet">

<!-- DataTables Responsive CSS -->
<link
	href="${host}/bower_components/datatables-responsive/css/dataTables.responsive.css"
	rel="stylesheet">

<!-- Custom CSS -->
<link href="${host}/dist/css/sb-admin-2.css" rel="stylesheet">

<!-- Custom Fonts -->
<link
	href="${host}/bower_components/font-awesome/css/font-awesome.min.css"
	rel="stylesheet" type="text/css">

<!-- HTML5 Shim and Respond.js IE8 support of HTML5 elements and media queries -->
<!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
<!--[if lt IE 9]>
	        <script src="https://oss.maxcdn.com/libs/html5shiv/3.7.0/html5shiv.js"></script>
	        <script src="https://oss.maxcdn.com/libs/respond.js/1.4.2/respond.min.js"></script>
	    <![endif]-->

<div id="wrapper">
	<!-- Navigation -->
	<nav class="navbar navbar-default navbar-static-top" role="navigation"
		style="margin-bottom: 0">
		<div class="navbar-header">
			<button type="button" class="navbar-toggle" data-toggle="collapse"
				data-target=".navbar-collapse">
				<span class="sr-only">Toggle navigation</span> <span
					class="icon-bar"></span> <span class="icon-bar"></span> <span
					class="icon-bar"></span>
			</button>
			<a class="navbar-brand" href="${host}/index.do"><fmt:message
					key="titre_page" /></a>
		</div>
		<!-- /.navbar-header -->

		<ul class="nav navbar-top-links navbar-right">
			<li class="dropdown"><a class="dropdown-toggle"
				data-toggle="dropdown" href="#"> <i class="fa fa-language fa-fw"></i>
					<i class="fa fa-caret-down"></i>
			</a>
				<ul class="dropdown-menu dropdown-messages">
					<li><a href="?lang=en">
							<div>
								<i class="fa  fa-empire fa-fw"></i> <span
									class="pull-right text-muted"> en</span>
							</div>
					</a></li>
					<li><a href="?lang=fr">
							<div>
								<i class="fa  fa-rebel  fa-fw"></i> <span
									class="pull-right text-muted"> fr</span>
							</div>
					</a></li>
				</ul> <!-- /.dropdown-user --></li>
			<c:if test="${sessionCust != null}">
				<li class="dropdown"><a class="dropdown-toggle"
					data-toggle="dropdown" href="#"> <i class="fa fa-user fa-fw"></i>
						<i class="fa fa-caret-down"></i>
				</a>
					<ul class="dropdown-menu dropdown-user">
						<li><a href="${host}/logout"> <i
								class="fa fa-edit  fa-sign-out"></i> <fmt:message key="logout" />
						</a></li>
					</ul> <!-- /.dropdown-user --></li>
			</c:if>
			<!-- /.dropdown -->
		</ul>
		<!-- /.navbar-top-links -->

		<div class="navbar-default sidebar" role="navigation">
			<div class="sidebar-nav navbar-collapse">
				<ul class="nav" id="side-menu">
					<li><a href="${host}/proprietaire/list.do"><i
							class="fa fa-table fa-fw"></i> <fmt:message key="lister" /></a></li>

					<sec:authorize access="hasRole('ADMIN')">
						<li><a href="${host}/proprietaire/edit.do"><i
								class="fa fa-edit fa-fw"></i> <fmt:message key="creation" /></a></li>
					</sec:authorize>

					<li><a href="${host}/animal/list.do"><i
							class="fa fa-table fa-fw"></i> <fmt:message key="lister-animaux" /></a>
					</li>

					<sec:authorize access="hasRole('ADMIN')">
						<li><a href="${host}/animal/edit.do"><i
								class="fa fa-edit fa-fw"></i> <fmt:message key="creation-animal" /></a></li>
					</sec:authorize>

					<li><a href="${host}/vaccin/list.do"><i
							class="fa fa-table fa-fw"></i> <fmt:message key="lister-vaccins" /></a>
					</li>

					<sec:authorize access="hasRole('ADMIN')">
						<li><a href="${host}/vaccin/edit.do"><i
								class="fa fa-edit fa-fw"></i> <fmt:message key="creation-vaccin" /></a></li>
					</sec:authorize>

					<li><a href="${host}/list-message.do"><i
							class="fa fa-table fa-fw"></i> <fmt:message key="lister-messages" /></a></li>

					<li><a href="${host}/swagger-ui-master/dist/documentationREST.jsp" target="blank"><i
							class="fa fa-table fa-fw"></i> <fmt:message key="documentationREST" /></a></li>

					<li><a href="${host}/search-engine/search-animal.do"><i
							class="fa fa-search fa-fw"></i> <fmt:message key="search-engine" /></a>
					</li>
					<sec:authorize access="hasRole('ADMIN')">
						<li><a href="${host}/export/export.do"><i
								class="fa fa-download  fa-fw"></i> <fmt:message key="export" /></a></li>
					</sec:authorize>


				</ul>
			</div>
			<!-- /.sidebar-collapse -->
		</div>
		<!-- /.navbar-static-side -->
	</nav>
	<div id="page-wrapper">

		<style type="text/css">
ul li {
	list-style: none;
}
</style>
</head>