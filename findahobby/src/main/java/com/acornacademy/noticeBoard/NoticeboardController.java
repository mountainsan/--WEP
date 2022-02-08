package com.acornacademy.noticeBoard;

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
@RequestMapping("noticeboard")
public class NoticeboardController {
	private static final Logger logger= LoggerFactory.getLogger(NoticeboardController.class);
	
	@Autowired private INoticeboard iNoticeboard;
	
	@RequestMapping(value = "noticeboard")
	public String NoticeBoard(Model model) {
//		logger.info("Access noticeboard page..");
		
		// 게시글 데이터베이스에서 가져오기
		List<Noticeboard> boardLst= iNoticeboard.readBoard();
		model.addAttribute("boardLst", boardLst);
		
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
		// 작성글 데이터베이스에 저장 
		iNoticeboard.writeProc(noticeboard, session); 
		return "noticeBoard/boardList";
	}
	
	@RequestMapping(value = "readBoard")
	public String readBoard(Model model, @RequestParam("bno") String bno) {
		Noticeboard boardDetail= iNoticeboard.readDetail(bno);
		model.addAttribute("boardDetail", boardDetail);
		return "noticeBoard/viewForm";
	}

}
