package com.acornacademy.noticeBoard;

import java.util.List;

import javax.servlet.http.HttpSession;

public interface INoticeboard {

	void writeProc(Noticeboard noticeboard, HttpSession session);

	List<Noticeboard> readBoard();

	Noticeboard readDetail(String bno);
	
}
