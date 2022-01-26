package com.acornacademy.outerhobby;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("outerhobby")
public class OuterhobbyController {
	private static final Logger logger= LoggerFactory.getLogger(OuterhobbyController.class);
	
	@RequestMapping(value = "outerhobby")
	public String outerhobby() {
		return "outerhobby/outerhobby";
	}
}
