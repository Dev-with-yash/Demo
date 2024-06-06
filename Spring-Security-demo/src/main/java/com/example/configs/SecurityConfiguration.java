package com.example.configs;

import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;


@EnableWebSecurity
public class SecurityConfiguration {
     public void configure(HttpSecurity http) throws Exception {
    	 http.authorizeRequests()
    	 .requestMatchers("/info").permitAll()
    	 .requestMatchers("/balance").authenticated().and().formLogin();
    	 
     }
}
