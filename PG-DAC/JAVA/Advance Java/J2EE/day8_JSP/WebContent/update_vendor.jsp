<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<jsp:setProperty property="*" name="vendor" />
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h5>Update Vendor</h5>
	<form action="update.jsp">
		<table style="background-color: cyan; margin: auto;">
			<tr>
				<td>City</td>
				<td><input type="text" name="city"></td>
			</tr>
			<tr>
				<td>Phone</td>
				<td><input type="text" name="cell_no"></td>
			</tr>
		</table>
		<input type="submit" value="Update">
	</form>
</body>
</html>