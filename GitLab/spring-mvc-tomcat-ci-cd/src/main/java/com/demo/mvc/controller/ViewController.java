package com.demo.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class ViewController {

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String indexController(Model model) {
		
		model.addAttribute("message", "Hello Worlde ---> This changes for testing ci/cd");
		return "index";
	}
}
