package com.example.demo;


import org.apache.catalina.core.ApplicationContext;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.controller.Employee;



@SpringBootApplication
public class SpringBootDemoApplication {

	public static void main(String[] args) {
		ApplicationContext context =  (ApplicationContext) SpringApplication.run(SpringBootDemoApplication.class, args);
		Employee e = (Employee)((BeanFactory) context).getBean(Employee.class);
		System.out.println(e);
		e.getName();
	}

}
