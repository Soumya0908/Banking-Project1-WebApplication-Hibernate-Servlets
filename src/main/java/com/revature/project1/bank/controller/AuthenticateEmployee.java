package com.revature.project1.bank.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.revature.project1.bank.service.CustomerService;
import com.revature.project1.bank.service.CustomerServiceImpl;
import com.revature.project1.bank.service.EmployeeService;
import com.revature.project1.bank.service.EmployeeServiceImpl;

/**
 * Servlet implementation class AuthenticateEmployee
 */
public class AuthenticateEmployee extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AuthenticateEmployee() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int employeeId = Integer.parseInt(request.getParameter("employeeId"));
		String employeePassword = request.getParameter("employeePassword");
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.println("<html><head>");
		out.println("<body style='background-color:PeachPuff;'><div class= cs-login>");
		EmployeeService employeeService = new EmployeeServiceImpl();
		if (employeeService.isEmployeeExists(employeeId, employeePassword)) {
			out.println("<h2>You have logged in at : " + new java.util.Date());
			out.println("Welcome" + employeeId);
			HttpSession session = request.getSession();
			session.setAttribute("employeeId", +employeeId);
			RequestDispatcher dispatcher = request.getRequestDispatcher("EmployeeOperations.jsp");
			dispatcher.forward(request, response);
			out.println("<a href='EmployeeOperations.jsp?employeeId="+employeeId+"'>PerformOperations</a>");
		}else {
			out.println("<h2>You have logged in at : " + new java.util.Date());
			out.println("Sorry employeeId or password incorrect " + employeeId);		
			out.println("<br/><br/><a href=Home.html>Try Again</a>");
		}
		out.println("</body></html>");

	}

}
