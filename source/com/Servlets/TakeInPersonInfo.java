package com.Servlets;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class BookFlight
 */
public class TakeInPersonInfo extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String id= (String) request.getSession().getAttribute("id");
		
		request.getSession(false).invalidate();
		HttpSession sesh = request.getSession(true);
		
		
		sesh.setAttribute("id", id);
		sesh.setAttribute("name", request.getParameter("name"));
		sesh.setAttribute("address",request.getParameter("address"));
		sesh.setAttribute("zipCode", request.getParameter("zipCode"));
		sesh.setAttribute("state", request.getParameter("state"));
		sesh.setAttribute("numTickets", request.getParameter("numTickets"));
		
		RequestDispatcher rd = request.getRequestDispatcher("getBillingInfo.jsp");
		rd.forward(request, response);
	}

}
