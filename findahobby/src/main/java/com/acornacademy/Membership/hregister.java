package com.acornacademy.Membership;
import java.sql.Date;

import com.acornacademy.Login.hlogin;

public class hregister extends hlogin  {

    // ���̵� 
    private String hid;

    // ��й�ȣ 
    private String hpw;

    // �̸� 
    private String hname;

    // �ڵ�����ȣ 
    private String hphone;

    // �̸��� 
    private String hemail;

    // ���Գ�¥ 
    private Date hregdate;

    // ��� 
    private String hlocation;

    // ���� 
    private String htendency;

    // ���ɻ� 
    private String hinterest;

    // Ȱ���ð� 
    private String hactivitytime;

    // ��̳��̵� 
    private String hdifficulty;

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

    public String getHname() {
        return hname;
    }

    public void setHname(String hname) {
        this.hname = hname;
    }

    public String getHphone() {
        return hphone;
    }

    public void setHphone(String hphone) {
        this.hphone = hphone;
    }

    public String getHemail() {
        return hemail;
    }

    public void setHemail(String hemail) {
        this.hemail = hemail;
    }

    public Date getHregdate() {
        return hregdate;
    }

    public void setHregdate(Date hregdate) {
        this.hregdate = hregdate;
    }

    public String getHlocation() {
        return hlocation;
    }

    public void setHlocation(String hlocation) {
        this.hlocation = hlocation;
    }

    public String getHtendency() {
        return htendency;
    }

    public void setHtendency(String htendency) {
        this.htendency = htendency;
    }

    public String getHinterest() {
        return hinterest;
    }

    public void setHinterest(String hinterest) {
        this.hinterest = hinterest;
    }

    public String getHactivitytime() {
        return hactivitytime;
    }

    public void setHactivitytime(String hactivitytime) {
        this.hactivitytime = hactivitytime;
    }

    public String getHdifficulty() {
        return hdifficulty;
    }

    public void setHdifficulty(String hdifficulty) {
        this.hdifficulty = hdifficulty;
    }

    // Hregister �� ����
//    public void CopyData(Hregister param)
//    {
//        this.hid = param.getHid();
//        this.hpw = param.getHpw();
//        this.hname = param.getHname();
//        this.hphone = param.getHphone();
//        this.hemail = param.getHemail();
//        this.hregdate = param.getHregdate();
//        this.hlocation = param.getHlocation();
//        this.htendency = param.getHtendency();
//        this.hinterest = param.getHinterest();
//        this.hactivitytime = param.getHactivitytime();
//        this.hdifficulty = param.getHdifficulty();
//    }
}