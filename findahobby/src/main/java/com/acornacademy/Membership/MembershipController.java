package com.acornacademy.Membership;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("membership")
public class MembershipController {
	private static final Logger logger = LoggerFactory.getLogger(MembershipController.class);
	
	@RequestMapping(value = "membershipProc")
	public String membership() {
		
		return "member/membership";
	}

	
	
}
