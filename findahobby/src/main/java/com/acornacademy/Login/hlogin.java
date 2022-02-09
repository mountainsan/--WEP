package com.acornacademy.Login;

public class hlogin {

    // 아이디 
    private String hid;

    // 비밀번호 
    private String hpw;

    public String getHid() {
        return hid;
    }

    public void setHid(String hid) {
        this.hid = hid;
    }

    public String getHpw() {
        return hpw;
    }

    public void setHpw(String hpw) {
        this.hpw = hpw;
    }

    // Hlogin 모델 복사
//    public void CopyData(Hlogin param)
//    {
//        this.hid = param.getHid();
//        this.hpw = param.getHpw();
//    }
}