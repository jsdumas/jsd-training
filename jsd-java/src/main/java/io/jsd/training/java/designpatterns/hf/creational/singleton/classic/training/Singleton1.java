package io.jsd.training.java.designpatterns.hf.creational.singleton.classic.training;

public class Singleton1 {

	private static Singleton1 instance = new Singleton1();

	private Singleton1() {
	}

	public void helloSingeton() {
		System.out.println("Hello Singleton");
	}

	public static Singleton1 getInstance() {
		return instance;
	}
}
