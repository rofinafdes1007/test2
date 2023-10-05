package com.supplychain.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;

import jakarta.servlet.http.HttpServletRequest;
@Controller
public class ProductController {

	
	@Autowired
	ProductRepo prepo;
	

	@PostMapping("/placeOrder")
	public String placeOrder(HttpServletRequest req)
	{
		Product prod=new Product();
		prod.setProdName(req.getParameter("prodName"));
		prod.setDeliveryAddress(req.getParameter("deliveryAddress"));
		prod.setQuantity(Integer.parseInt(req.getParameter("Quantity")));
		prepo.save(prod);
		return "success";
	}
}
