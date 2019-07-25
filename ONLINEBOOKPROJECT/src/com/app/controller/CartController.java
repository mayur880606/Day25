package com.app.controller;


import com.app.service.*;
import com.app.pojos.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/customer/cart")
public class CartController {
	
	@Autowired
	private ICustomerService customerService;
	
	@RequestMapping
	public String getCart(Users activeUser) {
		
		Customer customer = customerService.getCustomerByUsername(activeUser.getUsername());
		int cartId = customer.getCart().getCartId();
		
		return "redirect:/customer/cart/"+cartId;
	}
	
	@RequestMapping("/{cartId}")
	public String geCartRedirect(@PathVariable(value="cartId") int cartId, Model model) {
		
		model.addAttribute("cartId", cartId);
		
		return "cart";
	}
}







