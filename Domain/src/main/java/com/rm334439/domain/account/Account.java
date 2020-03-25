package com.rm334439.domain.account;



import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.rm334439.domain.document.Document;

@Entity
@Table(name = "account_table")
public class Account {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long account_id;
	
	private String account_type;
	private String account_number;
	//private Document account_document;
	private Double account_amount;
	private Currency account_currency;
	
	@ManyToOne(fetch = FetchType.EAGER, optional = false, cascade = CascadeType.ALL)
	private Bank account_bank;
	

	public Account() {
		// TODO Auto-generated constructor stub
	}

	public Account(Bank account_bank, String account_type, String account_number,
			Document account_document, Currency account_currency, Double account_amount) {
		super();
		this.account_bank = account_bank;
		this.account_type = account_type;
		this.account_number = account_number;
		//this.account_document = account_document;
		this.account_currency = account_currency;
		this.account_amount = account_amount;
	}

	public Long getAccount_id() {
		return account_id;
	}

	public void setAccount_id(Long account_id) {
		this.account_id = account_id;
	}

	public Bank getAccount_bank() {
		return account_bank;
	}

	public void setAccount_bank(Bank account_bank) {
		this.account_bank = account_bank;
	}

	public String getAccount_type() {
		return account_type;
	}

	public void setAccount_type(String account_type) {
		this.account_type = account_type;
	}

	public String getAccount_number() {
		return account_number;
	}

	public void setAccount_number(String account_number) {
		this.account_number = account_number;
	}

	//public Document getAccount_document() {return account_document;}

	//public void setAccount_document(Document account_document) {this.account_document = account_document;}

	public Currency getAccount_currency() {
		return account_currency;
	}

	public void setAccount_currency(Currency account_currency) {
		this.account_currency = account_currency;
	}

	public Double getAccount_amount() {
		return account_amount;
	}

	public void setAccount_amount(Double account_amount) {
		this.account_amount = account_amount;
	}

	@Override
	public String toString() {
		return "Account [account_id=" + account_id + ", account_bank=" + account_bank + ", account_type=" + account_type
				+ ", account_number=" + account_number + ", account_document=" 
				+ ", account_currency=" + account_currency + ", account_amount=" + account_amount + "]";
		//+ account_document
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((account_amount == null) ? 0 : account_amount.hashCode());
		result = prime * result + ((account_bank == null) ? 0 : account_bank.hashCode());
		result = prime * result + ((account_currency == null) ? 0 : account_currency.hashCode());
		//result = prime * result + ((account_document == null) ? 0 : account_document.hashCode());
		result = prime * result + ((account_id == null) ? 0 : account_id.hashCode());
		result = prime * result + ((account_number == null) ? 0 : account_number.hashCode());
		result = prime * result + ((account_type == null) ? 0 : account_type.hashCode());
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
		Account other = (Account) obj;
		if (account_amount == null) {
			if (other.account_amount != null)
				return false;
		} else if (!account_amount.equals(other.account_amount))
			return false;
		if (account_bank == null) {
			if (other.account_bank != null)
				return false;
		} else if (!account_bank.equals(other.account_bank))
			return false;
		if (account_currency == null) {
			if (other.account_currency != null)
				return false;
		} else if (!account_currency.equals(other.account_currency))
			return false;
		//if (account_document == null) {if (other.account_document != null)return false;} else if (!account_document.equals(other.account_document))return false;
		if (account_id == null) {
			if (other.account_id != null)
				return false;
		} else if (!account_id.equals(other.account_id))
			return false;
		if (account_number == null) {
			if (other.account_number != null)
				return false;
		} else if (!account_number.equals(other.account_number))
			return false;
		if (account_type == null) {
			if (other.account_type != null)
				return false;
		} else if (!account_type.equals(other.account_type))
			return false;
		return true;
	}
	
	

}
