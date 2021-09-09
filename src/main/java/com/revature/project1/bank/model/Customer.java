package com.revature.project1.bank.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@Entity
@Table(name="customers")
public class Customer {
	@Column
	private int customerId;
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int customerAccNo;
	@Column
	private String customerName;
	@Column
	private String customerPassword;
	@Column
	private String customerMobileNo;
	@Column
	private String customerEmailId;
	@Column
	private int customerBalance;
	@Column
	private Date registrationDate;
	
	public Customer() {
		super();
	}
	
	public Customer(int customerId, int customerAccNo, String customerName, String customerPassword,
			String customerMobileNo, String customerEmailId, int customerBalance, Date registrationDate) {
		super();
		this.customerId = customerId;
		this.customerAccNo = customerAccNo;
		this.customerName = customerName;
		this.customerPassword = customerPassword;
		this.customerMobileNo = customerMobileNo;
		this.customerEmailId = customerEmailId;
		this.customerBalance = customerBalance;
		this.registrationDate = registrationDate;
	}

	public Customer(String customerName, String customerPassword, String customerMobileNo, String customerEmailId) {
		super();
		this.customerName = customerName;
		this.customerPassword = customerPassword;
		this.customerMobileNo = customerMobileNo;
		this.customerEmailId = customerEmailId;
	}

	
	public Customer(int customerId, String customerName, String customerPassword, String customerMobileNo,
			String customerEmailId, int customerBalance, Date registrationDate) {
		super();
		this.customerId = customerId;
		this.customerName = customerName;
		this.customerPassword = customerPassword;
		this.customerMobileNo = customerMobileNo;
		this.customerEmailId = customerEmailId;
		this.customerBalance = customerBalance;
		this.registrationDate = registrationDate;
	}

	public Customer(int customerId, int customerAccNo, String customerName, String customerPassword,
			String customerMobileNo, String customerEmailId, int customerBalance) {
		super();
		this.customerId = customerId;
		this.customerAccNo = customerAccNo;
		this.customerName = customerName;
		this.customerPassword = customerPassword;
		this.customerMobileNo = customerMobileNo;
		this.customerEmailId = customerEmailId;
		this.customerBalance = customerBalance;
	}

	public Customer(int customerId, String customerName, String customerMobileNo, String customerEmailId,
			int customerBalance, Date registrationDate) {
		super();
		this.customerId = customerId;
		this.customerName = customerName;
		this.customerMobileNo = customerMobileNo;
		this.customerEmailId = customerEmailId;
		this.customerBalance = customerBalance;
		this.registrationDate = registrationDate;
	}

	public Customer(int customerId, String customerName, String customerMobileNo,
			String customerEmailId, int customerBalance) {
		super();
		this.customerId = customerId;
		this.customerName = customerName;
		this.customerMobileNo = customerMobileNo;
		this.customerEmailId = customerEmailId;
		this.customerBalance = customerBalance;
	}
	



	public int getCustomerId() {
		return customerId;
	}

	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}

	public int getCustomerAccNo() {
		return customerAccNo;
	}

	public void setCustomerAccNo(int customerAccNo) {
		this.customerAccNo = customerAccNo;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getCustomerPassword() {
		return customerPassword;
	}

	public void setCustomerPassword(String customerPassword) {
		this.customerPassword = customerPassword;
	}

	public String getCustomerMobileNo() {
		return customerMobileNo;
	}

	public void setCustomerMobileNo(String customerMobileNo) {
		this.customerMobileNo = customerMobileNo;
	}

	public String getCustomerEmailId() {
		return customerEmailId;
	}

	public void setCustomerEmailId(String customerEmailId) {
		this.customerEmailId = customerEmailId;
	}

	public int getCustomerBalance() {
		return customerBalance;
	}

	public void setCustomerBalance(int customerBalance) {
		this.customerBalance = customerBalance;
	}

	public Date getRegistrationDate() {
		return registrationDate;
	}

	public void setRegistrationDate(Date registrationDate) {
		this.registrationDate = registrationDate;
	}

	@Override
	public String toString() {
		return "Customer [customerId=" + customerId + ", customerAccNo=" + customerAccNo + ", customerName="
				+ customerName + ", customerPassword=" + customerPassword + ", customerMobileNo=" + customerMobileNo
				+ ", customerEmailId=" + customerEmailId + ", customerBalance=" + customerBalance
				+ ", registrationDate=" + registrationDate + "]";
	}
	
}
