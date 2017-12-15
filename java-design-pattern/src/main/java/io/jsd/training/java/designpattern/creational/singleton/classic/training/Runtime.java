package io.jsd.training.java.designpattern.creational.singleton.classic.training;

public class Runtime {

	private static int size;

	public static void main(String[] args) {

		Singleton2 s1 = Singleton2.getInstance("test1");
		Singleton2 s2 = Singleton2.getInstance(null);
		if (s1.equals(s2))
			System.out.println("instance unique");
		else
			System.out.println("instance multiple");
		System.out.println("S1 :" + s1);
		System.out.println("S2 :" + s2);

	}
}
