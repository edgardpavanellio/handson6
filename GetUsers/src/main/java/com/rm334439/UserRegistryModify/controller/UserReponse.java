package com.rm334439.UserRegistryModify.controller;

import java.util.Date;

import com.rm334439.UserRegistryModify.domain.User;

public class UserReponse {

	
	private Long user_id;
	private String user_name;
	private String user_lastName;
	private String user_email;
	private String user_login;
	private Date user_birthDate;
	
	
	public UserReponse() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public UserReponse(final User user) {
		this.user_id = user.getUser_id();
		this.user_name = user.getUser_name();
		this.user_lastName = user.getUser_lastName();
		this.user_email = user.getUser_email();
		this.user_login = user.getUser_login();
		this.user_birthDate = user.getUser_birthDate();
		// TODO Auto-generated constructor stub
	}


	public UserReponse(Long user_id, String user_name, String user_lastName, String user_email, String user_login,
			Date user_birthDate) {
		super();
		this.user_id = user_id;
		this.user_name = user_name;
		this.user_lastName = user_lastName;
		this.user_email = user_email;
		this.user_login = user_login;
		this.user_birthDate = user_birthDate;
	}


	public Long getUser_id() {
		return user_id;
	}


	public void setUser_id(Long user_id) {
		this.user_id = user_id;
	}


	public String getUser_name() {
		return user_name;
	}


	public void setUser_name(String user_name) {
		this.user_name = user_name;
	}


	public String getUser_lastName() {
		return user_lastName;
	}


	public void setUser_lastName(String user_lastName) {
		this.user_lastName = user_lastName;
	}


	public String getUser_email() {
		return user_email;
	}


	public void setUser_email(String user_email) {
		this.user_email = user_email;
	}


	public String getUser_login() {
		return user_login;
	}


	public void setUser_login(String user_login) {
		this.user_login = user_login;
	}


	public Date getUser_birthDate() {
		return user_birthDate;
	}


	public void setUser_birthDate(Date user_birthDate) {
		this.user_birthDate = user_birthDate;
	}
	
	
}
