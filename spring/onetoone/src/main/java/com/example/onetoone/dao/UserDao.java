package com.example.onetoone.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


import com.example.onetoone.model.UserEntity;

@Repository
public interface UserDao extends JpaRepository<UserEntity,Long> {

}
