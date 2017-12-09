package io.jsd.training.codingame.rollercoaster;

public class GroupOfRiders {

	private final long id;
	private final long numberOfRiders;

	public GroupOfRiders(long id, long numberOfRiders) {
		this.id = id;
		this.numberOfRiders = numberOfRiders;
	}

	public long getNumberOfRiders() {
		return numberOfRiders;
	}
	
	public long getId() {
		return id;
	}

}
