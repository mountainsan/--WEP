package com.acornacademy.Membership;

public interface IMemberService {

	String memberProc(hregister hregister, Postcode postcode);

	String isExistID(hregister hregister);

	String sendAuth(hregister hregister);

}
