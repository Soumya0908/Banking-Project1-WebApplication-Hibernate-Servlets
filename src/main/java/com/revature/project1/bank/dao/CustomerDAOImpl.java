package com.revature.project1.bank.dao;

import java.util.List;

import org.apache.log4j.Logger;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import com.revature.project1.bank.model.Customer;
import com.revature.project1.bank.util.HibernateUtil;

//run and see
public class CustomerDAOImpl implements CustomerDAO {
	HibernateUtil hibernateUtil=new HibernateUtil();
    private static Logger logger = Logger.getLogger("CustomerDAOImpl");
    SessionFactory sessionFactory = hibernateUtil.getSessionFactory();
    Session session = sessionFactory.openSession();
    
	public int addCustomer(Customer customer) {
		Transaction transaction = session.beginTransaction();
		session.save(customer);
		int customerAccNo = customer.getCustomerAccNo();
		logger.info("Printing customer name before saving : "+customer.getCustomerName());
		customer.setCustomerName(customer.getCustomerName());
		transaction.commit();
		return customerAccNo;
	}

	public boolean isCustomerExists(int customerAccNo, String customerPassword) {
        Query query = session.createQuery("from com.revature.project1.bank.model.Customer where customerAccNo="+customerAccNo+" and customerPassword='"+customerPassword +"'");
        if (query.list().size() == 0)
        {
          return false;
        }
        else
        {
          return true;
        }
	}


	public Customer getCustomerByAccNo(int customerAccNo) {
		Transaction transaction = session.beginTransaction();
		Customer customer =  (Customer) session.get(Customer.class, customerAccNo);
		transaction.commit();
		return customer;
	}

	public int amountWithdraw(int customerAccNo, int amount) {
	   Customer customer =  (Customer) session.get(Customer.class, customerAccNo);
		Transaction transaction=session.beginTransaction();
		logger.info("Amount"+amount+"withdrawal");
	    int customerBalance=customer.getCustomerBalance();
	    customerBalance =customerBalance-amount;
	    customer.setCustomerBalance(customerBalance);
		transaction.commit();
		return customerBalance;	
	}

	public int amountDeposit(int customerAccNo, int amount) {
		
	   Customer customer=(Customer) session.load(Customer.class,customerAccNo);
		Transaction transaction=session.beginTransaction();
		logger.info("Amount"+amount+"deposited");
	    int customerBalance= customer.getCustomerBalance();
	    customerBalance = customerBalance + amount;
	    customer.setCustomerBalance(customerBalance);
		transaction.commit();
		return customerBalance;
				
	}

	public int customerTransactions(int senderId, int receiverId, int amount) {
		// TODO Auto-generated method stub	
	    Customer customer=(Customer) session.load(Customer.class,senderId);
		Customer customer1=(Customer) session.load(Customer.class,receiverId);
		Transaction transaction=session.beginTransaction();
		logger.info("transfer successfull");
		int customerBalance=customer.getCustomerBalance();
		customerBalance=customerBalance-amount;
		customer.setCustomerBalance(customerBalance);
		int customerBalance1=customer1.getCustomerBalance();
		customerBalance1=customerBalance1+amount;
		customer1.setCustomerBalance(customerBalance1);
		transaction.commit();
		return customerBalance1;
	}

	public int getBalance(int customerAccNo) {
		Query query = session.createQuery("select customerBalance from com.revature.project1.bank.model.Customer where customerAccNo = "+customerAccNo);
		int customerBalance = (Integer) query.list().get(0);
		logger.info("The balance for :"+customerAccNo+ " is "+customerBalance);
		return customerBalance;
	}

	
	public boolean deleteCustomer(int customerId) {
		// TODO Auto-generated method stub
		Transaction transaction = session.beginTransaction();
		Customer customer = new Customer();
		customer.setCustomerId(customerId);
		session.delete(customer);
		transaction.commit();
		return true;
	}

	
	public boolean updateCustomer(Customer customer) {
		// TODO Auto-generated method stub
		boolean result = true;
		Transaction transaction = null;
		try {
		transaction = session.beginTransaction();
		session.update(customer);
		logger.info("Printing customerAccountNo before saving : "+customer.getCustomerAccNo());
		customer.setCustomerAccNo(customer.getCustomerAccNo());
		transaction.commit();
		} catch(Exception e) {
			if(transaction != null) {
				transaction.rollback();
			}
			result = false;
		}
	    return result;
}
	

	
	public Customer validateCustomerById(int customerId) {
		// TODO Auto-generated method stub
		Customer customer =  (Customer) session.get(Customer.class, customerId);
		if(customer ==null)
			return null;
		else
			return customer;
	}
	
	public boolean validatetransaction(int customerAccNo, int customerBalance) {
		// TODO Auto-generated method stub
		Customer customer =  (Customer) session.get(Customer.class, customerAccNo);
        Query query = session.createQuery("from customers where customerAccNo = "+customerAccNo + "and customerBalance = " +customer.getCustomerBalance());
        logger.info("The balance for:" +customerAccNo+ "is" +customerBalance);
        if (query.list().size() == 0)
        {
          return false;
        }
        else
        {
          return true;
        }
	}

	public List<Customer> getCustomers() {
		Query query = session.createQuery("from com.revature.project1.bank.model.Customer");
		List<Customer> customers = query.list();
		System.out.println(customers);
		return customers;
	}
}
