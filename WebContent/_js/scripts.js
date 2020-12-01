$(document).ready(function(){
console.log("JQuery esta funcionado");
});

function deleteImagemDestaque(id){
	let urlAction = "imgdestaque?action=delImagemDestaque&id=" + id;
	
$.ajax({
	url: urlAction,
	method: 'GET',
	success: function(response){
		if(response==='OK'){
			alert('Imagem deleteada com sucesso')
			window.location.reload();
		} else{
			alert(response)
		}
	},
	error: function(response){
		alert(respose);
	}
});	
	
}

function imgContrastUpdate(id){
	let urlAction = 'imgdestaque?action=updateImagemDestaque&id='+ id;
	
	$.ajax({
		url: urlAction,
		method: 'GET',
		dataType: 'json',
		success: function(obj){
			if(obj){
				console.log(obj);
				$('#id').val(obj.id);
				$('#nomeImagem').val(obj.name);
				$('#descricaoImagem').val(obj.description);
				$('#linkImagem').val(obj.link);
				$('#urlImagem').val(obj.urlimg);
				$('#imgContrastUpdateModal').modal('show');
			}
		}
	});
}
	