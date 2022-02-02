package com.acornacademy.noticeBoard;

import java.sql.Date;

//게시판 
public class Noticeboard {
	
 // 조회수 
 private Integer hits;

 // 글번호 
 private Integer bno;

 // 아이디 
 private String hid;

 // 게시판제목 
 private String btitle;

 // 게시판내용 
 private String bcontent;

 // 게시판작성일 
 private Date bwritedate;
 
 

public Integer getHits() {
	 return hits;
}

public void setHits(Integer hits) {
	 this.hits = hits;
}

public Integer getBno() {
     return bno;
 }

 public void setBno(Integer bno) {
     this.bno = bno;
 }

 public String getHid() {
     return hid;
 }

 public void setHid(String hid) {
     this.hid = hid;
 }

 public String getBtitle() {
     return btitle;
 }

 public void setBtitle(String btitle) {
     this.btitle = btitle;
 }

 public String getBcontent() {
     return bcontent;
 }

 public void setBcontent(String bcontent) {
     this.bcontent = bcontent;
 }

 public Date getBwritedate() {
     return bwritedate;
 }

 public void setBwritedate(Date bwritedate) {
     this.bwritedate = bwritedate;
 }
 
}
