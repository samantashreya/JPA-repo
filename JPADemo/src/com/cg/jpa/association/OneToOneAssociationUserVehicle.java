package com.cg.jpa.association;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class OneToOneAssociationUserVehicle {
	
	public static void main(String[] args) {
		EntityManagerFactory factory=Persistence.createEntityManagerFactory("JPA-PU");
		EntityManager em=factory.createEntityManager();
		User user=new User();
		user.setName("Harshit");
		Vehicle vehicle=new Vehicle();
		vehicle.setVehicleName("Car");
		user.setVehicle(vehicle);
		vehicle.setUser(user);
		em.getTransaction().begin();
		
		//em.persist(vehicle);
		em.persist(user);
		
		em.getTransaction().commit();
	}

}
