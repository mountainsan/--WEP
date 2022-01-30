package com.acornacademy.noticeBoard;

import javax.servlet.http.HttpSession;

public interface INoticeboard {

	void writeProc(Noticeboard noticeboard, HttpSession session);
	
}
