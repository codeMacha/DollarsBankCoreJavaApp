package com.cognixia.jump.dao;

import com.cognixia.jump.model.Customer;

public interface CustomerDAO {
	
	//create 
	Customer createCustomer(Customer customer);
	
	//read
	Customer getCustomerById(int id);
	Customer getCustomerByUsername(String username);
	
	//update
	Customer updateCustomer(Customer customer);
	
	// delete
	boolean removeCustomerById(int id);

}
