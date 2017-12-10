<%@ taglib prefix="s" uri="/struts-tags"%>

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
										
										
									</tr>


								</s:iterator>
							</tbody>
						</table>