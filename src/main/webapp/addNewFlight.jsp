<!DOCTYPE html>
<!-- saved from url=(0042)http://localhost:8080/FlyAway/mainPage.jsp -->
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<%@ page import="com.Dao.AirlineDao"%>
<%@ page import="com.Dao.PlaceDao"%>
<%@ page import="java.util.ArrayList"%>
<%@ page import="java.util.List"%>

<title>Add a Flight</title>
</head>
<body>
	<h1>Add a Flight</h1>
	<form action="AddFlight" method="post">
		<table>

			<label for="dateOfTravel">Date of Travel</label>
			<input type="date" name="dateOfTravel">
			
			<tr><td>Source:</td><td>
			<select name="source">
				<%
					List<String> list = PlaceDao.getAllPlaces();

				for (String name : list) {
				%>
				<option value="<%out.print(name);%>">
					<%out.print(name);%>
				</option>
				<%
					}
				%>
			</select>
			<br>
			<tr><td>Destination:</td><td>
				<select name="destination">
					<%

					for (String name : list) {
					%>
					<option value="<%out.print(name);%>">
						<%out.print(name);%>
					</option>
					<%
						}
					%>
				</select>
			<tr><td>Airlines:</td><td>
				<select name="airline">
					<%
					List<String> airlines = AirlineDao.getAllAirlines();
					for (String name : airlines) {
					%>
					<option value="<%out.print(name);%>">
						<%out.print(name);%>
					</option>
					<%
						}
					%>
				</select>
			<tr>
				<td>Ticket Price ($):</td>
				<td><input type="text" name="ticketPrice"></td>
			</tr>
			<tr>
				<td>Number of Seats on Plane:</td>
				<td><input type="text" name="numSeats"></td>
			</tr>
			</tbody>
		</table>
		<br> <br> <br> <input type="submit" value="Add">
	</form>


</body>
</html>