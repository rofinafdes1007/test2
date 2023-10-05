package com.supplychain.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import jakarta.servlet.http.HttpServletRequest;

@Controller
public class DealerController {
	@Autowired
	private DealerRepo drepo;
	
	@PostMapping("/registerDealer")
	public String registerDealer(HttpServletRequest req)
	{
		Dealer dealer=new Dealer();
		dealer.setOrganizationName(req.getParameter("organizationName"));
		dealer.setContactPerson(req.getParameter("contactPerson"));
		dealer.setContactNum(req.getParameter("contactNum"));
		dealer.setEmail(req.getParameter("email"));
		dealer.setWarehouseAdd(req.getParameter("warehouseAdd"));
		dealer.setRegisteredAdd(req.getParameter("registeredAdd"));
		drepo.save(dealer);
		System.out.println("dealer data added successfully");
		return "success";
		
	}
}

