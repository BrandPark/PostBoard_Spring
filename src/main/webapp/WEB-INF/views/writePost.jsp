<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="sf" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html, charset=UTF-8">
<title>글 작성</title>
</head>
<body>
<h1> 글 작성하기</h1>
<sf:form method="post" action="${pageContext.request.contextPath}/doPost" modelAttribute="text">
	<table>
		<tr><td>제목 : </td> <td><sf:input path="title"/></td></tr>
		<tr><td>내용: </td> <td><sf:textarea path="contents"/></td></tr>
		<tr><td><input type="submit" value="작성하기"/></td></tr>
	</table>
</sf:form>
</body>
</html>