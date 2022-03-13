<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html xmlns="http://www.w3.org/1999/xhtml" 
      xmlns:th="https://www.thymeleaf.org"
      xmlns:sec="https://www.thymeleaf.org/thymeleaf-extras-springsecurity3">
    <head>
        <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.1/dist/css/bootstrap.min.css"
        integrity="sha384-zCbKRCUGaJDkqS1kPbPd7TveP5iyJE0EjAuZQTgFLD2ylzuqKfdKlfG/eSrtxUkn" crossorigin="anonymous">
        <title>Login</title>
    </head>
    <body>
        <div th:if="${param.error}">
        
           <h3><i><b><font color="red">Invalid username or password.</font></b></i></h3>
        </div>
        <div th:if="${param.logout}">
            You have been logged out.
        </div>
        <form th:action="@{/login}" method="post">
        <fieldset class="form-group">
        <label for="username">User Name:</label>
        <input type="text" class="form-control" placeholder="Your username" name="username" id="userName">
    </fieldset>

	<fieldset class="form-group">
        <label for="password">Password:</label>
        <input type="password" class="form-control" placeholder="Your Password" name="password" id="password">
    </fieldset>

            <div><input type="submit" value="Sign In" class="btn btn-success"/></div>
        </form>
        
        <h3><a href="/">Return to Main Page</a></h3>
    </body>
</html>