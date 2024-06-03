package com.example.onetoone;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.onetoone.dao.UserDao;
import com.example.onetoone.dao.UserProfileDao;

import com.example.onetoone.model.UserEntity;
import com.example.onetoone.model.UserProfile;

@SpringBootApplication
public class OnetooneApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(OnetooneApplication.class, args);
	}
	
	@Autowired
    UserDao userdao;
	
	@Autowired
	UserProfileDao userProfileDao;
	
	public void run(String... args) throws Exception {
		UserProfile userProfile = new UserProfile();
		userProfile.setAddress("10-120, vishakapatnam");
		
		UserEntity user = new UserEntity();
		user.setName("yaswanth dao");
		user.setUserProfile(userProfile);
		userProfile.setUser(user);
		
		userdao.save(user);
		userProfileDao.save(userProfile);
		System.out.println("one to one mapping..");
		
	}

}
