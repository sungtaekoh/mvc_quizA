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
<body>member_list.jsp<br>
<table border=-"1">
<tr>
	<th>���̵�</th> <th>��й�ȣ</th> <th>�̸�</th>
</tr>
	<c:choose>
		<c:when test="${list.size() !=0 }">
			<c:forEach var="mem" item="${list }">
			<tr>
				<td>${mem.id }</td> <td>${mem.pwd }</td> <td>${mem.name }</td>
				</tr>
				</c:forEach>
			<tr><th colspan="3">�����Ͱ� �����Ѵ�</th></tr>
		</c:when>
		<c:otherwise>
			�����Ͱ� �������� �ʽ��ϴ� 	 
		</c:otherwise>
		</table>
	</c:choose>
	<tr><td colspan="3"><a href="index">index�̵�</a> </td> </tr>
</body>
</html>