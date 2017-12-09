package io.jsd.training.codingame.rollercoaster;

/** @link DaylyRidesTest **/
public class DaylyRides {

	private final RollerCoasterQueue rollerCoasterQueue;
	private final RollerCoaster rollerCoaster;
	private final RidesCombination ridesCombination;

	public DaylyRides(RollerCoaster rollerCoaster) {
		this.rollerCoaster = rollerCoaster;
		this.rollerCoasterQueue = rollerCoaster.getRollerCoasterQueue();
		this.ridesCombination = new RidesCombination();
	}


	public long getGain() {
		if(rollerCoaster.getCapacity()>rollerCoasterQueue.getNumberOfRiders()){
			return rollerCoasterQueue.getNumberOfRiders() * rollerCoaster.getNumberOfRidesByDay();
		}
		RidesPossible ridesPossible = ridesCombination.getRidesPossible(rollerCoaster.getCapacity(), rollerCoasterQueue.getGroupsOfRiders());
		long gain = 0;
		int idRide = 0;
		long countRide = 0;
		while (countRide < rollerCoaster.getNumberOfRidesByDay()) {
			if (idRide > ridesPossible.getNumberOfRides()-1) {
				idRide = idRide-ridesPossible.getNumberOfRides();
			}
			Ride ride = ridesPossible.getRide(idRide);
			gain += ride.getNumberOfRiders();
			idRide+=ride.getNumberOfGroups();
			countRide++;
		}
		return gain;
	}

}
