package com.mvc.form;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ModelController {

	@RequestMapping("/")
	public String showForm(Model theModel) {
		
	    // Adding Model attribute (attribute name and value)
		// Populate the form page using getter     
		
		     theModel.addAttribute("student", new Student());
		     return "formPage";
	}
	
	     // Add modelAttribute which bind data on form page
	     // Help to get data on display page 
	
// Step-3: Perform validation in controller
	
	@RequestMapping("/processForm")
	public String processForm(@Valid @ModelAttribute("student") Student theStudent,
			                  BindingResult bindingResult) {
		
		System.out.println("Result"+bindingResult);
		if(bindingResult.hasErrors())	
		    return "formPage";
		else    		    		
			return "displayPage";
	}
	
//	@RequestMapping("/processForm")
//	public String processForm(@ModelAttribute("student") Student theStudent) {
//			
//		return "displayPage";
//	}
	
	
}