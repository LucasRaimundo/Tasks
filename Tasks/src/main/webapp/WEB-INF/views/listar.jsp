<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Task List</title>
</head>
<body>
<table>
	<tr>

		<th>ID</th>
		<th>Descri?ao</th>
		<th>Status</th>
	</tr>
	<c:forEach var="tasks" items="${tasks_list}">
		<tr>
			<td><c:out value="${tasks.id}"></c:out></td>
			<td><c:out value="${tasks.nome}"></c:out></td>
			<td><c:out value="${tasks.status}"></c:out></td>
		
		</tr>
	</c:forEach>
</table>		
</body>
</html>