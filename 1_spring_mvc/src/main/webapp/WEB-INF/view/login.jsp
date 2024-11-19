<%@ page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<h1>login page</h1>
	<!-- <a href="/">Go to index page</a>     not work  -->

	<h1>This is example of ModelAndView</h1>
	<%
	String course = (String) request.getAttribute("course");
	String class1 = (String) request.getAttribute("class1");

	List<String> fruitsName = (List<String>) request.getAttribute("fruitsName");
	%>



	<h3>
		Course :
		<%=course%>
	</h3>
	<h3>
		class:
		<%=class1%></h3>

	<h5>
		Fruit Names :
		<%=fruitsName%></h5>

</body>
</html>