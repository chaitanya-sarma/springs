package com.hornySage.springdemo.mvc;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

	@RequestMapping("/")
	public String showPage() {
		return "main-menu";
	}
	
	@RequestMapping("/showForm")
	public String showForm() {
		return "helloworld-form";
	}

	@RequestMapping("/processForm")
	public String shoutName(HttpServletRequest req, Model model){
		String name = req.getParameter("studentName");
		name = name.toUpperCase();
		model.addAttribute("message", "Yo!! "+name+" wassup");
		return "helloworld";
	}
}
