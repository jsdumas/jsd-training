package io.jsd.training.memorymanagement.escapingreferences;
public class Main {

	public static void main(String[] args) {
		CustomerRecords records = new CustomerRecords();

		records.addCustomer(new Customer("John"));
		records.addCustomer(new Customer("Simon"));
		
		//this method fails because it tries to clear an immutable collection
//		records.getCustomers().clear();
				
		for (Customer next : records.getCustomers().values())
				{
					System.out.println(next);
				}
		
		Customer john = records.getCustomerByName("John");
		System.out.println(john.getName());

	}
	
}
