<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h3>Index page</h3>
	<h6>Send Data Controoler to View Using 1.Model</h6>

	<%
	String name = (String) request.getAttribute("name");
	Integer rollNo = (Integer) request.getAttribute("rollNo");
	List<String> namelist = (List<String>) request.getAttribute("nameList");
	%>
	<h3>
		Name:
		<%=name%></h3>

	<h3>
		rollNO:
		<%=rollNo%></h3>
	<h4>
		NameList:
		<%=namelist%></h4>
		
		<a href="login">Go to ModelAndView Example</a>
</body>
</html>