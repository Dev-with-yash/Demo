package com.example.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;




@RestController 
@RequestMapping("/api")
public class SecurityController {
	@GetMapping("/info")
	public String getInfo() {
		return "this is the information on the site";
	}
	@GetMapping("/display")
	public String getDisplay() {
		return "display the info";
	}
	
	@GetMapping("/balance")
	public String getBalance() {
		return "display the balance";
	}
	
}
