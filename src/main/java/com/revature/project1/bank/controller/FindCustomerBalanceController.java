package com.revature.project1.bank.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.revature.project1.bank.model.Customer;
import com.revature.project1.bank.service.CustomerService;
import com.revature.project1.bank.service.CustomerServiceImpl;

/**
 * Servlet implementation class FindCustomerBalanceController
 */
public class FindCustomerBalanceController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public FindCustomerBalanceController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int customerAccNo = Integer.parseInt(request.getParameter("customerAccNo"));
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.println("<body style='background-color:PeachPuff;'><div class= cs-login>");
		CustomerService customerService = new CustomerServiceImpl();	
	   int customerBalance = customerService.getBalance(customerAccNo);
	   if(customerService.getBalance(customerAccNo)!=0) {
		out.println("<h2>You have logged in at : " + new java.util.Date());
		out.println("Welcome" + customerAccNo);
		out.println("<br/><h1 align=center>Customer Balance for AccountNo" +customerAccNo+ " is" +customerBalance);
		out.println("<h1><br/><br/><br/><a href=CustomerOperations.jsp>GoBack</a>");
		}
		else {
			out.println("<h2>You have logged in at : " + new java.util.Date());
			out.println("Welcome" + customerAccNo);
			out.println("<br/><br/><br/><h2 align=center>please enter correct Account Number");
			out.println("<h1><br/><br/><br/><a href=FindCustomerBalance.jsp>GoBack</a>");
		}
		out.println("</body></html>");
	}

}
