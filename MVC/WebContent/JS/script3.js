
	$('input[type=submit]').click(function(event){
		event.preventDefault();

			var login = $("input#login").val();
			var password = $("input#password").val();
			
			$.post("../Login", {log : login, pass: password}, 
				function(response,status){
					if (response == 1){
						$("div").html(response + " Connected");
						//alert("OK");
					}
					else if (response == 0){
						$("div").html(response + " Mauvais mot de passe ou login");
						//alert("Mauvais mot de passe ou login");
					}
					else{
						alert ("error");
					}
				});
	});
