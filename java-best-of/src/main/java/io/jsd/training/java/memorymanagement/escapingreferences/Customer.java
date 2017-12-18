package io.jsd.training.java.memorymanagement.escapingreferences;

public class Customer {
	private String name;

	public String getName() {
		return name;
	}

	public Customer(String name) {
		this.name = name;
	}
	
	public Customer(Customer oldCustomer) {
		this.name=oldCustomer.getName();
	}
	
		public String toString() {
		return name;
	}
	
}
