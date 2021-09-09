package com.revature.project1.bank.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.revature.project1.bank.model.Employee;
import com.revature.project1.bank.service.EmployeeService;
import com.revature.project1.bank.service.EmployeeServiceImpl;

/**
 * Servlet implementation class EmployeeController
 */
public class EmployeeController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public EmployeeController() {
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
		String employeeName = request.getParameter("employeeName");
		String employeePassword = request.getParameter("employeePassword");		
		String employeeMobileNo = request.getParameter("employeeMobileNo");
		String employeeEmail = request.getParameter("employeeEmail");
		int employeeSalary = Integer.parseInt(request.getParameter("employeeSalary"));
		Employee employee = new Employee( 0, employeeName, employeePassword, employeeMobileNo, employeeEmail, employeeSalary);		
		EmployeeService employeeService = new EmployeeServiceImpl();
		int employeeId = employeeService.addEmployee(employee);
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.println("<head><link href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css\" rel=\"stylesheet\" integrity=\"sha384-\"/>\r\n"
				+ "<link type=\"text/css\" rel=\"stylesheet\" href=\"CSS/Style.css\"/></head>");
		out.println("<body><div class= cs-login>");
		out.println("<h1>"+employeeName + ", congrats you have successfully opened an account in our bank with balance of INR "+employeeSalary);
		out.println("<h1> Please note your employeeId for future logins :"+employeeId);
		out.println("<h1> <br/><br/><br/><a href=EmployeeLogin.jsp>Login</a>");

	}

}
