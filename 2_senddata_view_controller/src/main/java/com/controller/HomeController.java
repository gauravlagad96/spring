package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.entities.User;

import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;

@Controller
public class HomeController {

	@RequestMapping("/")
	public String home() {
		return "home";
	}

	@RequestMapping("register")
	public String register() {
		return "register";
	}

//	1. Accepting data from view Using servlet
//	@RequestMapping("process")
//	public String process(HttpServletRequest httpServletRequest) {
//		String name = httpServletRequest.getParameter("name");
//		String email = httpServletRequest.getParameter("email");
//		String password = httpServletRequest.getParameter("password");
//
//		System.out.println(name + " " + email + " " + password);
//		return "process";
//	} 

//	2. Accepting data from view Using @RequestParam and send to view Using Model
//	@RequestMapping(path="process",method = RequestMethod.POST)
//	public String process(@RequestParam("name") String name, @RequestParam("email") String email,
//			@RequestParam("password") String password, Model model) {
//
//		model.addAttribute("name", name);
//		model.addAttribute("email", email);
//		model.addAttribute("password", password);
//		System.out.println(name + " " + email + " " + password);
//		return "result";
//	}

//	3. Accepting data from view Using @RequestParam and send to entities
//	@RequestMapping(path = "process", method = RequestMethod.POST)
//	public String process(@RequestParam("name") String name, @RequestParam("email") String email,
//			@RequestParam("password") String password, Model model) {
//		User user = new User();
//		user.setName(name);
//		user.setEmail(email);
//		user.setPassword(password);
//		
//		model.addAttribute("user", user);
//     	System.out.println(name + " " + email + " " + password);
//		return "result";
//	}

	
//	3. Accepting data from view Using @ModelAttribute 
	@RequestMapping(path = "process", method = RequestMethod.POST)
	public String process(@ModelAttribute User user, Model model) {

//		System.err.println(user);
		
		return "result";
	}

}
