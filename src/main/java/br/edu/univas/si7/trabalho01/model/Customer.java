package br.edu.univas.si7.trabalho01.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import br.edu.univas.si7.trabalho01.model.support.CustomerType;

@Entity
public class Customer implements Serializable {

	@Id
	private String id; // CPF ou CNPJ
	private String name;
	@Column(unique = true)
	private String email;

	private CustomerType type;
	private String phoneNumber;

	@OneToMany(mappedBy = "customer", cascade = CascadeType.REMOVE)
	private List<Address> addresses = new ArrayList<>();

	@OneToMany(mappedBy = "customer")
	private List<Order> orders = new ArrayList<>();

	public Customer() {
	}

	public Customer(String id, String name, String email, String phoneNumber, CustomerType type) {
		this.id = id;
		this.name = name;
		this.email = email;
		this.type = type;
		this.phoneNumber = phoneNumber;
	}

	public void addAddress(Address... address) {
		this.addresses.addAll(Arrays.asList(address));
	}

	public void addOrders(Order... orders) {
		this.orders.addAll(Arrays.asList(orders));
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public CustomerType getType() {
		return type;
	}

	public void setType(CustomerType type) {
		this.type = type;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public List<Address> getAddresses() {
		return addresses;
	}

	public List<Order> getOrders() {
		return orders;
	}




	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Customer other = (Customer) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}
}