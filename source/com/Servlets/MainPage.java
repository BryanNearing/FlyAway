package com.Servlets;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.Dao.FlightDao;
import com.Flight.Flight;

/**
 * Servlet implementation class GetProductInfo
 */
@WebServlet("/MainPage")
public class MainPage extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String dateOfTravel = request.getParameter("dateOfTravel");
		String source = request.getParameter("source").replace("\n", "");
		String destination = request.getParameter("destination").replace("\n", "");
		String numPeople = request.getParameter("numPeople");
		

		List<Flight> list = FlightDao.getAllFlightsSearch(source, destination, dateOfTravel, Integer.parseInt(numPeople));
		request.setAttribute("list", list);
		
		RequestDispatcher rd = request.getRequestDispatcher("flightSearch.jsp");
		rd.forward(request, response);
	}

}
