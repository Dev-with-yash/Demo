package com.example.service;

import java.util.List;

import com.example.model.CommentsDto;
import com.example.model.Posts;

public interface PostsService {
   public List<Posts> getAllPosts();
   public Posts addPosts(Posts post);
   public List<CommentsDto> getAllComments(int pid);
   public String getCommentsPort();
}
