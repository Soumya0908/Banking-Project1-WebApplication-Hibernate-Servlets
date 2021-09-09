package com.revature.project1.bank.service;

import java.util.List;
import com.revature.project1.bank.model.Employee;

public interface EmployeeService {
	
	public int addEmployee(Employee employee);
	  public boolean isEmployeeExists(int employeeId, String employeePassword);
	  public  boolean updateEmployee(Employee employee);
	  public boolean deleteEmployee(int employeeId);
	  public List<Employee> getAllEmployeeDetails();
	  public Employee getEmployeeById(int employeeId);
}
