package com.Servlets;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.Flight.*;

/**
 * Servlet implementation class AddFlight
 */
public class AddFlight extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		Flight f = new Flight(request.getParameter("source"), 
				request.getParameter("destination"), request.getParameter("airline"),
				Float.parseFloat(request.getParameter("ticketPrice")), Integer.parseInt(request.getParameter("numSeats")),
						request.getParameter("dateOfTravel"));
		
		int status = com.Dao.FlightDao.save(f);
		System.out.println(status);
		RequestDispatcher rd = request.getRequestDispatcher("flights.jsp");
		rd.forward(request, response);
		
	}

}
