package com.mvc.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class BindingController {
	
	@RequestMapping("/displayBindData")
	public String displayForm(@RequestParam("studentName") String theName, Model model) {
		
		String result = "My name is: "+theName;
		
		model.addAttribute("message", result);
		
		return "modelDataPage";
	}
}
