package io.jsd.training.java.designpattern.structural.adapter.iterenum.app;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Vector;

import io.jsd.training.java.designpattern.structural.adapter.iterenum.EnumerationIterator;

public class EnumerationIteratorTestDrive {
	public static void main(String args[]) {
		Vector v = new Vector(Arrays.asList(args));
		Iterator iterator = new EnumerationIterator(v.elements());
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}
	}
}
