package io.jsd.training.java.designpatterns.hf.creational.singleton.subclass.app;

import io.jsd.training.java.designpatterns.hf.creational.singleton.subclass.pattern.CoolerSingleton;
import io.jsd.training.java.designpatterns.hf.creational.singleton.subclass.pattern.HotterSingleton;
import io.jsd.training.java.designpatterns.hf.creational.singleton.subclass.pattern.Singleton;

public class SingletonTestDrive {
	public static void main(String[] args) {
		Singleton foo = CoolerSingleton.getInstance();
		Singleton bar = HotterSingleton.getInstance();
		System.out.println(foo);
		System.out.println(bar);
 	}
}
