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