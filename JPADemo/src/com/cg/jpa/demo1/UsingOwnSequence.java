package com.cg.jpa.demo1;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class UsingOwnSequence {

	public static void main(String[] args) {

		Employee emp = new Employee();
		emp.setName("Priya Mehta");
		emp.setAge(27);
		emp.setSalary(12000);
		emp.setGender("Female");
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("JPA-PU");
		EntityManager em = factory.createEntityManager();
		em.getTransaction().begin();
		em.persist(emp);
		em.getTransaction().commit();
		System.out.println("Done");

	}

}
