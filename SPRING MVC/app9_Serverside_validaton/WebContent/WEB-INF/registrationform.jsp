<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
      <%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html>
<html>
<head>
<style type="text/css">
	.error{
	color: red;
	font-family: consolas;
	font-style: italic;
	font-weight: bold;
	font-size: large;
	}
</style>

<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1 style="color: green;" align="center">Suthan software solution</h1>
<h2 style="color: blue;"align="center" >User   registration form</h2>

<form:form method="post" action="reg" commandName="user">
<table align="center" bgcolor="lightblue">
<tr> 
	<td>User Name </td>
	<td> <form:input path="uname"/></td>
	<td> <form:errors path="uname" cssClass="error"/> 
</tr>
<tr> 
	<td>Password </td>
	<td> <form:input path="upwd"/></td>
	<td> <form:errors path="upwd" cssClass="error"/> 
</tr>
<tr> 
	<td>User Age</td>
	<td> <form:input path="uage"/></td>
	<td> <form:errors path="uage" cssClass="error"/> 
</tr>
<tr> 
	<td>User Date of Birth</td>
	<td> <form:input path="udob"/></td>
	<td> <form:errors path="uage" cssClass="error"/> 
</tr>
<tr> 
	<td>User Email id</td>
	<td> <form:input path="uemail"/></td>
	<td> <form:errors path="uemail" cssClass="error"/> 
</tr>
<tr> 
	<td>User Mobile</td>
	<td> <form:input path="umobile"/></td>
	<td> <form:errors path="umobile" cssClass="error"/> 
</tr>
<tr>
	<td >
		<input type="submit"  value="Regstration"/>
		
	</td>

</tr>
</table>
</form:form>


</body>
</html>