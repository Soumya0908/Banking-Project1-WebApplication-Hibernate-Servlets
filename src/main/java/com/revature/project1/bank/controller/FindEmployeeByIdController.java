package com.revature.project1.bank.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
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
 * Servlet implementation class FindEmployeeByIdController
 */
public class FindEmployeeByIdController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public FindEmployeeByIdController() {
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
		
		int employeeId = Integer.parseInt(request.getParameter("employeeId"));
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.println("<body style='background-color:PeachPuff;'><div align-text= 'center'>");
		EmployeeService employeeService = new EmployeeServiceImpl();
		Employee employee = employeeService.getEmployeeById(employeeId);
		List<Employee> employees = new ArrayList<Employee>();
		employees.add(employee);
		HttpSession session = request.getSession();
		session.setAttribute("allEmployees", employees);
		RequestDispatcher dispatcher = request.getRequestDispatcher("DisplayEmployeeDetails.jsp");
		dispatcher.forward(request, response);

}
}
