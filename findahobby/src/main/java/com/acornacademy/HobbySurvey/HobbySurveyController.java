package com.acornacademy.HobbySurvey;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


@Controller
@RequestMapping("HobbySurvey")
public class HobbySurveyController {
	
	private static final Logger logger = LoggerFactory.getLogger(HobbySurveyController.class);
	
	
	@RequestMapping(value = "HobbySurveyProc")
	public String HobbySurvey() {
		return "survey/HobbySurvey";
	}

}
