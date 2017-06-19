function validar(){
	
	var retorno = true;
	if (origem.value == ""){
		origem.style.border = "1px solid red";
		labelOrigem.style.color = "red";
	
	}else{
		origem.style.border = "1px solid silver";
		labelOrigem.style.color = "black";
	}
	if (destino.value == ""){
		destino.style.border = "1px solid red";
		labelDestino.style.color = "red";
	
	}else{
		destino.style.border = "1px solid silver";
		labelDestino.style.color = "black";
	}
	if (ida.value == ""){
		ida.style.border = "1px solid red";
		labelIda.style.color = "red";
	
	}else{
		ida.style.border = "1px solid silver";
		labelIda.style.color = "black";
	}
	if (volta.value == ""){
		volta.style.border = "1px solid red";
		labelVolta.style.color = "red";
	
	}else{
		volta.style.border = "1px solid silver";
		labelVolta.style.color = "black";
	}
	
}