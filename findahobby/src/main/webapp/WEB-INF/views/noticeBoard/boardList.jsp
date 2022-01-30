<%@ page contentType="text/html; charset=UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<c:url var="urlHome" value="/" />
<!-- <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
<script type="text/javascript">
$(document).ready(function(){
	$("div.title").css("cursor", "pointer").click(function(){
		let no= $(this).attr("id");
		$("#writeNo").val(no);
		$("#frm").attr("action", "${urlHome}board/detailRead");
		$("#frm").submit();
	})
})
</script> -->
<div class="top"><%@ include file="../common/top.jsp" %></div>

<center>



<section class="pt-5 pb-5">
<form id="frm" action="${urlHome }noticeboard/write" method="post">
<!-- get session id 20220130 pjh -->
Session ID: <input type=text value='<%=session.getAttribute("hid") %>' readonly="readonly" />
<!-- <input type="hidden" id="writeNo" name="writeNo" /> -->
<table style="width: 650px; ">
	<thead>
	<tr>
	<c:set var="admin" value='<%=session.getAttribute("hid") %>' />
		<c:if test="${admin eq 'admin' }">
		<th style="width: 40px; height:20px;" align="center">선택</th>
		</c:if>
		<th style="width: 40px; height:20px;" align="center">번호</th>
		<th style="width: 330px; height:20px;" align="center">제 목</th>
		<th style="width: 80px; height:20px;" align="center">작성자</th>
		<th style="width: 120px; height:20px;" align="center">작성일</th>
		<th style="width: 80px; height:20px;" align="center">조회수</th>
	</tr>
	</thead>
	<tr>
	<c:set var="admin" value='<%=session.getAttribute("hid") %>' />
		<c:if test="${admin eq 'admin' }">
	    <td style="width: 40px; height:20px;" align="center"><hr/></td>
	    </c:if>
	 	<td style="width: 40px; height:20px;" align="center"><hr/></td>
		<td style="width: 330px; height:20px;" align="center"><hr/></td>
		<td style="width: 80px; height:20px;" align="center"><hr/></td>
		<td style="width: 120px; height:20px;" align="center"><hr/></td>
		<td style="width: 80px; height:20px;" align="center"><hr/></td>
	</tr>
	
	<!-- var: "b", items="${boardLst}"  -->
	<c:forEach begin="0" end="2">
	
	<tr>
	<c:set var="admin" value='<%=session.getAttribute("hid") %>' />
		<c:if test="${admin eq 'admin' }">
		<td style="width: 40px; height:40px;" align="center"><input type="checkbox"/></td>
		</c:if>
		<!-- pre : 넘어오는 값 그대로 출력 -->
		<!--  id="${board.no}", <pre>${board.title }</pre>  -->
		<td style="width: 40px; height:40px;" align="left"><div class="bnum">번호</div></td>
		<td style="width: 330px; height:40px;" align="left"><div class="title">게시판 제목</div></td>
		<td style="width: 80px; height:40px;" align="center">사용자 아이디</td>
		<td style="width: 120px; height:40px;" align="left">작성일</td>
		<td style="width: 80px; height:40px;" align="left">조회수</td>
	</tr>
	
	</c:forEach>
	
	
	<c:set var="admin" value='<%=session.getAttribute("hid") %>' />
		<c:if test="${admin eq 'admin' }">
	<tr><td colspan=5><hr/></td></tr>
	<tr>
		
		<td colspan=2><input type="checkbox"/> 전체선택</td>
		
		<td colspan=3 align="right">
			<input type="button" onclick="" value='삭제' style="width: 100px; "/>
			<!-- <input type="button" onclick="" value='글쓰기' style="width: 100px; "/> -->
			<button style="width: 100px;">글쓰기</button>
		</td>
	</tr>
	<tr><td colspan=5><hr/></td></tr>
		</c:if>
</table>
</form>
</section>


<table>
<tr>
<td>
	<select>
		<option>전체</option>
		<option>제목</option>
		<option>작성자</option>
	</select>
	<input type=text name='search'/>
	<input type=button name='searchBtn' value='검색' style="width: 80px; "/>
</td>
</tr>
</table>

</center>

<div class="footer"><%@ include file="../common/footer.jspf" %></div>