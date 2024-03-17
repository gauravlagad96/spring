package com.autowired.annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Employee {
  //@Autowired- internally it uses byType - we can use @autowired by 3 ways.
	private Address address;

	public Address getAddress() {
		return address;
	}
	@Autowired
	@Qualifier("address1")
	public void setAddress(Address address) {
		this.address = address;
	}

	
	@Override
	public String toString() {
		return "Employee [address=" + address + "]";
	}

}
