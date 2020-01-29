<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="sf" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>회원 가입</title>
</head>
<body>
	<h1>정보를 입력해 주세요.</h1>
	<hr>
	<sf:form action="${pageContext.request.contextPath}/doJoin" method="post" modelAttribute="user">
		<table>
			<tr> <td>ID  </td>	<td><sf:input path="userId"/></td> </tr>
			<tr> <td>Password  </td>	<td><sf:input path="userPassword"/></td> </tr>
			<tr> <td>Email  </td>	<td><sf:input path="userEmail"/></td> </tr>
			<tr><td><input type="submit" value="회원가입"/></td></tr>
		</table>
		
<%-- 		<input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}"/> --%>
		
	</sf:form>
</body>
</html>