package com.app.springboot_registrationform.service;

import com.app.springboot_registrationform.entity.Customer;
import com.app.springboot_registrationform.repo.CustomerRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerServiceImpl implements CustomerService{
    @Autowired
    private CustomerRepo repo;
    @Override
    public void registerCustomer(Customer customer) {
        repo.save(customer);
    }

    @Override
    public List<Customer> findAllCustomers() {
        return repo.findAll();
    }
}
