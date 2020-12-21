<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 <%@ page import="com.Dao.FlightDao"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Displaying Details</title>
</head>
<body>

<%
out.println("Name: " + session.getAttribute("name") + "<br>");
out.println("Address: " + session.getAttribute("address") + "<br>");
out.println("Zipcode: " + session.getAttribute("zipCode") + "<br>");
out.println("State: " + session.getAttribute("state") + "<br>");
out.println("<br><br>");
out.println("CC number:   " + session.getAttribute("ccNum") + "<br>");
out.println("Expiration Date:   " + session.getAttribute("exp") + "<br>");
out.println("CVC:   " + session.getAttribute("cvc") + "<br><br>");


int id = Integer.parseInt((String) session.getAttribute("id"));
int totalPrice = Integer.parseInt((String) session.getAttribute("numTickets")) * FlightDao.getFlightPrice(id);
out.println("Cost is " + session.getAttribute("numTickets") + " tickets * " + FlightDao.getFlightPrice(id) + " (per Ticket) = $" + totalPrice);
FlightDao.updateTicketNum(id, Integer.parseInt((String) session.getAttribute("numTickets")));
%>
<br>
<form action="mainPage.jsp">
         <button type="submit">Purchase</button>
    </form>

</body>
</html>