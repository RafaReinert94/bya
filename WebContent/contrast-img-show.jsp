<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<jsp:include page="inc/header.jsp"></jsp:include>
<main>
  <table class="table">
    <thead>
      <tr>
        <th scope="col">id</th>
        <th scope="col">Nome</th>
        <th scope="col">Descrição</th>
        <th scope="col">Link</th>
        <th scope="col">urlimg</th>
        <th scope="col">Ativa</th>
        <th scope="col"></th>
      </tr>
    </thead>
    <tbody>
      <c:forEach var="imgDestaque" items="${listaImagemDestaques}">
        <tr>
          <td>
            <c:out value="${imgDestaque.id}"></c:out>
          </td>
          <td>
            <c:out value="${imgDestaque.name}"></c:out>
          </td>
          <td>
            <c:out value="${imgDestaque.description}"></c:out>
          </td>
          <td>
            <c:out value="${imgDestaque.link}"></c:out>
          </td>
          <td>
            <c:out value="${imgDestaque.urlimg}"></c:out>
          </td>
          <td>
         <c:if test="${imgDestaque.usable==1}">
         <input class="form-check-input position-static mx-auto" type="checkbox" id="blankCheckbox" value="1" checked  disabled aria-label="...">
         </c:if>
         <c:if test="${imgDestaque.usable==0}">
         <input  class="form-check-input position-static mx-auto" type="checkbox" id="blankCheckbox" value="1"  disabled aria-label="...">
         </c:if>
         </td>
          <td>
          	<a href="javascript:;"  class="btn btn-sm btn-primary" onclick="imgContrastUpdate(${imgDestaque.id});">Editar</a>
          	|
            <a  class="btn btn-sm btn-danger" onclick="deleteImagemDestaque(${imgDestaque.id});">Excluir</a>
          </td>
        </tr>
      </c:forEach>
    </tbody>
  </table>
  <div>
  <a class="btn btn-primary" href="imgdestaque?action=destaqueImgAdd" role="button">Adicionar</a>
  </div>
</main>

<jsp:include page="contrast-img-update.jsp"></jsp:include>
<jsp:include page="inc/footer.jsp"></jsp:include>