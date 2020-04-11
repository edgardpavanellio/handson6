package com.rm334439.UserRegistryModify.domain;

public enum Vehicle {
	
	BIKE(0),
	MOTO(1),
	SCOOTER(2);
	
	private int id;

	Vehicle(int id) {
		// TODO Auto-generated constructor stub
		this.id=id;
	}
	
	public Integer getVehicle_Id() {
		return id;
	}
	
	public void setVehicle_Id(Integer id) {
		this.id = id;
	}

}
