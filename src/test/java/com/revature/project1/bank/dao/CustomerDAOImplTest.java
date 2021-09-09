package com.revature.project1.bank.dao;

import static org.junit.Assert.*;

import java.util.Date;


import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.revature.project1.bank.model.Customer;
import com.revature.project1.bank.service.CustomerService;
import com.revature.project1.bank.service.CustomerServiceImpl;

public class CustomerDAOImplTest {
	
	CustomerService customerService;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
		customerService = new CustomerServiceImpl();
	}

	@After
	public void tearDown() throws Exception {
		customerService = null;
	}

	@Test
	public void testAddCustomer() {
		Customer customer = new Customer(1, 0 ,"Soumya","soumya@123","1234567890","soumya@123.com",50000, new Date());
		assertEquals(true,customerService.addCustomer(customer));
	}

	@Test
	public void testIsCustomerExists() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetCustomerByAccNo() {
		fail("Not yet implemented");
	}

	@Test
	public void testAmountWithdraw() {
		fail("Not yet implemented");
	}

	@Test
	public void testAmountDeposit() {
		fail("Not yet implemented");
	}

	@Test
	public void testCustomerTransactions() {
		fail("Not yet implemented");
	}

	@Test
	public void testCustomerWithIdExists() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetBalance() {
		fail("Not yet implemented");
	}

}
