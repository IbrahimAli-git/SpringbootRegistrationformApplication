package com.app.service;

import com.app.entity.Customer;
import com.app.repo.CustomerRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomerServiceImpl implements CustomerService{
    @Autowired
    private CustomerRepo repo;
    @Override
    public void registerCustomer(Customer customer) {
        repo.save(customer);
    }
}
