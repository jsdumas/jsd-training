package io.jsd.training.memorymanagement.garbagecollector;

public class Customer  {
	private String name;

	public String getName() {
		return name;
	}
	
	public Customer(String name) {
		this.name = name;
	}
	
	public Customer(Customer oldCustomer) {
		this.name = oldCustomer.name; 
	}
	
	
	public String toString() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	//it is useless
	//if GC never run for this object, finalize method will never called
	public void finalalize() {
		System.out.println("This object is being gc'd.");
		
		//But it is very usefull if we want to verify or log information before object erasing
//		if(file.isOpen()) {
//			logger.warn("It looks like this resource was not closed");
//		}
	}
	
}
