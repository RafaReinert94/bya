package br.com.byaarts.dao;

import java.sql.*;

import br.com.byaarts.cnn.ConnectionFactory;

public class LoginAdminDAO {

	public static int verificaLogin(String login, String senha) {
		Connection cnn = ConnectionFactory.getConnection();
		String query1 = "SELECT id FROM admin WHERE email = ? AND senha = ?";
		int idLogado = 0;
		
		
		try {
			PreparedStatement pStm = cnn.prepareStatement(query1);
			pStm.setString(1, login);
			pStm.setString(2, senha);
			ResultSet rsLogin = pStm.executeQuery();
			
			while(rsLogin.next()) {
				idLogado = rsLogin.getInt("id");
			}
			rsLogin.close();
			cnn.close();
				
		} catch (SQLException e) {
			e.printStackTrace();
		}
				
		return idLogado;
	}

}
