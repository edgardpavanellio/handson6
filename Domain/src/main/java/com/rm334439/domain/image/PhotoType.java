package com.rm334439.domain.image;

public enum PhotoType {

	DOCUMENT(0),
	PROFILE(1);
	
	private int id;

	PhotoType(int id) {
		// TODO Auto-generated constructor stub
		this.id=id;
	}
	
	public Integer getPhotoType_Id() {
		return id;
	}
	
	public void setPhotoType_Id(Integer id) {
		this.id = id;
	}
	
}
