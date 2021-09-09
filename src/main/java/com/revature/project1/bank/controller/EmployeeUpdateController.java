package com.revature.project1.bank.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.revature.project1.bank.model.Employee;
import com.revature.project1.bank.service.EmployeeService;
import com.revature.project1.bank.service.EmployeeServiceImpl;

/**
 * Servlet implementation class EmployeeUpdateController
 */
public class EmployeeUpdateController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public EmployeeUpdateController() {
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
		Employee employee = new Employee();		
		employeeService.updateEmployee(employee);				
		employee.setEmployeeName(request.getParameter("employeeName"));
		employee.setEmployeePassword(request.getParameter("employeePassword"));
		employee.setEmployeeMobileNo(request.getParameter("employeeMobileNo"));
		employee.setEmployeeEmail(request.getParameter("employeeEmail"));
		HttpSession session = request.getSession();
		session.setAttribute("Message","Details of employee with employeeId : "+employeeId+ " updated successfully");			
		out.println("<h1><br/><br/><br/><a href=EmployeeOperations.jsp>GoBack</a>");
		out.println("</div></body></html>");
		
	}

}
