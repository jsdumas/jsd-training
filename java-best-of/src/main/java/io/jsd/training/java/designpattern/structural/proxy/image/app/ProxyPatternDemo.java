package io.jsd.training.java.designpattern.structural.proxy.image.app;

import io.jsd.training.java.designpattern.structural.proxy.image.pattern.Image;
import io.jsd.training.java.designpattern.structural.proxy.image.pattern.ProxyImage;

public class ProxyPatternDemo {

	public static void main(String[] args) {
		Image image = new ProxyImage("test_10mb.jpg");

		// image will be loaded from disk
		image.display();
		System.out.println("");

		// image will not be loaded from disk
		image.display();
	}
}
