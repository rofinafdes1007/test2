package com.supplychain.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import jakarta.servlet.http.HttpServletRequest;

public class AdminController {
@Autowired
private AdminRepo repo;

@GetMapping("/validateAdmin")
public void validate(HttpServletRequest req)
{
	String page=null;
	String username=req.getParameter("uname");
	String password=req.getParameter("pwd");
	
	List<Admin> list=repo.findAll();
	for(Admin admin:list)
	{
		System.out.println(admin);
	
	if((admin.getUserName()).equals(username)&&(admin.getPassword()).equals(password))
	{
		page="success";
	}
	else
	{
		page="fail";
	}
}

}
}
