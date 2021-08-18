package com.mvc.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

// Step-1: Define a controller class using annotation 
    
    @Controller
    public class DemoController {
    	
// Step-2: Define a controller method and add mapping 
// Step-3: Return view name 
    	
	@RequestMapping("/")
	public String showPage() {
		return "menuPage";
	}
}

    