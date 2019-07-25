package com.app.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import com.app.pojos.Customer;
import com.app.service.ICustomerService;

@Controller
@RequestMapping("/register")
public class RegisterController {
	
@Autowired
public ICustomerService service;

public RegisterController() {
		super();
		System.out.println("in constr of " + getClass().getName());
	}
@GetMapping("/register")
public String registerCustomer(Customer customer) {
		System.out.println("show the customer form");
	
		return "/customer/register";
	}

@PostMapping("/register")
public String registerCustomerPost(Customer customer, Model map)
{	
	customer.setEnabled(true);
	System.out.println(customer);
	service.addCustomer(customer);
	System.out.println(customer);
	map.addAttribute("usernameMsg", "RegisterSucessfully");
	return "/user/login"; //should lead to back to log in
}
}
