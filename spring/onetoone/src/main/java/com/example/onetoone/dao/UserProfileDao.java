package com.example.onetoone.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.onetoone.model.UserProfile;


@Repository
public interface UserProfileDao extends JpaRepository<UserProfile,Long> {
    
}