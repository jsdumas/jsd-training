package io.jsd.training.java.memorymanagement.test;

public class Main {

	public static void main(String args[]) {
		Main main = new Main();
		main.start();
	}
	
	public void start() {
		String last = "Z";
		Container container = new Container();
		container.setInitial("C"); // getInitial() --> C
		another(container,last);
		System.out.print(container.getInitial()); // getInitial() --> B
		//container display B because was affected to cointainer while initialHolder points over the same object in heap
		//when initialHolder points over another object, it gets a new value for initial
		//but initial container stays the same as before, that is to say B and not A
	}
	
	public void another(Container initialHolder, String newInitial) {
		newInitial.toLowerCase();//--> there is no reference to memorize the result of toLowerCase()
		//initial reference newInitial doesn't change
		initialHolder.setInitial("B"); // getInitial() --> B
		Container initial2 = new Container();
		initialHolder=initial2; // getInitial() --> A
		System.out.print(initialHolder.getInitial()); // getInitial() --> A
		System.out.print(newInitial);
	}
}
