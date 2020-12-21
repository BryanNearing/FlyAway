<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<%
String id=request.getParameter("id");
session.setAttribute("id", id);
%>

<h1>Enter Personal Information</h1>
<form action="TakeInPersonInfo" method="post">
<table>


<tbody>
<tr><td>Name:</td><td><input type="text" name="name"></td></tr>
<tr><td>Address:</td><td><input type="text" name="address"></td></tr>
<tr><td>Zip Code:</td><td><input type="text" name="zipCode"></td></tr>
<tr><td>State:</td><td><input type="text" name="state"></td></tr>
<tr><td>Number of Tickets:</td><td><input type="text" name="numTickets"></td></tr>
</tbody>
</table>
<input type="submit" value="Submit">
</form>


</body>
</html>