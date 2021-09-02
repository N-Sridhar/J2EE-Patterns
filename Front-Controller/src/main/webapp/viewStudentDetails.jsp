<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Student Details</title>
</head>
<body>
	<jsp:useBean id="studentDetails"
		type="com.sri.patterns.frontcontroller.StudentVO" scope="request" />
	ID: <jsp:getProperty property="id" name="studentDetails" />
	Name: <jsp:getProperty property="name" name="studentDetails" />
</body>
</html>