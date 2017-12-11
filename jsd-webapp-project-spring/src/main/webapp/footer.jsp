
</div>
<!-- /#page-wrapper -->

</div>
<!-- /#wrapper -->

<!-- jQuery -->
<script src="${host}/bower_components/jquery/dist/jquery.min.js"></script>

<!-- Bootstrap Core JavaScript -->
<script
	src="${host}/bower_components/bootstrap/dist/js/bootstrap.min.js"></script>

<!-- Metis Menu Plugin JavaScript -->
<script src="${host}/bower_components/metisMenu/dist/metisMenu.min.js"></script>

<!-- DataTables JavaScript -->
<script
	src="${host}/bower_components/datatables/media/js/jquery.dataTables.min.js"></script>
<script
	src="${host}/bower_components/datatables-plugins/integration/bootstrap/3/dataTables.bootstrap.min.js"></script>

<!-- Custom Theme JavaScript -->
<script src="${host}/dist/js/sb-admin-2.js"></script>

<!-- Page-Level Demo Scripts - Tables - Use for reference -->
<script>
	$(document).ready(function() {
		$('#dataTables-example').DataTable({
			responsive : true,
			language : {
				<c:if test="${lang == 'fr'}">

					url : "//cdn.datatables.net/plug-ins/1.10.7/i18n/French.json"

				</c:if>
				<c:if test="${lang == 'en'}">

					url : "//cdn.datatables.net/plug-ins/1.10.7/i18n/English.json"

				</c:if>

			}
		});
	});
</script>
</body>

</html>