package io.jsd.training.binary;

import java.util.Base64;

public class Base64Converter {

	public static void main(String[] args) {
		
		String abc = "ABC";
		String abcEncodedBase64= Base64.getEncoder().encodeToString(abc.getBytes()).toString();
		System.out.println("String codée en base 64 "+abcEncodedBase64);
		
		byte[] byteDecodedFromStringBase64 = Base64.getDecoder().decode(abcEncodedBase64);
		System.out.println("Taille du tableau de bytes "+byteDecodedFromStringBase64.length);
		System.out.println("Décimal de la valeur à l'emplacement 0 du tableau de bytes "+byteDecodedFromStringBase64[0]);
		
		String stringDeocdedFromByte = new String(byteDecodedFromStringBase64);
		System.out.println("String décodée depuis un tableau de bytes "+stringDeocdedFromByte);
		
		Conversion converter = new Conversion();
		String hexStringDecodedFromByte = converter.bytesToHexString(byteDecodedFromStringBase64);
		System.out.println("String en hexadécimal décodée depuis un tableau de bytes "+hexStringDecodedFromByte);
	}

}
