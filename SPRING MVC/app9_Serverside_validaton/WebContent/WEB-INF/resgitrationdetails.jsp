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
<table border='1' align="center" bgcolor="lightgreen">
<tr>
	<td>User Name  </td>
	<td>${user.uname}</td>
</tr>
<tr>
	<td> User Password   </td>
	<td> ${user.upwd} </td>
</tr>
<tr>
	<td>User Age </td>
	<td>${user.uage}</td>
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