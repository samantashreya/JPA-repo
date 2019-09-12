package com.cg.jpa.association.onetomany;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "UserDetails")
public class User1 {
	@Id
	@GeneratedValue
	private int id;
	private String name;
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "user"/* ,fetch = FetchType.EAGER enables the eager fetching */)
	// We can change the table name and table column name as below
	//@JoinTable(name = "user_veh", joinColumns = @JoinColumn(name = "id"), inverseJoinColumns = @JoinColumn(name = "vehicleId"))
	private List<Vehicle1> vehicle=new ArrayList<Vehicle1>();

	public List<Vehicle1> getVehicle() {
		return vehicle;
	}

	public void setVehicle(List<Vehicle1> vehicle) {
		this.vehicle = vehicle;
	}

	public User1() {
		super();
		// TODO Auto-generated constructor stub
	}

	public User1(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + "]";
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
