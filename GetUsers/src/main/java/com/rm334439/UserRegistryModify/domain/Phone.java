package com.rm334439.UserRegistryModify.domain;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "phone_table")
public class Phone {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long phone_id;
	
	private String phone_type;
	private String phone_number;
	private Country phone_country;
	
	
	
	public Phone() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Phone(Country phone_country, String phone_type, String phone_number) {
		super();
		this.phone_country = phone_country;
		this.phone_type = phone_type;
		this.phone_number = phone_number;
	}
	
	

	public Long getPhone_id() {
		return phone_id;
	}
	public void setPhone_id(Long phone_id) {
		this.phone_id = phone_id;
	}
	public Country getPhone_country() {
		return phone_country;
	}
	public void setPhone_country(Country phone_country) {
		this.phone_country = phone_country;
	}
	public String getPhone_type() {
		return phone_type;
	}
	public void setPhone_type(String phone_type) {
		this.phone_type = phone_type;
	}
	public String getPhone_number() {
		return phone_number;
	}
	public void setPhone_number(String phone_number) {
		this.phone_number = phone_number;
	}

	@Override
	public String toString() {
		return "Phone [phone_id=" + phone_id + ", phone_country=" + phone_country + ", phone_type=" + phone_type
				+ ", phone_number=" + phone_number + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((phone_country == null) ? 0 : phone_country.hashCode());
		result = prime * result + ((phone_id == null) ? 0 : phone_id.hashCode());
		result = prime * result + ((phone_number == null) ? 0 : phone_number.hashCode());
		result = prime * result + ((phone_type == null) ? 0 : phone_type.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Phone other = (Phone) obj;
		if (phone_country != other.phone_country)
			return false;
		if (phone_id == null) {
			if (other.phone_id != null)
				return false;
		} else if (!phone_id.equals(other.phone_id))
			return false;
		if (phone_number == null) {
			if (other.phone_number != null)
				return false;
		} else if (!phone_number.equals(other.phone_number))
			return false;
		if (phone_type == null) {
			if (other.phone_type != null)
				return false;
		} else if (!phone_type.equals(other.phone_type))
			return false;
		return true;
	}
	
	
	
	
}
