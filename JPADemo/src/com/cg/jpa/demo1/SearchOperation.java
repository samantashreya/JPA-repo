package com.cg.jpa.demo1;

import java.util.Scanner;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class SearchOperation {

	public static void main(String[] args) {
		
		EntityManagerFactory factory=Persistence.createEntityManagerFactory("JPA-PU");
		EntityManager em=factory.createEntityManager();
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter Employee Id");
		int empId=scanner.nextInt();
		em.getTransaction().begin();
		Employee e=em.find(Employee.class, empId);
		System.out.println(e);
		em.getTransaction().commit();
		scanner.close();
	}

}
