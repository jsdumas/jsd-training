package io.jsd.training.designpatterns.hf.behavioural.state.gumballstate.behaviour;

public interface State {
 
	public void insertQuarter();
	public void ejectQuarter();
	public void turnCrank();
	public void dispense();
}
