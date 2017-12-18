package io.jsd.training.java.designpattern.structural.facade.shape;

import io.jsd.training.java.designpattern.structural.facade.shape.pattern.ShapeMaker;

public class Runtime {

	public static void main(String[] args) {
		ShapeMaker shapeMaker = new ShapeMaker();

		shapeMaker.drawCircle();
		shapeMaker.drawRectangle();
		shapeMaker.drawSquare();
	}

}
