
package com.example.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.dao.CommentDao;
import com.example.model.Comments;


@Service	
public class CommentServiceImpl implements CommentService{
	
	@Autowired
	CommentDao dao;

	@Override
	public List<Comments> showAllComments() {
		// TODO Auto-generated method stub
		return dao.findAll();
	}

	@Override
	public Comments addComment(Comments comment) {
		// TODO Auto-generated method stub
		return dao.save(comment);
	}

	@Override
	public List<Comments> getAllCommentsByPid(int pid) {
		// TODO Auto-generated method stub
		return dao.findByPid(pid);
	}

	@Override
	public List<Comments> getAllCommentsByCid(int cid) {
		// TODO Auto-generated method stub
		return dao.findByCid(cid);
	}
}
