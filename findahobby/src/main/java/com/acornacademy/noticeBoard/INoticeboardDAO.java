package com.acornacademy.noticeBoard;

import java.util.List;
import java.util.Map;

public interface INoticeboardDAO {

	void InsertWriteProc(Noticeboard noticeboard);

	List<Noticeboard> readBoard();

	Noticeboard readDetail(String bno);

	void Hits(Map<String, Integer> hitsMap);

}
