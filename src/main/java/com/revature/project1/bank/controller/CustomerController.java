package com.revature.project1.bank.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.revature.project1.bank.model.Customer;
import com.revature.project1.bank.service.CustomerService;
import com.revature.project1.bank.service.CustomerServiceImpl;

/**
 * Servlet implementation class CustomerController
 */
public class CustomerController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CustomerController() {
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
		int customerId = Integer.parseInt(request.getParameter("customerId"));
		String customerName = request.getParameter("customerName");
		String customerPassword = request.getParameter("customerPassword");
		String customerMobileNo = request.getParameter("customerMobileNo");
		String customerEmailId = request.getParameter("customerEmailId");
		int customerBalance = Integer.parseInt(request.getParameter("customerBalance"));
		Customer customer = new Customer(customerId , 0, customerName, customerPassword, customerMobileNo, customerEmailId, customerBalance, new Date());	
		CustomerService customerService = new CustomerServiceImpl();
		int customerAccNo = customerService.addCustomer(customer);
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();	
		out.println("<link href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css\" rel=\"stylesheet\" integrity=\"sha384-\"/>\r\n"
				+ "<link type=\"text/css\" rel=\"stylesheet\" href=\"CSS/Style.css\"/>");
		out.println("<body><div class= cs-login>");
		out.println("<h1>"+customerName+ ",congrats you have successfully opened an account in our bank with balance of INR "+customerBalance);
		out.println("<h1> Please note your CustomerAccountNo for future logins :"+customerAccNo+"   "+customer.getRegistrationDate());
		out.println("<h1> <br/><br/><br/><a href=CustomerLoginForm.jsp>Login</a>");
		out.println("<div></body></html>");	
	}

}
