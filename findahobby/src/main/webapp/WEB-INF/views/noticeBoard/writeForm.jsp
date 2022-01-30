<%@ page contentType="text/html; charset=UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<c:url var="urlHome" value="/" />

<div class="top"><%@ include file="../common/top.jsp" %></div>
<center>
<section class="pt-5 pb-5">
<form action="${urlHome }noticeboard/writeProc" method="post">
<%-- <input type="text" name="pno" value="${pno }"> --%>
<table style="width: 650px; ">
	<tr>
		<td style="width: 80px; height:40px;" align="right">작성자</td>
		<td style="width: 570px; height:40px;">
			<input type=text name='id' value='<%=session.getAttribute("hid") %>' readonly="readonly" /> 
		</td>
	</tr>
	<tr>
		<td  style="width: 80px; height:40px;" align="right">제 목</td>
		<td style="width: 570px; height:40px;">
			<input type=text name='btitle' style="width: 500px; "/> 
		</td>
	</tr>
	<tr>
		<td colspan=2 align="right"><textarea name="bcontent" style="width: 650px; height: 300px"></textarea></td>
	</tr>
	<tr>
		<td align='center' height=40 colspan=2>
			<input type=submit value='글쓰기' style="width: 120px; "/>
			<input type="button" onclick="location.href='${urlHome }noticeboard';" value='취소' style="width: 120px; "/>	 
		</td>
	</tr>
</table>
</form>
</section>
</center>

<div class="footer"><%@ include file="../common/footer.jspf" %></div>