package com.rm334439.UserRegistryModify.domain;


public enum Currency {

	DOLLAR("Dollar",0,"$"),
	REAL("Real",1,"R$");
	
	private String currency_name;
	private int currency_id;
	private String currency_symbol;


	private Currency(String currency_name, int currency_id, String currency_symbol) {
		this.currency_name = currency_name;
		this.currency_id = currency_id;
		this.currency_symbol = currency_symbol;
	}


	public String getCurrency_name() {
		return currency_name;
	}


	public void setCurrency_name(String currency_name) {
		this.currency_name = currency_name;
	}


	public int getCurrency_id() {
		return currency_id;
	}


	public void setCurrency_id(int currency_id) {
		this.currency_id = currency_id;
	}


	public String getCurrency_symbol() {
		return currency_symbol;
	}


	public void setCurrency_symbole(String currency_symbol) {
		this.currency_symbol = currency_symbol;
	}
	
	
	
	
}


/*
@Entity
public class Currency {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int currency_id;
	
	private String currency_name;
	private String currency_symbol;
	
	@ManyToOne(fetch = FetchType.EAGER, optional = false, cascade = CascadeType.ALL)
	private Country currency_country;
	
	public Currency() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Currency(int currency_id, String currency_name, String currency_symbol, Country currency_country) {
		super();
		this.currency_id = currency_id;
		this.currency_name = currency_name;
		this.currency_symbol = currency_symbol;
		this.currency_country = currency_country;
	}

	public int getCurrency_id() {
		return currency_id;
	}

	public void setCurrency_id(int currency_id) {
		this.currency_id = currency_id;
	}

	public String getCurrency_name() {
		return currency_name;
	}

	public void setCurrency_name(String currency_name) {
		this.currency_name = currency_name;
	}

	public String getCurrency_symbol() {
		return currency_symbol;
	}

	public void setCurrency_symbol(String currency_symbol) {
		this.currency_symbol = currency_symbol;
	}

	public Country getCurrency_country() {
		return currency_country;
	}

	public void setCurrency_country(Country currency_country) {
		this.currency_country = currency_country;
	}

	@Override
	public String toString() {
		return "Currency [currency_id=" + currency_id + ", currency_name=" + currency_name + ", currency_symbol="
				+ currency_symbol + ", currency_country=" + currency_country + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((currency_country == null) ? 0 : currency_country.hashCode());
		result = prime * result + currency_id;
		result = prime * result + ((currency_name == null) ? 0 : currency_name.hashCode());
		result = prime * result + ((currency_symbol == null) ? 0 : currency_symbol.hashCode());
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
		Currency other = (Currency) obj;
		if (currency_country != other.currency_country)
			return false;
		if (currency_id != other.currency_id)
			return false;
		if (currency_name == null) {
			if (other.currency_name != null)
				return false;
		} else if (!currency_name.equals(other.currency_name))
			return false;
		if (currency_symbol == null) {
			if (other.currency_symbol != null)
				return false;
		} else if (!currency_symbol.equals(other.currency_symbol))
			return false;
		return true;
	}
}
*/