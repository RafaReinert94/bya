package br.com.byaarts.model;

import java.util.ArrayList;


import br.com.byaarts.beans.ImagemDestaque;
import br.com.byaarts.dao.ImagemDestaqueDAO;

public class ImagemDestaqueModel {

	public ArrayList<ImagemDestaque> listaImagemDestaque() {
		return ImagemDestaqueDAO.listaImagemDestaque();
		
	}

	public static int addImagemDestaque(ImagemDestaque imgSubmit) {
		return ImagemDestaqueDAO.addImagemDestaque(imgSubmit);
	}

	public static int delImagemDestaque(int id) {
		return ImagemDestaqueDAO.delImagemDestaque(id);
	}

	public static ImagemDestaque getImagemDestaqueById(int id) {
		return ImagemDestaqueDAO.getImagemDestaqueById(id);
	}

	public static int updateImagemDestaque(ImagemDestaque imgSubmit) {
		return ImagemDestaqueDAO.updateImagemDestaque(imgSubmit);
	}
	
	
	

}
