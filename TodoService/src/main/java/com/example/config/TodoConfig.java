package com.example.config;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

@Configuration
public class TodoConfig {
   @Bean
   public JdbcTemplate getTemplate() {
	   JdbcTemplate jdbcTemplate = new JdbcTemplate();
	   jdbcTemplate.setDataSource(createDataSource());
	   return jdbcTemplate;
   }
   @Bean
   public DataSource createDataSource() {
	   DriverManagerDataSource dataSource = new DriverManagerDataSource();
	   dataSource.setDriverClassName("oracle.jdbc.driver.OracleDriver");
	   dataSource.setUrl("jdbc:oracle:thin:@localhost:1521:xe");
	   dataSource.setUsername("system");
	   dataSource.setPassword("123456");
	   return dataSource;
	   
   }
}
