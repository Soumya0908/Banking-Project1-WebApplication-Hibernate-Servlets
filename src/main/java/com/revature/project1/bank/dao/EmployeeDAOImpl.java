package com.revature.project1.bank.dao;

import java.util.List;
import java.util.logging.Logger;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.revature.project1.bank.model.Employee;
import com.revature.project1.bank.util.HibernateUtil;

public class EmployeeDAOImpl implements EmployeeDAO{
	
	private static Logger logger = Logger.getLogger("EmployeeDAOImpl");
	HibernateUtil hibernateUtil=new HibernateUtil();
	SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
	Session session = sessionFactory.openSession();	//ok then wait for 2 min
	//helllo whole application run cheyyali..servlet call hestee kada session undedi..allemployees ki

	public int addEmployee(Employee employee) {
		// TODO Auto-generated method stub
		Transaction transaction = session.beginTransaction();
		session.save(employee);
		int employeeId = employee.getEmployeeId();
		logger.info("Printing employee name before saving : "+employee.getEmployeeName());
		employee.setEmployeeName(employee.getEmployeeName());
		transaction.commit();
		return employeeId;
	}

	public boolean updateEmployee(Employee employee) {
		boolean result = true;
		Transaction transaction = null;
		try {
		transaction = session.beginTransaction();
		session.update(employee);
		int employeeId = employee.getEmployeeId();
		logger.info("Printing employeeId before saving : "+employee.getEmployeeId());
		employee.setEmployeeId(employee.getEmployeeId());
		transaction.commit();
		} catch(Exception e) {
			if(transaction != null) {
				transaction.rollback();
			}
			result = false;
		}
	    return result;
	}

	public boolean deleteEmployee(int employeeId) {
		// TODO Auto-generated method stub
		Transaction transaction = session.beginTransaction();
		Employee employee = new Employee();
		employee.setEmployeeId(employeeId);
		session.delete(employee);
		transaction.commit();
		return true;
	}

	public List<Employee> getAllEmployeeDetails() {
		// TODO Auto-generated method stub
		Query query = session.createQuery("from com.revature.project1.bank.model.Employee");
		List<Employee> employees = query.list();
		System.out.println(employees);
		return employees;
	}

	public Employee getEmployeeById(int employeeId) {
		// TODO Auto-generated method stub
		Transaction transaction = session.beginTransaction();
		Employee employee =  (Employee) session.get(Employee.class, employeeId);
		transaction.commit();
		return employee;
	}

	public boolean isEmployeeExists(int employeeId, String employeePassword) {
	
        Query query = session.createQuery("from Employee where employeeId = "+employeeId+ " and employeePassword = '"+employeePassword + "'");
        if (query.list().size() == 0)
        {
          return false;
        }
        else
        {
          return true;
        }
	}
	
	

}
