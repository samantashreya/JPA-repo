package com.cg.jpa.demo1;

import java.util.List;
import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

public class JPAQueryUsingScanner {

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("JPA-PU");
		EntityManager em = emf.createEntityManager();
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter Gender");
		String gender=scanner.nextLine();
		TypedQuery<Employee> query=em.createQuery("select emp from Employee emp where emp.gender=:gen", Employee.class);
		//TypedQuery<Employee> query=em.createQuery("from Employee where gender=:gen", Employee.class);/*:gen is named parameter & ? is positional parameter*/
	//	TypedQuery<Employee> query = em.createQuery("select emp from Employee emp", Employee.class);//We can write like this also and like as written below
		/*TypedQuery<Employee> query = em.createQuery("from Employee", Employee.class);*/// Used when we know that data
																						// coming out from query is
		query.setParameter("gen", gender);																			// known
		List<Employee> employees = query.getResultList();
		for (Employee employee : employees) {
			System.out.println(employee);
		}
		scanner.close();
	}

}
