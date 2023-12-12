package com.springboot.first.app;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@Controller
@ResponseBody
@RestController
public class HelloWorldController {
	
   //GET HTTP Method		
	@GetMapping("/hello-worlds")
	public String helloWorld() {
		return "Hello World!";
	}
	
	//GET HTTP Method		
		@GetMapping("/hello-world-app")
		public String helloWorldApp() {
			return "Hello World app!";
		}
}
