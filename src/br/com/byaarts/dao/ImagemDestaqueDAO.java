package br.com.byaarts.dao;

import java.sql.*;
import java.util.ArrayList;

import br.com.byaarts.beans.ImagemDestaque;
import br.com.byaarts.cnn.ConnectionFactory;

public class ImagemDestaqueDAO {

	public static ArrayList<ImagemDestaque> listaImagemDestaque() {
		Connection cnn = ConnectionFactory.getConnection();
		String query = "SELECT * FROM imgdestaque";
		ArrayList<ImagemDestaque> arImagemDestaque = new ArrayList();
		
		try {
			PreparedStatement pStm = cnn.prepareStatement(query);
			ResultSet rsImagemDestaque = pStm.executeQuery();
			
			while(rsImagemDestaque.next()) {
				ImagemDestaque img = new ImagemDestaque(rsImagemDestaque.getInt("id"),
						rsImagemDestaque.getString("nome"),rsImagemDestaque.getString("descricao"),
						rsImagemDestaque.getString("link"),rsImagemDestaque.getString("urlimg"),
						rsImagemDestaque.getInt("ativa"));
				arImagemDestaque.add(img);
			}
			cnn.close();
			rsImagemDestaque.close();
			return arImagemDestaque;
			
			
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
		
	}

	public static int addImagemDestaque(ImagemDestaque imgSubmit) {
		String query = "INSERT INTO imgdestaque(nome, descricao, link, urlimg, ativa) values (?,?,?,?,?)";
		Connection cnn = ConnectionFactory.getConnection();
		
		int linhasAfetadas = 0;
		
		try {
			PreparedStatement pStm = cnn.prepareStatement(query);
			pStm.setString(1, imgSubmit.getName());
			pStm.setString(2, imgSubmit.getDescription());
			pStm.setString(3, imgSubmit.getLink());
			pStm.setString(4, imgSubmit.getUrlimg());
			pStm.setInt(5, imgSubmit.getUsable());
			linhasAfetadas = pStm.executeUpdate();
			cnn.close();
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return linhasAfetadas;
	}

	public static int delImagemDestaque(int id) {
		
		String query = "DELETE FROM imgdestaque WHERE id = ?";
		
		Connection cnn = ConnectionFactory.getConnection();
		int linhasAfetadas = 0;
		
		try {
			PreparedStatement pStm = cnn.prepareStatement(query);
			pStm.setInt(1, id);
			linhasAfetadas = pStm.executeUpdate();
			cnn.close();
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return linhasAfetadas;
	}

	public static ImagemDestaque getImagemDestaqueById(int id) {
		ImagemDestaque imgRetorno = new ImagemDestaque();
		String query = "SELECT * FROM imgdestaque WHERE id=?";
		Connection cnn = ConnectionFactory.getConnection();
		
		try {
			PreparedStatement pStm = cnn.prepareStatement(query);
			pStm.setInt(1, id);
			
			ResultSet rsImgDestaque = pStm.executeQuery();
			
			while(rsImgDestaque.next()) {
				imgRetorno.setId(id);
				imgRetorno.setName(rsImgDestaque.getString("nome"));
				imgRetorno.setDescription(rsImgDestaque.getString("descricao"));
				imgRetorno.setLink(rsImgDestaque.getString("link"));
				imgRetorno.setUrlimg(rsImgDestaque.getString("urlimg"));
				imgRetorno.setUsable(rsImgDestaque.getInt("ativa"));
			}
			rsImgDestaque.close();
			cnn.close();
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return imgRetorno;
	}

	public static int updateImagemDestaque(ImagemDestaque imgSubmit) {
		String query = "UPDATE imgdestaque SET nome=?, descricao=?, link=?, urlimg=?, ativa=? WHERE id=?";
		Connection cnn = ConnectionFactory.getConnection();
		int linhasAfetadas = 0;
		
		try {
			PreparedStatement pStm = cnn.prepareStatement(query);
			pStm.setString(1, imgSubmit.getName());
			pStm.setString(2, imgSubmit.getDescription());
			pStm.setString(3, imgSubmit.getLink());
			pStm.setString(4, imgSubmit.getUrlimg());
			pStm.setInt(5, imgSubmit.getUsable());
			pStm.setInt(6, imgSubmit.getId());
			linhasAfetadas = pStm.executeUpdate();
			cnn.close();
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return linhasAfetadas;
	}
	

}
