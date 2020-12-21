package com.Servlets;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class AddPlace
 */
public class AddPlace extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		if(request.getParameter("newPlace") != "") {
			com.Dao.PlaceDao.save(request.getParameter("newPlace"));
			RequestDispatcher rd = request.getRequestDispatcher("listPlaces.jsp");
			rd.forward(request, response);
		}
		else
			response.getWriter().println("That was not a word, go back and try again");;
	}

}
