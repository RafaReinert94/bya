<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<jsp:include page="inc/header.jsp"></jsp:include>

<main>
	<div id="carouselExampleCaptions" class="carousel slide" data-ride="carousel">
        <ol class="carousel-indicators">
            <li data-target="#carouselExampleCaptions" data-slide-to="0" class="active"></li>
            <li data-target="#carouselExampleCaptions" data-slide-to="1"></li>
        </ol>
        <div class="carousel-inner">
            <div class="carousel-item active">
                <img src="_img/agua-viva-quarto.jpg" class="d-block w-100" alt="agua-viva-quarto">
                <div class="carousel-caption d-none d-md-block">
                    <h5>Água Viva(NOME DA IMAGEM)</h5>
                    <p>Algum comentario legal sobre a tela e o lugar.</p>
                </div>
            </div>
            <div class="carousel-item">
                <img src="_img/polvo-quarto.jpg" class="d-block w-100" alt="polvo-quarto">
                <div class="carousel-caption d-none d-md-block">
                    <h5>Polvo (NOME DA IMAGEM)</h5>
                    <p>Algum comentario legal sobre a tela e o lugar.</p>
                </div>
            </div>
        </div>
        <a class="carousel-control-prev" href="#carouselExampleCaptions" role="button" data-slide="prev">
            <span class="carousel-control-prev-icon" aria-hidden="true"></span>
            <span class="sr-only">Previous</span>
        </a>
        <a class="carousel-control-next" href="#carouselExampleCaptions" role="button" data-slide="next">
            <span class="carousel-control-next-icon" aria-hidden="true"></span>
            <span class="sr-only">Next</span>
        </a>
    </div>
</main>

<jsp:include page="inc/footer.jsp"></jsp:include>