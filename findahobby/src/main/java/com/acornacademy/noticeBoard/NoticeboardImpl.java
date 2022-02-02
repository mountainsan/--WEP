package com.acornacademy.noticeBoard;

import java.sql.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class NoticeboardImpl implements INoticeboard{
	private static final Logger logger= LoggerFactory.getLogger(Noticeboard.class);
	@Autowired private INoticeboardDAO iNoticeboardDAO;

	@Override
	public void writeProc(Noticeboard noticeboard, HttpSession session) {
		
		// Save current date
		currentDate(noticeboard);
		
		// insert database
		iNoticeboardDAO.InsertWriteProc(noticeboard);
		
		// 세션에서 id값 가져오기
//		logger.info(session.getAttribute("hid")+"");
		session.invalidate();
	}

	private void currentDate(Noticeboard noticeboard) {
		// Save current date
		Date writeDate= new Date(System.currentTimeMillis());
		noticeboard.setBwritedate(writeDate);
	}

	@Override
	public List<Noticeboard> readBoard() {
		return iNoticeboardDAO.readBoard();
	}

	@Override
	public Noticeboard readDetail(String bno) {
		Map<String, Integer> hitsMap= new HashMap<String, Integer>();
		int noticebno= Integer.parseInt(bno);
		hitsMap.put("bno", noticebno);
		iNoticeboardDAO.Hits(hitsMap);
		return iNoticeboardDAO.readDetail(bno);
	}

}
