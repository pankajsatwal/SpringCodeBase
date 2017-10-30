package com.sat.SpringTDDAngularJS4.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
	
//	@RequestMapping(value="/hello",method=RequestMethod.GET)
	@GetMapping("/hello")
	public String sayHello() {
		return "Hi Pankaj! Welcome to Spring Boot App!!";
	}
	

}
