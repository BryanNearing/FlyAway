package com.Servlets;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class TakeInBillingInfo
 */
public class TakeInBillingInfo extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		HttpSession sesh = request.getSession();

		sesh.setAttribute("ccNum", request.getParameter("ccNum"));
		sesh.setAttribute("exp", request.getParameter("exp"));
		sesh.setAttribute("cvc", request.getParameter("cvc"));

		RequestDispatcher rd = request.getRequestDispatcher("displayDetails.jsp");
		rd.forward(request, response);
	}

}
