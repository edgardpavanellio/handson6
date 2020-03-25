package com.rm334439.domain.user;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;

import com.rm334439.domain.address.Address;
import com.rm334439.domain.document.Document;
import com.rm334439.domain.image.Photo;
import com.rm334439.domain.status.Status;

@Entity
@Table(name = "user_table")
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name="user_type")
public abstract class User {
	

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long user_id;
	
	private String user_name;
	private String user_lastName;
	private String user_email;
	private String user_login;
	private String user_password;
	
	@Basic
	@Temporal(TemporalType.DATE)
	private Date user_birthDate;
	
	
	
	@OneToOne(fetch = FetchType.EAGER, optional = true, cascade = CascadeType.ALL)
	private Document user_document;
	
	@OneToMany(cascade = CascadeType.ALL)
	private List<Address> user_address;//list
	
	@OneToOne(fetch = FetchType.EAGER, optional = true, cascade = CascadeType.ALL)
	private Photo user_photo;
	
	@ManyToOne(fetch = FetchType.EAGER, optional = true, cascade = CascadeType.ALL)
	private Status user_status;
	
	
	
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}



	public User(String user_name, String user_lastName, String user_birthDate, String user_email,
			String user_login, String user_password, Document user_document, List<Address> user_address,
			Photo user_photo, Status user_status) throws ParseException {
		super();
		this.user_name = user_name;
		this.user_lastName = user_lastName;
		this.user_birthDate = new SimpleDateFormat("yyyy-MM-dd").parse(user_birthDate);
		this.user_email = user_email;
		this.user_login = user_login;
		this.user_password = user_password;
		this.user_document = user_document;
		this.user_address = user_address;
		this.user_photo = user_photo;
		this.user_status = user_status;
	}
	
	public User(String user_name, String user_lastName, String user_birthDate, String user_email,
			String user_login, String user_password, Document user_document,
			Photo user_photo, Status user_status) throws ParseException {
		super();
		this.user_name = user_name;
		this.user_lastName = user_lastName;
		this.user_birthDate = new SimpleDateFormat("yyyy-MM-dd").parse(user_birthDate);
		this.user_email = user_email;
		this.user_login = user_login;
		this.user_password = user_password;
		this.user_document = user_document;
		this.user_photo = user_photo;
		this.user_status = user_status;
	}
	
	public User(String user_name, String user_lastName, String user_birthDate, String user_email,
			String user_login, String user_password, Document user_document,
			Status user_status) throws ParseException {
		super();
		this.user_name = user_name;
		this.user_lastName = user_lastName;
		this.user_birthDate = new SimpleDateFormat("yyyy-MM-dd").parse(user_birthDate);
		this.user_email = user_email;
		this.user_login = user_login;
		this.user_password = user_password;
		this.user_document = user_document;
		this.user_status = user_status;
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



	public Date getUser_birthDate() {
		return user_birthDate;
	}



	public void setUser_birthDate(String user_birthDate) throws ParseException {
		this.user_birthDate = new SimpleDateFormat("yyyy-MM-dd").parse(user_birthDate);
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



	public String getUser_password() {
		return user_password;
	}



	public void setUser_password(String user_password) {
		this.user_password = user_password;
	}



	public Document getUser_document() {
		return user_document;
	}



	public void setUser_document(Document user_document) {
		this.user_document = user_document;
	}



	public List<Address> getUser_address() {
		return user_address;
	}



	public void setUser_address(List<Address> user_address) {
		this.user_address = user_address;
	}



	public Photo getUser_photo() {
		return user_photo;
	}



	public void setUser_photo(Photo user_photo) {
		this.user_photo = user_photo;
	}



	public Status getUser_status() {
		return user_status;
	}



	public void setUser_status(Status user_status) {
		this.user_status = user_status;
	}

	@Transient
	public String getDecriminatorValue() {
	    return this.getClass().getAnnotation(DiscriminatorValue.class).value();
	}

	

	@Override
	public String toString() {
		return "User [user_id=" + user_id + ", user_name=" + user_name + ", user_lastName=" + user_lastName
				+ ", user_birthDate=" + user_birthDate + ", user_email=" + user_email + ", user_login=" + user_login
				+ ", user_password=" + user_password + ", user_document=" + user_document + ", user_address="
				+ user_address + ", user_photo=" + user_photo + ", user_status=" + user_status + "]";
	}



	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((user_address == null) ? 0 : user_address.hashCode());
		result = prime * result + ((user_birthDate == null) ? 0 : user_birthDate.hashCode());
		result = prime * result + ((user_document == null) ? 0 : user_document.hashCode());
		result = prime * result + ((user_email == null) ? 0 : user_email.hashCode());
		result = prime * result + ((user_id == null) ? 0 : user_id.hashCode());
		result = prime * result + ((user_lastName == null) ? 0 : user_lastName.hashCode());
		result = prime * result + ((user_login == null) ? 0 : user_login.hashCode());
		result = prime * result + ((user_name == null) ? 0 : user_name.hashCode());
		result = prime * result + ((user_password == null) ? 0 : user_password.hashCode());
		result = prime * result + ((user_photo == null) ? 0 : user_photo.hashCode());
		result = prime * result + ((user_status == null) ? 0 : user_status.hashCode());
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
		User other = (User) obj;
		if (user_address == null) {
			if (other.user_address != null)
				return false;
		} else if (!user_address.equals(other.user_address))
			return false;
		if (user_birthDate == null) {
			if (other.user_birthDate != null)
				return false;
		} else if (!user_birthDate.equals(other.user_birthDate))
			return false;
		if (user_document == null) {
			if (other.user_document != null)
				return false;
		} else if (!user_document.equals(other.user_document))
			return false;
		if (user_email == null) {
			if (other.user_email != null)
				return false;
		} else if (!user_email.equals(other.user_email))
			return false;
		if (user_id == null) {
			if (other.user_id != null)
				return false;
		} else if (!user_id.equals(other.user_id))
			return false;
		if (user_lastName == null) {
			if (other.user_lastName != null)
				return false;
		} else if (!user_lastName.equals(other.user_lastName))
			return false;
		if (user_login == null) {
			if (other.user_login != null)
				return false;
		} else if (!user_login.equals(other.user_login))
			return false;
		if (user_name == null) {
			if (other.user_name != null)
				return false;
		} else if (!user_name.equals(other.user_name))
			return false;
		if (user_password == null) {
			if (other.user_password != null)
				return false;
		} else if (!user_password.equals(other.user_password))
			return false;
		if (user_photo == null) {
			if (other.user_photo != null)
				return false;
		} else if (!user_photo.equals(other.user_photo))
			return false;
		if (user_status == null) {
			if (other.user_status != null)
				return false;
		} else if (!user_status.equals(other.user_status))
			return false;
		return true;
	}


	
}
