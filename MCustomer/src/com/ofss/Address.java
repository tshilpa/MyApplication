
package com.ofss; 
public class Address {

	int flatNo;
	String streeName;
	String city;
	long pinCode;
	public Address(int flatNo, String streeName, String city, long pinCode) {
		super();
		this.flatNo = flatNo;
		this.streeName = streeName;
		this.city = city;
		this.pinCode = pinCode;
	}
	public Address() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Address [flatNo=" + flatNo + ", streeName=" + streeName + ", city=" + city + ", pinCode=" + pinCode
				+ "]";
	}

}
