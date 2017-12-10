<%@include file="../header.jsp" %>
	
	<div class="row">
        <div class="col-lg-12">

            <h1 class="page-header"><fmt:message key="bienvenu" /></h1>

            <p></p>
        </div>
        <!-- /.col-lg-12 -->
    </div>
    <!-- /.row -->
    <div class="row">
    	<div class="col-lg-12">
    	
    		<div class="panel panel-default">
			<div class="panel-body">

				<div class="dataTable_wrapper" >
				 	<table class="table table-striped table-bordered table-hover" id="dataTables">
                        <thead>
							<tr>
								<th><fmt:message key="message-name" /></th>
								<th><fmt:message key="message-type" /></th>
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

<%@include file="../footer.jsp" %>

<script type="text/javascript">

	function parseListMessage(data){
		
		var $result = $("#result");
		$result.empty();
		
		if(data.length >0)
		{
			
		 	for(iterator in data)
	        {
		 		var $tr = $("<tr/>");
		 		
	            var $td1 = $("<td/>");
	            $td1.append(data[iterator]['message']);
	            $tr.append($td1)
	            
	            var $td2 = $("<td/>");
	            $td2.append(data[iterator]['type']);
	            $tr.append($td2)
	
		 		$result.append($tr);
		 		
	        }
		}
	}

	$(document).ready(function() {
		function refreshAjax()
		{

			$.ajax({
				type : "get",
				url : "ajaxRefreshMessages.do",
				dataType : "json",
				success : function(data) {
					parseListMessage(data);
				}
			});

			setTimeout(refreshAjax, 10000);

		}
		refreshAjax();
		
	});




</script>
