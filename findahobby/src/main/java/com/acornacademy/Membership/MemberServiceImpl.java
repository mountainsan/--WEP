package com.acornacademy.Membership;

import java.util.List;
import java.util.Random;

import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.acornacademy.Login.hlogin;
import java.security.MessageDigest;
	import java.security.NoSuchAlgorithmException;


@Service
public class MemberServiceImpl implements IMemberService {
	
	private static final Logger logger =
			LoggerFactory.getLogger(MemberServiceImpl.class);

	@Autowired
	private IMemberDAO iMemberDao;
	@Autowired
	private HttpSession session;
	
	
	public class SHA {
		public final String encryptSHA512(String data) {
	        try {
	            MessageDigest sha = MessageDigest.getInstance("SHA-512");
	            sha.update(data.getBytes());
	            StringBuffer sb = new StringBuffer();
	            for (byte b : sha.digest()){ 
	                sb.append(Integer.toHexString(0xff & b));
	            }
	            return  sb.toString();
	        } catch (NoSuchAlgorithmException e) {
	        	e.printStackTrace();
	            return null;
	        }
	    }
	}//memberProc start-----------------------------------------------
	@Override
	public String memberProc(hregister hregister, Postcode postcode) {
		
		Boolean authState = (Boolean) session.getAttribute("authState");
		if(!authState)
			return "인증번호를 입력하세요";
		
		// !!!! user inserted value to SHA encrypt for DAO ------
		hlogin hlogin = hregister;
		SHA sha = new SHA();

		hlogin.setHpw(sha.encryptSHA512(hregister.getHpw()));
		iMemberDao.InsertpwProc(hlogin);
		//value to DAO ------------------------
		
		//zipcode value to dao
		if(!"".equals(postcode.getZipcode()))
			iMemberDao.InsertPostcode(postcode);
		
		// essential point will be must-done
		if(!"".equals(hregister.getHid())&& !"".equals(hregister.getHpw())&&  
				!"".equals(hregister.getHname()) &&	!"".equals(hregister.getHphone())&&
				!"".equals(hregister.getHemail()) ) {
			
			iMemberDao.InsertMember(hregister);
			return "회원가입이 완료되었습니다."; }
		
		else 
			return "필수정보를 모두 입력해야 합니다.";
			
		// all done
		
		
	}//memberProc end---------------------------------------
	
	// zip code list
	@Override
	public List<Zipcode> searchZipcode(String addr) {
		return iMemberDao.searchZipcode(addr);
	}
	
	@Override
	public String isExistID(hregister hregister) {
		//사용자 입력 내용 - DB와 비교 - 개수 가져옴
		int exist = iMemberDao.IsExistID(hregister.getHid());
		
		logger.warn("exist : "+exist);
		
		if(exist ==0) {
			return " 사용할 수 있는 아이디 입니다. ";
		} else 
			
		return "이미 존재하는 아이디입니다. ";	
	}

	@Override
	public String sendAuth(hregister hregister) {
		//making authNum, authState into session
		String authNum = (String)session.getAttribute("authNum");
		logger.warn("authNum");
		Boolean authState = (Boolean) session.getAttribute("authState");
		logger.warn("authState");
		
		// making authNum into Random authNum
		if(authNum== null && authState== null) {
			
			logger.warn("if(authNum== null && !authState)");
			Random rand = new Random();
			String randNum = String.format("%04d", rand.nextInt(10000));
			
			session.setAttribute("authNum", randNum);
			session.setMaxInactiveInterval(180);
		}
		
		logger.warn("randNum: "+ authNum);
		
		logger.warn("authState : "+ authState);
		return authNum;

	}
	
	
	@Override
	public String authConfirm(String userInputAuthNum) {
		String sAuthNum = (String) session.getAttribute("authNum");
		
		if(sAuthNum==null)	return "인증번호 전송을 누르세요";
		
		if(sAuthNum.equals(userInputAuthNum)) {
			session.setAttribute("authState", true);
			return "인증 완료";
		}
		return "인증 실패";
	}
	
}
