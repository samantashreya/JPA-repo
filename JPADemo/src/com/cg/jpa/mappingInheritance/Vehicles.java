package com.cg.jpa.mappingInheritance;

import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorType;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;

@Entity
/* @Inheritance(strategy = InheritanceType.SINGLE_TABLE) This will create single table for all the classes*/
/*@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS) This will create a table per class*/
@Inheritance(strategy = InheritanceType.JOINED)/*Gives common information we can join the tables*/
@DiscriminatorColumn(name = "VehicleType",discriminatorType = DiscriminatorType.STRING)
@DiscriminatorValue("GV")
public class Vehicles {

	@Id
	@GeneratedValue
	private int vehicleId;
	private String vehicleName;
	private String licenseNumber;

	public Vehicles() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Vehicles(int vehicleId, String vehicleName, String licenseNumber) {
		super();
		this.vehicleId = vehicleId;
		this.vehicleName = vehicleName;
		this.licenseNumber = licenseNumber;
	}

	@Override
	public String toString() {
		return "Vehicles [vehicleId=" + vehicleId + ", vehicleName=" + vehicleName + ", licenseNumber=" + licenseNumber
				+ "]";
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

	public String getLicenseNumber() {
		return licenseNumber;
	}

	public void setLicenseNumber(String licenseNumber) {
		this.licenseNumber = licenseNumber;
	}

}
