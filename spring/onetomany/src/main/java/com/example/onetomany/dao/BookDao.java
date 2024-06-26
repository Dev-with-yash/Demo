package com.example.onetomany.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.onetomany.model.Book;


@Repository
public interface BookDao extends JpaRepository<Book, Integer> {

}
