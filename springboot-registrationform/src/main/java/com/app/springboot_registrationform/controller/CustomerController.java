package com.app.springboot_registrationform.controller;

import com.app.entity.Customer;
import com.app.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class CustomerController {
    @GetMapping("/register")
    public String register(Model model) {
        Customer customer = new Customer();
        model.addAttribute(customer);
        return "register";
    }
    @PostMapping("/registerCustomer")
    public String registerCustomer(@ModelAttribute("customer") Customer customer) {
        System.out.println(customer);
        return "Success";
    }
}
