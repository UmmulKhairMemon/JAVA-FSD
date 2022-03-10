<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<html>
<head>
<%@include file="./base.jsp" %>
</head>

<style>
table {
float: left;
}

table, th, td {
border: 2px solid black;
}
</style>
<head></head>
<body bgcolor="cyan">
	<h2>Users Page</h2>
	
	<table>
	<tr><th>ID</th><th>Name</th><th>Email</th><th>Password</th></tr>
		<c:forEach items="${users}" var="user" varStatus="count">
			<tr id="${count.index}">
			<td>${user.id}</td>
			<td>${user.name}</td>
			<td>${user.email}</td>
			<td>${user.password}</td>
			
			</tr>
		</c:forEach>
		
	</table>
	<br>
	<br>
	<br>
	<br>
	<a href="/">Return to Menu</a>
	
</body>

</html> 