package com.cg.jpa.demo1;

import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

public class RetrieveEmpById {

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("JPA-PU");
		EntityManager em = emf.createEntityManager();
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter Employee Id");
		int empId=scanner.nextInt();
		
		TypedQuery<Employee> query=em.createQuery("from Employee where id=:eno", Employee.class);
		query.setParameter("eno", empId);
		Employee employee=query.getSingleResult();
		System.out.println(employee);
		scanner.close();
	}

}
