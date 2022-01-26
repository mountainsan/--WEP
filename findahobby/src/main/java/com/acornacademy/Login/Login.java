package com.acornacademy.Login;


public class Login {

	private String id;

	private String pw;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPw() {
		return pw;
	}

	public void setPw(String pw) {
		this.pw = pw;
	}

	// Login
	public void CopyData(Login param) {
		this.id = param.getId();
		this.pw = param.getPw();
	}
}