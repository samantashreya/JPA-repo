package com.cg.jpa.association.manytomany;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name = "UserDetails")
public class User2 {
	@Id
	@GeneratedValue
	private int id;
	private String name;
	@ManyToMany(cascade = CascadeType.ALL,mappedBy = "user")
	private List<Vehicle2> vehicle=new ArrayList<Vehicle2>();

	public List<Vehicle2> getVehicle() {
		return vehicle;
	}

	public void setVehicle(List<Vehicle2> vehicle) {
		this.vehicle = vehicle;
	}

	public User2() {
		super();
		// TODO Auto-generated constructor stub
	}

	public User2(int id, String name) {
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
