package com.airtel.connection.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.airtel.connection.dto.Customer;
import com.airtel.connection.service.CustomerService;

@RestController
public class CustomerController {

	@Autowired
	CustomerService customerService;

	@RequestMapping(value = "/v1/createConnection", method = RequestMethod.POST)
	public void createConnection(@RequestBody Customer customer) {
		customerService.createCon(customer);
	}

}
