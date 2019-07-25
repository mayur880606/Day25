package com.app.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.app.pojos.Users;
import com.app.service.IUserService;

@Controller
@RequestMapping("/user")
public class UserController {
	// dependency
	@Autowired
	private IUserService service;

	public UserController() {
		System.out.println("in def constr of " + getClass().getName());
	}

	// req handling method to show login form
	@GetMapping("/login")
	public String showLoginForm() {
		System.out.println("in show login form");
		return "/user/login";
	}

	// req handling method to process login form
	@PostMapping("/login") // =@RequestMapping + method=post
	public String processLoginForm(Model map, 
			@RequestParam String username,
			@RequestParam String password,
			HttpSession hs) {
		System.out.println("in process login form");
		try {
		
			Users u = service.validateUser(username, password);
			//Customer c=service.validateCustomer(username,password);
			map.addAttribute("status", "Login Successful....");
			if (u.getRole().equals("admin")) // admin login
			{
				hs.setAttribute("user_dtls", u.getUsername());
					return "/admin/adminwork";//replace by redirect
			}
		
			hs.setAttribute("user_dtls", u.getUsername());
			
			return "/customer/successfull";
		} catch (RuntimeException e) {
			System.out.println("err in user controller " + e);
			
			map.addAttribute("status", "Invalid Login , Pls retry!!!!");
			return "/user/login";
		}
		
		
	}
	@GetMapping("/contact")
	public String contactus() {
	System.out.println("in show contact form");
	return "/company/aboutus";
	
	}
}
