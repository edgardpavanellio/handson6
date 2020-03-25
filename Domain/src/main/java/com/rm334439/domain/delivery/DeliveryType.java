package com.rm334439.domain.delivery;

public enum DeliveryType {
	
	FIX(0),
	CLOUD(1);
	
	private int id;

	DeliveryType(int id) {
		// TODO Auto-generated constructor stub
		this.id=id;
	}
	
	public Integer getDeliveryType_Id() {
		return id;
	}
	
	public void setDeliveryType_Id(Integer id) {
		this.id = id;
	}

}
