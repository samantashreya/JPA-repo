package com.cg.jpa.demo1;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class PersistanceContextDemo {

	public static void main(String[] args) {
		
		Employee employee=new Employee(1010,"Swati","Female",22,20000);
		EntityManagerFactory factory=Persistence.createEntityManagerFactory("JPA-PU");
		EntityManager em=factory.createEntityManager();
		em.getTransaction().begin();
		Employee e=em.find(Employee.class,1006);
		Employee e1=em.find(Employee.class,1007);
		System.out.println(e);
		System.out.println(e1);
		em.clear();//It removes all the objects outside the persistance object
		em.detach(e);//it will throw out or detach the object outside the persistance context
		e.setSalary(87999);
		e1.setSalary(34567);
		em.merge(e);
		em.getTransaction().commit();
		System.out.println(e);
		System.out.println(e1);
		System.out.println("Done");
		
	
	}

}
