<!DOCTYPE html>
<!-- saved from url=(0042)http://localhost:8080/FlyAway/mainPage.jsp -->
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

<%@ page import="com.Dao.AirlineDao"%>
<%@ page import="com.Dao.PlaceDao"%>
<%@ page import="java.util.ArrayList"%>
<%@ page import="java.util.List"%>

<title>Find a Flight</title>
</head>
<body>
	<br>
	<a href="adminLogin.jsp">Admin</a>
	<h1>Search for a Flight</h1>
	<form action="MainPage" method="post">
		<table>

			<label for="dateOfTravel">Date of Travel</label>
			<input type="date" name="dateOfTravel">
			<tr>
				<td>Source:</td>
				<td><select name="source">
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
				</select> <br>
			<tr>
				<td>Destination:</td>
				<td><select name="destination">
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
			<tr>
				<td>Number of People:</td>
				<td><input type="text" name="numPeople"></td>
			</tr>
			</tbody>
		</table>
		<br> <br>
		<br> <input type="submit" value="Search">
	</form>


</body>
</html>