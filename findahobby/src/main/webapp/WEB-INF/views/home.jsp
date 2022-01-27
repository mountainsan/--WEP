<%@ page contentType="text/html; charset=UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<c:url var="urlHome" value="/" />

<html>
<head>
	<title>오늘의 취미</title>
</head>
<body>



<div class="top"><%@ include file="common/top.jsp" %></div>

<!-- card-layout start 20220126 pjh -->
<section class="pt-5 pb-5">
	<div class="container">
		<div class="row">
			<div class="col-12">
				<h3 class="mb-3" style="text-align: center;">취미 미리보기</h3>
			</div>
			<div class="col-12">
				<div class="inner">
					<div class="item">
						<div class="row">
							<!-- var: "h", items="${hobbyLst}"  -->
							<c:forEach begin="0" end="2">
								<div class="col-md-4 mb-3">
									<div class="card">
										<img class="img-fluid" alt="100%x280"
											src="https://images.unsplash.com/photo-1532781914607-2031eca2f00d?ixlib=rb-0.3.5&amp;q=80&amp;fm=jpg&amp;crop=entropy&amp;cs=tinysrgb&amp;w=1080&amp;fit=max&amp;ixid=eyJhcHBfaWQiOjMyMDc0fQ&amp;s=7c625ea379640da3ef2e24f20df7ce8d">
										<ul class="list-group list-group-flush">
											<li class="list-group-item"><b>제목 영역</b></li>
											<li class="list-group-item">카테고리 영역</li>
											<li class="list-group-item">해시태그 영역</li>
										</ul>
									</div>
								</div>
							</c:forEach>
						</div>
					</div>
				</div>
			</div>
		</div>
	</div>
</section>
<!-- card-layout end 20220126 pjh -->

<!-- card-layout recommend start 20220127 pjh -->
<section class="pt-5 pb-5">
	<div class="container">
		<div class="row">
			<div class="col-12">
				<h3 class="mb-3">오늘의 날씨로 취미를 추천해드립니다.</h3>
			</div>
			<div class="col-12">
				<div class="inner">
					<div class="item">
						<div class="row">
							<div class="col-md-4 mb-3">
								<div class="card">
									<img class="img-fluid" alt="100%x280"
										src="https://images.unsplash.com/photo-1532781914607-2031eca2f00d?ixlib=rb-0.3.5&amp;q=80&amp;fm=jpg&amp;crop=entropy&amp;cs=tinysrgb&amp;w=1080&amp;fit=max&amp;ixid=eyJhcHBfaWQiOjMyMDc0fQ&amp;s=7c625ea379640da3ef2e24f20df7ce8d">
									<ul class="list-group list-group-flush">
										<li class="list-group-item"><b>제목 영역</b></li>
										<li class="list-group-item">카테고리 영역</li>
										<li class="list-group-item">해시태그 영역</li>
									</ul>
								</div>
							</div>
							<!-- contents start 20220127 pjh -->
							<div class="col-md-4 mb-3">
								'사용자 아이디' 님 안녕하세요. <br /> 
								좋은 아침입니다.<br /> 
								오늘은 '맑음(날씨정보)' 날씨입니다.<br /> 
								'추천 취미 제목' 취미는 어떠신가요?<br />
								<button>'추천 취미 제목' 더 알아보기</button>
							</div>
							<!-- contents end 20220127 pjh -->
							</div>
					</div>
				</div>
			</div>
		</div>
	</div>
</section>
<!-- card-layout recommend end 20220127 pjh -->
	
<div class="footer"><%@ include file="common/footer.jspf" %></div>



</body>
</html>
