<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h5>Update Vendor</h5>
	<form action="add.jsp">
		<table style="background-color: cyan; margin: auto;">
			<tr>
				<td>email</td>
				<td><input type="email" name="email"></td>
			</tr>
			<tr>
				<td>name</td>
				<td><input type="text" name="name"></td>
			</tr>
			<tr>
				<td>City</td>
				<td><input type="text" name="city"></td>
			</tr>
			<tr>
				<td>Phone</td>
				<td><input type="text" name="phone"></td>
			</tr>
			<tr>
				<td>regAmount</td>
				<td><input type="text" name="regAmount"></td>
			</tr>
			<tr>
				<td>regDate</td>
				<td><input type="date" name="regDate"></td>
			</tr>
			<tr>
				<td>role</td>
				<td><input type="text" name="role"></td>
			</tr>
		</table>
		<input type="submit" value="Add New Vendor">
	</form>
</body>
</html>