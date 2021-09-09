package com.revature.project1.bank.service;

import java.util.List;

import com.revature.project1.bank.dao.EmployeeDAO;
import com.revature.project1.bank.dao.EmployeeDAOImpl;
import com.revature.project1.bank.model.Employee;

public class EmployeeServiceImpl implements EmployeeService {
	EmployeeDAO employeeDAO = new EmployeeDAOImpl();

	public int addEmployee(Employee employee) {
		// TODO Auto-generated method stub
		return employeeDAO.addEmployee(employee) ;
	}

	
	public boolean isEmployeeExists(int employeeId, String employeePassword) {
		// TODO Auto-generated method stub
		return employeeDAO.isEmployeeExists(employeeId, employeePassword) ;
	}

	public boolean updateEmployee(Employee employee) {
		// TODO Auto-generated method stub
		return employeeDAO.updateEmployee(employee) ;
	}


	public boolean deleteEmployee(int employeeId) {
		// TODO Auto-generated method stub
		return employeeDAO.deleteEmployee(employeeId) ;
	}

	
	public List<Employee> getAllEmployeeDetails() {
		// TODO Auto-generated method stub
		return employeeDAO.getAllEmployeeDetails() ;
	}

	public Employee getEmployeeById(int employeeId) {
		// TODO Auto-generated method stub
		return employeeDAO.getEmployeeById(employeeId) ;
	}

	
}
