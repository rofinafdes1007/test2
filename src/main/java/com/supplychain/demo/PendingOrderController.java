package com.supplychain.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class PendingOrderController {

	@Autowired
	ProductRepo prepo;
	
	@Autowired
	CustomerRepo crepo;
	@GetMapping("/getData")
	public  ModelAndView getData()
	{
		ModelAndView mv=new ModelAndView();
		List<Product> prodList=prepo.findAll();	
	for(Product product:prodList)
	{
		System.out.println(product);
	}
	List<Customer> custList=crepo.findAll();	
	for(Customer customer:custList)
	{
		System.out.println(customer);
	}
	mv.setViewName("data");
	mv.addObject("pl",prodList);
	mv.addObject("cl", custList);
	return mv;
	
	}
	@GetMapping("/getData2")
	public ModelAndView getData2() {
		ModelAndView mv=new ModelAndView();
	List<Product> prodList=	prepo.findAll();
	for (Product product : prodList) {
		System.out.println(product);
	}
	//proN,q,da             
	 List<Customer>  custList= crepo.findAll();
	 //custname
	 for (Customer customer : custList) {
		System.out.println(customer);
	}
	mv.setViewName("data2.jsp");
	mv.addObject("pl",prodList);
	mv.addObject("cl",custList);
		return mv;
	}
}
 