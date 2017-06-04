package com.hornySage.springdemo.mvc;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/hello")
public class HelloWorldController {

	@RequestMapping("/")
	public String showPage() {
		return "main-menu";
	}
	
	@RequestMapping("/showForm")
	public String showForm() {
		return "helloworld-form";
	}

// V1
//	@RequestMapping("/processForm")
	public String shoutNameV1(HttpServletRequest req, Model model){
		String name = req.getParameter("studentName");
		name = name.toUpperCase();
		model.addAttribute("message", "Yo!! "+name+" wassup");
		return "helloworld";
	}
	
	@RequestMapping("/processForm")
	public String shoutNameV2(@RequestParam("studentName") String name, Model model){
		name = name.toUpperCase();
		model.addAttribute("message", "Yo!! "+name+" wassupp");
		return "helloworld";
	}
}
