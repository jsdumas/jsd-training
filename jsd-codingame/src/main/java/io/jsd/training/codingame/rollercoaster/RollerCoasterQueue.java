package io.jsd.training.codingame.rollercoaster;

import java.util.LinkedList;
import java.util.Queue;

public class RollerCoasterQueue {
	
	private final Queue<GroupOfRiders> waitingGroupsOfRiders;
	private int numberOfRiders;
	
	public RollerCoasterQueue() {
		this.waitingGroupsOfRiders = new LinkedList<GroupOfRiders>();
		this.numberOfRiders=0;
	}
	
	public void addGroup(GroupOfRiders groupOfRiders) {
		this.numberOfRiders+=groupOfRiders.getNumberOfRiders();
		this.waitingGroupsOfRiders.add(groupOfRiders);
	}

	public Queue<GroupOfRiders> getGroupsOfRiders() {
		return waitingGroupsOfRiders;
	}

	public int getNumberOfRiders() {
		return numberOfRiders;
	}
	
}
