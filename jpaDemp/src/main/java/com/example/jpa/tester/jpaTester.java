package com.example.jpa.tester;

import com.example.jpa.model.Employee;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

public class jpaTester {

	public static void main(String[] args) {
	   String PERSISTANCE_UNIT_TIME = "PERSISTENCE";
	   EntityManagerFactory factory = Persistence.createEntityManagerFactory(PERSISTANCE_UNIT_TIME);
       EntityManager manager = factory.createEntityManager();
       EntityTransaction txn=manager.getTransaction();
       txn.begin();
       Employee emp = new Employee(101, "yaswanth", "manager");
       manager.persist(emp);
       txn.commit();
	   manager.close();
	   factory.close();
       
	}

}
