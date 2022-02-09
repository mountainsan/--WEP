package com.acornacademy.Membership;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.acornacademy.Login.hlogin;





@Service
public class MemberServiceImpl implements IMemberService {

	@Autowired
	private IMemberDAO iMemberDao;
	@Autowired
	private HttpSession session;
	
	@Override
	public String memberProc(hregister hregister, Postcode postcode) {
		Boolean authState = (Boolean) session.getAttribute("authState");
		if(!authState)
			return "������ �����ؾ� �մϴ�.";
		
		// !!!! inserted value to SHA encrypt for DAO !!!!!!
		hlogin hlogin = hregister;
		
		
		hlogin.setHpw(null);
		hregister.getHpw();
		//to DAO 
		iMemberDao.memberProc(hlogin);
		//zipcode value to dao
		if(!"".equals(postcode.getZipcode()))
			iMemberDao.InsertPostcode(postcode);
		
		
		iMemberDao.memberProc(hlogin);
		// all done
		return "ȸ�������� �Ϸ�Ǿ����ϴ�.";
		
	}
	// zip code list

	@Override
	public String isExistID(hregister hregister) {
		// TODO Auto-generated method stub
		return null;
	}

}
