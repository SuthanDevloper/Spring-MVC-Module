<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<form>
<table align="center" bgcolor="yellow">
<tr>
	<td>User FistName  </td>
	<td>${user.fname}</td>
</tr>
<tr>
	<td> User Last Name   </td>
	<td> ${user.lname} </td>
</tr>
<tr>
	<td>User qual </td>
	<td>${user.uqal}</td>
</tr>
<tr>
	<td> User udes  </td>
	<td> ${user.udes} </td>
</tr>
<tr>
	<td>  User  email  </td>
	<td> ${user.uemail} </td>
</tr>
<tr>
	<td>  User  mobile  </td>
	<td> ${user.umobile} </td>
</tr>

</table>
</form>
</body>
</html>