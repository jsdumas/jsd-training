package io.jsd.training.binary;

import org.junit.Test;

public class ConversionTest {
	
	private Conversion conversion = new Conversion();
	//Diginext is software editor
	private String hexa = "446967696e65787420697320736f66747761726520656469746f72";
	
	@Test
	public void test() {
		byte[] byteArray = conversion.hexStringToByteArray(hexa);
		System.out.println(new String(byteArray));
		System.out.println("" + (char)byteArray[9] + (char)byteArray[10]);
	}
	
	@Test
	public void test2() {
		System.out.println((0x3 & 0x3) << 8);
		System.out.println((0x5 & 0x3) << 8);
	}

}
