package io.jsd.training.java.guava.base;

import com.google.common.base.MoreObjects;

public class Pojo {
	
	private final String aString;
	private final int anInt;
	private final Object anObject;
 
	public Pojo(String aString, int anInt, Object anObject) {
		this.aString = aString;
		this.anInt = anInt;
		this.anObject = anObject;
	}
 
	@Override
	public String toString() {
		return MoreObjects.toStringHelper(this)
				.add("aString", aString)
				.add("anInt", anInt)
				.add("anObject", anObject)
				.toString();
	}

}
