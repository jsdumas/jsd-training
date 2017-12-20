package io.jsd.training.designpattern.behavioural.strategy.operation.behaviour.operation;

public class OperationSubstract implements OperationStrategy {

	public int doOperation(int num1, int num2) {
		return num1 - num2;
	}

}
