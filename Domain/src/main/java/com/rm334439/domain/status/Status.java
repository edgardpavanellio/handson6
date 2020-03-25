package com.rm334439.domain.status;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "status_table")
public class Status {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int status_id;
	private String status_code;
	private String status_name;
	private String status_description;
	
	
	public Status() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	public Status(String status_code, String status_name, String status_description) {
		super();
		this.status_code = status_code;
		this.status_name = status_name;
		this.status_description = status_description;
	}
	
	public Status(String status_code, String status_description) {
		super();
		this.status_code = status_code;
		this.status_description = status_description;
	}


	public int getStatus_id() {
		return status_id;
	}
	public void setStatus_id(int status_id) {
		this.status_id = status_id;
	}
	public String getStatus_code() {
		return status_code;
	}
	public void setStatus_code(String status_code) {
		this.status_code = status_code;
	}
	public String getStatus_name() {
		return status_name;
	}
	public void setStatus_name(String status_name) {
		this.status_name = status_name;
	}
	public String getStatus_description() {
		return status_description;
	}
	public void setStatus_description(String status_description) {
		this.status_description = status_description;
	}
	


	@Override
	public String toString() {
		return "Status [status_id=" + status_id + ", status_code=" + status_code + ", status_name=" + status_name
				+ ", status_description=" + status_description + "]";
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((status_code == null) ? 0 : status_code.hashCode());
		result = prime * result + ((status_description == null) ? 0 : status_description.hashCode());
		result = prime * result + status_id;
		result = prime * result + ((status_name == null) ? 0 : status_name.hashCode());
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
		Status other = (Status) obj;
		if (status_code == null) {
			if (other.status_code != null)
				return false;
		} else if (!status_code.equals(other.status_code))
			return false;
		if (status_description == null) {
			if (other.status_description != null)
				return false;
		} else if (!status_description.equals(other.status_description))
			return false;
		if (status_id != other.status_id)
			return false;
		if (status_name == null) {
			if (other.status_name != null)
				return false;
		} else if (!status_name.equals(other.status_name))
			return false;
		return true;
	}
	
	

}
