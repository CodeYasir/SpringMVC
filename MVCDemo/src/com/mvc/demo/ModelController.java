package com.mvc.demo;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ModelController {
	
	@RequestMapping("/displayModelData")
	public String displayForm(HttpServletRequest request, Model model) {
		String name = request.getParameter("name");
		
		String result = "My name is: "+name;
		
		model.addAttribute("message", result);
		
		return "modelDataPage";
	}
}
