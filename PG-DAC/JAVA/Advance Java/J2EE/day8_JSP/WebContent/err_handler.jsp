<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page isErrorPage="true"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h5 style="color: red;">Error Message ${pageContext.exception.message}</h5>
	<h5>Error causing Page ${pageContext.errorData.requestURI}</h5>
	<h5>Status code ${pageContext.errorData.statusCode}</h5>

</body>
</html>