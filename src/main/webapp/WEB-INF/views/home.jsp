<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<html>
<head>
	<title>스프링 게시판</title>
</head>
<body>
<h1>
	Post Board _ Spring
</h1>

<P> <a href="${pageContext.request.contextPath}/postList">게시글 목록</a> </P>

	<c:if test="${pageContext.request.userPrincipal.name != null}">
<!-- 		<a href="document.getElementById('logout').submit()">Logout</a> -->


		<form id="logout" action="<c:url value="/logout"/>" method="post">
			<input type="hidden" name="${_csrf.parameterName}"
				value="${_csrf.token }" />
			<input type="submit" value="logout"/>
		</form>
	</c:if>

</body>
</html>
