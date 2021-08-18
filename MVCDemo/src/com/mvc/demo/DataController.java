package com.mvc.demo;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class DataController {
	
	@RequestMapping("/displayData")
	public String displayForm(HttpServletRequest request) {
		return "dataPage";
	}
}
