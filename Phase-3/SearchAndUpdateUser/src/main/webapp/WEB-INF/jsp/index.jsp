<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<%@include file="./base.jsp" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
</head>
<body bgcolor="cyan">
<h2>Spring Application</h2>

<h2 class="hello-title">Hello ${name}!</h2>
<a href="users">List of Users</a>
<form action="search/{id}" method="post">
Enter ID Number:<br> 
<input name="id" type="text" id="id" placeholder="User ID" required/>
<input name="Submit" type="submit"/>
</form>

</body>
</html>
