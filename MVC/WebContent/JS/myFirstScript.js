function validateMyForm () {
	var mf = false;
	var mfstr = "Missing fields : \n";
	var sum = "Summary : \n";
	var champs = document.getElementsByTagName('input');
	for (var i = 0; i <= champs.length - 1; i++) {
		//summary
		if (champs[i].type == "radio" && champs[i].checked) {
			sum+="-"+champs[i].name+" : "+champs[i].value+"\n";
		}
		else if(champs[i].type != "radio" && champs[i].type != "submit"){
			sum+="-"+champs[i].name+" : "+champs[i].value+"\n";
		}
		//missing fields
		if((champs[i].type == "text" || champs[i].type == "date") && champs[i].value == ""){
			mf = true;
			mfstr+=""+champs[i].name+"\n"
		}
	};
	if(mf){
		alert(mfstr);
	}
	else{
		alert(sum);
	}
}

function toggleFM (sex) {
	var A = document.getElementsByTagName("fieldset");
	var B = document.getElementsByTagName("legend");
	var C = document.getElementsByTagName("input");
	var D = document.getElementsByTagName("button");
	if (sex == "male") {
		for (var i = 0; i < A.length; i++) {
			A[i].style.borderColor = "#fd0e25";
		};
		for (var i = 0; i < B.length; i++) {
			B[i].style.color = "#fd0e25";
		};
		for (var i = 0; i < C.length; i++) {
			C[i].style.borderColor = "#fd0e25";
			C[i].style.backgroundColor = "#fff3f3";
		};
		for (var i = 0; i < C.length; i++) {
			D[i].style.borderColor = "#fd0e25";
			D[i].style.backgroundColor = "#fff3f3";
			D[i].style.boxShadow = "1px 1px 5px #fd0e25";
		};
		document.getElementsByTagName('h1')[0].innerHTML = "Hello Sir";
	}
	else{
		for (var i = 0; i < A.length; i++) {
			A[i].style.borderColor = "#2d47fc";
		};
		for (var i = 0; i < B.length; i++) {
			B[i].style.color = "#2d47fc";
		};
		for (var i = 0; i < C.length; i++) {
			C[i].style.borderColor = "#2d47fc";
			C[i].style.backgroundColor = "#d6f3fe";
		};
		for (var i = 0; i < C.length; i++) {
			D[i].style.borderColor = "#2d47fc";
			D[i].style.backgroundColor = "#d6f3fe";
			D[i].style.boxShadow = "1px 1px 5px #2d47fc";
		};
		document.getElementsByTagName('h1')[0].innerHTML = "Hello Madam";
	}
}