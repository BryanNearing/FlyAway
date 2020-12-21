<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page import="java.util.*"%>
<%@ page import="com.Flight.*, com.Dao.FlightDao"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Flights Matching Your Search</title>
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
			<th>Book Flight</th>
		</tr>
		<%
			String dateOfTravel = request.getParameter("dateOfTravel");
		String source = request.getParameter("source");
		String destination = request.getParameter("destination");
		String numPeople = request.getParameter("numPeople");

		List<Flight> list = FlightDao.getAllFlightsSearch(source, destination, dateOfTravel, Integer.parseInt(numPeople));

		
		if (list.size() > 0) {
			for (Flight name : list) {
		%>
		<tr>
			<td><%out.println(name.getId()); %></td>
			<td><%out.println(name.getSource()); %></td>
			<td><%out.println(name.getDestination()); %></td>
			<td><%out.println(name.getAirline()); %></td>
			<td><%out.println(name.getTicketPrice()); %></td>
			<td><%out.println(name.getNumSeats()); %></td>
			<td><%out.println(name.getFlightTime()); %></td>
			<td><a href="bookFlight.jsp?id=<%out.println(name.getId());%>">Book</a></td>
		</tr>
		<%
			}
		}
		%>
	</table>

</body>
</html>