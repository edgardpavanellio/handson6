package com.rm334439.UserRegistryModify.domain;


import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;


@Entity
@Table(name = "document_table")
public class Document {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long document_id;
	private String document_type;
	private String document_number;
	
	@OneToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
	private List<Photo> document_photo;
	
	
	public Document() {
		super();
	}


	public Document(String document_type, String document_number, List<Photo> document_photo) {
		super();
		this.document_type = document_type;
		this.document_number = document_number;
		this.document_photo = document_photo;
	}

	
	public Document(String document_type, String document_number) {
		super();
		this.document_type = document_type;
		this.document_number = document_number;
	}

	public Long getDocument_id() {
		return document_id;
	}


	public void setDocument_id(Long document_id) {
		this.document_id = document_id;
	}


	public String getDocument_type() {
		return document_type;
	}


	public void setDocument_type(String document_type) {
		this.document_type = document_type;
	}


	public String getDocument_number() {
		return document_number;
	}


	public void setDocument_number(String document_number) {
		this.document_number = document_number;
	}


	public List<Photo> getDocument_photo() {
		return document_photo;
	}


	public void setDocument_photo(List<Photo> document_photo) {
		this.document_photo = document_photo;
	}


	@Override
	public String toString() {
		return "Document [document_id=" + document_id + ", document_type=" + document_type + ", document_number="
				+ document_number + ", document_photo=" + document_photo + "]";
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((document_id == null) ? 0 : document_id.hashCode());
		result = prime * result + ((document_number == null) ? 0 : document_number.hashCode());
		result = prime * result + ((document_photo == null) ? 0 : document_photo.hashCode());
		result = prime * result + ((document_type == null) ? 0 : document_type.hashCode());
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
		Document other = (Document) obj;
		if (document_id == null) {
			if (other.document_id != null)
				return false;
		} else if (!document_id.equals(other.document_id))
			return false;
		if (document_number == null) {
			if (other.document_number != null)
				return false;
		} else if (!document_number.equals(other.document_number))
			return false;
		if (document_photo == null) {
			if (other.document_photo != null)
				return false;
		} else if (!document_photo.equals(other.document_photo))
			return false;
		if (document_type == null) {
			if (other.document_type != null)
				return false;
		} else if (!document_type.equals(other.document_type))
			return false;
		return true;
	}


	

}
