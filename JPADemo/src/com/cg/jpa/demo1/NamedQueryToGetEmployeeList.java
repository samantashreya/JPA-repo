package com.cg.jpa.demo1;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

public class NamedQueryToGetEmployeeList {

	public static void main(String[] args) {
		EntityManagerFactory factory=Persistence.createEntityManagerFactory("JPA-PU");
		EntityManager em=factory.createEntityManager();
		TypedQuery<Employee> query = em.createNamedQuery("getAllEmployees",Employee.class);
		
		TypedQuery<Employee> query1 = em.createNamedQuery("getEmployeeByGender",Employee.class);
		query1.setParameter("gen", "Male");
		
		List<Employee> employees=query.getResultList();
		for(Employee employee:employees) {
			System.out.println(employee);
		}
		System.out.println("Employee List Based on Gender Male");
		List<Employee> employees1=query1.getResultList();
		for(Employee employee1:employees1) {
			System.out.println(employee1);
		}
	}

}
