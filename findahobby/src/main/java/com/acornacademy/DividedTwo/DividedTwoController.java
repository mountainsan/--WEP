package com.acornacademy.DividedTwo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


@Controller
@RequestMapping("DividedTwo")
public class DividedTwoController {
	
	private static final Logger logger = LoggerFactory.getLogger(DividedTwoController.class);
	
	@RequestMapping(value = "DividedTwoProc")
	public String DividedTwo() {
		return "survey/DividedTwo";
	}

}
