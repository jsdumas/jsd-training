package io.jsd.training.designpattern.structural.facade.shape;


public class Rectangle implements Shape {

	@Override
	public void draw() {
		System.out.println("Rectangle::draw()");
	}

}
