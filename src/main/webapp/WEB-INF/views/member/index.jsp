<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
    <c:set var="contextPath" value="${pageContext.request.contextPath }"/>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
 	index�Դϴ�<br>
 	<a href = "${contextPath }/member/register_view">ȸ������</a>
 	<a href = "${contextPath }/member/member_list">���ȸ������</a>
</body>
</html>