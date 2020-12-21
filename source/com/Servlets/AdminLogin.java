package com.Servlets;

import java.io.IOException;
import com.Dao.AdminDao;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class GetProductInfo
 */
@WebServlet("/AdminLogin")
public class AdminLogin extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		
		RequestDispatcher rd = null;
		
		//TODO, validate login with SQL query
		if(com.Dao.AdminDao.correctLoginInfo(username, password)) {
			request.getSession(false).invalidate();
			HttpSession sesh = request.getSession(true);
			
			rd = request.getRequestDispatcher("adminDashboard.jsp");
			rd.forward(request, response);
		}
		else {
			rd = request.getRequestDispatcher("adminLogin.jsp");
			rd.forward(request, response);
		}
	}

}