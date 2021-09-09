package com.revature.project1.bank.service;

import static org.junit.Assert.*;

import java.util.Date;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.revature.project1.bank.model.Customer;
import com.revature.project1.bank.dao.CustomerDAOImpl;
import com.revature.project1.bank.dao.CustomerDAO;

public class CustomerServiceImplTest {
	CustomerDAO customerDAO;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
		customerDAO = new CustomerDAOImpl();
	}

	@After
	public void tearDown() throws Exception {
		customerDAO=null;
	}

	@Test
	public void testAddCustomer() {
		Customer customer = new Customer(567,0,"Ramya","ramya123","7654321890","ramya123@gmail.com",6000,new Date());
		assertEquals(true, customerDAO.addCustomer(customer));
	}

	@Test
	public void testAmountWithdraw() {
		
	}

	@Test
	public void testAmountDeposit() {
		fail("Not yet implemented");
	}

	@Test
	public void testDeleteCustomer() {
		fail("Not yet implemented");
	}

	@Test
	public void testIsCustomerExists() {
		fail("Not yet implemented");
	}

	@Test
	public void testUpdateCustomer() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetCustomerByAccNo() {
		fail("Not yet implemented");
	}

	@Test
	public void testCustomerTransactions() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetBalance() {
		fail("Not yet implemented");
	}

	@Test
	public void testValidateCustomerById() {
		fail("Not yet implemented");
	}

	@Test
	public void testValidatetransaction() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetCustomers() {
		fail("Not yet implemented");
	}

}
