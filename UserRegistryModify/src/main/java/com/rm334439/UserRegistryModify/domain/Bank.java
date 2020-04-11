package com.rm334439.UserRegistryModify.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "bank_table")
public class Bank {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int bank_id;
	
	private String bank_code;
	private String bank_name;
	private String bank_description;

	public Bank() {
		// TODO Auto-generated constructor stub
	}

	public Bank(String bank_code, String bank_name, String bank_description) {
		super();
		this.bank_code = bank_code;
		this.bank_name = bank_name;
		this.bank_description = bank_description;
	}

	public int getBank_id() {
		return bank_id;
	}

	public void setBank_id(int bank_id) {
		this.bank_id = bank_id;
	}

	public String getBank_code() {
		return bank_code;
	}

	public void setBank_code(String bank_code) {
		this.bank_code = bank_code;
	}

	public String getBank_name() {
		return bank_name;
	}

	public void setBank_name(String bank_name) {
		this.bank_name = bank_name;
	}

	public String getBank_description() {
		return bank_description;
	}

	public void setBank_description(String bank_description) {
		this.bank_description = bank_description;
	}

	@Override
	public String toString() {
		return "Bank [bank_id=" + bank_id + ", bank_code=" + bank_code + ", bank_name=" + bank_name
				+ ", bank_description=" + bank_description + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((bank_code == null) ? 0 : bank_code.hashCode());
		result = prime * result + ((bank_description == null) ? 0 : bank_description.hashCode());
		result = prime * result + bank_id;
		result = prime * result + ((bank_name == null) ? 0 : bank_name.hashCode());
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
		Bank other = (Bank) obj;
		if (bank_code == null) {
			if (other.bank_code != null)
				return false;
		} else if (!bank_code.equals(other.bank_code))
			return false;
		if (bank_description == null) {
			if (other.bank_description != null)
				return false;
		} else if (!bank_description.equals(other.bank_description))
			return false;
		if (bank_id != other.bank_id)
			return false;
		if (bank_name == null) {
			if (other.bank_name != null)
				return false;
		} else if (!bank_name.equals(other.bank_name))
			return false;
		return true;
	}
	
	

}
