package io.jsd.training.codingame.labyrinth;

import io.jsd.training.codingame.labyrinth.bean.CellType;
import io.jsd.training.codingame.labyrinth.bean.Direction;

public class Edge {

	private final Direction direction;
	private final Cell neighbour;
	private final double cost;

	public Edge(Direction direction, Cell neighbour) {
		this.direction = direction;
		this.neighbour = neighbour;
		if (neighbour.getCellType().equals(CellType.UNKOWN_CELL) || neighbour.getCellType().equals(CellType.WALL)) {
			this.cost = Double.MAX_VALUE;
		} else {
			this.cost = 10;
		}

	}

	public Cell getNeighbourCell() {
		return neighbour;
	}

	public double getCost() {
		return cost;
	}

	public Direction getDirection() {
		return direction;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((direction == null) ? 0 : direction.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Edge other = (Edge) obj;
		if (direction != other.direction)
			return false;
		return true;
	}

}
