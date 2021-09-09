package com.revature.project1.bank.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="employees")
public class Employee {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int employeeId;
	@Column
	private String employeeName;
	@Column
	private String employeePassword;
	@Column
	private String employeeMobileNo;
	@Column
	private String employeeEmail;
	@Column
	private int employeeSalary;
	
	public Employee() {
		super();
	}

	
	public Employee(int employeeId, String employeeName, String employeePassword, String employeeMobileNo,
			String employeeEmail, int employeeSalary) {
		super();
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.employeePassword = employeePassword;
		this.employeeMobileNo = employeeMobileNo;
		this.employeeEmail = employeeEmail;
		this.employeeSalary = employeeSalary;
	}


	public Employee(String employeeName, String employeePassword, String employeeMobileNo, String employeeEmail,
			int employeeSalary) {
		super();
		this.employeeName = employeeName;
		this.employeePassword = employeePassword;
		this.employeeMobileNo = employeeMobileNo;
		this.employeeEmail = employeeEmail;
		this.employeeSalary = employeeSalary;
	}


	public int getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}
	public String getEmployeeName() {
		return employeeName;
	}
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	public String getEmployeePassword() {
		return employeePassword;
	}
	public void setEmployeePassword(String employeePassword) {
		this.employeePassword = employeePassword;
	}
	
	public String getEmployeeMobileNo() {
		return employeeMobileNo;
	}
	public void setEmployeeMobileNo(String employeeMobileNo) {
		this.employeeMobileNo = employeeMobileNo;
	}
	public String getEmployeeEmail() {
		return employeeEmail;
	}
	public void setEmployeeEmail(String employeeEmail) {
		this.employeeEmail = employeeEmail;
	}
	public int getEmployeeSalary() {
		return employeeSalary;
	}
	public void setEmployeeSalary(int employeeSalary) {
		this.employeeSalary = employeeSalary;
	}


	@Override
	public String toString() {
		return "Employee [employeeId=" + employeeId + ", employeeName=" + employeeName + ", employeePassword="
				+ employeePassword + ", employeeMobileNo=" + employeeMobileNo + ", employeeEmail=" + employeeEmail
				+ ", employeeSalary=" + employeeSalary + "]";
	}
	
	
	
}
