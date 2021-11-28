<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
    <c:set var ="contextPath" value="${pageContext.request.contextPath }"/>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>register_view.sjp<br>
	<h1>회원가입 페이지 입니다</h1>
	<from action="${contextPath }/member/register" method="post">
		<input type="text" name="id" placeholder="input id"><br>
		<input type="password" name="pwd" placeholder="input pwd"><br>
		<input type="text" name="name" placeholder="input name"><br>
		<input type="submit" value="가입">
	</from>

</body>
</html>