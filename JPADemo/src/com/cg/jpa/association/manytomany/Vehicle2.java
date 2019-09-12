package com.cg.jpa.association.manytomany;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Vehicle2 {

	@Id
	@GeneratedValue
	private int vehicleId;
	private String vehicleName;
	@ManyToMany
	private List<User2> user=new ArrayList<User2>();
	
	
	
	public List<User2> getUser() {
		return user;
	}
	public void setUser(List<User2> user) {
		this.user = user;
	}
	public Vehicle2() {
		super();
		
	}
	@Override
	public String toString() {
		return "Vehicle [vehicleId=" + vehicleId + ", vehicleName=" + vehicleName + "]";
	}
	public int getVehicleId() {
		return vehicleId;
	}
	public void setVehicleId(int vehicleId) {
		this.vehicleId = vehicleId;
	}
	public String getVehicleName() {
		return vehicleName;
	}
	public void setVehicleName(String vehicleName) {
		this.vehicleName = vehicleName;
	}
	public Vehicle2(int vehicleId, String vehicleName) {
		super();
		this.vehicleId = vehicleId;
		this.vehicleName = vehicleName;
	}
	
	
}
