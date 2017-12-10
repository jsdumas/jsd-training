<%@ taglib prefix="s" uri="/struts-tags"%>

<s:include value="header.jsp">
	<s:param value="Liste des personnes enregistrées" name="title" />
</s:include>


<hr>
<h1>Liste des personnes :</h1>
<hr>



<div class="row">
	<div class="col-lg-12">
		<div class="panel panel-default">
			<div class="panel-heading">Liste de personne</div>
			<!-- /.panel-heading -->
			<div class="panel-body">
				<div class="dataTable_wrapper">
					<s:if
						test="!personnes.isEmpty() && !(personnes.size() == 1 && personnes.get(0).equals(user))">

						<table class="table table-striped table-bordered table-hover"
							id="dataTables-example">
							<thead>
								<tr>
									<th>id</th>
									<th>Prénom</th>
									<th>Nom</th>
									<th>Age</th>
									<th>Email</th>
									<th>Username</th>
									<th>Password</th>
									<th>Update</th>
									<th>Supprimer</th>
								</tr>
							</thead>
							<tbody>
								<s:iterator value="personnes">


									<tr>
										<td><s:property value="id" /></td>
										<td><s:property value="nom" /></td>
										<td><s:property value="prenom" /></td>
										<td><s:property value="age" /></td>
										<td><s:property value="email" /></td>
										<td><s:property value="username" /></td>
										<td><s:property value="password" /></td>
										<td>
											<form action="updatePersonne" method="post" role="form">
												<input type="hidden" name="personne.id"
													value="<s:property value="id"/>" />
												<button type="submit" class="btn btn-primary btn-circle">
													<i class="fa fa-list"></i>
												</button>

											</form>
										</td>
										<td>
											<form action="deletePersonne" method="post" role="form">
												<input type="hidden" name="personne.id"
													value="<s:property value="id"/>" />
												<button type="submit" class="btn btn-warning btn-circle">
													<i class="fa fa-times"></i>
												</button>
											</form>
										</td>
									</tr>


								</s:iterator>
							</tbody>
						</table>
					</s:if>
					<s:else>La liste est vide</s:else>


				</div>
				<!-- /.table-responsive -->

				<s:include value="footer.jsp" />