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

	private Integer getBottomNeighbourId() {
		int x = cell.getX() + 1;
		String id = String.valueOf(x) + String.valueOf(cell.getY());
		return Integer.parseInt(id);
	}

	private Integer getRightNeighbourId() {
		int y = cell.getY() + 1;
		String id = String.valueOf(cell.getX()) + String.valueOf(y);
		return Integer.parseInt(id);
	}

	private Integer getUpperNeighbourId() {
		int x = cell.getX() - 1;
		if (x < 0)
			return null;
		String id = String.valueOf(x) + String.valueOf(cell.getY());
		return Integer.parseInt(id);
	}

	private Integer getLeftNeighbourId() {
		int y = cell.getY() - 1;
		if (y < 0)
			return null;
		String id = String.valueOf(cell.getX()) + String.valueOf(y);
		return Integer.parseInt(id);
	}

	public void addToCell() {
		cell.addNeighbour(Direction.LEFT, leftNeighbour);
		cell.addNeighbour(Direction.UP, upperNeighbour);
		cell.addNeighbour(Direction.RIGHT, rightNeighbour);
		cell.addNeighbour(Direction.DOWN, bottomNeighbour);
	}

}
