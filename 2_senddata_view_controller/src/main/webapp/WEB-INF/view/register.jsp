<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Registration Form</title>
<link rel="stylesheet" type="text/css" href="webapp/css/styles.css">
</head>
<style>
body {
	font-family: Arial, sans-serif;
	background-color: #f4f4f9;
	margin: 0;
	padding: 0;
	display: flex;
	justify-content: center;
	align-items: center;
	height: 100vh;
}

h1 {
	text-align: center;
	color: #333;
}

form {
	background-color: #fff;
	padding: 20px;
	border-radius: 8px;
	box-shadow: 0 4px 6px rgba(0, 0, 0, 0.1);
	width: 300px;
}

label {
	display: block;
	font-weight: bold;
	margin-bottom: 5px;
	color: #555;
}

input {
	width: 100%;
	padding: 10px;
	margin-bottom: 15px;
	border: 1px solid #ddd;
	border-radius: 4px;
}

input:focus {
	border-color: #007BFF;
	outline: none;
}

button {
	width: 100%;
	padding: 10px;
	background-color: #007BFF;
	color: white;
	border: none;
	border-radius: 4px;
	font-size: 16px;
	cursor: pointer;
}

button:hover {
	background-color: #0056b3;
}
</style>
<body>
	<form action="process" method="post">

		<h1>Register</h1>
		<label for="name">Name:</label> <input type="text" id="name"
			name="name" required> <label for="email">Email:</label> <input
			type="email" id="email" name="email" required> <label
			for="password">Password:</label> <input type="password" id="password"
			name="password" required>
		<button type="submit">Register</button>
	</form>

</body>
</html>
