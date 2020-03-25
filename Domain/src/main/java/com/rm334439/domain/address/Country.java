package com.rm334439.domain.address;

public enum Country {

	BRASIL("Brasil",0,55),
	BOLIVIA("Bolivia",1,591),
	ARGENTINA("Argentina",2,54),
	COLOMBIA("Colombia",3,57),
	ECUADOR("Equador",4,593),
	PARAGUAY("Paraguay",5,595),
	PERU("Peru",6,51),
	URUGUAY("Uruguay",7,598),
	VENEZUELA("Venezuela",8,58);
	
	private String country_name;
	private int country_id;
	private int country_code;


	private Country(String country_name, int country_id, int country_code) {
		this.country_name = country_name;
		this.country_id = country_id;
		this.country_code = country_code;
	}


	public String getCountry_name() {
		return country_name;
	}


	public void setCountry_name(String country_name) {
		this.country_name = country_name;
	}


	public int getCountry_id() {
		return country_id;
	}


	public void setCountry_id(int country_id) {
		this.country_id = country_id;
	}


	public int getCountry_code() {
		return country_code;
	}


	public void setCountry_code(int country_code) {
		this.country_code = country_code;
	}
	
	
	
	
}
