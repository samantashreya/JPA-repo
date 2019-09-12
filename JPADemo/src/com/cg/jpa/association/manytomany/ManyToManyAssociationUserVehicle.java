package com.cg.jpa.association.manytomany;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class ManyToManyAssociationUserVehicle {

	public static void main(String[] args) {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("JPA-PU");
		EntityManager em = factory.createEntityManager();
		User2 user = new User2();
		user.setName("Harshit");
		Vehicle2 vehicle = new Vehicle2();
		vehicle.setVehicleName("Car");
		Vehicle2 vehicle2 = new Vehicle2();
		vehicle2.setVehicleName("Lamborginni");
		vehicle.getUser().add(user);
		vehicle2.getUser().add(user);
		user.getVehicle().add(vehicle);
		user.getVehicle().add(vehicle2);
		
		em.getTransaction().begin();

		// em.persist(vehicle);
		em.persist(user);

		em.getTransaction().commit();

		/*
		 * User user1=em.find(User.class, 1); System.out.println(user.getId()+ " " +
		 * user.getName()); //em.close(); because of this exception of lazy association
		 * fetching will occur for(Vehicle v: user.getVehicle()) {
		 * System.out.println(v); }
		 */
	}

}
