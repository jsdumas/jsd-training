package io.jsd.training.codingame.labyrinth;

public class Distance {

	private final double cost;
	private final Cell neighbourCell;
	private final double distanceToDestination;
	private final double distance;

	public Distance(Edge edge, Cell currentCell, Cell destinationCell) {
		this.cost = edge.getCost();
		this.neighbourCell = edge.getNeighbourCell();
		this.distanceToDestination = currentCell.getDistanceToDestination() + cost;
		this.distance = distanceToDestination + heuristic(neighbourCell, destinationCell);
	}

	// Manhattan heuristic/distance !!!
	private double heuristic(Cell neighbourCell, Cell destination) {
		return Math.abs(neighbourCell.getX() - destination.getX())
				+ Math.abs(neighbourCell.getY() - destination.getY());
	}

	public double getDistanceToDestination() {
		return distanceToDestination;
	}

	public double getDistance() {
		return distance;
	}

	public boolean isLongerThanNeighbourDistance() {
		return distance >= neighbourCell.getLowerCostPath();
	}

	public boolean isShorterThanNeighbourDistance() {
		return distance < neighbourCell.getLowerCostPath();
	}

}
