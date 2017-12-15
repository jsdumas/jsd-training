package io.jsd.training.java.designpattern.structural.facade.shape.pattern;

import io.jsd.training.java.designpattern.structural.facade.shape.Circle;
import io.jsd.training.java.designpattern.structural.facade.shape.Rectangle;
import io.jsd.training.java.designpattern.structural.facade.shape.Shape;
import io.jsd.training.java.designpattern.structural.facade.shape.Square;

public class ShapeMaker {
	private final Shape circle;
	private final Shape rectangle;
	private final Shape square;

	public ShapeMaker() {
		circle = new Circle();
		rectangle = new Rectangle();
		square = new Square();
	}

	public void drawCircle() {
		circle.draw();
	}

	public void drawRectangle() {
		rectangle.draw();
	}

	public void drawSquare() {
		square.draw();
	}
}
