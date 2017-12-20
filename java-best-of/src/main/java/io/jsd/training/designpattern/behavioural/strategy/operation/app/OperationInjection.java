package io.jsd.training.designpattern.behavioural.strategy.operation.app;

import io.jsd.training.designpattern.behavioural.strategy.operation.behaviour.OperationContext;
import io.jsd.training.designpattern.behavioural.strategy.operation.behaviour.operation.OperationAdd;
import io.jsd.training.designpattern.behavioural.strategy.operation.behaviour.operation.OperationMultiply;
import io.jsd.training.designpattern.behavioural.strategy.operation.behaviour.operation.OperationSubstract;

public class OperationInjection {
	public static void main(String[] args) {
		OperationContext operationContext = new OperationContext(new OperationAdd());
		System.out.println("10 + 5 = " + operationContext.executeStrategy(10, 5));

		operationContext = new OperationContext(new OperationSubstract());
		System.out.println("10 - 5 = " + operationContext.executeStrategy(10, 5));

		operationContext = new OperationContext(new OperationMultiply());
		System.out.println("10 * 5 = " + operationContext.executeStrategy(10, 5));
	}

}
