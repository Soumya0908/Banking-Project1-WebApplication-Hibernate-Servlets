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
import com.revature.project1.bank.model.Employee;
import com.revature.project1.bank.service.CustomerService;
import com.revature.project1.bank.service.CustomerServiceImpl;
import com.revature.project1.bank.service.EmployeeService;
import com.revature.project1.bank.service.EmployeeServiceImpl;

/**
 * Servlet implementation class DeleteCustomerController
 */
public class DeleteCustomerController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DeleteCustomerController() {
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
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.println("<body style='background-color:PeachPuff;'><div class= cs-login>");
		CustomerService customerService = new CustomerServiceImpl();
		customerService.deleteCustomer(customerId);
		HttpSession session = request.getSession();
		session.setAttribute("message", "Deletion of : "+customerId+ " is successful");
		List<Customer> customers = customerService.getCustomers();	
		session.setAttribute("allCustomers", customers);
		RequestDispatcher dispatcher = request.getRequestDispatcher("DisplayCustomerDetails.jsp");
		dispatcher.forward(request, response);
	}

}
