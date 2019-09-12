package com.cg.jpa.demo1;

import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class UpdateEmpById {

	public static void main(String[] args) {

		EntityManagerFactory factory=Persistence.createEntityManagerFactory("JPA-PU");
		EntityManager em=factory.createEntityManager();
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter Employee Id");
		int empId=scanner.nextInt();
		System.out.println("Enter Employee Age");
		int age=scanner.nextInt();
		System.out.println("Enter Employee Salary");
		double salary=scanner.nextDouble();
		//We can write the below statement in two ways as below
		Query query=em.createQuery("update Employee set age=:age, salary=:sal where id=:eid");
	//	Query query=em.createQuery("update Employee set age=?, salary=? where id=?");//Here the Employee is the bean class name
		/*
		 * query.setParameter(1, age); query.setParameter(2, salary);
		 * query.setParameter(3, empId);
		 */
		query.setParameter("age", age);
		query.setParameter("sal", salary);
		query.setParameter("eid", empId);
		em.getTransaction().begin();
		int result=query.executeUpdate();//Tells the number of rows updated
		em.getTransaction().commit();
		System.out.println(result + " row(s) Updated");
		scanner.close();
		
	}

}
