package com.tnsif.restapi;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RestControllerExample {
	@RequestMapping("/hello")
     public String show() {
    	return "Welcome";
     }
	@GetMapping("/hello")
	public String greetings(@RequestParam String name)
	{
		return "Welcome"+name; 
	}
}
