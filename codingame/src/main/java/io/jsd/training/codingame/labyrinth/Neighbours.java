package io.jsd.training.codingame.labyrinth;

import java.util.Map;

import io.jsd.training.codingame.labyrinth.bean.Direction;

public class Neighbours {

	private final Cell cell;
	private final Cell leftNeighbour;
	private final Cell upperNeighbour;
	private final Cell rightNeighbour;
	private final Cell bottomNeighbour;

	public Neighbours(Cell cell, Map<Integer, Cell> cellsMap) {
		this.cell = cell;
		this.leftNeighbour = cellsMap.get(getLeftNeighbourId());
		this.upperNeighbour = cellsMap.get(getUpperNeighbourId());
		this.rightNeighbour = cellsMap.get(getRightNeighbourId());
		this.bottomNeighbour = cellsMap.get(getBottomNeighbourId());
	}

	private Object getBottomNeighbourId() {
		return Integer.parseInt(String.valueOf(cell.getX() + 1) + String.valueOf(cell.getY()));
	}

	private Object getRightNeighbourId() {
		return Integer.parseInt(String.valueOf(cell.getX()) + String.valueOf(cell.getY() + 1));
	}

	private Object getUpperNeighbourId() {
		return Integer.parseInt(String.valueOf(cell.getX() - 1) + String.valueOf(cell.getY()));
	}

	private Integer getLeftNeighbourId() {
		return Integer.parseInt(String.valueOf(cell.getX()) + String.valueOf(cell.getY() - 1));
	}

	public void addToCell() {
		cell.addNeighbour(Direction.LEFT, leftNeighbour);
		cell.addNeighbour(Direction.UP, upperNeighbour);
		cell.addNeighbour(Direction.RIGHT, rightNeighbour);
		cell.addNeighbour(Direction.DOWN, bottomNeighbour);
	}

}
