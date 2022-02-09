package com.acornacademy.Membership;

import java.util.List;

public interface IMemberService {

	String memberProc(hregister hregister, Postcode postcode);

	String isExistID(hregister hregister);

	String sendAuth(hregister hregister);

	List<Zipcode> searchZipcode(String addr);

	String authConfirm(String userInputAuthNum);

}
