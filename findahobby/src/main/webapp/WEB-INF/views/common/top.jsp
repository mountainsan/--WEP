<%@ page contentType="text/html; charset=UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%

	/*
	 *	request를 통해 session을 얻어올 수 있으며, 내부 인자가 true인 경우 session이 없으면 별도로 생성하고
	 *	false면 별도로 생성하지 않고 null을 반환 
	 */
	// 세션 설정 
	//HttpSession topSession= request.getSession(false);

	//String sessionId= (String) topSession.getAttribute("id");
	
	// 세션을 식별하기 위한 고유 ID 정보
	//System.out.println(topSession.getId());
	// 사용자가 등록한 ID 정보 
	//System.out.println(sessionId);
%>

<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-ka7Sk0Gln4gmtz2MlQnikT1wXgYsOg+OMhuP+IlRH9sENBO0LRn5q+8nbTov4+1p" crossorigin="anonymous"></script>


<c:url var="urlHome" value="/" />
<nav class="navbar navbar-expand-lg navbar-light bg-light">
	<div class="container-fluid">
		<a class="navbar-brand" href="${urlHome }">오늘의 취미</a>
		<button class="navbar-toggler" type="button" data-bs-toggle="collapse"
			data-bs-target="#navbarSupportedContent"
			aria-controls="navbarSupportedContent" aria-expanded="false"
			aria-label="Toggle navigation">
			<span class="navbar-toggler-icon"></span>
		</button>
		<div class="collapse navbar-collapse" id="navbarSupportedContent">
			<ul class="navbar-nav me-auto mb-2 mb-lg-0">
				<li class="nav-item"><a class="nav-link" href="#">전체 취미 보기</a>
				</li>
				<li class="nav-item"><a class="nav-link" href="#">실내 취미 보기</a>
				</li>
				<li class="nav-item"><a class="nav-link" href="${urlHome }outerhobby">실외 취미 보기</a>
				</li>
				<li class="nav-item"><a class="nav-link" href="${urlHome }noticeboard">공지사항</a>
				</li>
			</ul>
		</div>
		<div style="position: relative;right: 70px;top: 7px">
			<form class="d-flex">
				<input class="form-control me-2" type="search" placeholder="검색"
					aria-label="Search">
				<button class="btn btn-outline-success" style="width: 70;" type="submit">검색</button>
			</form>
		</div>
		<div class="navbar" id="navbarSupportedContent">
			<ul class="navbar-nav me-auto mb-2 mb-lg-0">
				<li class="nav-item"><a class="nav-link" href="${urlHome }login">로그인</a>
				</li>
				<li class="nav-item"><a class="nav-link" href="${urlHome }membership">회원가입</a>
				</li>
				<li class="nav-item"><a class="nav-link" href="#">글쓰기</a>
				</li>
			</ul>
		</div>
	</div>
</nav>
