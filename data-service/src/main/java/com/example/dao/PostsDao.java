package com.example.dao;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.model.Posts;

@Repository
public interface PostsDao extends JpaRepository<Posts,Integer>{

}
