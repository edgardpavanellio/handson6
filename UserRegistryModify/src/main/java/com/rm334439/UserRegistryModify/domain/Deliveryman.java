package com.rm334439.UserRegistryModify.domain;

import java.text.ParseException;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.OneToOne;
import javax.persistence.Transient;


@Entity
@DiscriminatorValue("D")
public class Deliveryman extends User {
	
	@OneToOne(fetch = FetchType.EAGER, optional = true, cascade = CascadeType.ALL)
	private Account deliveryan_account;
	
	private DeliveryType deliveryan_deliveryType;
	private Vehicle deliveryman_vehicle;
	
	public Deliveryman() {
		// TODO Auto-generated constructor stub
	}

	
	
	public Deliveryman(String user_name, String user_lastName, String user_birthDate,
			String user_email, String user_login, String user_password, Document user_document,
			List<Address> user_address, Photo user_photo, Status user_status) throws ParseException {
		super(user_name, user_lastName, user_birthDate, user_email, user_login, user_password, user_document,
				user_address, user_photo, user_status);
		// TODO Auto-generated constructor stub
	}

	
	public Deliveryman(String user_name, String user_lastName, String user_birthDate,
			String user_email, String user_login, String user_password, Document user_document,
			Photo user_photo, Status user_status) throws ParseException {
		super(user_name, user_lastName, user_birthDate, user_email, user_login, user_password, user_document,
				user_photo, user_status);
		// TODO Auto-generated constructor stub
	}


	public Deliveryman(String user_name, String user_lastName, String user_birthDate,
			String user_email, String user_login, String user_password, Document user_document,
			List<Address> user_address, Photo user_photo, Status user_status, Account deliveryan_account, DeliveryType deliveryman_deliveryType, Vehicle deliveryman_vehicle) throws ParseException {
		super(user_name, user_lastName, user_birthDate, user_email, user_login, user_password, user_document,
				user_address, user_photo, user_status);
		// TODO Auto-generated constructor stub
		
		this.deliveryan_account = deliveryan_account;
		this.deliveryan_deliveryType=deliveryman_deliveryType;
		this.deliveryman_vehicle = deliveryman_vehicle;
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



	public Account getDeliveryan_account() {
		return deliveryan_account;
	}

	public void setDeliveryan_account(Account deliveryan_account) {
		this.deliveryan_account = deliveryan_account;
	}

	public DeliveryType getDeliveryan_deliveryType() {
		return deliveryan_deliveryType;
	}

	public void setDeliveryan_deliveryType(DeliveryType deliveryan_deliveryType) {
		this.deliveryan_deliveryType = deliveryan_deliveryType;
	}

	public Vehicle getDeliveryman_vehicle() {
		return deliveryman_vehicle;
	}

	public void setDeliveryman_vehicle(Vehicle deliveryman_vehicle) {
		this.deliveryman_vehicle = deliveryman_vehicle;
	}
	
	@Transient
	public String getDecriminatorValue() {
	    return this.getClass().getAnnotation(DiscriminatorValue.class).value();
	}


	@Override
	public String toString() {
		return "Deliveryman [deliveryan_account=" + deliveryan_account + ", deliveryan_deliveryType="
				+ deliveryan_deliveryType + ", deliveryman_vehicle=" + deliveryman_vehicle + ", toString()="
				+ super.toString() + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((deliveryan_account == null) ? 0 : deliveryan_account.hashCode());
		result = prime * result + ((deliveryan_deliveryType == null) ? 0 : deliveryan_deliveryType.hashCode());
		result = prime * result + ((deliveryman_vehicle == null) ? 0 : deliveryman_vehicle.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Deliveryman other = (Deliveryman) obj;
		if (deliveryan_account == null) {
			if (other.deliveryan_account != null)
				return false;
		} else if (!deliveryan_account.equals(other.deliveryan_account))
			return false;
		if (deliveryan_deliveryType != other.deliveryan_deliveryType)
			return false;
		if (deliveryman_vehicle != other.deliveryman_vehicle)
			return false;
		return true;
	}
	
	

}
