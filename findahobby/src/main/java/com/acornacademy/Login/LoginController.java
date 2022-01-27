package com.acornacademy.Login;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Controller
@RequestMapping("login")
public class LoginController {

	private static final Logger logger = LoggerFactory.getLogger(LoginController.class);
	@Autowired private ILoginService iLoginServ ;
	
	// if login is successed, get LOGINSUCCESS
	
	// derivative address & embodied method
	@RequestMapping (value = "loginProc")
	public String loginProc(Model model, Login login) {
		
		// loginResult sign is int & is embodied in service
		int loginResult =iLoginServ.loginProc(login);
		
		return "login";
		
	}
	
	
	
	
		
		
	//6-3. login successed, return home
	
		//6-4. ${msg} 
		
			
	
	//7. impl2: session time over -> logout
	@RequestMapping (value = "logout")
	public String logout(HttpSession session) {
		session.invalidate();
		return "home"; 
	}
		
		
		
		
	
}
