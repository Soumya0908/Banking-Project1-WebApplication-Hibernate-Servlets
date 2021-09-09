package com.revature.project1.bank.dao;

import java.util.List;

import com.revature.project1.bank.model.Customer;

public interface CustomerDAO {
	
	public int addCustomer(Customer customer);
	public boolean isCustomerExists(int customerAccNo, String customerPassword);
	public List<Customer> getCustomers();
	public boolean updateCustomer(Customer customer);
	public Customer getCustomerByAccNo(int customerAccNo);
	public int amountWithdraw(int customerAccNo, int amount);
	public int amountDeposit(int customerAccNo, int amount);
	public int customerTransactions(int senderId, int receiverId, int amount);
	public int getBalance(int customerAccNo);
	public boolean  deleteCustomer(int customerId);
	public Customer validateCustomerById(int customerId);
	

}
