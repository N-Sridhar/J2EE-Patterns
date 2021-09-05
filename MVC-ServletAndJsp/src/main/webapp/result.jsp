<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Average</title>
</head>
<body>
	<%
	int avg = (Integer) request.getAttribute("result");
	out.println("Max of two numbers: " + avg);
	%>
</body>
</html>