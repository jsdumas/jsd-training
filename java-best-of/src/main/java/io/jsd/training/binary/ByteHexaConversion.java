package io.jsd.training.binary;

import javax.xml.bind.DatatypeConverter;

public class ByteHexaConversion {
	
	// Convert Hex String to Byte Array

	public byte[] hexString2Byte(String hexString) {
		hexString = hexString.replace(" ", "");
		
	       byte[] bytes = new byte[hexString.length() / 2];
//	       for (int i = 0; i < bytes.length; i++) {
//	          bytes[i] = (byte) Integer.parseInt(hexString.substring(2 * i, 2 * i + 2), 16);
//	       }
	       for (int i = 0; i < bytes.length; i+=2) {
		          bytes[i/2] = Integer.valueOf(hexString.substring(i, i + 2), 16).byteValue();
		       }
	       return bytes;
	    }
	
	public byte[] hexString2ByteApi(String hexString) {
			hexString = hexString.replace(" ", "");
	       return DatatypeConverter.parseHexBinary(hexString);
	    }
	
	public String byte2String(byte tableau) {
		return String.format(
				"%8s",	// 8 digits for 8 bits
				//	Integer.toBinaryString(toUnsignedInt(tableau))
				Integer.toBinaryString(Byte.toUnsignedInt(tableau))
				).replace(" ", "0");
	}
	
	public String prettyPrint(byte[] array) {
		if(array == null) return "null";
		StringBuilder sb = new StringBuilder();
		for(byte octet : array) {
			sb.append(byte2String(octet)).append(" ");
		}
		return sb.toString();
	}
	
	

	private int toUnsignedInt(byte value) {
		//Note:
		//	1) value is a signed byte
		//	2) upcasting a signed byte (8 bit) to unsigned int (32 bit) will cause a Sign Extension,
		//	i.e., the number of bits increased (with 1's) until it reaches 32 bits
		//	3) value & 0xFF will remove extra leading 24 bits
		
		//	Example :
		//	0xAD = -83
		// (int)0xAD => 11111111 11111111 11111111 10101101
		// (int)0xAD & 0xFF => (11111111 11111111 11111111 10101101) & (00000000 00000000 00000000 11111111)
		// = 00000000 00000000 00000000 10101101
		return value & 0xFF;
	}

	// Convert Byte Arrary to Hex String
	    public String byte2hex(byte[] b)
	    {

	     // String Buffer can be used instead

	       String hs = "";
	       String stmp = "";

	       for (int n = 0; n < b.length; n++)
	       {
	          stmp = (java.lang.Integer.toHexString(b[n] & 0XFF));

	          if (stmp.length() == 1)
	          {
	             hs = hs + "0" + stmp;
	          }
	          else
	          {
	             hs = hs + stmp;
	          }

	          if (n < b.length - 1)
	          {
	             hs = hs + "";
	          }
	       }

	       return hs;
	    }

}
