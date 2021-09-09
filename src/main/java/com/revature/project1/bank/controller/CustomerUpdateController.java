package com.revature.project1.bank.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

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
 * Servlet implementation class CustomerUpdateController
 */
public class CustomerUpdateController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CustomerUpdateController() {
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
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();	
		out.println("<body style='background-color:PeachPuff;'><div class= cs-login>");
		CustomerService customerService = new CustomerServiceImpl();
		Customer customer= new Customer();
		 customerService.updateCustomer(customer);
		HttpSession session = request.getSession();	
		session.getAttribute("Welcome to Update Section" +customerAccNo);	
		customer.setCustomerName(request.getParameter("customerName"));
		customer.setCustomerPassword(request.getParameter("customerPassword"));
		customer.setCustomerMobileNo(request.getParameter("customerMobileNo"));
		customer.setCustomerEmailId(request.getParameter("customerEmailId"));
		//customer.setCustomerAccNo(Integer.parseInt(request.getParameter("customerAccNo")));
		out.println("Details of customerAccNo : "+customerAccNo+ " updated successfully");
		out.println("<h1><br/><br/><br/><a href=CustomerOperations.jsp>GoBack</a>");
		
		out.println("</div></body></html>");
	}

}
