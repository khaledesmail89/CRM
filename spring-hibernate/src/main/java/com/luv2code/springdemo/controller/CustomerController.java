package com.luv2code.springdemo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(name = "/customer")
public class CustomerController {

	@RequestMapping(name = "/allCustomers")
	public String listCustomers(Model model) {

		return "index";
	}
}
