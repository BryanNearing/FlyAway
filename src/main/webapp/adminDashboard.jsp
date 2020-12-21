<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<a href="changePassword.jsp">Change Password</a>
	<br/><br>
	Get a List of All of the Available Places
    <form action="listPlaces.jsp">
         <button type="submit">List Places</button>
    </form>
    <br>
    Get a List of All of the Airlines
     <form action="airlines.jsp">
         <button type="submit">Airlines</button>
    </form>
    <br>
    Get A List of All of the Flights
     <form action="flights.jsp">
         <button type="submit">Flights</button>
    </form>
    <br><br><br>
     <form action="Logout" method="post">
         <button type="submit">Logout</button>
    </form>
	

</body>
</html>