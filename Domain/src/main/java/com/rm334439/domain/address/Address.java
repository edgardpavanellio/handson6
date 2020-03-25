package com.rm334439.domain.address;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "address_table")
public class Address {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long address_id;
	
	private String address_province;
	private String address_region;
	private String address_city;
	private String address_state;
	private String address_street;
	private String address_complement;
	private String address_reference;
	private String address_name;
	private String address_number;
	private String address_postalCode;
	private Double address_latitude;
	private Double address_longitude;
	private Country address_country;
	
	public Address() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Address(Country address_country, String address_province, String address_region,
			String address_city, String address_state, String address_street, String address_complement,
			String address_reference, String address_name, String address_number, String address_postalCode,
			Double address_latitude, Double address_longitude) {
		super();
		this.address_country = address_country;
		this.address_province = address_province;
		this.address_region = address_region;
		this.address_city = address_city;
		this.address_state = address_state;
		this.address_street = address_street;
		this.address_complement = address_complement;
		this.address_reference = address_reference;
		this.address_name = address_name;
		this.address_number = address_number;
		this.address_postalCode = address_postalCode;
		this.address_latitude = address_latitude;
		this.address_longitude = address_longitude;
	}
	
	public Address(Country address_country, 
			String address_city, String address_state, String address_street, String address_name, 
			String address_number) {
		super();
		this.address_country = address_country;
		this.address_city = address_city;
		this.address_state = address_state;
		this.address_street = address_street;
		this.address_name = address_name;
		this.address_number = address_number;
	}


	public Long getAddress_id() {
		return address_id;
	}


	public void setAddress_id(Long address_id) {
		this.address_id = address_id;
	}


	public Country getAddress_country() {
		return address_country;
	}


	public void setAddress_country(Country address_country) {
		this.address_country = address_country;
	}


	public String getAddress_province() {
		return address_province;
	}


	public void setAddress_province(String address_province) {
		this.address_province = address_province;
	}


	public String getAddress_region() {
		return address_region;
	}


	public void setAddress_region(String address_region) {
		this.address_region = address_region;
	}


	public String getAddress_city() {
		return address_city;
	}


	public void setAddress_city(String address_city) {
		this.address_city = address_city;
	}


	public String getAddress_state() {
		return address_state;
	}


	public void setAddress_state(String address_state) {
		this.address_state = address_state;
	}


	public String getAddress_street() {
		return address_street;
	}


	public void setAddress_street(String address_street) {
		this.address_street = address_street;
	}


	public String getAddress_complement() {
		return address_complement;
	}


	public void setAddress_complement(String address_complement) {
		this.address_complement = address_complement;
	}


	public String getAddress_reference() {
		return address_reference;
	}


	public void setAddress_reference(String address_reference) {
		this.address_reference = address_reference;
	}


	public String getAddress_name() {
		return address_name;
	}


	public void setAddress_name(String address_name) {
		this.address_name = address_name;
	}


	public String getAddress_number() {
		return address_number;
	}


	public void setAddress_number(String address_number) {
		this.address_number = address_number;
	}


	public String getAddress_postalCode() {
		return address_postalCode;
	}


	public void setAddress_postalCode(String address_postalCode) {
		this.address_postalCode = address_postalCode;
	}


	public Double getAddress_latitude() {
		return address_latitude;
	}


	public void setAddress_latitude(Double address_latitude) {
		this.address_latitude = address_latitude;
	}


	public Double getAddress_longitude() {
		return address_longitude;
	}


	public void setAddress_longitude(Double address_longitude) {
		this.address_longitude = address_longitude;
	}


	@Override
	public String toString() {
		return "Address [address_id=" + address_id + ", address_country=" + address_country + ", address_province="
				+ address_province + ", address_region=" + address_region + ", address_city=" + address_city
				+ ", address_state=" + address_state + ", address_street=" + address_street + ", address_complement="
				+ address_complement + ", address_reference=" + address_reference + ", address_name=" + address_name
				+ ", address_number=" + address_number + ", address_postalCode=" + address_postalCode
				+ ", address_latitude=" + address_latitude + ", address_longitude=" + address_longitude + "]";
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((address_city == null) ? 0 : address_city.hashCode());
		result = prime * result + ((address_complement == null) ? 0 : address_complement.hashCode());
		result = prime * result + ((address_country == null) ? 0 : address_country.hashCode());
		result = prime * result + ((address_id == null) ? 0 : address_id.hashCode());
		result = prime * result + ((address_latitude == null) ? 0 : address_latitude.hashCode());
		result = prime * result + ((address_longitude == null) ? 0 : address_longitude.hashCode());
		result = prime * result + ((address_name == null) ? 0 : address_name.hashCode());
		result = prime * result + ((address_number == null) ? 0 : address_number.hashCode());
		result = prime * result + ((address_postalCode == null) ? 0 : address_postalCode.hashCode());
		result = prime * result + ((address_province == null) ? 0 : address_province.hashCode());
		result = prime * result + ((address_reference == null) ? 0 : address_reference.hashCode());
		result = prime * result + ((address_region == null) ? 0 : address_region.hashCode());
		result = prime * result + ((address_state == null) ? 0 : address_state.hashCode());
		result = prime * result + ((address_street == null) ? 0 : address_street.hashCode());
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
		Address other = (Address) obj;
		if (address_city == null) {
			if (other.address_city != null)
				return false;
		} else if (!address_city.equals(other.address_city))
			return false;
		if (address_complement == null) {
			if (other.address_complement != null)
				return false;
		} else if (!address_complement.equals(other.address_complement))
			return false;
		if (address_country != other.address_country)
			return false;
		if (address_id == null) {
			if (other.address_id != null)
				return false;
		} else if (!address_id.equals(other.address_id))
			return false;
		if (address_latitude == null) {
			if (other.address_latitude != null)
				return false;
		} else if (!address_latitude.equals(other.address_latitude))
			return false;
		if (address_longitude == null) {
			if (other.address_longitude != null)
				return false;
		} else if (!address_longitude.equals(other.address_longitude))
			return false;
		if (address_name == null) {
			if (other.address_name != null)
				return false;
		} else if (!address_name.equals(other.address_name))
			return false;
		if (address_number == null) {
			if (other.address_number != null)
				return false;
		} else if (!address_number.equals(other.address_number))
			return false;
		if (address_postalCode == null) {
			if (other.address_postalCode != null)
				return false;
		} else if (!address_postalCode.equals(other.address_postalCode))
			return false;
		if (address_province == null) {
			if (other.address_province != null)
				return false;
		} else if (!address_province.equals(other.address_province))
			return false;
		if (address_reference == null) {
			if (other.address_reference != null)
				return false;
		} else if (!address_reference.equals(other.address_reference))
			return false;
		if (address_region == null) {
			if (other.address_region != null)
				return false;
		} else if (!address_region.equals(other.address_region))
			return false;
		if (address_state == null) {
			if (other.address_state != null)
				return false;
		} else if (!address_state.equals(other.address_state))
			return false;
		if (address_street == null) {
			if (other.address_street != null)
				return false;
		} else if (!address_street.equals(other.address_street))
			return false;
		return true;
	}
	
	
	
	
}
