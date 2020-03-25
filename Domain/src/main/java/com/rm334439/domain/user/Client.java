package com.rm334439.domain.user;


import java.text.ParseException;
import java.util.Date;
import java.util.List;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.Transient;

import com.rm334439.domain.address.Address;
import com.rm334439.domain.document.Document;
import com.rm334439.domain.image.Photo;
import com.rm334439.domain.status.Status;

@Entity
@DiscriminatorValue("C")
public class Client extends User {

	
	//payment_method
	
	public Client() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Client(String user_name, String user_lastName, String user_birthDate, String user_email,
			String user_login, String user_password, Document user_document, List<Address> user_address,
			Photo user_photo, Status user_status) throws ParseException {
		super(user_name, user_lastName, user_birthDate, user_email, user_login, user_password, user_document,
				user_address, user_photo, user_status);
		// TODO Auto-generated constructor stub
	}
	
	public Client(String user_name, String user_lastName, String user_birthDate, String user_email,
			String user_login, String user_password, Document user_document,
			Photo user_photo, Status user_status) throws ParseException {
		super(user_name, user_lastName, user_birthDate, user_email, user_login, user_password, user_document,
				 user_photo, user_status);
		// TODO Auto-generated constructor stub
	}
	
	public Client(String user_name, String user_lastName, String user_birthDate, String user_email,
			String user_login, String user_password, Document user_document,
			Status user_status) throws ParseException {
		super(user_name, user_lastName, user_birthDate, user_email, user_login, user_password, user_document,
				  user_status);
		// TODO Auto-generated constructor stub
	}


	@Override
	public Long getUser_id() {
		// TODO Auto-generated method stub
		return super.getUser_id();
	}


	@Override
	public void setUser_id(Long user_id) {
		// TODO Auto-generated method stub
		super.setUser_id(user_id);
	}


	@Override
	public String getUser_name() {
		// TODO Auto-generated method stub
		return super.getUser_name();
	}


	@Override
	public void setUser_name(String user_name) {
		// TODO Auto-generated method stub
		super.setUser_name(user_name);
	}


	@Override
	public String getUser_lastName() {
		// TODO Auto-generated method stub
		return super.getUser_lastName();
	}


	@Override
	public void setUser_lastName(String user_lastName) {
		// TODO Auto-generated method stub
		super.setUser_lastName(user_lastName);
	}


	@Override
	public Date getUser_birthDate() {
		// TODO Auto-generated method stub
		return super.getUser_birthDate();
	}


	@Override
	public void setUser_birthDate(String user_birthDate) throws ParseException {
		// TODO Auto-generated method stub
		super.setUser_birthDate(user_birthDate);
	}


	@Override
	public String getUser_email() {
		// TODO Auto-generated method stub
		return super.getUser_email();
	}


	@Override
	public void setUser_email(String user_email) {
		// TODO Auto-generated method stub
		super.setUser_email(user_email);
	}


	@Override
	public String getUser_login() {
		// TODO Auto-generated method stub
		return super.getUser_login();
	}


	@Override
	public void setUser_login(String user_login) {
		// TODO Auto-generated method stub
		super.setUser_login(user_login);
	}


	@Override
	public String getUser_password() {
		// TODO Auto-generated method stub
		return super.getUser_password();
	}


	@Override
	public void setUser_password(String user_password) {
		// TODO Auto-generated method stub
		super.setUser_password(user_password);
	}


	@Override
	public Document getUser_document() {
		// TODO Auto-generated method stub
		return super.getUser_document();
	}


	@Override
	public void setUser_document(Document user_document) {
		// TODO Auto-generated method stub
		super.setUser_document(user_document);
	}


	@Override
	public List<Address> getUser_address() {
		// TODO Auto-generated method stub
		return super.getUser_address();
	}


	@Override
	public void setUser_address(List<Address> user_address) {
		// TODO Auto-generated method stub
		super.setUser_address(user_address);
	}


	@Override
	public Photo getUser_photo() {
		// TODO Auto-generated method stub
		return super.getUser_photo();
	}


	@Override
	public void setUser_photo(Photo user_photo) {
		// TODO Auto-generated method stub
		super.setUser_photo(user_photo);
	}


	@Override
	public Status getUser_status() {
		// TODO Auto-generated method stub
		return super.getUser_status();
	}


	@Override
	public void setUser_status(Status user_status) {
		// TODO Auto-generated method stub
		super.setUser_status(user_status);
	}

	
	@Transient
	public String getDecriminatorValue() {
	    return this.getClass().getAnnotation(DiscriminatorValue.class).value();
	}


	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}


	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return super.hashCode();
	}


	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		return super.equals(obj);
	}



}
