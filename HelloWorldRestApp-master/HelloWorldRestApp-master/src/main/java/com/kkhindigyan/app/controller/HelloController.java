package com.kkhindigyan.app.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
	
	@RequestMapping(path = "/",method = RequestMethod.GET)
	public String welcome() {
		return "<h3>Welcome to Restful Web Service</h3>";
	}
}
