<!-- MemberForm/searchPostcodeForm.jsp -->
<%@ page contentType="text/html; charset=UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<c:url var="urlHome" value="/"/>

<style type="text/css">
.list_over {overflow:auto;  background-color:pink; }
.list_out { background-color:#FFFFFF; }
</style>
<script type="text/javascript">
function setParentAddr(zipcode, address){
	/* 호출한 창에 값 전달 */
	opener.document.getElementById("zipcode").value=zipcode;
	opener.document.getElementById("addr1").value=address;
	/* 현재 창 닫기 */
	window.close();
}
</script>
<html>
<body>
	<form action="${urlHome }membership/searchZipcode" method="post">
		<h1>
			우편번호를 검색하세요.<input type=text name='addr' /> 
			<input type=submit class="btn btn-outline-success" value="우편번호 검색" />
		</h1>
	</form>
	<c:forEach var="z" items="${zipcodeLst }">
		<c:set var="zipcode" value="${z.zipcode }"/>
		<c:set var="address" value="${z.sido }${z.sigungu }${z.doro }"/>
		<div onmouseover="this.className='list_over'"
			onmouseout="this.className='list_out'"
			onclick="setParentAddr('${zipcode }', '${address }')">
		${zipcode } ${address }<br/>
		</div>
	</c:forEach> 
</body>
</html>