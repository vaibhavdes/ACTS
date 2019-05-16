<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<jsp:setProperty property="*" name="vendor" />
${sessionScope.vendor.vendorUpdate()}
<c:redirect url="vendors.jsp"/>

