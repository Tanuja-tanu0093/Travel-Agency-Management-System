<%@ page language="java" contentType="text/html; charset=UTF-8"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Travel Agency Login</title>
</head>

<body>

<h2>Travel Agency Management System</h2>
<h3>User Login</h3>

<form action="login" method="post">

<table border="0">

<tr>
<td>Email:</td>
<td><input type="email" name="email" required></td>
</tr>

<tr>
<td>Password:</td>
<td><input type="password" name="password" required></td>
</tr>

<tr>
<td></td>
<td><input type="submit" value="Login"></td>
</tr>

</table>

</form>

<br>

<%
String error = request.getParameter("error");

if(error != null){
%>

<p style="color:red;">Invalid Email or Password</p>

<%
}
%>

</body>
</html>