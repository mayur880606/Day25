package com.app.controller;

import java.util.List;
import com.app.pojos.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.app.service.IBookService;
import com.app.service.ICustomerService;

@Controller
@RequestMapping("/admin")
public class AdminHome {

	@Autowired
	private ICustomerService customerService;
	
	@Autowired
	private IBookService bookService;
	
	@RequestMapping
	public  String adminPage() {
		return "/adminwork";
	}
	
	@RequestMapping("/booklist") 
	public String bookInventory(Model model) {
		
		List<Book> books = bookService.getBookList();
		model.addAttribute("books", books);
		
		return "admin/booklist";
	}
	
	@RequestMapping("/customer")
	public String customerManagement(Model model) {
		
		List<Customer> customerList = customerService.getAllCustomers();
		model.addAttribute("customerList", customerList);
		
		return "admin/customerlist";
	}
	@GetMapping("/deletecustomer")
	public String deleteVendor(@RequestParam int customerId,
			RedirectAttributes flashMap) {
		System.out.println("in delete vendor "+customerId+" "+flashMap);
		flashMap.addFlashAttribute("status",customerService.deleteCustomer(customerId));
			return "redirect:/admin/customer"; //redirect view name
	}
}














