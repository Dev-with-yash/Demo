package com.example.service;

import java.util.List;

import com.example.model.Comments;

public interface CommentService {
	
	public List<Comments> showAllComments();
	public Comments addComment(Comments comment);
	public List<Comments> getAllCommentsByPid(int pid);
	public List<Comments> getAllCommentsByCid(int cid);

}