package com.example.demo.controller;

import org.springframework.stereotype.Component;

@Component
public class Employee {
	int empid;
	String name;
	int salary;
	String desg;
	public int getEmpid() {
		return empid;
	}
	public void setEmpid(int empid) {
		this.empid = empid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public String getDesg() {
		return desg;
	}
	public void setDesg(String desg) {
		this.desg = desg;
	}
	public Employee(int empid, String name, int salary, String desg) {
		super();
		this.empid = empid;
		this.name = name;
		this.salary = salary;
		this.desg = desg;
	}
	
	public Employee() {
		this.empid = 101;
		this.name = "yaswanth";
		this.salary = 20000;
		this.desg = "developer";
	}
	@Override
	public String toString() {
		return "Employee [empid=" + empid + ", name=" + name + ", salary=" + salary + ", desg=" + desg + "]";
	}
	
	
     
}
