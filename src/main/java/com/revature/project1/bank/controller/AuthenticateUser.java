package com.revature.project1.bank.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.revature.project1.bank.service.CustomerService;
import com.revature.project1.bank.service.CustomerServiceImpl;



/**
 * Servlet implementation class AuthenticateUser
 */
public class AuthenticateUser extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	private static AuthenticateUser authenticateUser = new AuthenticateUser();
	
	public static AuthenticateUser getInstance() {
		return authenticateUser;
	}
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AuthenticateUser() {
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
		int customerAccNo = Integer.parseInt(request.getParameter("customerAccNo"));
		String customerPassword = request.getParameter("customerPassword");
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.println("<html><head>");
		out.println("<link href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css\" rel=\"stylesheet\" integrity=\"sha384-\"/>\r\n"
				+ "<link type=\"text/css\" rel=\"stylesheet\" href=\"CSS/Style.css\"/>");
		out.println("</head><body>");
		CustomerService customerService = new CustomerServiceImpl();	
		if (customerService.isCustomerExists(customerAccNo, customerPassword)) {
			out.println("<h2>You have logged in at : " + new java.util.Date());
			out.println("Welcome" + customerAccNo);
			HttpSession session = request.getSession();
			session.setAttribute("customerAccNo", +customerAccNo);
			RequestDispatcher dispatcher = request.getRequestDispatcher("CustomerOperations.jsp");	
			dispatcher.forward(request, response);
			out.println("<a href='CustomerOperations.jsp?customerAccNo="+customerAccNo+"'>PerformOperations</a>");			
			
		} else {
			out.println("<h2>You have logged in at : " + new java.util.Date());
			out.println("Sorry customerAccNo or customerPassword incorrect " + customerAccNo);		
			out.println("<br/><br/><a href=Home.html>Try Again</a>");
			
		}
		out.println("</body></html>");
		}
}