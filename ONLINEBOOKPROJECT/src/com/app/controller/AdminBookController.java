package com.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.app.service.IBookService;

@Controller
@RequestMapping("/admin")
public class AdminBookController {

	@Autowired
	private IBookService bookService; 
	@GetMapping("/delete")
	public String deleteVendor(@RequestParam int bookId,
			RedirectAttributes flashMap) {
		System.out.println("in delete vendor "+bookId+" "+flashMap);
		flashMap.addFlashAttribute("status",bookService.deleteBook(bookId));
			return "redirect:/admin/booklist"; //redirect view name
	}
	
}
