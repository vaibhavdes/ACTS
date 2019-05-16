<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<jsp:useBean id="vendor" class="bean.VendorBean" scope="session" />
<jsp:setProperty property="*" name="vendor" />
<!-- Matches Getter Setter -->
<c:redirect url="vendors.jsp" />


<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h5>
		<a href="starter.jsp">View All Vendors</a>
	</h5>
</body>
</html>