package com.cg.jpa.association.onetomany;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class OneToManyAssociationUserVehicle {

	public static void main(String[] args) {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("JPA-PU");
		EntityManager em = factory.createEntityManager();
		User1 user = new User1();
		user.setName("Harshit");
		Vehicle1 vehicle = new Vehicle1();
		vehicle.setVehicleName("Car");
		Vehicle1 vehicle2 = new Vehicle1();
		vehicle2.setVehicleName("Lamborginni");
		vehicle.setUser(user);
		vehicle2.setUser(user);
		user.getVehicle().add(vehicle);
		user.getVehicle().add(vehicle2);
		vehicle.setUser(user);
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
