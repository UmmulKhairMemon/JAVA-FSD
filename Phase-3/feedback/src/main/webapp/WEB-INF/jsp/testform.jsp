<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>   
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title>Add Feedback</title>
</head>
<body text = "black">
<form:form action="/test_form" method="post" commandName="testUser">
  <label for="user">User:</label><br>
  <input type="text" id="user" name="user" placeholder="User Name"><br>
  <label for="comments">Comments:</label><br>
  <input type="text" id="comments" name="comments" placeholder="Comment"><br>
  <label for="rating">Rating:</label>
  <input type="range" name="rating" id="rating" min="0" max="10" value="5" class="slider red " ><br>
  <input type="submit" value="Submit" align="center">
  
</form:form> 
</body>
</html>