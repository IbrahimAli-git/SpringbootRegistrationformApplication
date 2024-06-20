package com.app.springboot_registrationform.service;

import com.app.springboot_registrationform.entity.Customer;

import java.util.List;


public interface CustomerService {
     void registerCustomer(Customer customer);
      List<Customer> findAllCustomers();
}
