<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ page import="com.Dao.AirlineDao"%>
<%@ page import="java.util.ArrayList"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Airlines</title>
</head>
<body>

<%
	ArrayList<String> list = com.Dao.AirlineDao.getAllAirlines();

	for(String name: list)
		out.println(name + "<br>");
%>

<br>
     <form action="addNewAirline.jsp">
         <button type="submit">Add New Airline</button>
    </form>
    <br>
    <form action="adminDashboard.jsp">
         <button type="submit">Dashboard</button>
    </form>

</body>
</html>