package io.jsd.training.java.designpattern.hf.behavioural.strategy.operation.behaviour.operation;

/**
 * In Strategy pattern, a class behavior or its algorithm can be changed at run time. This type of design pattern comes under behavior
 * pattern. In Strategy pattern, we create objects which represent various strategies and a context object whose behavior varies as per its
 * strategy object. The strategy object changes the executing algorithm of the context object.
 **/

public interface OperationStrategy {
	public int doOperation(int num1, int num2);

}
