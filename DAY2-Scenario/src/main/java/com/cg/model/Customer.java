package com.cg.model;

public class Customer {
private String firstName;
private String lastName;
private Address address;
private Account accounts;

@Override
public String toString() {
	return "Customer [firstName=" + firstName + ", lastName=" + lastName + ", address=" + address + ", accounts="
			+ accounts + "]";
}

public Customer(String firstName, String lastName, Address address, Account accounts) {
	super();
	this.firstName = firstName;
	this.lastName = lastName;
	this.address = address;
	this.accounts = accounts;
}

public String getFirstName() {
	return firstName;
}

public void setFirstName(String firstName) {
	this.firstName = firstName;
}

public String getLastName() {
	return lastName;
}

public void setLastName(String lastName) {
	this.lastName = lastName;
}

public Address getAddress() {
	return address;
}

public void setAddress(Address address) {
	this.address = address;
}

public Account getAccounts() {
	return accounts;
}

public void setAccounts(Account accounts) {
	this.accounts = accounts;
}

public Customer() {
	
}
}
