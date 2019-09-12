package com.cg.jpa.demo1;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

public class JPAQueryDemo {

	public static void main(String[] args) {

		EntityManagerFactory emf = Persistence.createEntityManagerFactory("JPA-PU");
		EntityManager em = emf.createEntityManager();
		TypedQuery<Employee> query = em.createQuery("from Employee", Employee.class);// Used when we know that data
																						// coming out from query is
																						// known
		List<Employee> employees = query.getResultList();
		for (Employee employee : employees) {
			System.out.println(employee);
		}
	}

}
