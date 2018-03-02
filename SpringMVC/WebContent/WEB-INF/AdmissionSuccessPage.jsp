<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h2>Welcome </h2>

${headermsg}

<table border="2x">
	<tr>
		<td>Student Name</td>
		<td>${student1.studentName}</td>
	</tr>
	<tr>
		<td>Student Hobby</td>
		<td>${student1.studentHobby}</td>
	</tr>
</table>
City is ${student1.address.city}. State is ${student1.address.state}. Pin is ${student1.address.pin}
</body>
</html>