package com.acornacademy.Membership;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

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
	} // complete
	
	@RequestMapping(value = "isExistID")
	public String isExistID(Model model, hregister hregister) {
		//dto to serv & get message
		String msg = iMemberServ.isExistID(hregister );
		model.addAttribute("msg", msg);
		
		return "member/membership";	
	} // complete
	
	// making authnum into session
	@RequestMapping(value = "sendAuth")
	public String sendAuth(Model model, hregister hregister,HttpSession session) {
		//dto to serv & get value
		 iMemberServ.sendAuth(hregister );
		// get authNum & make into randNum
		 String randNum = (String)session.getAttribute("authNum") ;
	
		// give random number to jsp
		model.addAttribute("msg", "인증번호 :"+randNum);
		return "member/membership";	
	}// complete
	
	// compare each other
	@RequestMapping(value = "authConfirm")
	public String authConfirm(Model model, hregister hregister,
			@RequestParam("userInputAuthNum") String userInputAuthNum ) {
		//dto to serv & get value
		 String msg = iMemberServ.authConfirm(userInputAuthNum);
		
		// give Confirm to jsp
		model.addAttribute("msg", msg);
		return "member/membership";	
	}
	
	//popup start
	@RequestMapping(value = "postSearch")
	public String postSearch(Model model) {
		return "member/searchPostcode";
	}
	
	@RequestMapping(value = "searchZipcode")
	public String searchZipcode(Model model,
			@RequestParam("addr") String addr) {
//		logger.warn(addr);
		List<Zipcode> zipcodeLst = iMemberServ.searchZipcode(addr);
		model.addAttribute("zipcodeLst", zipcodeLst);
		return "member/searchPostcode";
	}
	

	
	
}
