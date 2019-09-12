package com.cg.jpa.demo1;

import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class DeleteEmpBySalary {

	public static void main(String[] args) {
	
		EntityManagerFactory factory=Persistence.createEntityManagerFactory("JPA-PU");
		EntityManager em=factory.createEntityManager();
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter Employee Salary");
		double salary=scanner.nextDouble();
	
		Query query=em.createQuery("delete from Employee where salary>:sal");

	
		query.setParameter("sal", salary);
		
		em.getTransaction().begin();
		int result=query.executeUpdate();//Tells the number of rows updated
		em.getTransaction().commit();
		System.out.println(result + " row(s) Deleted");
		scanner.close();

	}

}
