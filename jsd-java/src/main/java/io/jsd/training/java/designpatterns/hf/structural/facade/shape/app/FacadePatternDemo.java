package io.jsd.training.java.designpatterns.hf.structural.facade.shape.app;

import io.jsd.training.java.designpatterns.hf.structural.facade.shape.pattern.ShapeMaker;

public class FacadePatternDemo {

	public static void main(String[] args) {
		ShapeMaker shapeMaker = new ShapeMaker();

		shapeMaker.drawCircle();
		shapeMaker.drawRectangle();
		shapeMaker.drawSquare();
	}

}
