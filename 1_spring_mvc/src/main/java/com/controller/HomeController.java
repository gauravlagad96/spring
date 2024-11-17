package com.controller;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {

	@RequestMapping("/")
	public String index(Model m) {
		m.addAttribute("name", "Gaurav"); // set key value pair
		m.addAttribute("rollNo", 4334);

		// setting multiple objects
		List<String> list = new ArrayList<String>();
		list.add("garuav");
		list.add("vaibhav");
		list.add("shubham");
		m.addAttribute("nameList", list);

		return "index";
	}

	// send data controller to view Using ModelAndView .
	@RequestMapping("login")
	public ModelAndView home() {
		ModelAndView model = new ModelAndView();
		model.addObject("class1", "12th");
		model.addObject("course", "Mca");
		model.setViewName("login"); // set the view mapping name and return ModelAndView object

		List<String> list = new LinkedList<>();
		list.add("Mango");
		list.add("Orange");
		list.add("Apple");
		model.addObject("fruitsName", list);

		return model;
	}

	@RequestMapping("register")
	public String registerPage() {
		return "register";
	}

}
