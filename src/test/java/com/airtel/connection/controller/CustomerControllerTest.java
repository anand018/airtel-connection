package com.airtel.connection.controller;

import com.airtel.connection.dto.Customer;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.web.server.LocalServerPort;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.util.Assert;

import java.time.LocalDate;



@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class CustomerControllerTest {

	@Autowired
	TestRestTemplate restTemplate;
	@LocalServerPort
	Integer port;

	@Test
	public void testCreateConnection() {
		String baseUrl="http://localhost:"+port+"/airtel-connection";
		Customer customer = new Customer();
		customer.setAddress("AECS Layout Singasandra, Bengaluru");
		customer.setAltNo("75347584375");
		customer.setDob(LocalDate.parse("2019-12-12"));
		customer.setEmail("abc@xyz.com");
		customer.setId(8383748);
		customer.setName("Smith");
		customer.setNomineeMobile("8475847584");
		customer.setPanNo("GHRTY1276R");

		ResponseEntity response = restTemplate.postForEntity(baseUrl+"/v1/createConnection", customer,String.class);
		Assert.isTrue(HttpStatus.OK == response.getStatusCode(), "Status should be 200");
	}
} 
