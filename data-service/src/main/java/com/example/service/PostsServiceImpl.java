package com.example.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.example.dao.PostsDao;
import com.example.model.CommentsDto;
import com.example.model.Posts;

@Service
public class PostsServiceImpl implements PostsService{

	
	@Autowired
	FeignProxy proxy;
	
	
	@Autowired
	RestTemplate restTemplate;
	
	private PostsDao dao;
	
	
	public PostsServiceImpl(PostsDao dao) {
		super();
		this.dao = dao;
		
	}

	public List<Posts> getAllPosts() {
		return dao.findAll() ;
	}

	@Override
	public Posts addPosts(Posts post) {
		return dao.save(post);
	}

	public String getCommentsPort() {
		return proxy.getPort();
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<CommentsDto> getAllComments(int pid) {
		List<CommentsDto> data = restTemplate.getForObject("http://COMMENT-SERVICE/comments/postid"+pid, List.class);
		return data;
	}

}
