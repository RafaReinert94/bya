package br.com.byaarts.model;

import br.com.byaarts.dao.LoginAdminDAO;

public class LoginAdminModel {

	public static int verificaLogin(String login, String senha) {
		return LoginAdminDAO.verificaLogin(login, senha);
	}



}
