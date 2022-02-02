<%@ page contentType="text/html; charset=UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<c:url var="urlHome" value="/" />
<div class="top"><%@ include file="../common/top.jsp" %></div>
<center>
<form action="${urlHome }">
<div style="padding-top:100px; padding-bottom:100px;">
<table style="width: 50%; padding-bottom:100px !important;">
	<tr>
		<td><h2>${boardDetail.btitle }</h2></td>
	</tr>
	<tr>
		<td colspan=2><hr/></td>
	</tr>
	<tr>
		<td valign="top">작성자 : ${boardDetail.hid }</td>
		<td align="right" valign="bottom">작성날짜 : ${boardDetail.bwritedate }</td>
	</tr>
	<tr>
		<td colspan=2><hr/></td>
	</tr>
	<tr>
		<td colspan=2 style="width: 650px; height: 300px" valign="top">
		
		${boardDetail.bcontent }
		
		</td>
	</tr>
	<tr>
		<td colspan=2><hr/></td>
	</tr>
	<tr>
		<td colspan=2 align="right">
			<button formaction="${urlHome }board/reply" style="width: 60px;">답글</button>
			<button style="width: 60px;">수정</button>
			<button style="width: 60px;">삭제</button>
			<input type="button" onclick="location.href='${urlHome }noticeboard';" value='목록' style="width: 60px; "/>	
		</td>
	</tr>
</table>
</div>
</form>
</center>
<div class="footer"><%@ include file="../common/footer.jspf" %></div>