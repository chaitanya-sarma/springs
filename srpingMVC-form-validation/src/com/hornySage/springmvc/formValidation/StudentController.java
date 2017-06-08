package com.hornySage.springmvc.formValidation;

import javax.validation.Valid;

import org.springframework.beans.propertyeditors.StringTrimmerEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class StudentController {

	//Things that run before the web-request is processed
	@InitBinder
	public void initBinder(WebDataBinder binder){
		StringTrimmerEditor editor = new StringTrimmerEditor(true);
		binder.registerCustomEditor(String.class, editor);
	}
	
	@RequestMapping("/")
	public String showPage() {
		return "main-menu";
	}
	
	@RequestMapping("/showForm")
	public String showForm(Model theModel) {
		theModel.addAttribute("student", new  Student());
		return "student-form";
	}

	@RequestMapping("/processForm")
	public String shoutNameV1(@Valid @ModelAttribute("student") Student theStudent,BindingResult theBindingResult){
		if(theBindingResult.hasErrors())
			return "student-form";
		else
			return "student-welcome";
	}
	
}
