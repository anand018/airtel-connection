package com.airtel.connection.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.airtel.connection.dto.Customer;
import com.airtel.connection.repository.CustomerRepo;
import com.airtel.connection.service.CustomerService;

@Service
public class CustomerServiceImpl implements CustomerService {

	@Autowired
	CustomerRepo customerRepo;

	@Override
	public void createCon(Customer customer) {
		customerRepo.save(customer);

	}

}
