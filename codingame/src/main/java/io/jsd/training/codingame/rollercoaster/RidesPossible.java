package io.jsd.training.codingame.rollercoaster;

import java.util.HashMap;

public class RidesPossible {

	private final HashMap<Long, Ride> rideMap;

	public RidesPossible(HashMap<Long, Ride> rideMap) {
		this.rideMap = rideMap;
	}

	public Ride getRide(long id) {
		return rideMap.get(id);
	}

	public int getNumberOfRides() {
		return rideMap.size();
	}

}
