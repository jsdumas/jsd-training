package io.jsd.training.java.designpattern.hf.behavioural.strategy.operation.behaviour.operation;

public class OperationMultiply implements OperationStrategy {

	public int doOperation(int num1, int num2) {
		return num1 * num2;
	}

}
