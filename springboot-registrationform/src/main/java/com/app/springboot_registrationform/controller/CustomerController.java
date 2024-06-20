package com.app.springboot_registrationform.controller;

import com.app.springboot_registrationform.entity.Customer;
import com.app.springboot_registrationform.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import java.util.List;

@Controller
public class CustomerController {
    @Autowired
    private CustomerService service;
    @GetMapping("/home")
    public String home() {
        return "home";
    }

    @GetMapping("/register")
    public String register(Model model) {
        Customer customer = new Customer();
        model.addAttribute(customer);
        return "register";
    }

    @GetMapping("/customers")
    public String getCustomers(Model model) {
        List<Customer> customers = service.findAllCustomers();
        model.addAttribute("customers", customers);
        return "customers";
    }

    @PostMapping("/registerCustomer")
    public String registerCustomer(@ModelAttribute("customer") Customer customer) {
        System.out.println(customer);
        service.registerCustomer(customer);
        return "Success";
    }
}
