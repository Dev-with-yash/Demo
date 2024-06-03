package com.example.onetomany.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.onetomany.model.Author;

@Repository
public interface AuthorDao extends JpaRepository<Author, Integer> {
	
}
