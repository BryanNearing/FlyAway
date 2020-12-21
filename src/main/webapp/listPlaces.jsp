<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%> 
<%@ page import="com.Dao.PlaceDao"%>
<%@ page import="java.util.ArrayList"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Places</title>
</head>
<body>

<%
	ArrayList<String> list = com.Dao.PlaceDao.getAllPlaces();

	for(String name: list)
		out.println(name + "<br>");
%>

<br>
     <form action="addNewPlace.jsp">
         <button type="submit">Add New Place</button>
    </form>
    <br>
    <form action="adminDashboard.jsp">
         <button type="submit">Dashboard</button>
    </form>

</body>
</html>