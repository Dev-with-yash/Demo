package com.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.model.CommentsDto;
import com.example.model.Posts;
import com.example.service.PostsService;

@RestController
@RequestMapping("/posts")
public class PostController {
	
    @Autowired
    PostsService service;
    
	@GetMapping("/commnetsPort")
	public String getPorts() {
		return service.getCommentsPort();
	}
    @GetMapping
    public List<Posts> getAllPosts(){
    	return service.getAllPosts();
    }
    
    @PostMapping
    public Posts addPosts(@RequestBody Posts post) {
    	return service.addPosts(post);
    }
    
    @GetMapping("/getComments/{pid}")
    public List<CommentsDto> getCommentsForPid(@PathVariable int pid){
    	return service.getAllComments(pid);
    }	
}
