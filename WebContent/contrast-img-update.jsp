<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
  

  <div class="modal fade" tabindex="-1" id="imgContrastUpdateModal" aria-labelledby="exampleModalLabel" aria-hidden="true">
  <div class="modal-dialog">
    <div class="modal-content">
      <div class="modal-header">
        <h5 class="modal-title">Edtar imagem de destaque</h5>
        <button type="button" class="close" data-dismiss="modal" aria-label="Close">
          <span aria-hidden="true">&times;</span>
        </button>
      </div>
      <div class="modal-body">
      		
      	
      <form action="imgdestaque" method="post">
    <div class="form-group col-6">
      <label for="exampleFormControlTextarea1">Nome da imagem</label>
      <input type="text" class="form-control" name="nomeImagem" id="nomeImagem">
    </div>
    <div class="form-group col-6">
      <label for="exampleFormControlTextarea1">Descrição da imagem</label>
      <textarea  class="form-control" id="descricaoImagem" name="descricaoImagem" rows="3"></textarea>
    </div>
    <div class="form-group col-6">
      <label for="exampleFormControlTextarea1">link</label>
      <input type="text" class="form-control" id="linkImagem" name="linkImagem">
    </div>
    <div class="form-group col-6">
      <label for="exampleFormControlTextarea1">Url da imagem</label>
      <input type="text" class="form-control" id="urlImagem" name="urlImagem">
    </div>
    <div class="form-group col-6">
      <input type="hidden" name="id" id="id">
      <input class="btn btn-success" type="submit" id="btnSubmit" value="Editar" >
     </div>
     <div class="form-group col-6">
      <label for="exampleFormControlTextarea1">Utilizar a Imagem: 
         <input class="form-check-input position-static mx-auto" id="ativa" type="checkbox" name="ativa" value="1" checked aria-label="...">
         </label>
    </div>
  </form> 	
               
      </div>
      <div class="modal-footer">
        <button type="button" class="btn btn-secondary" data-dismiss="modal">Close</button>
      </div>
    </div>
  </div>
</div>
  
  
