package com.revature.project1.bank.service;

import java.util.List;

import org.hibernate.Transaction;

import com.revature.project1.bank.dao.CustomerDAO;
import com.revature.project1.bank.dao.CustomerDAOImpl;
import com.revature.project1.bank.model.Customer;

public class CustomerServiceImpl implements CustomerService {
   CustomerDAO customerDAO = new CustomerDAOImpl();
	public int addCustomer(Customer customer) {
		// TODO Auto-generated method stub
		return customerDAO.addCustomer(customer);
	}

	public int amountWithdraw(int customerAccNo, int amount) {
		// TODO Auto-generated method stub
		return customerDAO.amountWithdraw(customerAccNo, amount);
	}

	public int amountDeposit(int customerAccNo, int amount) {
		// TODO Auto-generated method stub
		return customerDAO.amountDeposit(customerAccNo, amount);
	}


	
	public boolean deleteCustomer(int customerId) {
		// TODO Auto-generated method stub
		return customerDAO.deleteCustomer(customerId);
	}


	
	public boolean isCustomerExists(int customerAccNo, String customerPassword) {
		// TODO Auto-generated method stub
		return customerDAO.isCustomerExists(customerAccNo, customerPassword);
	}

	
	public boolean updateCustomer(Customer customer) {
		// TODO Auto-generated method stub
		return customerDAO.updateCustomer(customer);
	}

	
	public Customer getCustomerByAccNo(int customerAccNo) {
		// TODO Auto-generated method stub
		return customerDAO.getCustomerByAccNo(customerAccNo);
	}

	
	public int customerTransactions(int senderId, int receiverId, int amount) {
		// TODO Auto-generated method stub
		return customerDAO.customerTransactions(senderId, receiverId, amount);
	}

	
	public int getBalance(int customerAccNo) {
		// TODO Auto-generated method stub
		return customerDAO.getBalance(customerAccNo);
	}

	
	public Customer validateCustomerById(int customerId) {
		// TODO Auto-generated method stub
		return customerDAO.validateCustomerById(customerId);
	}

	
	public List<Customer> getCustomers() {
		// TODO Auto-generated method stub
		return customerDAO.getCustomers();
	}


	
}
