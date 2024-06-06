package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients("com.example.service")
public class DataServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(DataServiceApplication.class, args);
	}
	
    @Bean
    public RestTemplate getTemplate() {
		return new RestTemplate();
	}

}
