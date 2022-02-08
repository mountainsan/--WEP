package com.acornacademy.findahobby;

import java.util.Locale;

import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;



@Controller
public class HomeController {
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	
	@RequestMapping(value = "/")
	public String home(Locale locale, Model model, HttpSession session) {
		// home �젒洹� �떆 set session id (admin) 20220130 pjh
		session.setAttribute("hid", "admin");

		return "home";
	}
	
	@RequestMapping(value = "login")
	public String Login(Locale locale, Model model) {
		logger.info("Access login");
		return "member/Login";
	}
	
	@RequestMapping(value = "membership")
	public String membership(HttpSession session) {
		
	return "member/Membership";
	}
	
}
