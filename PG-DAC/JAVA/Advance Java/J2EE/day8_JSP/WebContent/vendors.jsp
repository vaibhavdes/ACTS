<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<h4 align="center" style="color: red;">${sessionScope.vendor.status}</h4>
	
	<h5>List of All Vendors</h5>
	<table style="background-color: cyan; margin: auto;">
		<tr>
			<td>ID</td>
			<td>Name</td>
			<td>Email</td>
			<td>City</td>
			<td>Cell No</td>
			<td>Reg_Amount</td>
			<td>Reg_Date</td>
			<td>Role</td>
			<td></td>
			<td></td>
		</tr>
		<c:forEach var="vendor" items="${sessionScope.vendor.vendors}">
			<tr>
				<form>
					<input type="hidden" value="${vendor.vendorId}" name="vendorId">
					<td>${vendor.vendorId}</td>
					<td>${vendor.email}</td>
					<td>${vendor.name}</td>
					<td>${vendor.city}</td>
					<td>${vendor.cell_no}</td>
					<td>${vendor.regAmount}</td>
					<td>${vendor.regDate}</td>
					<td>${vendor.role}</td>
					<td><input type="submit" value="Update"
						formaction="update_vendor.jsp"></td>
					<td><input type="submit" value="Delete"
						formaction="delete_vendor.jsp"></td>
				</form>
			</tr>
		</c:forEach>
	</table>
	
	<h4 align="center" style="color: blue;"><a href="add_vendor.jsp">Add New Vendor</a></h4>

</body>
</html>