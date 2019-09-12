package com.cg.jpa.demo1;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class InsertOperation {

	public static void main(String[] args) {

		Employee employee=new Employee(1010,"Swati","Female",22,20000);
		EntityManagerFactory factory=Persistence.createEntityManagerFactory("JPA-PU");
		EntityManager em=factory.createEntityManager();
		em.getTransaction().begin();
		em.persist(employee);
		em.getTransaction().commit();
		System.out.println("Data Saved...");
	}

}
