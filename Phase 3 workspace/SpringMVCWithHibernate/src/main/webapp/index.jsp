<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
${requestScope.msg}
<form action="checkLoginDetails" method="post">
	<label>Email</label> &nbsp;&nbsp;&nbsp;
	<input type="email" name="email"><br/>
	<label>Password</label>
	<input type="password" name="password"><br/>
	<label>TypeOfUser</label>
	<input type="radio" name="typeOfUser" value="user"/>User
	<input type="radio" name="typeOfUser" value="admin"/>Admin
	<br/>
	<input type="submit" value="submit"/>
	<input type="reset" value="reset"/>
</form>
<br/>
<a href="signUp.jsp">SignUp</a>
</body>
</html>