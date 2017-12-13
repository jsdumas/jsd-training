package io.jsd.training.java.designpattern.hf.creational.singleton.classic.training;

public class Singleton2 {

	private static Singleton2 instance;
	private static String urlDatabse = "";

	public Singleton2(String urlDatabse) {
		super();
		this.urlDatabse = urlDatabse;
	}

	public void helloSingeton() {
		System.out.println("Hello Singleton " + urlDatabse);
	}

	public static Singleton2 getInstance(String urlDatabse) {
		if (instance == null) {
			synchronized (Singleton2.urlDatabse) {
				if (instance == null) {
					instance = new Singleton2(urlDatabse);
				}
			}
		}
		return instance;
	}

	@Override
	public String toString() {
		return "Singleton2 [urlDatabse=" + urlDatabse + "]";
	}

}
