<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

${headermsg}
<form:errors path="student1.*" />
<form action="/SpringMVC/submitAdmission.html" method="post">
	Name : <input type="text" name="studentName"/><br>
	Hobby : <input type="text" name="studentHobby"/>
	<br>
	Address :<br>
	City <input type="text" name="address.city"/>
	State <input type="text" name="address.state"/>
	Pin <input type="text" name="address.pin"/>
	<input type="submit" value="Submit">
</form>
</body>
</html>