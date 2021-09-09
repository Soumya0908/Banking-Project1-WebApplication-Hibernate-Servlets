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
 * Servlet implementation class CustomerControllerTransaction
 */
public class CustomerControllerTransaction extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CustomerControllerTransaction() {
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
	
		int senderId = Integer.parseInt(request.getParameter("senderId"));
		int receiverId = Integer.parseInt(request.getParameter("receiverId"));
		int amount = Integer.parseInt(request.getParameter("amount"));
		PrintWriter out = response.getWriter();
		out.println("<html><head>");
		out.println("<body style='background-color:PeachPuff;'><div class= cs-login>");
		CustomerService customerService = new CustomerServiceImpl();
		Customer customer = new Customer();
		if(customerService.customerTransactions(senderId, receiverId, amount)!=0) {
		out.println("<h2>You have logged in at : " + new java.util.Date());
	     	HttpSession session = request.getSession();
			session.setAttribute("customerAccNo:", +customer.getCustomerAccNo());
			out.println("<br/><h1>Transfer of amount" +amount+"has been done successfully from accountNo " +senderId+ " to accountNo " +receiverId);
			out.println("<h1><br/><br/><br/><a href=CustomerOperations.jsp>GoBack</a>");
		}
		else {
			out.println("Transaction has been failed");
			out.println("<h1><br/><br/><br/><a href=CustomerOperations.jsp>GoBack</a>");		
		}
			out.println("</div></body></html>");
	}

}
