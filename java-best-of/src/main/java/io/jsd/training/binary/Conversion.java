package io.jsd.training.binary;

public class Conversion {
	
	public byte[] hexStringToByteArray(String hexaString) {
	    byte[] byteArray = new byte[hexaString.length() / 2];
	    for (int i = 0; i < byteArray.length; i++) {
	      int index = i * 2;
	      int hexaValue = Integer.parseInt(hexaString.substring(index, index + 2), 16);
	      byteArray[i] = (byte) hexaValue;
	    }
	    return byteArray;
	  }
	
	public String bytesToHexString(byte[] byteArray) {
	      final StringBuilder builder = new StringBuilder();
	      for(byte octet : byteArray) {
	         builder.append(Integer.toString(octet, 16));
	      }
	      return builder.toString();
	   }

}
