<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>  

<!DOCTYPE html>
<html>
<head>
 <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.1/dist/css/bootstrap.min.css"
        integrity="sha384-zCbKRCUGaJDkqS1kPbPd7TveP5iyJE0EjAuZQTgFLD2ylzuqKfdKlfG/eSrtxUkn" crossorigin="anonymous">
<meta charset="ISO-8859-1">
<title>Authentication Page</title>
</head>

<body>
<h2><b><i><font color="blue">Login Page</font></i></b></h2><br>
<form:form action="Auth" method="post" commandName="login">

        <label for="username"><b>User Name:</b></label>
        <input type="text" placeholder="Your username" name="username" id="username" required>
        <br>
        <br>    
        <label for="password"><b>Password:</b></label>
        <input type="password" placeholder="Your Password" name="password" id="password" required>
        <br>
        <br>
	<input type="submit" name="Submit"  class="btn btn-success"/>
</form:form>
</body>
</html>