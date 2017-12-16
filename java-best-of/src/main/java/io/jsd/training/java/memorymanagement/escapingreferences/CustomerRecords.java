package io.jsd.training.java.memorymanagement.escapingreferences;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class CustomerRecords {
	private Map<String, Customer> records;
	
	public CustomerRecords() {
		this.records = new HashMap<String, Customer>();
	}
	
	public void addCustomer(Customer c) {
		this.records.put(c.getName(), c);
	}
		
	public Map<String, Customer> getCustomers() {
		//This is a bad practice beacause we can modify collection when we get it
//		return this.records;
		
		//This is better beacause we return a copy of collection so that if we modify the copy we can not access to the private collection
//		return new HashMap<String, Customer>(records);
		
		//This is the best practice because the collection that we return is immutable. 
		return Collections.unmodifiableMap(this.records);
	}
}
