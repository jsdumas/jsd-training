package io.jsd.training.codingame.rollercoaster;

import java.util.Deque;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;

public class RidesCombination {

	public RidesPossible getRidesPossible(long capacity, Queue<GroupOfRiders> waitingGroupsOfRidersQueue) {
		Deque<GroupOfRiders> waitingGroups = new LinkedList<>();
		waitingGroups.addAll(waitingGroupsOfRidersQueue);
		HashMap<Long, Ride> rideMap = new HashMap<Long, Ride>();
		Queue<GroupOfRiders> groupsInRide = new LinkedList<GroupOfRiders>();
		long rideId=0;
		for (long i = 0; i < waitingGroups.size(); i++) {
			Ride ride = new Ride(rideId);
			if (ride.isEmpty()) {
				GroupOfRiders group = waitingGroups.pollFirst();
				waitingGroups.addLast(group);
				ride.add(group);
			}
			while (canGroupGetOnBoardNow(capacity, ride, waitingGroups.peekFirst())) {
				GroupOfRiders group = waitingGroups.pollFirst();
				ride.add(group);
				groupsInRide.add(group);
			}
			groupsInRide.addAll(waitingGroups);
			waitingGroups = new LinkedList<>();
			waitingGroups.addAll(groupsInRide);
			groupsInRide = new LinkedList<GroupOfRiders>();
			rideMap.put(rideId, ride);
			rideId++;
		}
		return new RidesPossible(rideMap);
	}

	public boolean canGroupGetOnBoardNow(long capacity, Ride ride, GroupOfRiders group) {
		return ride.getNumberOfRiders() + group.getNumberOfRiders() <= capacity;
	}

}
