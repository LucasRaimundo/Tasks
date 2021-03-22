package br.com.rlsystem.tasks.services;

import org.springframework.stereotype.Service;

@Service
public class LoginService {
	public boolean validateLogin(String login, String senha) {
		if (login.equals("bianca gomes") && senha.equals("lunaracessorios")){
			return true;
	} else {
		return false;
	}
	}
}
