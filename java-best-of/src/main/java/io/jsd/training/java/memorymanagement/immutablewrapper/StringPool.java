package io.jsd.training.java.memorymanagement.immutablewrapper;

public class StringPool {
	
	public static void main(String[] args) {
		
		//String pool allows internalisation of String objects which are created with the same value.
		//new String("something") create new object outside fom pool
		String referenceOne = "hello";
		String referenceTwo = "hello";
		
		if(referenceOne == referenceTwo) {
			System.out.println("they are the same object");
		} else {
			System.out.println("they are diferrent objects");
		}
		
		System.out.println("--------------------------");
		
		// in this case the references point over two different objects because they are not in the same pool
		String referenceThree = new Integer(76).toString();
		String referenceFour = "76";
		
		if(referenceThree == referenceFour) {
			System.out.println("they are the same object");
		} else {
			System.out.println("they are diferrent objects");
		}
		
		System.out.println("--------------------------");
		
		//If we want store the result of toString in the pool, then we have to tell at JVM to do it with the intern() method.
		String referenceFive = new Integer(76).toString().intern();
		
		if(referenceFour == referenceFive) {
			System.out.println("they are the same object");
		} else {
			System.out.println("they are diferrent objects");
		}
	}

}
