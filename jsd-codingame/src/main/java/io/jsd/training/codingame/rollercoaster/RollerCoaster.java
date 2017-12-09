package io.jsd.training.codingame.rollercoaster;

public class RollerCoaster {

	private final long capacity;
	private final long numberOfRidesByDay;
	private final RollerCoasterQueue rollerCoasterQueue;

	public RollerCoaster(long placeNumber, long numberOfRidesByDay, RollerCoasterQueue rollerCoasterQueue) {
		this.capacity = placeNumber;
		this.numberOfRidesByDay = numberOfRidesByDay;
		this.rollerCoasterQueue = rollerCoasterQueue;
	}

	public long getCapacity() {
		return capacity;
	}

	public long getNumberOfRidesByDay() {
		return numberOfRidesByDay;
	}

	public RollerCoasterQueue getRollerCoasterQueue() {
		return rollerCoasterQueue;
	}

}
