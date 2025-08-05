package com.cjc.app.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.cjc.app.model.Student;

@Controller
public class StudentController {

	@RequestMapping(value = "/")
	public String landingPage()
	{
		System.out.println("Inside Landing Page");
		return "index";
	}
	
	@RequestMapping(value = "/log")
	public String handlelogReqest()
	{
		System.out.println("Inside the log request method");
		return "login";
	}
	
	@RequestMapping(value = "/reg")
	public String handleregRequest()
	{
		System.out.println("Inside the reg request method");
		return "register";
	}
	
	@RequestMapping(value = "login")
	public String handleloginRequest(@RequestParam String username, @RequestParam String password)
	{
		System.out.println("Username : "+username);
		System.out.println("Password : "+password);	
		return "index";
	}
	
	@RequestMapping(value = "/register")
	public String handleregisterRequest(@ModelAttribute Student student)
	{
		System.out.println("Inside the register request method");
		System.out.println(student);
		return "index";
	}
}
