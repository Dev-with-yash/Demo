package com.example.demo.controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {
	  @GetMapping("/get")
	  public void getMapping() {
		  System.out.println("get mapping ...");
	  }
	  
	  @PostMapping("/post")
	  public void postMapping() {
		  System.out.println("post mapping ...");
	  }
	  @PutMapping("/put")
	  public void putMapping() {
		  System.out.println("put mapping ...");
	  }
	  @DeleteMapping("/delete")
	  public void deleteMapping() {
		  System.out.println("delete mapping ...");
	  }
	  
}
