package br.com.byaarts.servlet;


import java.io.IOException;
import java.util.*;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.gson.Gson;

import br.com.byaarts.beans.ImagemDestaque;
import br.com.byaarts.model.ImagemDestaqueModel;

/**
 * Servlet implementation class ImagemDestaqueController
 */
@WebServlet("/imgdestaque")
public class ImagemDestaqueController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private ImagemDestaqueModel imagemDestaqueModel = new ImagemDestaqueModel();
	
	

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		switch (request.getParameter("action")) {
		case "listaImgDestaque":
			listaImgDestaque(request, response);
			
			break;
		case "destaqueImgAdd":
			addImgDestaque(request, response);
			
			break;
		case "delImagemDestaque":
			delImagemDestaque(request, response);
			
			break;
		case "updateImagemDestaque":
			updateImagemDestaque(request, response);
			
			break;
			
		default:
			addImgDestaque(request, response);
			break;
		}
		
		
	}



	



	







	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Integer id = Integer.parseInt(request.getParameter("id"));
		String nome = request.getParameter("nomeImagem");
		String descricao = request.getParameter("descricaoImagem");
		String link = request.getParameter("linkImagem");
		String urlimg = request.getParameter("urlImagem");
		Integer ativa = 0;
		if(request.getParameter("ativa")==null) {
		  ativa = 0;
		} else {
		  ativa = Integer.parseInt(request.getParameter("ativa"));
		}
		
		
		int retorno = 0;
		
		ImagemDestaque imgSubmit = new ImagemDestaque();
		imgSubmit.setName(nome);
		imgSubmit.setDescription(descricao);
		imgSubmit.setLink(link);
		imgSubmit.setUrlimg(urlimg);
		imgSubmit.setUsable(ativa);
		
		if(id>0) {
			imgSubmit.setId(id);
			retorno = ImagemDestaqueModel.updateImagemDestaque(imgSubmit);
			
		} else {
			retorno = ImagemDestaqueModel.addImagemDestaque(imgSubmit);
		}
		if(retorno>0) {
			listaImgDestaque(request,response);
		} else {
			response.getWriter().print("Error");
		}
	}

	
	private void listaImgDestaque(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		List<ImagemDestaque> objListaImgDestaque = new ArrayList<ImagemDestaque>();
		objListaImgDestaque = imagemDestaqueModel.listaImagemDestaque();
		
		request.setAttribute("listaImagemDestaques", objListaImgDestaque);
		RequestDispatcher rd = request.getRequestDispatcher("contrast-img-show.jsp");
		rd.forward(request,response);	
	}


	private void addImgDestaque(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		RequestDispatcher rd = request.getRequestDispatcher("contrast-img-add.jsp");
		rd.forward(request,response);
	}
	
	private void delImagemDestaque(HttpServletRequest request, HttpServletResponse response)  throws ServletException, IOException {
		int id = Integer.parseInt(request.getParameter("id"));
		
		if(ImagemDestaqueModel.delImagemDestaque(id)>0) {
			response.getWriter().print("OK");
		} else {
			response.getWriter().print("Error");
		}
		
	}
	private void updateImagemDestaque(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		
		int id = (request.getParameter("id") != null)? Integer.parseInt(request.getParameter("id")) : 0;
		ImagemDestaque img = new ImagemDestaque();
				
		if(id>0) {
			img = ImagemDestaqueModel.getImagemDestaqueById(id);
		}
		
		Gson gson = new Gson();
		response.getWriter().print(gson.toJson(img));
		
	}
}
