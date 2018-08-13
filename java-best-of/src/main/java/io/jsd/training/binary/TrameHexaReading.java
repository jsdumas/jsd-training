package io.jsd.training.binary;

import java.io.IOException;

public class TrameHexaReading {
	
public static void main(String[] args) throws IOException {
		
		String hexaString = "103f44001210d00001a6";
//		String hexaString = "103f";
		
		ByteHexaConversion conversion = new ByteHexaConversion();
		
		byte[] tableau = conversion.hexString2Byte(hexaString);
		
		System.out.println(tableau);
		System.out.println(tableau.length);
		long longueurTrame = (tableau[8]+tableau[9]) & 0xff;
		System.out.println("Longueure des donn�es de la trame "+longueurTrame);
		
		
	}

}
