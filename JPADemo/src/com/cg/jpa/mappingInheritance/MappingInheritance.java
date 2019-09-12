package com.cg.jpa.mappingInheritance;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class MappingInheritance {

	public static void main(String[] args) {
		
		EntityManagerFactory factory=Persistence.createEntityManagerFactory("JPA-PU");
		EntityManager em=factory.createEntityManager();
		Vehicles vehicle=new Vehicles();
		vehicle.setVehicleName("Car");
		vehicle.setLicenseNumber("KA 01 2345");
		
		TwoWheeler tw=new TwoWheeler();
		tw.setVehicleName("R15");
		tw.setLicenseNumber("UP-50-0786");
		tw.setSteeringHandle("Bike Steering Handle");
		
		FourWheeler fw=new FourWheeler();
		fw.setVehicleName("Lamborgini");
		fw.setLicenseNumber("UP-50-0001");
		fw.setSteeringwheel("Lambo Steering Wheel");
		
		em.getTransaction().begin();
		em.persist(vehicle);
		em.persist(tw);
		em.persist(fw);
		em.getTransaction().commit();
		System.out.println("Done");
	}

}
