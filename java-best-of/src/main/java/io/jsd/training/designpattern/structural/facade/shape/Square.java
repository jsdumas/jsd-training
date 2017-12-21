package io.jsd.training.designpattern.structural.facade.shape;


public class Square implements Shape {

	@Override
	public void draw() {
		System.out.println("Square::draw()");
	}

}
