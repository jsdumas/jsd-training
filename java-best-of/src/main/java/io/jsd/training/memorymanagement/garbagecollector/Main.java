package io.jsd.training.memorymanagement.garbagecollector;

public class Main {

	public static void main(String[] args) {
		Runtime runtime = Runtime.getRuntime();

		long availableBytes = runtime.freeMemory();
		System.out.println("Available memory: " + availableBytes / 1024 + "k");

		// let's create a ton of garbage....
		Customer c;
		for (int i = 0; i < 1000000; i++) {
			c = new Customer("John");
		}

		availableBytes = runtime.freeMemory();
		System.out.println("Available memory: " + availableBytes / 1024 + "k");

		// forcing GC to happen is not a good idea
		// We don't know what sort of garbage collector we are running under
		// Also, it's not guaranteed to do anything. The JVM may just entirely ignore
		// our request.
		// The combination of "you don't know what it will do,"
		// "you don't know if it will even help,"
		// and "you shouldn't need to call it anyway"
		// are why people are so forceful in saying that generally you shouldn't call
		// it.
		System.gc();

		availableBytes = runtime.freeMemory();
		System.out.println("Available memory: " + availableBytes / 1024 + "k");
	}

}
