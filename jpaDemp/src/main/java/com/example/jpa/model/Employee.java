package com.example.jpa.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
@Entity
@Table(name = "employee")

public class Employee {
	
  int empid;
  
  String name;
  
  String desg;

public Employee(int empid, String name, String desg) {
	super();
	this.empid = empid;
	this.name = name;
	this.desg = desg;
}

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

public String getDesg() {
	return desg;
}

public void setDesg(String desg) {
	this.desg = desg;
}

public Employee() {
	super();
}
  
  
  
}
