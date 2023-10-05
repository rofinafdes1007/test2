package com.supplychain.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

import jakarta.servlet.http.HttpServletRequest;


@Controller
public class CustomerController {
	
	@Autowired
	private CustomerRepo Crepo;
	/*
	 * @PostMapping("/registerCustomer")
	 * 
	 * @ResponseBody public Customer registerCustomer(@RequestBody Customer
	 * customer) { Crepo.save(customer); System.out.println("customer added");
	 * return customer; }
	 */
	
	@PostMapping("/registerCustomer")
	public String registerCustomer(HttpServletRequest req)
	{
		Customer customer=new Customer();
		customer.setOrganizationName(req.getParameter("organizationName"));
		customer.setContactPerson(req.getParameter("contactPerson"));
		customer.setContactNum(req.getParameter("contactNum"));
		customer.setEmail(req.getParameter("email"));
		Crepo.save(customer);
		return "success";
	}
}
