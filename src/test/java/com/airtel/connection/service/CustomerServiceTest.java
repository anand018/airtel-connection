package com.airtel.connection.service;

import com.airtel.connection.repository.CustomerRepo;
import com.airtel.connection.service.impl.CustomerServiceImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;
import java.util.List;

@SpringBootTest
public class CustomerServiceTest {
    @Mock
    private CustomerRepo customerRepo;
    @InjectMocks
    private CustomerServiceImpl serviceImpl = new CustomerServiceImpl();

    @BeforeEach
    public void before() {

    }

    @Test
    public void testCreateConnection() {
        List<Customer> cList = new ArrayList<Customer>();


    }

}
