package io.jsd.training.codingame.labyrinth;

public class Edge {

	private final Direction direction;
	private final Cell neighbour;
	private final double cost;

	public Edge(Direction direction, Cell neighbour) {
		this.direction = direction;
		this.neighbour = neighbour;
		if(neighbour.getCellType().equals(CellType.UNKOWN_CELL)
			|| neighbour.getCellType().equals(CellType.WALL)) {
			this.cost=Double.MAX_VALUE;
		} else {
			this.cost=10;
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

}
