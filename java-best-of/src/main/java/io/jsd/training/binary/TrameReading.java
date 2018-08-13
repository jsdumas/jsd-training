package io.jsd.training.binary;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class TrameReading {
	
	public static void main(String[] args) throws IOException {
		
		String octet = "00000000";
		
		
		InputStream is = new FileInputStream(args[0]);
		
		int oneByte = 0;
		
		while ((oneByte = is.read()) != -1) {
			
			String binaryString = Integer.toBinaryString(oneByte);
			
			System.out.print(octet.substring(binaryString.length()) + binaryString);
			
		}
	}

}
