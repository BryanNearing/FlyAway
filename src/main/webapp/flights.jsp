<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page import="com.Dao.FlightDao"%>
<%@ page import="java.util.ArrayList"%>
<%@ page import="com.Flight.Flight"%>
<%@ page import="java.util.*"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Flights</title>
</head>
<body>

	<table border="1" width="90%">
		<tr>
			<th>Id</th>
			<th>Source</th>
			<th>Destination</th>
			<th>Airline</th>
			<th>Ticket Price</th>
			<th>Number of Seats</th>
			<th>Day of Flight</th>
		</tr>
		<%

		List<Flight> list = FlightDao.getAllFlights();

		if (list.size() > 0) {
			for (Flight name : list) {
		%>
		<tr>
			<td>
				<%
					out.println(name.getId());
				%>
			</td>
			<td>
				<%
					out.println(name.getSource());
				%>
			</td>
			<td>
				<%
					out.println(name.getDestination());
				%>
			</td>
			<td>
				<%
					out.println(name.getAirline());
				%>
			</td>
			<td>
				<%
					out.println(name.getTicketPrice());
				%>
			</td>
			<td>
				<%
					out.println(name.getNumSeats());
				%>
			</td>
			<td>
				<%
					out.println(name.getFlightTime());
				%>
			</td>
		</tr>
		<%
			}
		}
		%>
	</table>


	<br>
	<form action="addNewFlight.jsp">
		<button type="submit">Add New Flight</button>
	</form>
	<br>
	<form action="adminDashboard.jsp">
		<button type="submit">Dashboard</button>
	</form>
</body>
</html>