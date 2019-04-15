package com.ofss; 
public class Customer {

	String customerName;
	Address address;
	public Customer(String customerName, Address address) {
		super();
		this.customerName = customerName;
		this.address = address; //DI
	}
	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Customer [customerName=" + customerName + ", address=" + address + "]";
	}
	
	

}
