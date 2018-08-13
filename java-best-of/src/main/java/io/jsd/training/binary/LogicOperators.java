package io.jsd.training.binary;

public class LogicOperators {
	

	public static void main(String[] args) {

		System.out.println(0x1F);
		System.out.println(0x3F);
		System.out.println(0x1F & 0x3F);
		System.out.println((0x1F & 0x3F)<<4);
		
		
		byte[] array = new byte[2];
		array[0] = 0x2F;
		array[1] = 0x3F;
		System.out.println(new String(array));
	}

}
