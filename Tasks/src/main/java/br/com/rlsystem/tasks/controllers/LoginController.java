package br.com.rlsystem.tasks.controllers;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import br.com.rlsystem.tasks.services.LoginService;

import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/")
public class LoginController {
	@Autowired
	LoginService loginService;
	//teste
	//teste by:alan2
	@RequestMapping("/login")
	public String login() {
		return "login";
		
	}
	
	@RequestMapping(value = "/", method = RequestMethod.POST)
	public ModelAndView index(@RequestParam String login, @RequestParam String senha) {
		
		ModelAndView mv = new ModelAndView();
		mv.setViewName("index");
		
		if (loginService.validateLogin(login, senha)){
				mv.setViewName("index");
				mv.addObject("msg", "Bem Vindos gomes raimundo");
			
		} else {
			mv.setViewName("login");
			mv.addObject("msg", "O login não existe");	
		}
		
		
		
		return mv;
		
	}
	
	
	
	@RequestMapping(value = "/")
	public String index() {
		return "index";
		
	}
}
