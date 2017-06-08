package com.hornySage.springmvc.form;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class StudentController {

	@RequestMapping("/")
	public String showPage() {
		return "main-menu";
	}
	
	@RequestMapping("/showForm")
	public String showForm(Model theModel) {
		Student s = new  Student();
		theModel.addAttribute("student", s);
		return "student-form";
	}

	@RequestMapping("/processForm")
	public String shoutNameV1(@ModelAttribute("student") Student theStudent, Model model){
		model.addAttribute("message", "Yo!! "+theStudent.getFirstName()+"  "+theStudent.getLastName()+" registration successful. Welcome!!");
		return "student-welcome";
	}
	
}
