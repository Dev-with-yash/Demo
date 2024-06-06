
package com.example.dao;

import java.util.List;


import org.springframework.data.jpa.repository.JpaRepository;

import com.example.model.Comments;

public interface CommentDao extends JpaRepository<Comments,Integer>{
	
	public List<Comments> findByPid(int pid);
	public List<Comments> findByCid(int cid);

}

