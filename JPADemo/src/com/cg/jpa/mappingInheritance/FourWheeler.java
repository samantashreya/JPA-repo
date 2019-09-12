package com.cg.jpa.mappingInheritance;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("FW")
public class FourWheeler extends Vehicles {

	private String steeringwheel;

	public String getSteeringwheel() {
		return steeringwheel;
	}

	public void setSteeringwheel(String steeringwheel) {
		this.steeringwheel = steeringwheel;
	}
	
	
}
