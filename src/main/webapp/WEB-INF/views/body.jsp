<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-rbsA2VBKQhggwzxH7pPCaAqO46MgnOM80zW1RWuH61DGLwZJEdK2Kadq2F9CUG65"
	crossorigin="anonymous">
<script
	src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/js/bootstrap.bundle.min.js"
	integrity="sha384-kenU1KFdBIe4zVF0s0G1M5b4hcpxyD9F7jL+jjXkk+Q2h455rYXK/7HAuoJl+0I4"
	crossorigin="anonymous"></script>
<style>
#indexbody {
	position : relative;
	margin-left:  200px;
	margin-right:  200px;
	height: 750px;
}


</style>

<body>
<div id="indexbody">
		<br>
		<h3>회원들이 가장 많이 살펴본 관광지</h3>
		<hr>
		<div class="row g-4">
				<c:forEach items="${aList}" var="dto" varStatus="status">
					<div class="col-3">

						<a href=detail.do?list=index&contentid=${dto.contentid}>
							<div class="card">
								<img src=${ dto.firstimage} class="card-img-top" alt="..." onerror="this.src='resources/images/noimg.png'" height=250px />
								<div class="card-body">
									<div>
										<span class="card-title" style="overflow:hidden;text-overflow:ellipsis;white-space:nowrap;">${dto.title}</span>
									</div>
									<div>
										<span class="card-title">조회수</span><span>${dto.readcount}</span>
									</div>
								</div>
							</div>
						</a>
					</div>
				</c:forEach>
		</div>
</div>
<!-- 
<c:if test="${user != null}">
	<div>${user.gender}자들이 많이 조회한 관광정보</div>
	<div>${user.birth} 년생들이 많이 조회한 관광정보</div>
	<div>${user.loc} 거주자들이 많이 조회한 관광정보</div>
</c:if>
 -->
</body>