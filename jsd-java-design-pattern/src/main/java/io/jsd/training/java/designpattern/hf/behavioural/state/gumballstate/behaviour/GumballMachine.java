package io.jsd.training.java.designpattern.hf.behavioural.state.gumballstate.behaviour;

public class GumballMachine {

	// Different states that GumballMachine can have
	State soldOutState;
	State noQuarterState;
	State hasQuarterState;
	State soldState;

	// Init state of the GumballMachine
	State state = soldOutState;
	int count = 0;

	public GumballMachine(int numberGumballs) {
		// Each state take GumballMachine as constructor parameter
		// There are no more gumball in machine
		soldOutState = new SoldOutState(this);
		// No quarter
		noQuarterState = new NoQuarterState(this);
		// Quarter
		hasQuarterState = new HasQuarterState(this);
		// Gumball distribution
		soldState = new SoldState(this);

		this.count = numberGumballs;
		if (numberGumballs > 0) {
			state = noQuarterState;
		}
	}

	public void insertQuarter() {
		state.insertQuarter();
	}

	public void ejectQuarter() {
		state.ejectQuarter();
	}

	public void turnCrank() {
		state.turnCrank();
		state.dispense();
	}

	void setState(State state) {
		this.state = state;
	}

	void releaseBall() {
		System.out.println("A gumball comes rolling out the slot...");
		if (count != 0) {
			count = count - 1;
		}
	}

	int getCount() {
		return count;
	}

	void refill(int count) {
		this.count = count;
		state = noQuarterState;
	}

	public State getState() {
		return state;
	}

	public State getSoldOutState() {
		return soldOutState;
	}

	public State getNoQuarterState() {
		return noQuarterState;
	}

	public State getHasQuarterState() {
		return hasQuarterState;
	}

	public State getSoldState() {
		return soldState;
	}

	@Override
	public String toString() {
		StringBuffer result = new StringBuffer();
		result.append("\nMighty Gumball, Inc.");
		result.append("\nJava-enabled Standing Gumball Model #2004");
		result.append("\nInventory: " + count + " gumball");
		if (count != 1) {
			result.append("s");
		}
		result.append("\n");
		result.append("Machine is " + state + "\n");
		return result.toString();
	}
}
