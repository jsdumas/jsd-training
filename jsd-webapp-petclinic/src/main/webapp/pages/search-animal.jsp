<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>

<%@include file="../header.jsp"%>

<%-- <sj:head/> --%>
<div class="row">
	<div class="col-lg-12">
		<h1 class="page-header">
			<fmt:message key="search-engine" />
		</h1>
	</div>
	<!-- /.col-lg-12 -->
</div>
<div class="row">
	<div class="col-lg-12">
		<div class="panel panel-default">
			<div class="panel-heading"></div>
			<div class="panel-body">
			
				<div class="dataTable_wrapper" >
				 	<table class="table table-striped table-bordered table-hover" id="dataTables-example">
                        <thead>
							<tr>
								<th><fmt:message key="animal.nom" /></th>
								<th><fmt:message key="animal.dateNaissance" /></th>
							</tr>
						</thead>
						
						<tbody id="result">
						
						
						</tbody>
					</table>
				</div>
			</div>
		</div>
	</div>
</div>
<div class="row">
	<div class="col-lg-6">

		<div class="input-group custom-search-form">

			<form:form id="form_ajax">
				<div class="form-group">
					<input type="text" class="form-control"
						placeholder="<fmt:message key='searchByUsername' />" id="searchedNomProp" style="min-width:250px;"/>
					<span class="input-group-btn"> 
		               <a id="ajax-submit-nomProp" class="btn btn-default" style="height: 34px;
															 	border-left: medium none;
														 		border-radius: 0 4px 4px 0; 
													 			padding-top: 10px;
															 	padding-bottom: 10px;">
															 	<i class="fa fa-search"></i>
															 	</a>
					</span>
				</div>
				<div class="form-group">
					<input type="text" class="form-control"
						placeholder="<fmt:message key='searchByTypeOfAnimal' />" id="searchedTypeAnim"/>
					<span class="input-group-btn"> 
		               <a id="ajax-submit-typeAnim" class="btn btn-default" style="height: 34px;
															 	border-left: medium none;
														 		border-radius: 0 4px 4px 0; 
													 			padding-top: 10px;
															 	padding-bottom: 10px;">
															 	<i class="fa fa-search"></i>
															 	</a>
					</span>
				</div>
				<div class="form-group">
					<input type="text" class="form-control"
						placeholder="<fmt:message key='searchByAgeOfAnimal' />" id="searchedAgeAnim"/>
					<span class="input-group-btn"> 
		               <a id="ajax-submit-ageAnim" class="btn btn-default" style="height: 34px;
															 	border-left: medium none;
														 		border-radius: 0 4px 4px 0; 
													 			padding-top: 10px;
															 	padding-bottom: 10px;">
															 	<i class="fa fa-search"></i>
															 	</a>
					</span>
				</div>
				
			</form:form>
		</div>

	</div>
</div>




<%@include file="../footer.jsp"%>

<script type="text/javascript">

	function parseListAnimal(data){
		
		var $result = $("#result");
		$result.empty();
		
		if(data.length >0)
		{
			
		 	for(iterator in data)
            {
		 		var $tr = $("<tr/>");
		 		
                var $td1 = $("<td/>");
                $td1.append(data[iterator]['nom']);
                $tr.append($td1)
                
                var $td2 = $("<td/>");
                $td2.append(data[iterator]['dateDeNaissance']);
                $tr.append($td2)

		 		$result.append($tr);
		 		
            }
		}
	}

	$(document).ready(function() {
		$("#ajax-submit-nomProp").click(function(e) {
			e.preventDefault();
			
			var nomProprietaire = $(searchedNomProp).val()
			
			$.ajax({
				type : "post",
				url : "ajaxListingNomProp.do",
				dataType : "json",
				data : "nom_proprietaire="+nomProprietaire,
				success : function(data) {
					parseListAnimal(data);
				}

			});
		});
		$("#ajax-submit-typeAnim").click(function(e) {
			e.preventDefault();
			
			var typeAnim = $(searchedTypeAnim).val()
			
			$.ajax({
				type : "post",
				url : "ajaxListingTypeAnim.do",
				dataType : "json",
				data : "type_animal="+typeAnim,
				success : function(data) {
					parseListAnimal(data);
				}

			});
		});
		$("#ajax-submit-ageAnim").click(function(e) {
			e.preventDefault();
			
			var ageAnim = $(searchedAgeAnim).val()
			
			$.ajax({
				type : "post",
				url : "ajaxListingAgeAnim.do",
				dataType : "json",
				data : "age_animal="+ageAnim,
				success : function(data) {
					parseListAnimal(data);
				}

			});
		});

	});
</script>
