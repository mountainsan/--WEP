<%@ page contentType="text/html; charset=UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<c:url var="urlHome" value="/" />

<center>
	<h3>
		<font color="red">${msg }</font>
	</h3>
	<form action="${urlHome }member/loginProc" method="post">
	
			<tr>
				<td style="height: 100%;"><%@ include file="../common/top.jsp"%></td>
			</tr>
	<table>

			<tr>
				<td>아이디</td>
				<td><input type=text name='id' placeholder='ID 입력' /></td>
			</tr>
			<tr>
				<td>패스워드</td>
				<td><input type=password name='pw' placeholder='PW 입력' /></td>
			</tr>
			<tr>
				<td colspan=2 align='center'>
				<input type=submit class="btn btn-outline-success" value='로그인'
					style="width: 86px;" /> <input type=reset class="btn btn-outline-success" value='취소'
					style="width: 86px;" /></td>
			</tr>
			
		</table>	
			<tr>
				<td style="height: 100%;"><%@ include
						file="../common/footer.jspf"%></td>
			</tr>

		
	</form>
</center>
