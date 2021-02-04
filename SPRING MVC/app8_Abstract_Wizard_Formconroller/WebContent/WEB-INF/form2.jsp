<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%><%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1 style="color: green;" align="center">Suthan software solution</h1>
<h2 style="color: blue;"align="center" >Student  registration form</h2>
<table align="center" bgcolor="lightblue">
<form:form method="post" commandName="user">
<tr> 
	<td>User UQAL </td>
	<td> <form:input path="uqal"/></td>
</tr>
<tr> 
	<td>User Deingnaton </td>
	<td> <form:input path="udes"/></td>
</tr>
<tr>
	<td colspan="2">
		<input type="submit" name="_target0" value="Back"/>
		<input type="submit" name="_target2" value="Next"/>
		<input type="submit" name="_cancel" value="Cancel"/>
	</td>

</tr>
</form:form>
</table>
</form>
</body>
</html>