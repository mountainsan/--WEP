package com.acornacademy.noticeBoard;

import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("noticeboard")
public class NoticeboardController {
	private static final Logger logger= LoggerFactory.getLogger(NoticeboardController.class);
	
	@Autowired private INoticeboard iNoticeboard;
	
	@RequestMapping(value = "noticeboard")
	public String NoticeBoard() {
//		logger.info("Access noticeboard page..");
		return "noticeBoard/boardList";
	}
	
	@RequestMapping(value = "write")
	public String BoardWrite() {
//		logger.info("Access boardwrite page..");
		return "noticeBoard/writeForm";
	}
	
	@RequestMapping(value = "writeProc")
	public String writeProc(Noticeboard noticeboard, HttpSession session) {
//		logger.info("Success write..");
		iNoticeboard.writeProc(noticeboard, session); 
		return "noticeBoard/boardList";
	}

}
