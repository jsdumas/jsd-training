package io.jsd.training.java.memorymanagement.escapingreferences;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class CustomerRecords implements Iterable<Customer>{
	private Map<String, Customer> records;
	
	public CustomerRecords() {
		this.records = new HashMap<String, Customer>();
	}
	
	public void addCustomer(Customer c) {
		this.records.put(c.getName(), c);
	}
		
	public Map<String, Customer> getCustomers() {
		//This is a bad practice because we can modify collection when we get it
//		return this.records;
		
		//This is better because we return a copy of collection so that if we modify the copy we can not access to the private collection
//		return new HashMap<String, Customer>(records);
		
		//This is the best practice because the collection that we return is immutable. 
		return Collections.unmodifiableMap(this.records);
	}

	@Override
	public Iterator<Customer> iterator() {
		return records.values().iterator();
	}
	
	public Customer getCustomerByName(String name) {
		//Bad practive this method returns a modifiable reference
//		return records.get(name);
		return new Customer(records.get(name));
	}


}
