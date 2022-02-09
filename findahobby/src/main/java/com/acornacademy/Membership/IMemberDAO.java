package com.acornacademy.Membership;

import java.util.List;

import com.acornacademy.Login.hlogin;

public interface IMemberDAO {

	void InsertpwProc(hlogin hlogin);
	
	void InsertPostcode(Postcode postcode);
	
	void InsertMember(hregister hregister);

	int IsExistID(String hid);
		//개수 반환
	
	List<Zipcode> searchZipcode(String addr);

	
}
