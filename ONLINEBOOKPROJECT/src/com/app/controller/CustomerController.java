package com.app.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.app.pojos.Customer;
import com.app.service.ICustomerService;

@Controller
@RequestMapping("/customer")
public class CustomerController {
	public CustomerController() {
		super();
		System.out.println("in def constr of " + getClass().getName());
	}

	@Autowired
	ICustomerService service;
	
	@GetMapping("/login")
	public String showLoginForm() {
		System.out.println("in show login form");
		return "/customer/customerlogin";
	}
	
	@PostMapping("/login") // =@RequestMapping + method=post
	public String processLoginForm(Model map, 
			@RequestParam String userName,
			@RequestParam String password,
			HttpSession hs)
	{
		try{
		Customer c=service.validateCustomer(userName, password);
		map.addAttribute("status", "Login Successful....");
		hs.setAttribute("user_dtls", c.getUserName());
		return "/customer/successfull";
		}
	catch (RuntimeException e) {
		System.out.println("err in user controller " + e);
		
		map.addAttribute("status", "Invalid Login, Pls retry!!!!");
		return "/customer/customerlogin";
	}
}
}
