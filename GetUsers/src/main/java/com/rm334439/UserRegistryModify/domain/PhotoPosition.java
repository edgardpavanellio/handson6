package com.rm334439.UserRegistryModify.domain;

public enum PhotoPosition {
	
	FRONT(0),
	BACK(1);
	
	private int id;

	PhotoPosition(int id) {
		// TODO Auto-generated constructor stub
		this.id=id;
	}
	
	public Integer getPhotoPosition_Id() {
		return id;
	}
	
	public void setPhotoPosition_Id(Integer id) {
		this.id = id;
	}
	

}
