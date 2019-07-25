package com.app.dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.app.pojos.Customer;
@Repository
public class CustomerDao implements ICustomerDao {

	@Autowired
	SessionFactory sf;
	@Override
	public void addCustomer(Customer customer) {
		sf.getCurrentSession().persist(customer);

	}

	@Override
	public Customer getCustomerById(int customerId) {
		
		return sf.getCurrentSession().get(Customer.class, customerId);
	}

	@Override
	public List<Customer> getAllCustomers() {
		
		String jpql = "select c from Customer c";
		return sf.getCurrentSession().createQuery(jpql,Customer.class).getResultList();
	}

	@Override
	public Customer getCustomerByUsername(String username) {
		String jpql = "select c from Customer c where c.userName=:us";
		return sf.getCurrentSession().createQuery(jpql, Customer.class).setParameter("us", username).getSingleResult();
	}

	@Override
	public Customer validateCustomer(String username, String password) {
		// TODO Auto-generated method stub
		String jpql="select c from Customer c where c.userName=:us and c.password=:psw";
		return sf.getCurrentSession().createQuery(jpql,Customer.class).setParameter("us", username).setParameter("psw", password).getSingleResult();
	}

	@Override
	public String deleteCustomer(Customer customer) {
		// TODO Auto-generated method stub
		sf.getCurrentSession().delete(customer);
		return "customer deleted successfully";
	}

}
