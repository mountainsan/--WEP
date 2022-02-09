package com.acornacademy.Membership;

import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("membership")
public class MembershipController {
	private static final Logger logger = LoggerFactory.getLogger(MembershipController.class);
	
	@Autowired
	private IMemberService iMemberServ;
	
	@RequestMapping(value = "memberProc")
	public String memberProc(Model model, hregister hregister, Postcode postcode) {
		//dto to serv & get message
		String msg = iMemberServ.memberProc(hregister,postcode );
		model.addAttribute("msg", msg);
		return "member/membership";
		
	}
	@RequestMapping(value = "isExistID")
	public String isExistID(Model model, hregister hregister) {
		//dto to serv & get message
		String msg = iMemberServ.isExistID(hregister );
		model.addAttribute("msg", msg);
		
		return "member/membership";	
	}
	// making authnum into session
	@RequestMapping(value = "sendAuth")
	public String sendAuth(Model model, hregister hregister,HttpSession session) {
		//dto to serv & get 
		 iMemberServ.sendAuth(hregister );
		
		// get from session
		String randNum = (String)session.getAttribute("authNum");
		// give random number to jsp
		model.addAttribute("msg", msg);
		return "member/membership";	
	}
	

	
	
}
