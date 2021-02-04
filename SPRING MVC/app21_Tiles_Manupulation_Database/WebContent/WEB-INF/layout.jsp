<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<table width="100%" height="550">
	<tr height="20%">
		<td colspan="2" bgcolor="blue" align="center">
			<tiles:insertAttribute name="header"/>
		</td>
	</tr>
	<tr height="65%">
		<td width="20%"  bgcolor="lightblue" align="center">
			<tiles:insertAttribute name="menu"/>
		</td>
		<td width="80%"  bgcolor="lightgreen" align="center">
			<tiles:insertAttribute name="body"/>
		</td>
	</tr>
	<tr height="15%">
	<td width="100%" colspan="2" bgcolor="brown" align="center">
			<tiles:insertAttribute name="footer"/>
		</td>
		
	</tr>
</table>
</body>
</html>