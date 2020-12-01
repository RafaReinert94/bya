<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<jsp:include page="inc/header.jsp"></jsp:include>
<main>
  <form action="imgdestaque?action=listaImgDestaque" method="post">
    <div class="form-group col-6">
      <label for="exampleFormControlTextarea1">Nome da imagem</label>
      <input type="text" class="form-control" name="nomeImagem" placeholder="Nome da imagem...">
    </div>
    <div class="form-group col-6">
      <label for="exampleFormControlTextarea1">Descrição da imagem</label>
      <textarea  class="form-control" name="descricaoImagem" rows="3" placeholder="Descreva a imagem..."></textarea>
    </div>
    <div class="form-group col-6">
      <label for="exampleFormControlTextarea1">link</label>
      <input type="text" class="form-control" name="linkImagem" placeholder="">
    </div>
    <div class="form-group col-6">
      <label for="exampleFormControlTextarea1">Url da imagem</label>
      <input type="text" class="form-control" name="urlImagem" placeholder="">
    </div>

    <input type="hidden" name="id" value=0>
    <input type="hidden" name="ativa" value=1>
    
      <input class="btn btn-success" type="submit" value="Cadastrar">
      
  </form>
</main>

<jsp:include page="inc/footer.jsp"></jsp:include>