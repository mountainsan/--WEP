<%@ page contentType="text/html; charset=UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<c:url var="urlHome" value="/"/>
<script type="text/javascript">

function popupWindow(){
	/* 
	window.open(접근 URL, 제목, 크기)
	let myWindow = window.open("http://www.google.com", 
			"googlePopup", "width=200, height=100");
	window에 새로운 내용을 작성할 경우 사용
	myWindow.document.write("test Page");
	 */
	window.name="우편번호 검색";
	window.open("${urlHome }membership/postSearch", "_blank",  
			"top=500, left=500, width=400, height=400");
}

</script>
<tr>
	<td style="height: 100%;"><%@ include file="../common/top.jsp"%></td>
			</tr>
<center>

<h3>
msg
<font color="red">${msg }</font></h3>

<form action="${urlHome }membership/memberProc" method="post">
<table>
<tr><td colspan="4" align="center"><hr/>설문지영역<hr/></td></tr>

<tr>
		<td align='right' width=120>장소</td>
		<td colspan="2">
			<input type=radio name='hlocation' value='indoor' checked="checked"/>실내
			<input type=radio name='hlocation' value='outdoor' />실외
			
		</td>
	</tr>
	
<tr>
		<td align='right' width=120>성향</td>
		<td colspan="2">
			<input type=radio name='htendency' value='active' checked="checked"/>활동적
			<input type=radio name='htendency' value='nonactive' />비활동적
			
		</td>
	</tr>
	
	<tr>
		<td align='right' width=120>관심사</td>
		<td colspan="6">
			<input type=radio name='hinterest' value='workout' checked="checked"/>운동
			<input type=radio name='hinterest' value='making' />창작
			<input type=radio name='hinterest' value='deco' />꾸미기
			<input type=radio name='hinterest' value='collect' />수집
			<input type=radio name='hinterest' value='entertain' />오락
			<input type=radio name='hinterest' value='food' />푸드
		</td>
	</tr>
	
	<tr>
		<td align='right' width=120>활동시간</td>
		<td colspan="4">
			<input type=radio name='hactivitytime' value='onehour' checked="checked"/>1~2시간
			<input type=radio name='hactivitytime' value='threehour' />3~4시간
			<input type=radio name='hactivitytime' value='fivehour' />5~6시간
			<input type=radio name='hactivitytime' value='sixhour' />6시간이상
		</td>
	</tr>
	
	<tr>
		<td align='right' width=120>취미 난이도</td>
		<td colspan="2">
			<input type=radio name='hdifficulty' value='high' checked="checked"/>상
			<input type=radio name='hdifficulty' value='middle' />중
			<input type=radio name='hdifficulty' value='low' />하
		</td>
	</tr>
	

	<tr><td colspan="4" align="center"><hr/>필수사항<hr/></td></tr>
	
	<tr>
		<td align='right' height=40>이름</td>
		<td>
			<input type=text name='hname' placeholder='이름을 입력해주세요' value="${hregister.hname }"/> 
		</td>
		
	</tr>
	
	<tr>
		<td align='right' height=40>휴대폰 번호</td>
		<td>
			<input type=text name='hphone' placeholder='010-0000-0000'
			value="${hregister.hphone }"/> 
		</td>
		
	</tr>
	
	<tr>
		<td align='right' height=40>아이디</td>
		<td>
			<input type=text name='hid' placeholder='id 입력' value="${hregister.hid }"/> 
		</td>
		<td colspan="2"><button class="btn btn-outline-success" formaction="${urlHome }membership/isExistID">중복 확인</button></td>
	</tr>
	<tr>
		<td align='right' height=40>패스워드</td>
		<td>
			<input type=text name='hpw' placeholder='pw 입력' value="${hregister.hpw }"/> 
		</td>
		</tr>
		<tr>
		<td align='right'>패스워드 확인</td>
		<td>
			<input type=text name='pwOk' placeholder='pw 입력'/> 
		</td>
	</tr>
	<tr>
		<td align='right' height=40>E-Mail</td>
		<td>
			<input type=text name='hemail' placeholder='E-Mail 입력' value="${hregister.hemail }"/> 
		</td>
		<td colspan="2"><button class="btn btn-outline-success" formaction="${urlHome }membership/sendAuth">인증번호 전송</button></td>
	</tr>
	<tr>
		<td align='right'>인증번호</td>
		<td>
			<input type=text name='userInputAuthNum' placeholder='인증번호 입력'/> 
		</td>
		<td colspan="2"><button class="btn btn-outline-success" formaction="${urlHome }membership/authConfirm">인증번호 확인</button></td>
	</tr>
	<tr><td colspan="4" align="center"><hr/>선택사항<hr/></td></tr>
	<tr>
		<td align='right'>우편번호</td>
		<td>
			<input type=text id='zipcode' name='zipcode' readonly="readonly"/> 
		</td>
		<td colspan="2">
		<input type="button" class="btn btn-outline-success" onclick="popupWindow()" value="우편번호 검색"/></td>
	</tr>
	<tr>
		<td align='right'>주소</td>
		<td colspan="3">
			<input type=text id='addr1' name='addr1' readonly="readonly" style="width: 475px; "/> 
		</td>
	</tr>
	<tr>
		<td align='right'>상세주소</td>
		<td colspan="3">
			<input type=text name='addr2' style="width: 475px; "/> 
		</td>
	</tr>
	
	
	<tr>
		<td align='center' height=40 colspan=4>
			<input type=submit class="btn btn-outline-success" value='회원가입' style="width: 120px; "/>
			<button class="btn btn-outline-success" formaction="${urlHome }login" > 이미 아이디가 있으신가요?</button>
			<input type=reset class="btn btn-outline-success" value='취소' style="width: 120px; "/>	 
		</td>
	</tr>
	
</table>

</form>
<tr>
	<td style="height:100%;"><%@ include file="../common/footer.jspf" %></td>
</tr>
</center>


